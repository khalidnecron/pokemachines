package com.khalidnecron.pokemachines.forge

import com.khalidnecron.pokemachines.PokeMachines
import com.khalidnecron.pokemachines.PokeMachines.MOD_ID
import net.minecraftforge.fml.common.Mod

@Mod(MOD_ID)
object PokeMachinesForge {

    init {
        PokeMachines.init()
    }
}