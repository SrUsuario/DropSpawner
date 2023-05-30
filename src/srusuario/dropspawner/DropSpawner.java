/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package srusuario.dropspawner;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author SrUsuario
 */
public class DropSpawner extends JavaPlugin {

    PluginDescriptionFile pdffile = getDescription();
    public String version = ChatColor.GOLD + pdffile.getVersion();
    public String nombre = ChatColor.GREEN + "[" + ChatColor.BLUE + pdffile.getName() + ChatColor.GREEN + "] ";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "<------------------------------>");
        Bukkit.getConsoleSender().sendMessage(nombre + ChatColor.YELLOW + "Ha sido activado (version: " + version + ChatColor.YELLOW + ")");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Gracias por utilizar el plugin :)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "<------------------------------>");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(nombre + ChatColor.RED + "Ha sido desactivado (version: " + version + ChatColor.RED + ")");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

}
