/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4_escape_to_pokagon_package;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author mtbjj
 */
public class mp4Frame extends javax.swing.JFrame {

    /**
     * Creates new form mp4Frame
     */
    
    private CompassLabel compassLabel;
    
    public mp4Frame() {
        initComponents();
        compassLabel = new CompassLabel();
        compassPanel.add(compassLabel);
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
        ioTextField = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        compassBackgroundPanel = new javax.swing.JPanel();
        compassPanel = new javax.swing.JPanel();
        compassTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(124, 48, 241));
        setForeground(java.awt.Color.blue);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(51, 255, 51));
        backgroundPanel.setForeground(new java.awt.Color(0, 0, 255));
        backgroundPanel.setName("Escape To Pokagon"); // NOI18N
        backgroundPanel.setPreferredSize(new java.awt.Dimension(880, 510));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ioTextField.setBackground(new java.awt.Color(0, 0, 0));
        ioTextField.setColumns(20);
        ioTextField.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ioTextField.setForeground(new java.awt.Color(0, 200, 0));
        ioTextField.setRows(5);
        ioTextField.setToolTipText("");
        ioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 255, 51))); // NOI18N
        ioTextField.setCaretColor(new java.awt.Color(0, 200, 0));
        ioTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ioTextField.setDoubleBuffered(true);
        ioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ioTextFieldKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ioTextField);

        backgroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 550, 410));

        titleLabel.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 51));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Escape To Pokagon!");
        titleLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 0)));
        backgroundPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 370, 40));

        compassBackgroundPanel.setBackground(new java.awt.Color(0, 102, 0));
        compassBackgroundPanel.setBorder(new javax.swing.border.MatteBorder(null));
        compassBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        compassPanel.setBackground(new java.awt.Color(204, 255, 204));
        compassPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        compassPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compassPanel.setFocusCycleRoot(true);
        compassPanel.setMaximumSize(new java.awt.Dimension(260, 327));
        compassPanel.setMinimumSize(new java.awt.Dimension(260, 327));
        compassPanel.setLayout(new java.awt.GridLayout(1, 1));
        compassBackgroundPanel.add(compassPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 327));

        compassTitleLabel.setBackground(new java.awt.Color(204, 255, 204));
        compassTitleLabel.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        compassTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compassTitleLabel.setText("Compass");
        compassTitleLabel.setToolTipText("");
        compassTitleLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        compassTitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compassTitleLabel.setOpaque(true);
        compassBackgroundPanel.add(compassTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        backgroundPanel.add(compassBackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 410));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int n = 0;
    
    private void ioTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioTextFieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            compassLabel.setImage(n);
            n++;
            if(n == 15) {
                n = 0;
            }
        }
    }//GEN-LAST:event_ioTextFieldKeyReleased

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
    private javax.swing.JTextArea ioTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
