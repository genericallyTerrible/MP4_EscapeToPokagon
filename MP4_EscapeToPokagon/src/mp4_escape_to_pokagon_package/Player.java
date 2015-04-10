package mp4_escape_to_pokagon_package;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Holds an Inventory with a maximum carrying capacity and the score of points accrued
 * @author mtbjj
 */
public class Player {
    private Inventory inventory;
    private static final int MAX_ITEMS = 4;
    private int score;
    
    Player() {
        inventory = new Inventory(MAX_ITEMS);
        score = 0;
    }
    
    /**
     * Adds the value of score to the player's current score
     * @param score Adds the value of score to the player's current score
     */
    public void addToScore(int score) {
        this.score += score;
    }
    
    /**
     * Returns the players score so far
     * @return the players score so far
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Adds an item to the player's inventory if possible
     * @param obj the Item to be added to the player's inventory
     * @return true if the addition was successful, false otherwise
     */
    public boolean addItem(Item obj) {
        return inventory.addItem(obj);
    }
    
    /**
     * Removes an item from the player's inventory if possible
     * @param itemName name of the item to be removed
     * @return returns the Item if removed, null if unsuccessful
     */
    public Item dropItem(String itemName) {
        return inventory.removeItem(itemName);
    }
    
    /**
     * Checks a player's inventory for a specific item by name
     * @param itemName name of the specific item in question
     * @return true if player has the item, false otherwise
     */
    public boolean playerHas(String itemName){
        return inventory.contains(itemName);
    }
    
    /**
     * Returns a formated string to be displayed to the user showing their current inventory
     * @return a formated string to be displayed to the user showing their current inventory
     */
    public String checkInventory() {
        if(inventory.numInInventory() > 0){
            String str = "You check your inventory:\n";
            ArrayList<Item> currentInventory = inventory.itemsInInventory();
            for(Item item : currentInventory) {
                str += ("\t" + item.getName() + "\n");
            }
            return str;
        }
        return "Your inventory is currently empty.\n";
    }
}
