
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.basiccorruption.stevejobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StevejobsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item STEVE_JOBS = register(
			new SpawnEggItem(StevejobsModEntities.STEVE_JOBS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))
					.setRegistryName("steve_jobs_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
