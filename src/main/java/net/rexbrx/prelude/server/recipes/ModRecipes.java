package net.rexbrx.prelude.server.recipes;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;


public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, prelude.MODID);


    public static final RegistryObject<RecipeSerializer<AnalyzerRecipe>> ANALYZER_SERIALIZER =
            SERIALIZERS.register("analyzer", () -> AnalyzerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<VatRecipe>> VAT_SERIALIZER =
            SERIALIZERS.register("vat", () -> VatRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
