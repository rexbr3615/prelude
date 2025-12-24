package net.rexbrx.prelude.client.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.entity.common.chapter_omega.DiplocaulusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_omega.DiplodocusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_omega.IrritatorEntity;
import net.rexbrx.prelude.server.entity.common.chapter_omega.MonolophosaurusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.*;

@EventBusSubscriber(modid = prelude.MODID)
public class ModEventBusEvents
{

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.JURAVENATOR.get(), JuravenatorEntity.createAttributes().build());
        event.put(EntityInit.ALLOSAURUS.get(), AllosaurusEntity.createAttributes().build());
        event.put(EntityInit.GALLIMIMUS.get(), GallimimusEntity.createAttributes().build());
        event.put(EntityInit.RUGOPS.get(), RugopsEntity.createAttributes().build());
        event.put(EntityInit.PROTEROSUCHUS.get(), ProterosuchusEntity.createAttributes().build());
        event.put(EntityInit.MEGARAPTOR.get(), MegaraptorEntity.createAttributes().build());
        event.put(EntityInit.YUTYRANNUS.get(), YutyrannusEntity.createAttributes().build());
        event.put(EntityInit.BLUE_COELACANTH.get(), BlueCoelacanthEntity.createAttributes().build());
        event.put(EntityInit.CONODONTA.get(), ConodontaEntity.createAttributes().build());
        event.put(EntityInit.PTERANODON.get(), PteranodonEntity.createAttributes().build());
        event.put(EntityInit.THERIZINOSAURUS.get(), TherizinosaurusEntity.createAttributes().build());
        event.put(EntityInit.TORVOSAURUS.get(), TorvosaurusEntity.createAttributes().build());
        event.put(EntityInit.MUTADON.get(), MutadonEntity.createAttributes().build());
        event.put(EntityInit.CERATOSAURUS.get(), CeratosaurusEntity.createAttributes().build());
        event.put(EntityInit.OURANOSAURUS.get(), OuranosaurusEntity.createAttributes().build());
        event.put(EntityInit.AVACERATOPS.get(), AvaceratopsEntity.createAttributes().build());
        event.put(EntityInit.BAJADASAURUS.get(), BajadasaurusEntity.createAttributes().build());
        event.put(EntityInit.DEINOCHEIRUS.get(), DeinocheirusEntity.createAttributes().build());
        event.put(EntityInit.ALBERTOSAURUS.get(), AlbertosaurusEntity.createAttributes().build());
        event.put(EntityInit.PUERTASAURUS.get(), PuertasaurusEntity.createAttributes().build());
        event.put(EntityInit.TANYSTROPHEUS.get(), TanystropheusEntity.createAttributes().build());
        event.put(EntityInit.SIGILMASSASAURUS.get(), SigilmassasaurusEntity.createAttributes().build());
        event.put(EntityInit.ORODROMEUS.get(), OrodromeusEntity.createAttributes().build());
        event.put(EntityInit.DRYOSAURUS.get(), DryosaurusEntity.createAttributes().build());
        event.put(EntityInit.SILESAURUS.get(), SilesaurusEntity.createAttributes().build());
        event.put(EntityInit.AUSTRORAPTOR.get(), AustroraptorEntity.createAttributes().build());
        event.put(EntityInit.PARASAUROLOPHUS.get(), ParasaurolophusEntity.createAttributes().build());
        event.put(EntityInit.SCLEROCEPHALUS.get(), SclerocephalusEntity.createAttributes().build());
        event.put(EntityInit.KENTROSAURUS.get(), KentrosaurusEntity.createAttributes().build());
        event.put(EntityInit.SIATS.get(), SiatsEntity.createAttributes().build());
        event.put(EntityInit.JINFENGOPTERYX.get(), JinfengopteryxEntity.createAttributes().build());
        event.put(EntityInit.CLADOSELACHE.get(), CladoselacheEntity.createAttributes().build());
        event.put(EntityInit.ARGENTAVIS.get(), ArgentavisEntity.createAttributes().build());
        event.put(EntityInit.IRRITATOR.get(), IrritatorEntity.createAttributes().build());
        event.put(EntityInit.MONOLOPHOSAURUS.get(), MonolophosaurusEntity.createAttributes().build());
        event.put(EntityInit.DIPLOCAULUS.get(), DiplocaulusEntity.createAttributes().build());
        event.put(EntityInit.DIPLODOCUS.get(), DiplodocusEntity.createAttributes().build());

    }

}
