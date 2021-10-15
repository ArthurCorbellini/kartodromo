/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view;

import br.univates.kartodromo.controller.UsuarioController;
import br.univates.kartodromo.view.MenuV4;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Arthur
 */
public class Login extends javax.swing.JFrame {

    private Color defaultLeftColor = new Color(60, 63, 65);
    private Color defaultRightColor = new Color(35, 40, 44);
    private Color defaultColor = new Color(255, 211, 0);
    private ImageIcon logo = new ImageIcon(getClass().getResource("/images/logo-crown-orange.png"));

    public Login() {
        initComponents();

        instantiateElements();
    }

    private void instantiateElements() {
        jpLeft.setBackground(defaultLeftColor);
        jpRight.setBackground(defaultRightColor);
        lbLogo.setIcon(logo);

        lbIconUser.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon-mustache-light.png")));
        lbIconPassword.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon-lock-light.png")));

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

        jpLeft = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jpRight = new javax.swing.JPanel();
        jpInputData = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        lbIconUser = new javax.swing.JLabel();
        lbIconPassword = new javax.swing.JLabel();
        jpLogin = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        jpLeft.setBackground(new java.awt.Color(21, 25, 28));
        jpLeft.setPreferredSize(new java.awt.Dimension(225, 300));

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpLeftLayout = new javax.swing.GroupLayout(jpLeft);
        jpLeft.setLayout(jpLeftLayout);
        jpLeftLayout.setHorizontalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpLeftLayout.setVerticalGroup(
            jpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpRight.setBackground(new java.awt.Color(35, 40, 44));

        jpInputData.setBackground(new java.awt.Color(35, 40, 44));

        tfUser.setBackground(new java.awt.Color(35, 40, 44));
        tfUser.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tfUser.setForeground(new java.awt.Color(204, 204, 204));
        tfUser.setText("Usuário");
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 25, 28)));
        tfUser.setPreferredSize(new java.awt.Dimension(240, 35));
        tfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserFocusLost(evt);
            }
        });

        tfPassword.setBackground(new java.awt.Color(35, 40, 44));
        tfPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(204, 204, 204));
        tfPassword.setText("Senha");
        tfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(21, 25, 28)));
        tfPassword.setEchoChar('\u0000');
        tfPassword.setPreferredSize(new java.awt.Dimension(240, 35));
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });

        lbIconUser.setPreferredSize(new java.awt.Dimension(35, 35));

        lbIconPassword.setPreferredSize(new java.awt.Dimension(35, 35));

        jpLogin.setBackground(new java.awt.Color(35, 40, 44));
        jpLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpLogin.setPreferredSize(new java.awt.Dimension(100, 35));
        jpLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpLoginMouseReleased(evt);
            }
        });

        lbLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(204, 204, 204));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Entrar");

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jpExit.setBackground(new java.awt.Color(35, 40, 44));
        jpExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpExit.setPreferredSize(new java.awt.Dimension(100, 35));
        jpExit.setRequestFocusEnabled(false);
        jpExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpExitMouseReleased(evt);
            }
        });

        lbExit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbExit.setForeground(new java.awt.Color(204, 204, 204));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("Sair");

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpInputDataLayout = new javax.swing.GroupLayout(jpInputData);
        jpInputData.setLayout(jpInputDataLayout);
        jpInputDataLayout.setHorizontalGroup(
            jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInputDataLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIconPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIconUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInputDataLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jpInputDataLayout.setVerticalGroup(
            jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInputDataLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpRightLayout = new javax.swing.GroupLayout(jpRight);
        jpRight.setLayout(jpRightLayout);
        jpRightLayout.setHorizontalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpRightLayout.setVerticalGroup(
            jpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRightLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jpInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLoginMousePressed
        jpLogin.setBackground(defaultLeftColor);
    }//GEN-LAST:event_jpLoginMousePressed

    private void jpLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLoginMouseReleased
        jpLogin.setBackground(defaultRightColor);

        if (UsuarioController.validateUser(tfUser.getText(), tfPassword.getText())) {
            this.setVisible(false);
            new MenuV4().setVisible(true);
        } else {
            new DialogError(this, "Usuário não localizado.").setVisible(true);
        }
    }//GEN-LAST:event_jpLoginMouseReleased

    private void jpExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMousePressed
        jpExit.setBackground(defaultLeftColor);
    }//GEN-LAST:event_jpExitMousePressed

    private void jpExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpExitMouseReleased
        jpExit.setBackground(defaultRightColor);
        System.exit(0);
    }//GEN-LAST:event_jpExitMouseReleased

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        if (tfUser.getText().equals("Usuário")) {
            tfUser.setText(null);
        }

    }//GEN-LAST:event_tfUserFocusGained

    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        if (tfUser.getText().equals(""))
            tfUser.setText("Usuário");
    }//GEN-LAST:event_tfUserFocusLost

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        if (tfPassword.getText().equals("Senha")) {
            tfPassword.setText(null);
            tfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost
        if (tfPassword.getText().length() == 0) {
            tfPassword.setText("Senha");
            tfPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_tfPasswordFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpInputData;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpRight;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbIconPassword;
    private javax.swing.JLabel lbIconUser;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
