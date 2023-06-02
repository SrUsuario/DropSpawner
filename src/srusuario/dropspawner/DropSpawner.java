/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package srusuario.dropspawner;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import srusuario.listeners.CustomListener;
import srusuario.listeners.SpawnerBreakListener;

/**
 *
 * Es la clase principal del plugin
 *
 * @author SrUsuario
 */
public class DropSpawner extends JavaPlugin {

    private PluginDescriptionFile pdffile = getDescription();
    private String version = ChatColor.GOLD + pdffile.getVersion();
    private String nombre = ChatColor.GREEN + "[" + ChatColor.BLUE + pdffile.getName() + ChatColor.GREEN + "] ";

    /**
     * Cuando el plugin se habilita
     */
    @Override
    public void onEnable() {
        // Se registran los eventos Listener
        getServer().getPluginManager().registerEvents(new SpawnerBreakListener(), this);
        getServer().getPluginManager().registerEvents(new CustomListener(), this);
        // Se mandan mensajes a la consola
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "<------------------------------>");
        Bukkit.getConsoleSender().sendMessage(nombre + ChatColor.YELLOW + "Ha sido activado (version: " + version + ChatColor.YELLOW + ")");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Gracias por utilizar el plugin :)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "<------------------------------>");
    }

    /**
     * Cuando el plugin se deshabilita
     */
    @Override
    public void onDisable() {
        // Se mandan mensajes a la consola
        Bukkit.getConsoleSender().sendMessage(nombre + ChatColor.RED + "Ha sido desactivado (version: " + version + ChatColor.RED + ")");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

}
