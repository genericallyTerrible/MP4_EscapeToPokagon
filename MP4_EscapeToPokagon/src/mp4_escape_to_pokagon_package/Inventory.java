/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

import java.util.ArrayList;

/**
 * Allows for addition of Items into a storage array
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
    
    /**
     * Checks the inventory array to see if it contains any item with the name value passed
     * @param ItemName Name of the item you are interested in seeing if is contained
     * @return Returns true if an item with name ItemName is found, false if not.
     */
    public boolean contains(String ItemName) {
        for(Item item : inventory)
            if(item.getName().equalsIgnoreCase(ItemName))
                return true;
        return false;
    }
    
    /**
     * Adds an item into the inventory array, so long as there is 'room'
     * @param obj The Item you want added to the list
     * @return returns true if the Item obj was successfully added to the 
     * ArrayList, false if unsuccessful;
     */
    public boolean addItem(Item obj) {
        if(maxNumItems - (numItems) > 0) {
            numItems++;
            return inventory.add(obj);
        }
        return false;
    }
    
    /**
     * Takes a string and removes the item with that name, if possible
     * @param itemName name of the Item you want removed
     * @return The Item that was removed, if successful, null if otherwise
     */
    public Item removeItem(String itemName) {
        for(Item item : inventory) {
            if(item.getName().equalsIgnoreCase(itemName)){
                numItems--;
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }
    
    /**
     * returns a copy of the whole ArrayList
     * @return an ArrayList copy of the inventory ArrayList
     */
    public ArrayList<Item> itemsInInventory() {
        return inventory;
    }
    
    /**
     * Returns the current number of items in the inventory array
     * @return the current number of items in the inventory array
     */
    public int numInInventory() {
        return numItems;
    }
    
}
