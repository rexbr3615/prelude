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
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.recipes.common.IndustrialCrusherRecipe;

public class IndustrialCrusherCategory implements IRecipeCategory<IndustrialCrusherRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(prelude.MODID, "icrusher");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(prelude.MODID,
            "textures/gui/crusher.png");

    public static final RecipeType<IndustrialCrusherRecipe> INDUSTRIAL_CRUSHER_TYPE =
            new RecipeType<>(UID, IndustrialCrusherRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public IndustrialCrusherCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PreludeBlocks.INDUSTRIAL_CRUSHER.get()));
    }

    @Override
    public RecipeType<IndustrialCrusherRecipe> getRecipeType() {
        return INDUSTRIAL_CRUSHER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.prelude.crusher");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, IndustrialCrusherRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}