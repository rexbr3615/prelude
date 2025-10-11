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
import net.rexbrx.prelude.server.recipes.common.incubatorRecipe;

public class IncubatorCategory implements IRecipeCategory<incubatorRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(prelude.MODID, "incubator");
    public static final ResourceLocation TEXTURE = new ResourceLocation(prelude.MODID,
            "textures/gui/incubator.png");

    public static final RecipeType<incubatorRecipe> INCUBATOR_TYPE =
            new RecipeType<>(UID, incubatorRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public IncubatorCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(PreludeBlocks.INCUBATOR.get()));
    }

    @Override
    public RecipeType<incubatorRecipe> getRecipeType() {
        return INCUBATOR_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.prelude.incubator");
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
    public void setRecipe(IRecipeLayoutBuilder builder, incubatorRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}