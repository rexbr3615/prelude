package net.rexbrx.prelude.server.items.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class GravityGunItem extends Item {
    public GravityGunItem(Properties properties) {
        super(properties);
    }

    // NBT key para armazenar a entidade agarrada
    private static final String TAG_ENTITY_ID = "GrabbedEntityId";

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            CompoundTag tag = stack.getOrCreateTag();

            if (tag.contains(TAG_ENTITY_ID)) {
                int id = tag.getInt(TAG_ENTITY_ID);
                Entity entity = level.getEntity(id);

                if (entity != null) {
                    // Solta a entidade
                    tag.remove(TAG_ENTITY_ID);
                }
            } else {
                // Tenta pegar entidade na frente
                Vec3 look = player.getLookAngle();
                Vec3 start = player.getEyePosition();
                Vec3 end = start.add(look.scale(5));

                List<Entity> entities = level.getEntities(player, new AABB(start, end), e -> e.isAlive() && !(e instanceof Player));

                if (!entities.isEmpty()) {
                    Entity target = entities.get(0);
                    tag.putInt(TAG_ENTITY_ID, target.getId());
                }
            }
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {
        if (!(entity instanceof Player player)) return false;
        if (player.level().isClientSide) return false;

        CompoundTag tag = stack.getOrCreateTag();

        if (tag.contains(TAG_ENTITY_ID)) {
            int id = tag.getInt(TAG_ENTITY_ID);
            Entity grabbed = player.level().getEntity(id);

            if (grabbed != null) {
                // Lança a entidade para frente
                Vec3 direction = player.getLookAngle().normalize();
                grabbed.setDeltaMovement(direction.scale(5.0));
                tag.remove(TAG_ENTITY_ID);
            }
        }

        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean isSelected) {
        if (!level.isClientSide && isSelected && entity instanceof Player player) {
            CompoundTag tag = stack.getOrCreateTag();
            if (tag.contains(TAG_ENTITY_ID)) {
                Entity grabbed = level.getEntity(tag.getInt(TAG_ENTITY_ID));
                if (grabbed != null) {
                    // Atualiza posição da entidade à frente do jogador
                    Vec3 pos = player.position().add(player.getLookAngle().normalize().scale(2));
                    grabbed.teleportTo(pos.x, pos.y, pos.z);
                    grabbed.setDeltaMovement(0, 0, 0);
                } else {
                    // Se a entidade foi removida, limpa
                    tag.remove(TAG_ENTITY_ID);
                }
            }
        }
    }
}

