package net.rexbrx.prelude.server.items.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;

import java.util.List;
import java.util.Optional;

public class EssenceItem extends Item {
    public EssenceItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (!level.isClientSide) {
            BlockState state = level.getBlockState(clickedPos);

            if (state.is(PreludeBlocks.CALAMITES_SAPLING2.get())) {
                ServerLevel serverLevel = (ServerLevel) level;
                StructureTemplateManager manager = serverLevel.getStructureManager();

                // Sorteia qual estrutura será usada
                int choice = serverLevel.random.nextInt(3);
                ResourceLocation structureRL;
                BlockPos offset;

                if (choice == 0) {
                    structureRL = new ResourceLocation("prelude", "calamites");
                    offset = new BlockPos(-6, 0, -6); // ex: estrutura 7x7
                } else if (choice == 1) {
                    structureRL = new ResourceLocation("prelude", "calamites2");
                    offset = new BlockPos(-1, 0, -1); // correto
                } else {
                    structureRL = new ResourceLocation("prelude", "calamites3");
                    offset = new BlockPos(-4, 0, -4); // ex: estrutura 11x5 (formato estranho)
                }

                Optional<StructureTemplate> templateOptional = manager.get(structureRL);
                if (templateOptional.isPresent()) {
                    // Remove o bloco original
                    level.setBlock(clickedPos, Blocks.AIR.defaultBlockState(), 3);

                    // Calcula a posição onde a estrutura deve ser colocada
                    BlockPos structurePos = clickedPos.offset(offset);

                    StructureTemplate template = templateOptional.get();
                    StructurePlaceSettings settings = new StructurePlaceSettings()
                            .setMirror(Mirror.NONE)
                            .setRotation(Rotation.NONE)
                            .setIgnoreEntities(false)
                            .setKnownShape(true)
                            .setFinalizeEntities(true);

                    template.placeInWorld(
                            serverLevel,
                            structurePos,
                            structurePos,
                            settings,
                            serverLevel.random,
                            2
                    );

                    // Opcional: desgastar o item
                    if (player != null) {
                        stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(context.getHand()));
                    }

                    return InteractionResult.SUCCESS;
                }
            }
        }

        return InteractionResult.PASS;
    }


}
