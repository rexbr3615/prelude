package net.rexbrx.prelude.server.recipes;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;
import net.rexbrx.prelude.server.recipes.common.CrusherRecipe;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;
import net.rexbrx.prelude.server.recipes.common.incubatorRecipe;


public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, prelude.MODID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, prelude.MODID);


    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<AnalyzerRecipe>> ANALYZER_SERIALIZER =
            SERIALIZERS.register("analyzer", () -> AnalyzerRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<AnalyzerRecipe>> ANALYZER_TYPE =
            TYPES.register("analyzer", () -> new RecipeType<AnalyzerRecipe>() {
                @Override
                public String toString() {
                    return "analyzer";
                }
            });

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<VatRecipe>> VAT_SERIALIZER =
            SERIALIZERS.register("vat", () -> VatRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<VatRecipe>> VAT_TYPE =
            TYPES.register("vat", () -> new RecipeType<VatRecipe>() {
                @Override
                public String toString() {
                    return "vat";
                }
            });

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<CrusherRecipe>> CRUSHER_SERIALIZER =
            SERIALIZERS.register("crusher", () -> CrusherRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<CrusherRecipe>> CRUSHER_TYPE =
            TYPES.register("crusher", () -> new RecipeType<CrusherRecipe>() {
                @Override
                public String toString() {
                    return "crusher";
                }
            });

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<incubatorRecipe>> INCUBATOR_SERIALIZER =
            SERIALIZERS.register("incubator", () -> incubatorRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<incubatorRecipe>> INCUBATOR_TYPE =
            TYPES.register("incubator", () -> new RecipeType<incubatorRecipe>() {
                @Override
                public String toString() {
                    return "incubator";
                }
            });

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
