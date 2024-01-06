package com.khalidnecron.pokemachines

import com.khalidnecron.pokemachines.items.ItemRegister
import com.mojang.logging.LogUtils.getLogger
import org.slf4j.Logger

object PokeMachines {

    const val MOD_ID = "pokemachines"

    private const val CONFIG_PATH = "config/pokemachines/options.json"

    @JvmField
    val LOGGER: Logger = getLogger()

    fun init() {
        ItemRegister.register()
    }

}