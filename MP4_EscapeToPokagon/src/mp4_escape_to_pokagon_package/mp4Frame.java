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
        ioTextArea.setText(map.roomVisit() + '\n');
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(124, 48, 241));
        setForeground(java.awt.Color.blue);
        setMaximumSize(new java.awt.Dimension(880, 560));
        setMinimumSize(new java.awt.Dimension(880, 560));
        setPreferredSize(new java.awt.Dimension(885, 593));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(51, 255, 51));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 4));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 255));
        backgroundPanel.setFocusCycleRoot(true);
        backgroundPanel.setMaximumSize(new java.awt.Dimension(880, 560));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(880, 560));
        backgroundPanel.setName("Escape To Pokagon"); // NOI18N
        backgroundPanel.setPreferredSize(new java.awt.Dimension(880, 565));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ioTextArea.setBackground(new java.awt.Color(0, 0, 0));
        ioTextArea.setColumns(20);
        ioTextArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ioTextArea.setForeground(new java.awt.Color(0, 200, 0));
        ioTextArea.setRows(5);
        ioTextArea.setToolTipText("");
        ioTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 255, 51))); // NOI18N
        ioTextArea.setCaretColor(new java.awt.Color(0, 200, 0));
        ioTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ioTextArea.setDoubleBuffered(true);
        ioTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ioTextAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ioTextArea);

        backgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 550, 410));

        titleLabel.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 51));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Escape To Pokagon!");
        titleLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 0)));
        backgroundPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 370, 40));

        compassBackgroundPanel.setBackground(new java.awt.Color(0, 102, 0));
        compassBackgroundPanel.setBorder(new javax.swing.border.MatteBorder(null));
        compassBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomNumLabel.setBackground(new java.awt.Color(204, 255, 204));
        roomNumLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        roomNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomNumLabel.setText("Room #");
        roomNumLabel.setToolTipText("");
        roomNumLabel.setOpaque(true);
        compassBackgroundPanel.add(roomNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 50));

        compassPanel.setBackground(new java.awt.Color(204, 255, 204));
        compassPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compassPanel.setFocusCycleRoot(true);
        compassPanel.setMaximumSize(new java.awt.Dimension(260, 327));
        compassPanel.setMinimumSize(new java.awt.Dimension(260, 327));
        compassPanel.setLayout(new java.awt.GridLayout(1, 1));
        compassBackgroundPanel.add(compassPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 230));

        compassTitleLabel.setBackground(new java.awt.Color(204, 255, 204));
        compassTitleLabel.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        compassTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compassTitleLabel.setText("Compass");
        compassTitleLabel.setToolTipText("");
        compassTitleLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        compassTitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compassTitleLabel.setOpaque(true);
        compassBackgroundPanel.add(compassTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        scoreLabel.setBackground(new java.awt.Color(204, 255, 204));
        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Total Score: ");
        scoreLabel.setToolTipText("");
        scoreLabel.setOpaque(true);
        compassBackgroundPanel.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 260, 40));

        backgroundPanel.add(compassBackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 410));

        treeImagePanel2.setOpaque(false);
        treeImagePanel2.setPreferredSize(new java.awt.Dimension(30, 50));
        backgroundPanel.add(treeImagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        treeImagePanel1.setOpaque(false);
        treeImagePanel1.setPreferredSize(new java.awt.Dimension(30, 50));
        backgroundPanel.add(treeImagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 30, 50));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void ioTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioTextAreaKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean moved = false;
            try{
                int lineNumber = ioTextArea.getLineCount() - 2;
                int offset = ioTextArea.getLineStartOffset(lineNumber);
                int endOfLine = ioTextArea.getLineEndOffset(lineNumber) -  1;
                if(endOfLine - offset == 0) {
                    ioTextArea.insert("Please enter a command", offset);
                    return;
                }
                String command = ioTextArea.getText(offset, endOfLine - offset);
                
                if(endOfLine - offset <= 3) {
                    ioTextArea.append("\"" + command + "\" is not a recognized command\n");
                    return;
                }
                
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
                        ioTextArea.append("\"" + command + "\" is not a valid direction\n");
                } else if(command.equalsIgnoreCase("go east") || command.equalsIgnoreCase("move east") || command.equalsIgnoreCase("east")){
                    //Move east function + error check
                    if(east) {
                        map.moveRooms(2);
                        moved = true;
                    } else 
                        ioTextArea.append("\"" + command + "\" is not a valid direction\n");
                } else if(command.equalsIgnoreCase("go south") || command.equalsIgnoreCase("move south") || command.equalsIgnoreCase("south")){
                    //Move south function + error check
                    if(south) {
                        map.moveRooms(3);
                        moved = true;
                    } else 
                        ioTextArea.append("\"" + command + "\" is not a valid direction\n");
                } else if(command.equalsIgnoreCase("go west") || command.equalsIgnoreCase("move west") || command.equalsIgnoreCase("west")){
                    //Move west function + error check
                    if(west) {
                        map.moveRooms(4);
                        moved = true;
                    } else 
                        ioTextArea.append("\"" + command + "\" is not a valid direction\n");
                }
                
                else if(command.substring(0, 4).equalsIgnoreCase("look")) {
                    //Check for items etc
                    ioTextArea.append(map.look() + '\n');
                }
                
                else if(command.substring(0, 4).equalsIgnoreCase("take")) {
                    //Check for items etc
                    String item = command.substring(5, command.length());
                    if(map.currentRoomContains(item)){
                        if(player.addItem(map.removeItemFromCurrentRoom(item))){
                            ioTextArea.append("You took " + item + '\n');
                        }
                    } else {
                        ioTextArea.append(item + " is not in this room\n");
                    }
                } 
                
                else if(command.substring(0, 4).equalsIgnoreCase("drop")) {
                    //Check for items etc
                    String item = command.substring(5, command.length());
                    if(player.playerHas(item)){
                        Item droppeditem = player.dropItem(item);
                        if(map.addItemToCurrentRoom(droppeditem)) {
                            ioTextArea.append("You dropped " + item + '\n');
                            if(droppeditem.scoreRoom() == map.getRoomNumber()){
                                int reward = droppeditem.returnReward();
                                if(reward > 0) {
                                    player.addToScore(reward);
                                    ioTextArea.append("You got " + reward + " points for " + item + "\n");
                                    ioTextArea.append("Your current score is " + player.getScore() + " points\n");
                                }                                                                
                            }
                        }
                    } else {
                        ioTextArea.append("You do not have " + item + '\n');
                    }
                } else {
                    ioTextArea.append("\"" + command + "\" is not a recognized command\n");
                }
            } catch (BadLocationException ex) {
                Logger.getLogger(mp4Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(moved){
                boolean[] moveableDirections = map.getMoveableDirections();
                boolean north = moveableDirections[0];
                boolean east = moveableDirections[1];
                boolean south = moveableDirections[2];
                boolean west = moveableDirections[3];
                compassLabel.showDirections(north, east, south, west);
                roomNumLabel.setText("Room Number: " + map.getRoomNumber());
                ioTextArea.setText(map.roomVisit() + '\n');
            }
            scoreLabel.setText("Total Score: " + player.getScore());
        }
    }//GEN-LAST:event_ioTextAreaKeyReleased

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mp4Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel compassBackgroundPanel;
    private javax.swing.JPanel compassPanel;
    private javax.swing.JLabel compassTitleLabel;
    private javax.swing.JTextArea ioTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel roomNumLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel treeImagePanel1;
    private javax.swing.JPanel treeImagePanel2;
    // End of variables declaration//GEN-END:variables
}
