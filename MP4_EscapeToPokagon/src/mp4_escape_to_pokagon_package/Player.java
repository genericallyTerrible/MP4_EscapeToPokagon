package mp4_escape_to_pokagon_package;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
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
    
    public void addToScore(int score) {
        this.score += score;
    }
    
    public int getScore() {
        return score;
    }
    
    public void reset() {
        inventory = new Inventory(MAX_ITEMS);
        score = 0;
    }
    
    public boolean addItem(Item obj) {
        return inventory.addItem(obj);
    }
    
    public Item dropItem(String itemName) {
        return inventory.removeItem(itemName);
    }
    
    public boolean playerHas(String itemName){
        return inventory.contains(itemName);
    }
    
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
