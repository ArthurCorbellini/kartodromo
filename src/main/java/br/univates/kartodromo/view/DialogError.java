/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Arthur
 */
public class DialogError extends javax.swing.JDialog {

    private Color defaultColor = new Color(35, 40, 44);
    private Color defaultClickedColor = new Color(60, 63, 65);

    public DialogError(java.awt.Frame parent, String message) {
        super(parent, true);
        this.setUndecorated(true);

        initComponents();
        instantiateElements(message);
    }

    private void instantiateElements(String message) {
        lbIcon.setBackground(defaultColor);
        lbIcon.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon_error_light.png")));
        lbTitle.setText(message);
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpContent = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        jpConfirm = new javax.swing.JPanel();
        lbConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 150));

        jpBody.setBackground(new java.awt.Color(35, 40, 44));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jpBody.setPreferredSize(new java.awt.Dimension(300, 150));

        jpContent.setBackground(new java.awt.Color(35, 40, 44));

        lbTitle.setBackground(new java.awt.Color(204, 204, 204));
        lbTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(204, 204, 204));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle.setText("T??tulo Lorem Ipsum");
        lbTitle.setPreferredSize(new java.awt.Dimension(175, 50));

        lbIcon.setBackground(new java.awt.Color(204, 204, 204));
        lbIcon.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lbIcon.setForeground(new java.awt.Color(204, 204, 204));
        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpConfirm.setBackground(new java.awt.Color(35, 40, 44));
        jpConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpConfirm.setPreferredSize(new java.awt.Dimension(100, 35));
        jpConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpConfirmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpConfirmMouseReleased(evt);
            }
        });

        lbConfirm.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbConfirm.setForeground(new java.awt.Color(204, 204, 204));
        lbConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConfirm.setText("Confirmar");
        lbConfirm.setPreferredSize(new java.awt.Dimension(86, 21));

        javax.swing.GroupLayout jpConfirmLayout = new javax.swing.GroupLayout(jpConfirm);
        jpConfirm.setLayout(jpConfirmLayout);
        jpConfirmLayout.setHorizontalGroup(
            jpConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jpConfirmLayout.setVerticalGroup(
            jpConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpConfirmMousePressed
        jpConfirm.setBackground(defaultClickedColor);
    }//GEN-LAST:event_jpConfirmMousePressed

    private void jpConfirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpConfirmMouseReleased
        jpConfirm.setBackground(defaultColor);
        this.setVisible(false);
    }//GEN-LAST:event_jpConfirmMouseReleased

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
            java.util.logging.Logger.getLogger(DialogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogError dialog = new DialogError(new javax.swing.JFrame(), "teste");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpConfirm;
    private javax.swing.JPanel jpContent;
    private javax.swing.JLabel lbConfirm;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
