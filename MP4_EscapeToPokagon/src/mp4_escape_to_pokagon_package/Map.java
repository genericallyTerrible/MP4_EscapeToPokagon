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
    ArrayList<Room> rooms;
    Room currentRoom;
    private final int NUM_ROOMS = 37;
    private final int NORTH = 1;
    private final int EAST = 2;
    private final int SOUTH = 3;
    private final int WEST = 4;
    
    Map() throws IOException
    {
        rooms = new ArrayList<>();
        for(int i = 0; i < NUM_ROOMS; i++)
        {
            rooms.add(i, new Room("src/roomspackage/room" + i + ".txt"));
        }
        currentRoom = rooms.get(1);
        
        //change rooms and points when rooms are finished
        rooms.get(2).addItem(new Item("Pine cone", 100, 1));
        //rooms[1].addItem(new Item("Parking receipt", 100, 10));
        //rooms[1].addItem(new Item("Cattail", 100, 10));
        //rooms[1].addItem(new Item("Boat", 100, 10));
        //rooms[1].addItem(new Item("Canteen", 100, 10));
        //rooms[1].addItem(new Item("Bluebird", 100, 10));
        //rooms[1].addItem(new Item("Rusted key", 100, 10));
        //rooms[1].addItem(new Item("Map", 100, 10));
    }
    
    public boolean[] getMoveableDirections()
    {
        boolean[] directions = new boolean[4];
        directions[0] = currentRoom.isNorthRoom();
        directions[1] = currentRoom.isEastRoom();
        directions[2] = currentRoom.isSouthRoom();
        directions[3] = currentRoom.isWestRoom();
        return directions;
    }
    
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
    
    public int getRoomNumber() {
        return rooms.indexOf(currentRoom);
    }
    
    public boolean currentRoomContains(String itemName) {
        return currentRoom.roomContains(itemName);
    }
    
    public boolean addItemToCurrentRoom(Item obj){
        return currentRoom.addItem(obj);
    }
    
    public Item removeItemFromCurrentRoom(String itemName) {
        return currentRoom.removeItem(itemName);
    }
    
    public String roomVisit() {
        if(currentRoom.isFirstVisit()){
            return (currentRoom.getLongDescription());
        }
        return currentRoom.getShortDescription();
    }
    
    public String look(){
        return currentRoom.getLongDescription() + '\n' + currentContents();
    }
    
    public String currentContents() {
        return currentRoom.roomContents();
    }
}
