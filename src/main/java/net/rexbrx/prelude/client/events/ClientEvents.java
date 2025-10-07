package net.rexbrx.prelude.client.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.rexbrx.prelude.client.CreaturesMR.albertosaurus.AlbertosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.allosaurus.AllosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.avaceratops.AvaceratopsRenderer;
import net.rexbrx.prelude.client.CreaturesMR.bajadasaurus.BajadasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.ceratosaurus.CeratosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.coelacanth.blue.BlueCoelacanthRenderer;
import net.rexbrx.prelude.client.CreaturesMR.conodonta.ConodontaRenderer;
import net.rexbrx.prelude.client.CreaturesMR.deinocheirus.DeinocheirusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.dryosaurus.DryosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.gallimimus.GallimimusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.juravenator.JuravenatorRenderer;
import net.rexbrx.prelude.client.CreaturesMR.megaraptor.MegaraptorRenderer;
import net.rexbrx.prelude.client.CreaturesMR.mutadon.MutadonRenderer;
import net.rexbrx.prelude.client.CreaturesMR.orodromeus.OrodromeusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.ouranosaurus.OuranosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.proterosuchus.ProterosuchusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.pteranodon.PteranodonRenderer;
import net.rexbrx.prelude.client.CreaturesMR.puertasaurus.PuertasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.rugops.RugopsRenderer;
import net.rexbrx.prelude.client.CreaturesMR.sigilmassasaurus.SigilmassasaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.silesaurus.SilesaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.tanystropheus.TanystropheusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.therizinosaurus.TherizinosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.torvosaurus.TorvosaurusRenderer;
import net.rexbrx.prelude.client.CreaturesMR.yutyrannus.YutyrannusRenderer;
import net.rexbrx.prelude.client.menu.AnalyzerScreen;
import net.rexbrx.prelude.client.menu.CrusherScreen;
import net.rexbrx.prelude.client.menu.VatScreen;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.entity.common.DryosaurusEntity;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import net.rexbrx.prelude.server.entity.common.SilesaurusEntity;
import net.rexbrx.prelude.server.entity.common.YutyrannusEntity;
import net.rexbrx.prelude.server.items.PreludeItems;
import net.rexbrx.prelude.server.recipes.common.AnalyzerRecipe;
import net.rexbrx.prelude.server.recipes.common.VatRecipe;
import net.rexbrx.prelude.server.screens.ModMenuTypes;

@Mod.EventBusSubscriber(modid = prelude.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        //event.registerLayerDefinition(ModModelLayers.PRELUDE_LAYER, JuravenatorModel::createBodyLayer);
    }

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


    }


    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> {
            if (tintIndex == 1) {
                // Cor do líquido (RGB em hexadecimal)
                return 0xe9f7f4; // Azul claro, por exemplo
            }
            return 0xFFFFFF; // Base sem cor
        }, PreludeItems.SIMPLE_BOTTLE.get());
    }


}
