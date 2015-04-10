/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp4_escape_to_pokagon_package;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Map {
    ArrayList<Room> rooms;//used to store all rooms used in this program
    Room currentRoom;//tracks the room the player is currently in
    private final int NUM_ROOMS = 37;//total number of rooms
    
    //int constants representing the 4 directions
    private final int NORTH = 1;
    private final int EAST = 2;
    private final int SOUTH = 3;
    private final int WEST = 4;
    
    Map() throws IOException
    {
        rooms = new ArrayList<>();
        for(int i = 0; i < NUM_ROOMS; i++)//adds a room for each .txt file
        {
            rooms.add(i, new Room("src/roomspackage/room" + i + ".txt"));
        }
        currentRoom = rooms.get(1);
        
        //all 8 items required by project parameters are placed in their
        //appropriate Rooms and given appropriate point values and final
        //room locations
        rooms.get(25).addItem(new Item("Pine cone", 30, 27));
        rooms.get(2).addItem(new Item("Parking receipt", 30, 31));
        rooms.get(15).addItem(new Item("Cattail", 40, 12));
        rooms.get(5).addItem(new Item("Boat", 20, 6));
        rooms.get(28).addItem(new Item("Canteen", 50, 23));
        rooms.get(36).addItem(new Item("Bluebird", 60, 20));
        rooms.get(22).addItem(new Item("Rusted key", 60, 35));
        rooms.get(4).addItem(new Item("Map", 90, 24));
    }
    
    /**
     * returns 4 booleans, each representing whether or not there is a room
     * in each direction. index 0 is north, 1 east, 2 south, and 3 west
     * @return boolean array containing 4 booleans
     */
    public boolean[] getMoveableDirections()
    {
        boolean[] directions = new boolean[4];
        directions[0] = currentRoom.isNorthRoom();
        directions[1] = currentRoom.isEastRoom();
        directions[2] = currentRoom.isSouthRoom();
        directions[3] = currentRoom.isWestRoom();
        return directions;
    }
    
    /**
     * checks if there is a room in the specified direction, then changes
     * currentRoom to the new Room
     * @param direction int value which should be either 1, 2, 3, or 4 which
     * represents north, east, south, and west
     */
    public void moveRooms(int direction)
    {
        switch(direction)
        {
            case NORTH:
                if(currentRoom.isNorthRoom())
                    currentRoom = rooms.get(currentRoom.getNorthRoom());
                break;
            case EAST:
                if(currentRoom.isEastRoom())
                    currentRoom = rooms.get(currentRoom.getEastRoom());
                break;
            case SOUTH:
                if(currentRoom.isSouthRoom())
                    currentRoom = rooms.get(currentRoom.getSouthRoom());
                break;
            case WEST:
                if(currentRoom.isWestRoom())
                    currentRoom = rooms.get(currentRoom.getWestRoom());
                break;
            default:
                System.out.println("no direction specified");
        }
    }
    
    /**
     * returns the points earned from getting to the current room. The current
     * room then has a point value of zero.
     * @return returns point value
     */
    public int addPoints()
    {
        int points = currentRoom.getPointValue();
        currentRoom.setPointValue(0);
        return points;
    }
    
    /**
     * Returns the index value of the current room in the rooms ArrayList
     * @return the index value of the current room in the rooms ArrayList
     */
    public int getRoomNumber() {
        return rooms.indexOf(currentRoom);
    }
    
    /**
     * Checks if the current room has within its inventory
     * an item with the name itemName
     * @param itemName name of the item in question
     * @return true if the current room contains the item, false otherwise
     */
    public boolean currentRoomContains(String itemName) {
        return currentRoom.roomContains(itemName);
    }
    
    /**
     * Adds the Item obj to the current room's inventory and returns a boolean
     * denoting the result of the operation. True if successful, false otherwise.
     * @param obj The item to be added to the inventory of the current room
     * @return a boolean denoting the state of the operation, true if successful, false otherwise
     */
    public boolean addItemToCurrentRoom(Item obj){
        return currentRoom.addItem(obj);
    }
    
    /**
     * Removes an item by name from the current room's inventory and returns
     * it as the result of the function
     * @param itemName Name of the item to be removed
     * @return The item removed if the operation was successful, null otherwise
     */
    public Item removeItemFromCurrentRoom(String itemName) {
        return currentRoom.removeItem(itemName);
    }
    
    /**
     * Returns a string containing the description of the current room, the longer
     * variant if this is the first visit, shorter otherwise
     * @return a string containing the description of the current room, the longer
     * variant if this is the first visit, shorter otherwise
     */
    public String roomVisit() {
        if(currentRoom.isFirstVisit()){
            return (currentRoom.getLongDescription());
        }
        return currentRoom.getShortDescription();
    }
    
    /**
     * Returns a string containing the long description of the current room and
     * any items i currently has in its inventory.
     * @return a string containing the long description of the current room and
     * any items i currently has in its inventory.
     */
    public String look(){
        return currentRoom.getLongDescription() + '\n' + currentContents();
    }
    
    /**
     * Returns a string containing the current inventory of the current room
     * @return a string containing the current inventory of the current room
     */
    public String currentContents() {
        return currentRoom.roomContents();
    }
}
