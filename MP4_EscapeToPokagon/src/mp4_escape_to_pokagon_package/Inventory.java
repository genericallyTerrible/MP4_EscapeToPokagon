/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

import java.util.ArrayList;

/**
 *
 * @author mtbjj
 */
public class Inventory {
    private ArrayList<Item> inventory;
    private int maxNumItems;
    private int numItems;
    
    Inventory() {
        inventory = new ArrayList();
        this.maxNumItems = 100;
        numItems = 0;
    }
    
    Inventory(int maxNumItems) {
        inventory = new ArrayList();
        this.maxNumItems = maxNumItems;
        numItems = 0;
    }
    
    public boolean contains(String ItemName) {
        for(Item item : inventory)
            if(item.getName())
    }
    
    public boolean addItem(Item obj) {
        if(maxNumItems - (numItems + 1) > 0) {
            return inventory.add(obj);
        }
        return false;
    }
    
    public Item removeItem(Item obj) {
        if(inventory.contains(obj)){
            inventory.remove(obj);
            return obj;
        }
        return null;
    }
    
    
    
}
