package com.khalidnecron.pokemachines.fabric

import com.khalidnecron.pokemachines.PokeMachines
import net.fabricmc.api.ModInitializer

@Suppress("unused")
object PokeMachinesFabric: ModInitializer {
    override fun onInitialize() {
        PokeMachines.init()
    }

}