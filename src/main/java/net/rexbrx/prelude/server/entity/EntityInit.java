package net.rexbrx.prelude.server.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.*;

@Mod.EventBusSubscriber(modid = prelude.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInit {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, prelude.MODID);


    public static final RegistryObject<EntityType<JuravenatorEntity>> JURAVENATOR = register("juravenator",
            EntityType.Builder.<JuravenatorEntity>of(JuravenatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuravenatorEntity::new)

                    .sized(0.35f, 0.5f));

    public static final RegistryObject<EntityType<AllosaurusEntity>> ALLOSAURUS = register("allosaurus",
            EntityType.Builder.<AllosaurusEntity>of(AllosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AllosaurusEntity::new)

                    .sized(1.29f, 2.789f));

    public static final RegistryObject<EntityType<GallimimusEntity>> GALLIMIMUS = register("gallimimus",
            EntityType.Builder.<GallimimusEntity>of(GallimimusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GallimimusEntity::new)

                    .sized(0.87f, 1.839f));

    public static final RegistryObject<EntityType<RugopsEntity>> RUGOPS = register("rugops",
            EntityType.Builder.<RugopsEntity>of(RugopsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RugopsEntity::new)

                    .sized(0.79f, 1.888f));

    public static final RegistryObject<EntityType<ProterosuchusEntity>> PROTEROSUCHUS = register("proterosuchus",
            EntityType.Builder.<ProterosuchusEntity>of(ProterosuchusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProterosuchusEntity::new)

                    .sized(1.21f, 0.8911f));

    public static final RegistryObject<EntityType<MegaraptorEntity>> MEGARAPTOR = register("megaraptor",
            EntityType.Builder.<MegaraptorEntity>of(MegaraptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegaraptorEntity::new)

                    .sized(0.785f, 1.879f));

    public static final RegistryObject<EntityType<YutyrannusEntity>> YUTYRANNUS = register("yutyrannus",
            EntityType.Builder.<YutyrannusEntity>of(YutyrannusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YutyrannusEntity::new)

                    .sized(1.29f, 2.789f));

    public static final RegistryObject<EntityType<BlueCoelacanthEntity>> BLUE_COELACANTH = register("blue_coelacanth",
            EntityType.Builder.<BlueCoelacanthEntity>of(BlueCoelacanthEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueCoelacanthEntity::new)

                    .sized(1.5f, 1.3f));

    public static final RegistryObject<EntityType<ConodontaEntity>> CONODONTA = register("conodonta",
            EntityType.Builder.<ConodontaEntity>of(ConodontaEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ConodontaEntity::new)

                    .sized(0.34f, 0.34f));

    public static final RegistryObject<EntityType<PteranodonEntity>> PTERANODON = register("pteranodon",
            EntityType.Builder.<PteranodonEntity>of(PteranodonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PteranodonEntity::new)

                    .sized(0.78f, 0.9f));

    public static final RegistryObject<EntityType<TherizinosaurusEntity>> THERIZINOSAURUS = register("therizinosaurus",
            EntityType.Builder.<TherizinosaurusEntity>of(TherizinosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TherizinosaurusEntity::new)

                    .sized(1.29f, 2.789f));

    public static final RegistryObject<EntityType<TorvosaurusEntity>> TORVOSAURUS = register("torvosaurus",
            EntityType.Builder.<TorvosaurusEntity>of(TorvosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TorvosaurusEntity::new)

                    .sized(1.29f, 2.789f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            JuravenatorEntity.init();
            AllosaurusEntity.init();
            GallimimusEntity.init();
            RugopsEntity.init();
            ProterosuchusEntity.init();
            MegaraptorEntity.init();
            YutyrannusEntity.init();
            BlueCoelacanthEntity.init();
            ConodontaEntity.init();
            PteranodonEntity.init();
            TherizinosaurusEntity.init();
            TorvosaurusEntity.init();

        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(JURAVENATOR.get(), JuravenatorEntity.createAttributes().build());
        event.put(ALLOSAURUS.get(), AllosaurusEntity.createAttributes().build());
        event.put(GALLIMIMUS.get(), GallimimusEntity.createAttributes().build());
        event.put(RUGOPS.get(), RugopsEntity.createAttributes().build());
        event.put(PROTEROSUCHUS.get(), ProterosuchusEntity.createAttributes().build());
        event.put(MEGARAPTOR.get(), MegaraptorEntity.createAttributes().build());
        event.put(YUTYRANNUS.get(), YutyrannusEntity.createAttributes().build());
        event.put(BLUE_COELACANTH.get(), BlueCoelacanthEntity.createAttributes().build());
        event.put(CONODONTA.get(), ConodontaEntity.createAttributes().build());
        event.put(PTERANODON.get(), PteranodonEntity.createAttributes().build());
        event.put(THERIZINOSAURUS.get(), TherizinosaurusEntity.createAttributes().build());
        event.put(TORVOSAURUS.get(), TorvosaurusEntity.createAttributes().build());

    }

}
