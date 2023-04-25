package com.github.sib_energy_craft.ores.load;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;

import java.util.Set;

/**
 * @author drobyshev-ma
 * Created at 16-03-2023
 */
@Slf4j
public class Loader implements ModInitializer {

    @Override
    @SneakyThrows
    public void onInitialize() {
        log.debug("Load: {}", Loader.class.getName());
        for (var type : Set.of(Blocks.class, Items.class, PlacedFeatures.class)) {
            log.debug("Loaded: {}", Class.forName(type.getName()));
        }
        log.debug("Loaded: {}", Loader.class.getName());
    }
}
