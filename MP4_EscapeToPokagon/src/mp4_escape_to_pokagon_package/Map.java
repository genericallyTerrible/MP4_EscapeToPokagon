/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp4_escape_to_pokagon_package;

import java.io.IOException;

/**
 *
 * @author Andrew
 */
public class Map {
    Room[] rooms;
    Room currentRoom;
    private final int NUM_ROOMS = 5;
    private final int NORTH = 1;
    private final int EAST = 2;
    private final int SOUTH = 3;
    private final int WEST = 4;
    
    Map() throws IOException
    {
        rooms = new Room[NUM_ROOMS];
        for(int i = 0; i < NUM_ROOMS; i++)
        {
            rooms[i] = new Room("src/roomspackage/room" + i + ".txt");
        }
        currentRoom = rooms[0];
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
                    currentRoom = rooms[currentRoom.getNorthRoom()];
                break;
            case EAST:
                if(currentRoom.isEastRoom())
                    currentRoom = rooms[currentRoom.getEastRoom()];
                break;
            case SOUTH:
                if(currentRoom.isSouthRoom())
                    currentRoom = rooms[currentRoom.getSouthRoom()];
                break;
            case WEST:
                if(currentRoom.isWestRoom())
                    currentRoom = rooms[currentRoom.getWestRoom()];
                break;
            default:
                System.out.println("no direction specified");
        }
    }
}
