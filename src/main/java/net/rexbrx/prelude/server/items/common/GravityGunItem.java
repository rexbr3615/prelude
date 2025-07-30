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

public class GravityGunItem extends Item {
    public GravityGunItem(Properties properties) {
        super(properties);
    }

    // Botão direito: pegar ou soltar
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        CompoundTag tag = stack.getOrCreateTag();

        if (!level.isClientSide) {
            // Se já está segurando, solta
            if (tag.contains("heldEntityId")) {
                tag.remove("heldEntityId");
                player.displayClientMessage(Component.literal("Entidade solta!"), true);
            } else {
                // Tenta pegar uma entidade
                EntityHitResult hit = rayTraceEntities(level, player, 10);
                if (hit != null) {
                    Entity target = hit.getEntity();
                    if (target instanceof LivingEntity && target != player) {
                        tag.putInt("heldEntityId", target.getId());
                        player.displayClientMessage(Component.literal("Entidade agarrada!"), true);
                    }
                }
            }
        }

        return InteractionResultHolder.success(stack);
    }



    // Faz a entidade ficar flutuando na frente do jogador
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        if (!level.isClientSide && selected && entity instanceof Player player) {
            CompoundTag tag = stack.getOrCreateTag();
            if (tag.contains("heldEntityId")) {
                Entity held = level.getEntity(tag.getInt("heldEntityId"));
                if (held != null) {
                    Vec3 offset = player.getLookAngle().normalize().scale(3).add(0, 1.5, 0);
                    Vec3 targetPos = player.position().add(offset);
                    held.setNoGravity(true);
                    held.setDeltaMovement(Vec3.ZERO);
                    held.teleportTo(targetPos.x, targetPos.y, targetPos.z);
                }
            }
        }
    }

    // Raycast de entidade
    private EntityHitResult rayTraceEntities(Level level, Player player, double range) {
        Vec3 start = player.getEyePosition();
        Vec3 end = start.add(player.getLookAngle().scale(range));
        AABB box = new AABB(start, end).inflate(1);
        return ProjectileUtil.getEntityHitResult(level, player, start, end, box, e -> e instanceof LivingEntity && e != player);
    }
}

