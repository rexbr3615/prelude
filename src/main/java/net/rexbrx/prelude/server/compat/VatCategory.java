package net.rexbrx.prelude.server.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.items.PreludeItems;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;

public class VatCategory implements IRecipeCategory<VatRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(prelude.MODID, "vat");
    public static final ResourceLocation TEXTURE = new ResourceLocation(prelude.MODID,
            "textures/gui/culture_gui.png");

    public static final RecipeType<VatRecipe> VAT_TYPE =
            new RecipeType<>(UID, VatRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public VatCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PreludeBlocks.VAT.get()));
    }

    @Override
    public RecipeType<VatRecipe> getRecipeType() {
        return VAT_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.prelude.vat");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, VatRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 6).addIngredients(Ingredient.of(PreludeItems.NUTRIENTS.get()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(PreludeItems.DNA_NUCLEOTIDES.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem(null));
    }
}