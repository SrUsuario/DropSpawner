/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srusuario.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * Guarda el jugador que rompio el Spawner y el Spawner
 * 
 * @author SrUsuario
 */
public class SpawnerBreakEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Player breaker;
    private Block spawner;

    /**
     *
     * @param breaker
     * @param spawner
     */
    public SpawnerBreakEvent(Player breaker, Block spawner) {
        this.breaker = breaker;
        this.spawner = spawner;
    }

    /**
     *
     * @return
     */
    public Player getBreaker() {
        return breaker;
    }

    /**
     *
     * @param breaker
     */
    public void setBreaker(Player breaker) {
        this.breaker = breaker;
    }

    /**
     *
     * @return
     */
    public Block getSpawner() {
        return spawner;
    }

    /**
     *
     * @param spawner
     */
    public void setSpawner(Block spawner) {
        this.spawner = spawner;
    }

    /**
     *
     * @return
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     *
     * @return
     */
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
