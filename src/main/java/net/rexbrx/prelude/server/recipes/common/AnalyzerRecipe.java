package net.rexbrx.prelude.server.recipes.common;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.rexbrx.prelude.server.recipes.ModRecipes;
import org.checkerframework.checker.units.qual.A;

public record AnalyzerRecipe(Ingredient inputItem, ItemStack output) implements Recipe<AnalyzerRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // GrowthChamberRecipeInput --> INVENTORY of the Block Entity

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(AnalyzerRecipeInput AnalyzerRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(AnalyzerRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(AnalyzerRecipeInput AnalyzerRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.ANALYZER_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.ANALYZER_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<AnalyzerRecipe> {
        public static final MapCodec<AnalyzerRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(AnalyzerRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(AnalyzerRecipe::output)
        ).apply(inst, AnalyzerRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, AnalyzerRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, AnalyzerRecipe::inputItem,
                        ItemStack.STREAM_CODEC, AnalyzerRecipe::output,
                        AnalyzerRecipe::new);

        @Override
        public MapCodec<AnalyzerRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, AnalyzerRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}