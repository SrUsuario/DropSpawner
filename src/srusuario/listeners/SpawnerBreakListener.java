/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srusuario.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import srusuario.events.SpawnerBreakEvent;

/**
 *
 * Escucha cuando se rompe el spawner y llama a SpawnerBreakEvent si el usuario
 * que rompe el bloque tiene 1 espacio libre en el inventario
 *
 * @author SrUsuario
 */
public class SpawnerBreakListener implements Listener {

    /**
     * Si el bloque que se rompe es un Spawner y se rompe con una herramienta
     * con toque de seda y el usuario tiene 1 espacio libre en el inventario
     *
     * @param e el evento
     */
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block blockBroken = e.getBlock();
        if (blockBroken.getType().equals(Material.SPAWNER) && e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
            // Verifica si el player no tiene 1 espacio en el inventario
            if (e.getPlayer().getInventory().firstEmpty() == -1) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "No tienes espacio en el inventario para el spawner");
            } else {
                Bukkit.getServer().getPluginManager().callEvent(new SpawnerBreakEvent(e.getPlayer(), blockBroken));
            }
        }
    }

}
