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
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;

public class AnalyzerCategory implements IRecipeCategory<AnalyzerRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(prelude.MODID, "analyzer");
    public static final ResourceLocation TEXTURE = new ResourceLocation(prelude.MODID,
            "textures/gui/analyzer.png");

    public static final RecipeType<AnalyzerRecipe> ANALYZER_TYPE =
            new RecipeType<>(UID, AnalyzerRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public AnalyzerCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PreludeBlocks.ANALYZER.get()));
    }

    @Override
    public RecipeType<AnalyzerRecipe> getRecipeType() {
        return ANALYZER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.prelude.analyzer");
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
    public void setRecipe(IRecipeLayoutBuilder builder, AnalyzerRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 40).addIngredients(Ingredient.of(PreludeItems.NUCLEOTIDES.get()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(PreludeItems.DISC_DRIVE.get()));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem(null));
    }
}