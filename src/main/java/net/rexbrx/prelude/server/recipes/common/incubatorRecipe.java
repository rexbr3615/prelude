package net.rexbrx.prelude.server.recipes.common;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.recipes.ModRecipes;
import org.jetbrains.annotations.Nullable;

public record incubatorRecipe (Ingredient inputItem, ItemStack output) implements Recipe<IncubatorRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // IncubatorRecipeInput --> INVENTORY of the Block Entity

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(IncubatorRecipeInput IncubatorRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(IncubatorRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(IncubatorRecipeInput IncubatorRecipeInput, HolderLookup.Provider provider) {
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
        return ModRecipes.INCUBATOR_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.INCUBATOR_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<incubatorRecipe> {
        public static final MapCodec<incubatorRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(incubatorRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(incubatorRecipe::output)
        ).apply(inst, incubatorRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, incubatorRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, incubatorRecipe::inputItem,
                        ItemStack.STREAM_CODEC, incubatorRecipe::output,
                        incubatorRecipe::new);

        @Override
        public MapCodec<incubatorRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, incubatorRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}