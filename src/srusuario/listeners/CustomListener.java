/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srusuario.listeners;

import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import srusuario.events.SpawnerBreakEvent;

/**
 *
 * Escucha si lo que se rompe es un Spawner y añade el mismo Spawner del mismo tipo
 * 
 * @author SrUsuario
 */
public class CustomListener implements Listener {

    /**
     * Si lo que se rompe es un Spawner da el Spawner con el tipo del Spawner roto
     * y lo añade al inventario del jugador si hay sitio
     * 
     * @param e el evento
     */
    @EventHandler
    public void onSpawnerBreak(SpawnerBreakEvent e) {
        CreatureSpawner cs = (CreatureSpawner) e.getSpawner().getState();
        ItemStack spawnerGive = new ItemStack(Material.SPAWNER);

        BlockStateMeta meta = (BlockStateMeta) spawnerGive.getItemMeta();
        CreatureSpawner css = (CreatureSpawner) meta.getBlockState();

        css.setSpawnedType(cs.getSpawnedType());
        meta.setBlockState(css);
        spawnerGive.setItemMeta(meta);

        e.getBreaker().getInventory().addItem(spawnerGive);
    }

}
