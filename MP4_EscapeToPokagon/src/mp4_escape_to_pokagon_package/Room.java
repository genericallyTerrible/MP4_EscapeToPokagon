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
import java.util.ArrayList;

/**
 *
 * @author mtbjj
 */
public class Room {
    private int northRoom;
    private int eastRoom;
    private int southRoom;
    private int westRoom;
    private int pointValue;
    private String shortDescription;
    private String longDescription;
    private Inventory inventory;
    private boolean isFirstVisit = true;
    
    Room(String fileName) throws FileNotFoundException, IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        northRoom = Integer.parseInt(reader.readLine());
        eastRoom = Integer.parseInt(reader.readLine());
        southRoom = Integer.parseInt(reader.readLine());
        westRoom = Integer.parseInt(reader.readLine());
        pointValue = Integer.parseInt(reader.readLine());
        shortDescription = reader.readLine();
        String check = reader.readLine();
        inventory = new Inventory();
        while(!check.equals("END"))
        {
            longDescription += check + "\n";
            check = reader.readLine();
        }
        longDescription = longDescription.substring(0, longDescription.length()-1);
    }    
    
    public boolean isNorthRoom()
    {
        return northRoom != -1;
    }
    
    public int getNorthRoom()
    {
        return northRoom;
    }
    
    public boolean isEastRoom()
    {
        return eastRoom != -1;
    }
    
    public int getEastRoom()
    {
        return eastRoom;
    }
    
    public boolean isSouthRoom()
    {
        return southRoom != -1;
    }
    
    public int getSouthRoom()
    {
        return southRoom;
    }
    
    public boolean isWestRoom()
    {
        return westRoom != -1;
    }
    
    public int getWestRoom()
    {
        return westRoom;
    }
    
    public int getPointValue()
    {
        return pointValue;
    }
    
    public void setPointValue(int n)
    {
        pointValue = n;
    }
    
    public boolean addItem(Item obj) 
    {
        return inventory.addItem(obj);
    }
    
    public String getShortDescription()
    {
        return shortDescription;
    }
    
    public String getLongDescription()
    {
        return longDescription;
    }
    
    public Item removeItem(String itemName) 
    {
        return inventory.removeItem(itemName);
    }
    
    public boolean roomContains(String itemName){
        return inventory.contains(itemName);
    }
    
    public String roomContents() {
        if(inventory.numInInventory() > 0){
            String str = "";
            ArrayList<Item> currentInventory = inventory.itemsInInventory();
            for(Item item : currentInventory)
                str += ("There is a " + item.getName() + "on the ground\n");
            return str;
        }
        return "There are no items in this room\n";
    }
    
    public boolean isFirstVisit() {
        if(isFirstVisit){
            isFirstVisit = !isFirstVisit;
            return true;
        }
        return false;
    }
}