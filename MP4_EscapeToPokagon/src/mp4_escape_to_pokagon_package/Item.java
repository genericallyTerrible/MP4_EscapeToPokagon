/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

/**
 *
 * @author mtbjj
 */
public class Item {
    
    private String name;
    private int pointValue;
    private int scoreRoom;
    
    Item(String name, int pointValue, int scoreRoom){
        this.name          = name;
        this.pointValue    = pointValue;
        this.scoreRoom     = scoreRoom;
    }
    
    public String getName() {
        return name;
    }
    
    public int scoreRoom() {
        return scoreRoom;
    }
    
    public int pointValue() {
        return pointValue;
    }
}
