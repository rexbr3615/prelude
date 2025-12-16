package net.rexbrx.prelude.server.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.rexbrx.prelude.client.menu.*;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.ModRecipes;
import net.rexbrx.prelude.server.recipes.common.*;

import java.util.List;

@JeiPlugin
public class JEIPreludePlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AnalyzerCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new VatCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CrusherCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new IncubatorCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new IndustrialCrusherCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AnalyzerRecipe> AnalyzerRecipes = recipeManager.getAllRecipesFor(ModRecipes.ANALYZER_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(AnalyzerCategory.ANALYZER_TYPE, AnalyzerRecipes);

        List<VatRecipe> VatRecipes = recipeManager.getAllRecipesFor(ModRecipes.VAT_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(VatCategory.VAT_TYPE, VatRecipes);

        List<CrusherRecipe> CrusherRecipes = recipeManager.getAllRecipesFor(ModRecipes.CRUSHER_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(CrusherCategory.CRUSHER_TYPE, CrusherRecipes);

        List<incubatorRecipe> IncubatorRecipes = recipeManager.getAllRecipesFor(ModRecipes.INCUBATOR_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(IncubatorCategory.INCUBATOR_TYPE, IncubatorRecipes);

        List<IndustrialCrusherRecipe> ICrusherRecipes = recipeManager.getAllRecipesFor(ModRecipes.INDUSTRIAL_CRUSHER_TYPE.get()).stream().map(RecipeHolder::value).toList();
        registration.addRecipes(IndustrialCrusherCategory.INDUSTRIAL_CRUSHER_TYPE, ICrusherRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AnalyzerScreen.class, 60, 30, 20, 30,
                AnalyzerCategory.ANALYZER_TYPE);
        registration.addRecipeClickArea(VatScreen.class, 60, 30, 20, 30,
                VatCategory.VAT_TYPE);
        registration.addRecipeClickArea(CrusherScreen.class, 60, 30, 20, 30,
                CrusherCategory.CRUSHER_TYPE);
        registration.addRecipeClickArea(IncubatorScreen.class, 60, 30, 20, 30,
                IncubatorCategory.INCUBATOR_TYPE);
        registration.addRecipeClickArea(IndustrialCrusherScreen.class, 60, 30, 20, 30,
                IndustrialCrusherCategory.INDUSTRIAL_CRUSHER_TYPE);
    }
}
