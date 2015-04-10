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
        
    }
}
