/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author mtbjj
 */
public class mp4Frame extends javax.swing.JFrame {

    /**
     * Creates new form mp4Frame
     */
    
    private CompassLabel compassLabel;
    
    Map map;
    Player player;
    
    public mp4Frame() {
        initComponents();
        setTitle("Text Based Adventure Game");
        compassLabel = new CompassLabel();
        compassPanel.add(compassLabel);
        
        try {
            map = new Map();
        } catch (IOException ex) {
            Logger.getLogger(mp4Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        player = new Player();
        boolean[] moveableDirections = map.getMoveableDirections();
        compassLabel.showDirections(moveableDirections[0],moveableDirections[1],moveableDirections[2],moveableDirections[3]);
        roomNumLabel.setText("Room Number: " + map.getRoomNumber());
        scoreLabel.setText("Total Score: " + 0);
        
        JLabel treeImageLabel1;
        JLabel treeImageLabel2;
        String filename = "/images/tree.png";
        ImageIcon image = new ImageIcon(getClass().getResource(filename)); 
        treeImageLabel1 = new JLabel(image);
        treeImageLabel2 = new JLabel(image);
        treeImagePanel1.add(treeImageLabel1);
        treeImagePanel2.add(treeImageLabel2);
        
        JLabel footerImageLabel;
        filename = "/images/footer.png";
        image = new ImageIcon(getClass().getResource(filename)); 
        footerImageLabel = new JLabel(image);
        footerPanel.add(footerImageLabel);
        
        ioTextArea.setText(map.roomVisit() + '\n');
        ioTextArea.append("\n> ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ioTextArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        compassBackgroundPanel = new javax.swing.JPanel();
        roomNumLabel = new javax.swing.JLabel();
        compassPanel = new javax.swing.JPanel();
        compassTitleLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        treeImagePanel2 = new javax.swing.JPanel();
        treeImagePanel1 = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(124, 48, 241));
        setForeground(java.awt.Color.blue);
        setMinimumSize(new java.awt.Dimension(880, 560));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(51, 255, 51));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 4));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 255));
        backgroundPanel.setFocusCycleRoot(true);
        backgroundPanel.setMaximumSize(new java.awt.Dimension(880, 560));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(880, 560));
        backgroundPanel.setName("Escape To Pokagon"); // NOI18N
        backgroundPanel.setPreferredSize(new java.awt.Dimension(880, 565));

        ioTextArea.setBackground(new java.awt.Color(0, 0, 0));
        ioTextArea.setColumns(20);
        ioTextArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ioTextArea.setForeground(new java.awt.Color(0, 200, 0));
        ioTextArea.setRows(5);
        ioTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(51, 255, 51))); // NOI18N
        ioTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ioTextArea.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ioTextArea.setDoubleBuffered(true);
        ioTextArea.setFocusTraversalPolicyProvider(true);
        ioTextArea.setHighlighter(null);
        ioTextArea.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ioTextArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        ioTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ioTextAreaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ioTextAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ioTextArea);

        titleLabel.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 51));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Escape To Pokagon!");
        titleLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 0)));

        compassBackgroundPanel.setBackground(new java.awt.Color(0, 102, 0));
        compassBackgroundPanel.setBorder(new javax.swing.border.MatteBorder(null));

        roomNumLabel.setBackground(new java.awt.Color(204, 255, 204));
        roomNumLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        roomNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomNumLabel.setText("Room #");
        roomNumLabel.setOpaque(true);

        compassPanel.setBackground(new java.awt.Color(204, 255, 204));
        compassPanel.setToolTipText("Display's possible paths that can be taken from inside the current room.");
        compassPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compassPanel.setFocusCycleRoot(true);
        compassPanel.setMaximumSize(new java.awt.Dimension(260, 327));
        compassPanel.setMinimumSize(new java.awt.Dimension(260, 327));
        compassPanel.setLayout(new java.awt.GridLayout(1, 1));

        compassTitleLabel.setBackground(new java.awt.Color(204, 255, 204));
        compassTitleLabel.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        compassTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compassTitleLabel.setText("Compass");
        compassTitleLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        compassTitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compassTitleLabel.setOpaque(true);

        scoreLabel.setBackground(new java.awt.Color(204, 255, 204));
        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Total Score: ");
        scoreLabel.setOpaque(true);

        javax.swing.GroupLayout compassBackgroundPanelLayout = new javax.swing.GroupLayout(compassBackgroundPanel);
        compassBackgroundPanel.setLayout(compassBackgroundPanelLayout);
        compassBackgroundPanelLayout.setHorizontalGroup(
            compassBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compassBackgroundPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(compassBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compassTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        compassBackgroundPanelLayout.setVerticalGroup(
            compassBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compassBackgroundPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(compassTitleLabel)
                .addGap(5, 5, 5)
                .addComponent(roomNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(compassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        treeImagePanel2.setOpaque(false);
        treeImagePanel2.setPreferredSize(new java.awt.Dimension(30, 50));

        treeImagePanel1.setOpaque(false);
        treeImagePanel1.setPreferredSize(new java.awt.Dimension(30, 50));

        footerPanel.setOpaque(false);
        footerPanel.setPreferredSize(new java.awt.Dimension(800, 40));
        footerPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(treeImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(treeImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compassBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(treeImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(compassBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void ioTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioTextAreaKeyReleased
        //If the enter key was released
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Boolean to check if the player transitioned to a different room
            boolean moved = false;
            //Since the Map class reads from a file and may throw an IOException, everything
            //interacting with it is in a try->catch
            try{
                //Sets line number to that of the user's command
                int lineNumber = ioTextArea.getLineCount() - 2;
                //Gets offset + 2 for the "> " before an entry
                int offset = ioTextArea.getLineStartOffset(lineNumber) + 2;
                //offset of the end of the user's command
                int endOfLine = ioTextArea.getLineEndOffset(lineNumber) -  1;
                //No command was entered
                if(endOfLine - offset == 0) {
                    //Alert user, break away
                    ioTextArea.insert("Please enter a command\n\n> ", offset + 1);
                    return;
                }
                
                //User Spammed enter
                if(endOfLine - offset < 0) {
                    ioTextArea.setText("Please do not spam, it isn't nice.\n\n");
                    ioTextArea.append(map.shortDesc() + "\n> ");
                    return;
                }
                
                //User's command
                String command = ioTextArea.getText(offset, endOfLine - offset);
                
                //If the command was too short
                if(endOfLine - offset <= 3) {
                    ioTextArea.append("\"" + command + "\" is not a recognized command\n\n> ");
                    return;
                }
                
                //Booleans that denotes if a given direction is valid in the given context (room)
                boolean[] moveableDirections = map.getMoveableDirections();
                boolean north = moveableDirections[0];
                boolean east = moveableDirections[1];
                boolean south = moveableDirections[2];
                boolean west = moveableDirections[3];
                
                
                if(command.equalsIgnoreCase("go north") || command.equalsIgnoreCase("move north") || command.equalsIgnoreCase("north")){ 
                    //Move north function + error check
                    if(north) {
                        map.moveRooms(1);
                        moved = true;
                    } else 
                        ioTextArea.append("North is not a valid direction\n");   
                } else if(command.equalsIgnoreCase("go east") || command.equalsIgnoreCase("move east") || command.equalsIgnoreCase("east")){
                    //Move east function + error check
                    if(east) {
                        map.moveRooms(2);
                        moved = true;
                    } else 
                        ioTextArea.append("East is not a valid direction\n");
                } else if(command.equalsIgnoreCase("go south") || command.equalsIgnoreCase("move south") || command.equalsIgnoreCase("south")){
                    //Move south function + error check
                    if(south) {
                        map.moveRooms(3);
                        moved = true;
                    } else 
                        ioTextArea.append("South is not a valid direction\n");
                } else if(command.equalsIgnoreCase("go west") || command.equalsIgnoreCase("move west") || command.equalsIgnoreCase("west")){
                    //Move west function + error check
                    if(west) {
                        map.moveRooms(4);
                        moved = true;
                    } else 
                        ioTextArea.append("West is not a valid direction\n");
                }
                
                else if(command.substring(0, 4).equalsIgnoreCase("look")) {
                    //Check for items etc
                    ioTextArea.setText(map.look());
                }
                
                else if(endOfLine - offset >= 9 && command.substring(0, 9).equalsIgnoreCase("inventory"))  {
                    ioTextArea.append(player.checkInventory());
                }
                
                else if(command.substring(0, 4).equalsIgnoreCase("quit")) {
                    System.exit(0);
                }
                
                else if(command.substring(0, 4).equalsIgnoreCase("take")) {
                    if(command.length() > 5){                    
                        //Check for items etc
                        String item = command.substring(5, command.length());
                        if(map.currentRoomContains(item)){
                            Item playerWants = map.removeItemFromCurrentRoom(item); 
                            if(player.addItem(playerWants)){
                                ioTextArea.append("You took " + item + '\n');
                            } else {
                                map.addItemToCurrentRoom(playerWants);
                                ioTextArea.append("Your inventory is full! You cannot carry " + item + '\n');
                            }
                        } else {
                            ioTextArea.append(item + " is not in this room\n");
                        }
                    } else 
                        ioTextArea.append("You cannot take nothing\n");
                } 
                
                else if(command.substring(0, 4).equalsIgnoreCase("drop")) {
                    //Check for items etc
                    if (command.length() > 5){
                        String item = command.substring(5, command.length());
                        //If player has said item
                        if(player.playerHas(item)){
                            Item droppeditem = player.dropItem(item);
                            //If item can be added to the current rooom's inventory
                            if(map.addItemToCurrentRoom(droppeditem)) {
                                //Alert user
                                ioTextArea.append("You dropped " + item + '\n');
                                //If there was a reward for dropping said item in this room
                                if(droppeditem.scoreRoom() == map.getRoomNumber()){
                                    int reward = droppeditem.returnReward();
                                    //If there is still a reward for dropping this item
                                    if(reward > 0) {
                                        player.addToScore(reward);
                                        ioTextArea.append("You got " + reward + " points for " + item + "\n");
                                    }                                                                
                                }
                            }
                        } else 
                            ioTextArea.append("You do not have " + item + '\n');
                    } else 
                        ioTextArea.append("You cannot drop nothing\n");
                } else
                    ioTextArea.append("\"" + command + "\" is not a recognized command\n");
            } catch (BadLocationException ex) { //Try failed
                Logger.getLogger(mp4Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //If the command resulted in a move, update the compass label for the new room
            if(moved){
                boolean[] moveableDirections = map.getMoveableDirections();
                boolean north = moveableDirections[0];
                boolean east = moveableDirections[1];
                boolean south = moveableDirections[2];
                boolean west = moveableDirections[3];
                compassLabel.showDirections(north, east, south, west);
                roomNumLabel.setText("Room Number: " + map.getRoomNumber());
                ioTextArea.setText(map.roomVisit() + '\n');
                //If points are awarded for visiting this room, do so, but only the first time
                int visitPoints = map.addPoints();
                if(visitPoints != 0){
                    player.addToScore(visitPoints);
                }
            }
            //Update player's score
            scoreLabel.setText("Total Score: " + player.getScore());
            ioTextArea.append("\n> ");
        }
    }//GEN-LAST:event_ioTextAreaKeyReleased

    private void ioTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioTextAreaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        }
    }//GEN-LAST:event_ioTextAreaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mp4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mp4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mp4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mp4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mp4Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel compassBackgroundPanel;
    private javax.swing.JPanel compassPanel;
    private javax.swing.JLabel compassTitleLabel;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JTextArea ioTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel roomNumLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel treeImagePanel1;
    private javax.swing.JPanel treeImagePanel2;
    // End of variables declaration//GEN-END:variables
}
