package com.khalidnecron.pokemachines.fabric

import com.khalidnecron.pokemachines.PokeMachines
import net.fabricmc.api.ModInitializer

object PokeMachinesFabric: ModInitializer {
    override fun onInitialize() {
        PokeMachines.init()
    }

}