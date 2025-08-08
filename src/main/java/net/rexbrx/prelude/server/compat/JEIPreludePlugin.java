package net.rexbrx.prelude.server.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.rexbrx.prelude.client.menu.AnalyzerScreen;
import net.rexbrx.prelude.client.menu.CrusherScreen;
import net.rexbrx.prelude.client.menu.VatScreen;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;
import net.rexbrx.prelude.server.recipes.common.CrusherRecipe;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;

import java.util.List;

@JeiPlugin
public class JEIPreludePlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(prelude.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AnalyzerCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new VatCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CrusherCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AnalyzerRecipe> AnalyzerRecipes = recipeManager.getAllRecipesFor(AnalyzerRecipe.Type.INSTANCE);
        registration.addRecipes(AnalyzerCategory.ANALYZER_TYPE, AnalyzerRecipes);
        List<VatRecipe> VatRecipes = recipeManager.getAllRecipesFor(VatRecipe.Type.INSTANCE);
        registration.addRecipes(VatCategory.VAT_TYPE, VatRecipes);
        List<CrusherRecipe> CrusherRecipes = recipeManager.getAllRecipesFor(CrusherRecipe.Type.INSTANCE);
        registration.addRecipes(CrusherCategory.CRUSHER_TYPE, CrusherRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AnalyzerScreen.class, 60, 30, 20, 30,
                AnalyzerCategory.ANALYZER_TYPE);
        registration.addRecipeClickArea(VatScreen.class, 60, 30, 20, 30,
                VatCategory.VAT_TYPE);
        registration.addRecipeClickArea(CrusherScreen.class, 60, 30, 20, 30,
                CrusherCategory.CRUSHER_TYPE);
    }
}
