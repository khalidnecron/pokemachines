package com.khalidnecron.pokemachines.items

import com.khalidnecron.pokemachines.PokeMachines.MOD_ID
import dev.architectury.registry.registries.DeferredRegister
import dev.architectury.registry.registries.DeferredSupplier
import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys

class ItemRegister {
    companion object {

        private val items: DeferredRegister<Item> = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM)

        @JvmField
        val DISC_ITEM: DeferredSupplier<DiscItem> = items.register("empty_disc") {
            DiscItem(Item.Settings().maxCount(64))
        }

        fun register() {
            items.register()
        }
    }
}