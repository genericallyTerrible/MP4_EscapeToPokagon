/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Andrew Krause
 */
public class Room {
    //ints representing other room numbers
    private int northRoom;
    private int eastRoom;
    private int southRoom;
    private int westRoom;
    
    //represents number of points earned from visiting this room
    private int pointValue;
    
    //descriptions of the room
    private String shortDescription;
    private String longDescription;
    
    //contains Items that can be dropped by players or simply start here
    private Inventory inventory;
    
    //false if it isn't the first time this room has been visited
    private boolean isFirstVisit = true;
    
    Room(InputStream inputStream) throws IOException
    {
        //creates a reader for the given fileName, and gets all the data 
        //for the Room from it
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        northRoom = Integer.parseInt(reader.readLine());
        eastRoom = Integer.parseInt(reader.readLine());
        southRoom = Integer.parseInt(reader.readLine());
        westRoom = Integer.parseInt(reader.readLine());
        pointValue = Integer.parseInt(reader.readLine());
        shortDescription = reader.readLine();
        String check = reader.readLine();
        inventory = new Inventory();
        longDescription = "";
        while(!check.equals("END"))//longDescription = all remaining text exept for the final "END"
        {
            longDescription += check + "\n";
            check = reader.readLine();
        }
        longDescription = longDescription.substring(0, longDescription.length()-1);
        inputStream.close();
    }    
    
    /**
     * checks if there is a room north of this room
     * @return true if there is a room, false if otherwise
     */
    public boolean isNorthRoom()
    {
        return northRoom != -1;
    }
    
    /**
     * gives room number for the room north of this room
     * @return room number
     */
    public int getNorthRoom()
    {
        return northRoom;
    }
    
    /**
     * checks if there is a room east of this room
     * @return true if there is a room, false if otherwise
     */
    public boolean isEastRoom()
    {
        return eastRoom != -1;
    }
    
    /**
     * gives room number for the room east of this room
     * @return room number
     */
    public int getEastRoom()
    {
        return eastRoom;
    }
    
    /**
     * checks if there is a room south of this room
     * @return true if there is a room, false if otherwise
     */
    public boolean isSouthRoom()
    {
        return southRoom != -1;
    }
    
    /**
     * gives room number for the room south of this room
     * @return room number
     */
    public int getSouthRoom()
    {
        return southRoom;
    }
    
    /**
     * checks if there is a room west of this room
     * @return true if there is a room, false if otherwise
     */
    public boolean isWestRoom()
    {
        return westRoom != -1;
    }
    
    /**
     * gives room number for the room west of this room
     * @return room number
     */
    public int getWestRoom()
    {
        return westRoom;
    }
    
    /**
     * gets the point value of the room when it is entered
     * @return pointValue
     */
    public int getPointValue()
    {
        return pointValue;
    }
    
    /**
     * changes the point value of this room. Primarily used to set the point value to zero
     * @param n the new point value
     */
    public void setPointValue(int n)
    {
        pointValue = n;
    }
    
    /**
     * adds an item to this room's inventory
     * @param obj Item class object
     * @return true if succeeded in adding item
     */
    public boolean addItem(Item obj) 
    {
        return inventory.addItem(obj);
    }
    
    /**
     * returns the one-line description for a room
     * @return shortDescription
     */
    public String getShortDescription()
    {
        return shortDescription;
    }
    
    /**
     * returns the multi-line description for a room
     * @return longDescription
     */
    public String getLongDescription()
    {
        return longDescription;
    }
    
    /**
     * removes an item from this room's inventory
     * @param itemName the name of the Item to be removed
     * @return the Item removed
     */
    public Item removeItem(String itemName) 
    {
        return inventory.removeItem(itemName);
    }
    
    /**
     * checks to see if the room contains a certain Item
     * @param itemName the name of the Item in question
     * @return true if an item with the name itemName is in this room's inventory
     */
    public boolean roomContains(String itemName){
        return inventory.contains(itemName);
    }
    
    /**
     * checks this room's inventory for Items, and displays them in a user
     * friendly manner.
     * @return a long string showing what Items are here
     */
    public String roomContents() {
        if(inventory.numInInventory() > 0){
            String str = "";
            ArrayList<Item> currentInventory = inventory.itemsInInventory();
            for(Item item : currentInventory)
                str += ("There is a " + item.getName() + " on the ground\n");
            return str;
        }
        return "There are no items in this room\n";
    }
    
    /**
     * returns true the first time this function is used, then false all other times
     * @return true if it is the first time this room has been visited
     */
    public boolean isFirstVisit() {
        if(isFirstVisit){
            isFirstVisit = !isFirstVisit;
            return true;
        }
        return false;
    }
}