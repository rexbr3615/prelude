package net.rexbrx.prelude.server.recipes;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;
import net.rexbrx.prelude.server.recipes.common.CrusherRecipe;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;
import net.rexbrx.prelude.server.recipes.common.incubatorRecipe;


public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.RECIPE_SERIALIZERS, prelude.MODID);


    public static final RegistryObject<RecipeSerializer<AnalyzerRecipe>> ANALYZER_SERIALIZER =
            SERIALIZERS.register("analyzer", () -> AnalyzerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<VatRecipe>> VAT_SERIALIZER =
            SERIALIZERS.register("vat", () -> VatRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CrusherRecipe>> CRUSHER_SERIALIZER =
            SERIALIZERS.register("crusher", () -> CrusherRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<incubatorRecipe>> INCUBATOR_SERIALIZER =
            SERIALIZERS.register("incubator", () -> incubatorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
