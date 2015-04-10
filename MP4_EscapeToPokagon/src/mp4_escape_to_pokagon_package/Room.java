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

/**
 *
 * @author mtbjj
 */
public class Room {
    int northRoom;
    int eastRoom;
    int southRoom;
    int westRoom;
    int pointValue;
    String shortDescription;
    String longDescription;
    public Inventory inventory;
    
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
}
