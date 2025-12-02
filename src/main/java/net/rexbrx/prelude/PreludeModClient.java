package net.rexbrx.prelude;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.rexbrx.prelude.server.entity.EntityInit;

import net.rexbrx.prelude.client.CreaturesMR.chapter_one.albertosaurus.AlbertosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.allosaurus.AllosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.argentavis.ArgentavisRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.austroraptor.AustroraptorRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.avaceratops.AvaceratopsRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.bajadasaurus.BajadasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.ceratosaurus.CeratosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.cladoselache.CladoselacheRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.coelacanth.blue.BlueCoelacanthRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.conodonta.ConodontaRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.deinocheirus.DeinocheirusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.dryosaurus.DryosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.gallimimus.GallimimusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.jinfengopteryx.JinfengopteryxRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.juravenator.JuravenatorRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.kentrosaurus.KentrosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.megaraptor.MegaraptorRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.mutadon.MutadonRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.orodromeus.OrodromeusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.ouranosaurus.OuranosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.parasaurolophus.ParasaurolophusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.proterosuchus.ProterosuchusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.pteranodon.PteranodonRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.puertasaurus.PuertasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.rugops.RugopsRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.sclerocephalus.SclerocephalusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.siats.SiatsRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.sigilmassasaurus.SigilmassasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.silesaurus.SilesaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.tanystropheus.TanystropheusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.therizinosaurus.TherizinosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.torvosaurus.TorvosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.yutyrannus.YutyrannusRenderer;

@Mod(value = prelude.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = prelude.MODID, value = Dist.CLIENT)
public class PreludeModClient {


    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {

        event.registerEntityRenderer(EntityInit.JURAVENATOR.get(), JuravenatorRenderer::new);
        event.registerEntityRenderer(EntityInit.ALLOSAURUS.get(), AllosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.GALLIMIMUS.get(), GallimimusRenderer::new);
        event.registerEntityRenderer(EntityInit.RUGOPS.get(), RugopsRenderer::new);
        event.registerEntityRenderer(EntityInit.PROTEROSUCHUS.get(), ProterosuchusRenderer::new);
        event.registerEntityRenderer(EntityInit.MEGARAPTOR.get(), MegaraptorRenderer::new);
        event.registerEntityRenderer(EntityInit.YUTYRANNUS.get(), YutyrannusRenderer::new);
        event.registerEntityRenderer(EntityInit.BLUE_COELACANTH.get(), BlueCoelacanthRenderer::new);
        event.registerEntityRenderer(EntityInit.CONODONTA.get(), ConodontaRenderer::new);
        event.registerEntityRenderer(EntityInit.PTERANODON.get(), PteranodonRenderer::new);
        event.registerEntityRenderer(EntityInit.THERIZINOSAURUS.get(), TherizinosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.TORVOSAURUS.get(), TorvosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.MUTADON.get(), MutadonRenderer::new);
        event.registerEntityRenderer(EntityInit.CERATOSAURUS.get(), CeratosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.OURANOSAURUS.get(), OuranosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.AVACERATOPS.get(), AvaceratopsRenderer::new);
        event.registerEntityRenderer(EntityInit.BAJADASAURUS.get(), BajadasaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.DEINOCHEIRUS.get(), DeinocheirusRenderer::new);
        event.registerEntityRenderer(EntityInit.ALBERTOSAURUS.get(), AlbertosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.PUERTASAURUS.get(), PuertasaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.TANYSTROPHEUS.get(), TanystropheusRenderer::new);
        event.registerEntityRenderer(EntityInit.SIGILMASSASAURUS.get(), SigilmassasaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.ORODROMEUS.get(), OrodromeusRenderer::new);
        event.registerEntityRenderer(EntityInit.DRYOSAURUS.get(), DryosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.SILESAURUS.get(), SilesaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.AUSTRORAPTOR.get(), AustroraptorRenderer::new);
        event.registerEntityRenderer(EntityInit.PARASAUROLOPHUS.get(), ParasaurolophusRenderer::new);
        event.registerEntityRenderer(EntityInit.SCLEROCEPHALUS.get(), SclerocephalusRenderer::new);
        event.registerEntityRenderer(EntityInit.KENTROSAURUS.get(), KentrosaurusRenderer::new);
        event.registerEntityRenderer(EntityInit.SIATS.get(), SiatsRenderer::new);
        event.registerEntityRenderer(EntityInit.JINFENGOPTERYX.get(), JinfengopteryxRenderer::new);
        event.registerEntityRenderer(EntityInit.CLADOSELACHE.get(), CladoselacheRenderer::new);
        event.registerEntityRenderer(EntityInit.ARGENTAVIS.get(), ArgentavisRenderer::new);

        /*
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.VAT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.PROTOTAXITES_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.ENCRINUS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.ENCRINUS_STEM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.COMMON_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.SWARTPUNTIA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.COOKSONIA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.COOKSONIA_PLANT.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.CONCRETE_BARRIER.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.CALAMITES_SAPLING2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.CALAMITES_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.CALAMITES_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.HYPER_CALAMITES_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.GINKGO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.GINKGO_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.GINKGO_DOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.POWER_BOX.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.CABLE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.STEEL_GRATE_BLOCK.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.ANCIENT_RELIC.get(), RenderType.translucent());


        MenuScreens.register(ModMenuTypes.ANALYZER_MENU.get(), AnalyzerScreen::new);
        MenuScreens.register(ModMenuTypes.VAT_MENU.get(), VatScreen::new);
        MenuScreens.register(ModMenuTypes.CRUSHER_MENU.get(), CrusherScreen::new);
        MenuScreens.register(ModMenuTypes.INCUBATOR_MENU.get(), IncubatorScreen::new);

        ItemBlockRenderTypes.setRenderLayer(PreludeBlocks.METAL_PILLAR.get(), RenderType.translucent());
        */
    }



}
