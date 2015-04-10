package mp4_escape_to_pokagon_package;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mtbjj
 */
public class Player {
    private Inventory inventory;
    private static final int MAX_ITEMS = 4;
    private int score;
    
    Player() {
        inventory = new Inventory(MAX_ITEMS);
        score = 0;
    }
    
    public void addToScore(int score) {
        this.score += score;
    }
    
    public int getScore() {
        return score;
    }
    
    public void reset() {
        inventory = new Inventory(MAX_ITEMS);
        score = 0;
    }
    
    public boolean addItem(Item obj) {
        return inventory.addItem(obj);
    }
    
    public Item dropItem(Item obj) {
        return inventory.removeItem(obj);
    }
    
}
