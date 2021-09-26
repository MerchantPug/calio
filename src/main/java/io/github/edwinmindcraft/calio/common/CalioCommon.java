package io.github.edwinmindcraft.calio.common;

import io.github.edwinmindcraft.calio.api.ability.IAbilityHolder;
import io.github.edwinmindcraft.calio.api.registry.PlayerAbilities;
import io.github.edwinmindcraft.calio.common.registry.CalioRegisters;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class CalioCommon {
	public static void initialize() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(CalioCommon::registerCapabilities);
		CalioRegisters.register(bus);
		PlayerAbilities.register();
	}

	private static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.register(IAbilityHolder.class);
	}
}
