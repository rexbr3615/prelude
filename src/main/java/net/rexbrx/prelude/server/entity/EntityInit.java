package net.rexbrx.prelude.server.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.*;

import java.util.function.Supplier;

@EventBusSubscriber(modid = prelude.MODID)
public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, prelude.MODID);


    public static final Supplier<EntityType<JuravenatorEntity>> JURAVENATOR = ENTITY_TYPES.register("juravenator",
            () -> EntityType.Builder.of(JuravenatorEntity::new, MobCategory.CREATURE)

                    .sized(0.35f, 0.5f).build("juravenator"));

    public static final Supplier<EntityType<AllosaurusEntity>> ALLOSAURUS = ENTITY_TYPES.register("allosaurus",
            () -> EntityType.Builder.of(AllosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.29f, 2.789f).build("allosaurus"));

    public static final Supplier<EntityType<GallimimusEntity>> GALLIMIMUS = ENTITY_TYPES.register("gallimimus",
            () -> EntityType.Builder.of(GallimimusEntity::new, MobCategory.CREATURE)

                    .sized(0.87f, 1.839f).build("gallimimus"));

    public static final Supplier<EntityType<RugopsEntity>> RUGOPS = ENTITY_TYPES.register("rugops",
            () -> EntityType.Builder.of(RugopsEntity::new, MobCategory.CREATURE)

                    .sized(0.79f, 1.888f).build("rugops"));

    public static final Supplier<EntityType<ProterosuchusEntity>> PROTEROSUCHUS = ENTITY_TYPES.register("proterosuchus",
            () -> EntityType.Builder.of(ProterosuchusEntity::new, MobCategory.CREATURE)

                    .sized(1.21f, 0.8911f).build("proterosuchus"));

    public static final Supplier<EntityType<MegaraptorEntity>> MEGARAPTOR = ENTITY_TYPES.register("megaraptor",
            () -> EntityType.Builder.of(MegaraptorEntity::new, MobCategory.CREATURE)

                    .sized(0.785f, 1.879f).build("megaraptor"));

    public static final Supplier<EntityType<YutyrannusEntity>> YUTYRANNUS = ENTITY_TYPES.register("yutyrannus",
            () -> EntityType.Builder.of(YutyrannusEntity::new, MobCategory.CREATURE)

                    .sized(1.29f, 2.789f).build("yutyrannus"));

    public static final Supplier<EntityType<BlueCoelacanthEntity>> BLUE_COELACANTH = ENTITY_TYPES.register("blue_coelacanth",
            () -> EntityType.Builder.of(BlueCoelacanthEntity::new, MobCategory.WATER_CREATURE)

                    .sized(1.5f, 1.3f).build("blue_coelacanth"));

    public static final Supplier<EntityType<ConodontaEntity>> CONODONTA = ENTITY_TYPES.register("conodonta",
            () -> EntityType.Builder.of(ConodontaEntity::new, MobCategory.WATER_CREATURE)

                    .sized(0.34f, 0.34f).build("conodonta"));

    public static final Supplier<EntityType<PteranodonEntity>> PTERANODON = ENTITY_TYPES.register("pteranodon",
            () -> EntityType.Builder.of(PteranodonEntity::new, MobCategory.CREATURE)

                    .sized(0.78f, 0.9f).build("pteranodon"));

    public static final Supplier<EntityType<TherizinosaurusEntity>> THERIZINOSAURUS = ENTITY_TYPES.register("therizinosaurus",
            () -> EntityType.Builder.of(TherizinosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.789f, 3.1f).build("therizinosaurus"));

    public static final Supplier<EntityType<TorvosaurusEntity>> TORVOSAURUS = ENTITY_TYPES.register("torvosaurus",
            () -> EntityType.Builder.of(TorvosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.399f, 2.850f).build("torvosaurus"));

    public static final Supplier<EntityType<MutadonEntity>> MUTADON = ENTITY_TYPES.register("mutadon",
            () -> EntityType.Builder.of(MutadonEntity::new, MobCategory.CREATURE)

                    .sized(1.1f, 2.2f).build("mutadon"));

    public static final Supplier<EntityType<CeratosaurusEntity>> CERATOSAURUS = ENTITY_TYPES.register("ceratosaurus",
            () -> EntityType.Builder.of(CeratosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.04f, 2.12f).build("ceratosaurus"));

    public static final Supplier<EntityType<OuranosaurusEntity>> OURANOSAURUS = ENTITY_TYPES.register("ouranosaurus",
            () -> EntityType.Builder.of(OuranosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.89f, 3.111f).build("ouranosaurus"));

    public static final Supplier<EntityType<AvaceratopsEntity>> AVACERATOPS = ENTITY_TYPES.register("avaceratops",
            () -> EntityType.Builder.of(AvaceratopsEntity::new, MobCategory.CREATURE)

                    .sized(1.18f, 1.34f).build("avaceratops"));

    public static final Supplier<EntityType<BajadasaurusEntity>> BAJADASAURUS = ENTITY_TYPES.register("bajadasaurus",
            () -> EntityType.Builder.of(BajadasaurusEntity::new, MobCategory.CREATURE)

                    .sized(2.18f, 2.44f).build("bajadasaurus"));

    public static final Supplier<EntityType<DeinocheirusEntity>> DEINOCHEIRUS = ENTITY_TYPES.register("deinocheirus",
            () -> EntityType.Builder.of(DeinocheirusEntity::new, MobCategory.CREATURE)

                    .sized(2.18f, 2.44f).build("deinocheirus"));

    public static final Supplier<EntityType<AlbertosaurusEntity>> ALBERTOSAURUS = ENTITY_TYPES.register("albertosaurus",
            () -> EntityType.Builder.of(AlbertosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.29f, 2.789f).build("albertosaurus"));

    public static final Supplier<EntityType<PuertasaurusEntity>> PUERTASAURUS = ENTITY_TYPES.register("puertasaurus",
            () -> EntityType.Builder.of(PuertasaurusEntity::new, MobCategory.CREATURE)

                    .sized(5.35f, 6.965f).build("puertasaurus"));

    public static final Supplier<EntityType<TanystropheusEntity>> TANYSTROPHEUS = ENTITY_TYPES.register("tanystropheus",
            () -> EntityType.Builder.of(TanystropheusEntity::new, MobCategory.CREATURE)

                    .sized(2.2f, 0.8892f).build("tanystropheus"));

    public static final Supplier<EntityType<SigilmassasaurusEntity>> SIGILMASSASAURUS = ENTITY_TYPES.register("sigilmassasaurus",
            () -> EntityType.Builder.of(SigilmassasaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.81273f, 3.26242f).build("sigilmassasaurus"));

    public static final Supplier<EntityType<OrodromeusEntity>> ORODROMEUS = ENTITY_TYPES.register("orodromeus",
            () -> EntityType.Builder.of(OrodromeusEntity::new, MobCategory.CREATURE)

                    .sized(0.6911f, 0.812451f).build("orodromeus"));

    public static final Supplier<EntityType<DryosaurusEntity>> DRYOSAURUS = ENTITY_TYPES.register("dryosaurus",
            () -> EntityType.Builder.of(DryosaurusEntity::new, MobCategory.CREATURE)

                    .sized(0.811f, 1.2783f).build("dryosaurusw"));

    public static final Supplier<EntityType<SilesaurusEntity>> SILESAURUS = ENTITY_TYPES.register("silesaurus",
            () -> EntityType.Builder.of(SilesaurusEntity::new, MobCategory.CREATURE)

                    .sized(0.75f, 1.12f).build("silesaurus"));

    public static final Supplier<EntityType<AustroraptorEntity>> AUSTRORAPTOR = ENTITY_TYPES.register("austroraptor",
            () -> EntityType.Builder.of(AustroraptorEntity::new, MobCategory.CREATURE)

                    .sized(0.87f, 1.68f).build("austroraptor"));

    public static final Supplier<EntityType<ParasaurolophusEntity>> PARASAUROLOPHUS = ENTITY_TYPES.register("parasaurolophus",
            () -> EntityType.Builder.of(ParasaurolophusEntity::new, MobCategory.CREATURE)

                    .sized(2.27f, 2.88f).build("parasaurolophus"));

    public static final Supplier<EntityType<SclerocephalusEntity>> SCLEROCEPHALUS = ENTITY_TYPES.register("sclerocephalus",
            () -> EntityType.Builder.of(SclerocephalusEntity::new, MobCategory.CREATURE)

                    .sized(0.56f, 0.23f).build("sclerocephalus"));

    public static final Supplier<EntityType<KentrosaurusEntity>> KENTROSAURUS = ENTITY_TYPES.register("kentrosaurus",
            () -> EntityType.Builder.of(KentrosaurusEntity::new, MobCategory.CREATURE)

                    .sized(1.27f, 1.98f).build("kentrosaurus"));

    public static final Supplier<EntityType<SiatsEntity>> SIATS = ENTITY_TYPES.register("siats",
            () -> EntityType.Builder.of(SiatsEntity::new, MobCategory.CREATURE)

                    .sized(1.61f, 2.599f).build("siats"));


    public static final Supplier<EntityType<JinfengopteryxEntity>> JINFENGOPTERYX = ENTITY_TYPES.register("jinfengopteryx",
            () -> EntityType.Builder.of(JinfengopteryxEntity::new, MobCategory.CREATURE)

                    .sized(0.38f, 0.54f).build("jinfengopteryx"));

    public static final Supplier<EntityType<CladoselacheEntity>> CLADOSELACHE = ENTITY_TYPES.register("cladoselache",
            () -> EntityType.Builder.of(CladoselacheEntity::new, MobCategory.WATER_CREATURE)

                    .sized(1.5f, 1.3f).build("cladoselache"));

    public static final Supplier<EntityType<ArgentavisEntity>> ARGENTAVIS = ENTITY_TYPES.register("argentavis",
            () -> EntityType.Builder.of(ArgentavisEntity::new, MobCategory.CREATURE)

                    .sized(0.78f, 0.9f).build("argentavis"));


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
            MutadonEntity.init();
            CeratosaurusEntity.init();
            OuranosaurusEntity.init();
            AvaceratopsEntity.init();
            BajadasaurusEntity.init();
            DeinocheirusEntity.init();
            AlbertosaurusEntity.init();
            PuertasaurusEntity.init();
            TanystropheusEntity.init();
            SigilmassasaurusEntity.init();
            OrodromeusEntity.init();
            DryosaurusEntity.init();
            SilesaurusEntity.init();
            AustroraptorEntity.init();
            ParasaurolophusEntity.init();
            SclerocephalusEntity.init();
            KentrosaurusEntity.init();
            SiatsEntity.init();
            JinfengopteryxEntity.init();
            CladoselacheEntity.init();
            ArgentavisEntity.init();
        });
    }


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
