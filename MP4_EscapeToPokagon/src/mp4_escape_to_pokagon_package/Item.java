/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

/**
 * A collection of information defining an interact-able item in the game
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
    
    /**
     * Returns the name of the Item
     * @return the name of the Item
     */
    public String getName() {
        return name;
    }
    
    /**
     * returns the room in which this item must be dropped for credit(points)
     * @return the room in which this item must be dropped for credit(points)
     */
    public int scoreRoom() {
        return scoreRoom;
    }
    
    /**
     * Returns the number of points rewarded for dropping in the scoreRoom
     * @return the number of points rewarded for dropping in the scoreRoo
     */
    public int returnReward() {
        int reward = pointValue;
        pointValue = 0;
        return reward;
    }
}
