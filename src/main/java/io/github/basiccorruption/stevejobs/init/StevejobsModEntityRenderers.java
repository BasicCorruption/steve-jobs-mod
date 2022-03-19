
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.basiccorruption.stevejobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.basiccorruption.stevejobs.client.renderer.SteveJobsRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StevejobsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StevejobsModEntities.STEVE_JOBS, SteveJobsRenderer::new);
	}
}
