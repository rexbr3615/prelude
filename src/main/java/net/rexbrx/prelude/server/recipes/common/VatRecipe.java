package net.rexbrx.prelude.server.recipes.common;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.rexbrx.prelude.server.recipes.ModRecipes;

public record VatRecipe(Ingredient inputItem, ItemStack output) implements Recipe<VatRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // VatRecipeInput --> INVENTORY of the Block Entity

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(VatRecipeInput VatRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(VatRecipeInput.getItem(1));
    }

    @Override
    public ItemStack assemble(VatRecipeInput VatRecipeInput, HolderLookup.Provider provider) {
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
        return ModRecipes.VAT_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.VAT_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<VatRecipe> {
        public static final MapCodec<VatRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredients").forGetter(VatRecipe::inputItem),
                ItemStack.CODEC.fieldOf("output").forGetter(VatRecipe::output)
        ).apply(inst, VatRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, VatRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, VatRecipe::inputItem,
                        ItemStack.STREAM_CODEC, VatRecipe::output,
                        VatRecipe::new);

        @Override
        public MapCodec<VatRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, VatRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}