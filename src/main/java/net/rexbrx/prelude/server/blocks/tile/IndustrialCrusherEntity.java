package net.rexbrx.prelude.server.blocks.tile;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.rexbrx.prelude.server.blocks.ModBlockEntities;
import net.rexbrx.prelude.server.recipes.ModRecipes;
import net.rexbrx.prelude.server.recipes.common.IndustrialCrusherRecipe;
import net.rexbrx.prelude.server.recipes.common.IndustrialCrusherRecipeInput;
import net.rexbrx.prelude.server.screens.menu.IndustrialCrusherMenu;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class IndustrialCrusherEntity extends BlockEntity implements MenuProvider {
    public final ItemStackHandler itemHandler = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 40;

    public IndustrialCrusherEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.INDUSTRIAL_CRUSHER_ENTITY.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> IndustrialCrusherEntity.this.progress;
                    case 1 -> IndustrialCrusherEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> IndustrialCrusherEntity.this.progress = pValue;
                    case 1 -> IndustrialCrusherEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }


    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.tutorialmod.gem_polishing_station");
    }





    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new IndustrialCrusherMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {

        pTag.put("inventory", itemHandler.serializeNBT(pRegistries));
        pTag.putInt("icrusher.progress", progress);

        super.saveAdditional(pTag, pRegistries);
    }

    @Override
    public void loadAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        super.loadAdditional(pTag, pRegistries);
        itemHandler.deserializeNBT(pRegistries, pTag.getCompound("inventory"));
        progress = pTag.getInt("icrusher.progress");
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        if(hasRecipe()) {
            increaseCraftingProgress();
            setChanged(pLevel, pPos, pState);

            if(hasProgressFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void resetProgress() {
        progress = 0;
    }

    private void craftItem() {
        Optional<RecipeHolder<IndustrialCrusherRecipe>> recipe = getCurrentRecipe();
        ItemStack output = recipe.get().value().output();

        this.itemHandler.extractItem(INPUT_SLOT, 1, false);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(output.getItem(),
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + output.getCount() + 5));
    }

    private boolean hasRecipe() {
        Optional<RecipeHolder<IndustrialCrusherRecipe>> recipe = getCurrentRecipe();

        if(recipe.isEmpty()) {
            return false;
        }
        ItemStack output = recipe.get().value().output();

        return canInsertAmountIntoOutputSlot(output.getCount())
                && canInsertItemIntoOutputSlot(output.getItem());
    }

    private Optional<RecipeHolder<IndustrialCrusherRecipe>> getCurrentRecipe() {
        return this.level.getRecipeManager()
                .getRecipeFor(ModRecipes.INDUSTRIAL_CRUSHER_TYPE.get(), new IndustrialCrusherRecipeInput(itemHandler.getStackInSlot(INPUT_SLOT)), level);
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count <= this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
    }

    private boolean hasProgressFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftingProgress() {
        progress++;
    }
}

