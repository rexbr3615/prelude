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

public record IndustrialCrusherRecipe(Ingredient inputItem, ItemStack output) implements Recipe<IndustrialCrusherRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // IndustrialCrusherRecipeInput --> INVENTORY of the Block Entity

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(IndustrialCrusherRecipeInput IndustrialCrusherRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(IndustrialCrusherRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(IndustrialCrusherRecipeInput IndustrialCrusherRecipeInput, HolderLookup.Provider provider) {
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
        return ModRecipes.INDUSTRIAL_CRUSHER_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.INDUSTRIAL_CRUSHER_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<IndustrialCrusherRecipe> {
        public static final MapCodec<IndustrialCrusherRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredients").forGetter(IndustrialCrusherRecipe::inputItem),
                ItemStack.CODEC.fieldOf("output").forGetter(IndustrialCrusherRecipe::output)
        ).apply(inst, IndustrialCrusherRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, IndustrialCrusherRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, IndustrialCrusherRecipe::inputItem,
                        ItemStack.STREAM_CODEC, IndustrialCrusherRecipe::output,
                        IndustrialCrusherRecipe::new);

        @Override
        public MapCodec<IndustrialCrusherRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, IndustrialCrusherRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}