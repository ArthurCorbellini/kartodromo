/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view;

import br.univates.kartodromo.view.form.FormAuditoria;
import br.univates.kartodromo.view.form.FormCadastroTracado;
import br.univates.kartodromo.view.form.FormCadastroUsuario;
import br.univates.kartodromo.view.form.FormCadastroVeiculo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Arthur
 */
public class MenuV3 extends javax.swing.JFrame {

    private Color defaultDarkColor = new Color(21, 25, 28);
    private Color defaultLightColor = new Color(204, 204, 204);
    private Color defaultColor = new Color(255, 211, 0);

    private List<MenuItem> allButtons = new ArrayList<>();
    private List<MenuItem> listMenu;

    private MenuItem btnHome;
    private MenuItem btnIniciarCorrida;
    private MenuItem btnSobreShow;
    private MenuItem btnAboutHide;
    private MenuItem btnCadastro;
    private MenuItem btnCadastroUsuario;
    private MenuItem btnCadastroVeiculo;
    private MenuItem btnCadastroTracado;
    private MenuItem btnAuditoria;

    public MenuV3() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/images/logo_crown_orange.png")));

        listMenu = new ArrayList<>();

        // -------- btnHome --------
        buildBtnHome();
        listMenu.add(btnHome);

        // -------- btnIniciarCorrida --------   
        buildBtnIniciarCorrida();
        listMenu.add(btnIniciarCorrida);

        // -------- btnCadastros --------
        buildBtnCadastro();
        listMenu.add(btnCadastro);

        // -------- btnAuditoria --------
        buildBtnAuditoria();
        listMenu.add(btnAuditoria);

        // -------- btnSobre --------       
        buildBtnSobreShow();
        jpAboutShow.add(btnSobreShow);
        buildBtnSobreHide();
        jpAboutHide.add(btnAboutHide);

        addMenu(listMenu);
    }

    private void addMenu(List<MenuItem> listMenu) {
        listMenu.forEach(v -> {
            menus.add(v);

            List<MenuItem> subMenu = v.getSubMenu();
            subMenu.forEach(u -> addMenu(Arrays.asList(u)));

            // Lista contendo todos os botões e sub botões
            allButtons.add(v);
        });
        menus.revalidate();
    }

    private void buildBtnHome() {
        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-home-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-home-dark.png"));
        btnHome = new MenuItem(lightIcon, darkIcon, "Home", null);
    }

    private void buildBtnIniciarCorrida() {
        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-helmet-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-helmet-dark.png"));
        btnIniciarCorrida = new MenuItem(lightIcon, darkIcon, "Iniciar Corrida", null);
    }

    private void buildBtnCadastro() {
        List<MenuItem> listSubBtnCadastro = new ArrayList<>();
        ImageIcon dotLight = new ImageIcon(getClass().getResource("/images/menuIcons/icon-dot-light.png"));
        ImageIcon dotDark = new ImageIcon(getClass().getResource("/images/menuIcons/icon-dot-dark.png"));

        btnCadastroUsuario = new MenuItem(dotLight, dotDark, "  Usuário", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pressButton(btnCadastroUsuario, new FormCadastroUsuario());
            }
        });
        btnCadastroUsuario.getLbIcon().setHorizontalAlignment(JLabel.RIGHT);
        listSubBtnCadastro.add(btnCadastroUsuario);

        btnCadastroVeiculo = new MenuItem(dotLight, dotDark, "  Veículo", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pressButton(btnCadastroVeiculo, new FormCadastroVeiculo());
            }
        });
        btnCadastroVeiculo.getLbIcon().setHorizontalAlignment(JLabel.RIGHT);
        listSubBtnCadastro.add(btnCadastroVeiculo);

        btnCadastroTracado = new MenuItem(dotLight, dotDark, "  Traçado", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pressButton(btnCadastroTracado, new FormCadastroTracado());
            }
        });
        btnCadastroTracado.getLbIcon().setHorizontalAlignment(JLabel.RIGHT);
        listSubBtnCadastro.add(btnCadastroTracado);        

        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-registration-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-registration-dark.png"));
        btnCadastro = new MenuItem(lightIcon, darkIcon, "Cadastros", null, listSubBtnCadastro);
    }

    private void buildBtnSobreShow() {
        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-mustache-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-mustache-dark.png"));
        btnSobreShow = new MenuItem(lightIcon, darkIcon, "Sobre", null);
    }

    private void buildBtnSobreHide() {
        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-mustache-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-mustache-dark.png"));
        btnAboutHide = new MenuItem(lightIcon, darkIcon, "Sobre", null);
        btnAboutHide.setBackground(new Color(0, 28, 57));
    }

    private void buildBtnAuditoria() {
        ImageIcon lightIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-police-hat-light.png"));
        ImageIcon darkIcon = new ImageIcon(getClass().getResource("/images/menuIcons/icon-police-hat-dark.png"));

        btnAuditoria = new MenuItem(lightIcon, darkIcon, "Auditoria", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pressButton(btnAuditoria, new FormAuditoria());
            }
        });
    }

    private void pressButton(MenuItem btn, JPanel form) {
        resetOnButton();

        btn.setClicked(true);
        btn.setBackground(defaultColor);
        btn.getLbName().setForeground(defaultDarkColor);
        btn.getLbIcon().setIcon(btn.getDarkIcon());

        jpContent.add(form);
        jpContent.repaint();
        jpContent.revalidate();
    }

    private void resetOnButton() {
        jpContent.removeAll();

        allButtons.stream().filter(p -> p.isClicked()).forEach(p -> {
            p.setBackground(defaultDarkColor);
            p.getLbName().setForeground(defaultLightColor);
            p.getLbIcon().setIcon(p.getLightIcon());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jpBody = new javax.swing.JPanel();
        jpAbout = new javax.swing.JPanel();
        jsp3 = new javax.swing.JScrollPane();
        jpAboutHide = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jsp1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jsp2 = new javax.swing.JScrollPane();
        jpAboutShow = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jpContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(21, 25, 28));
        jPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        jpBody.setBackground(new java.awt.Color(224, 224, 224));
        jpBody.setPreferredSize(new java.awt.Dimension(800, 500));

        jpAbout.setBackground(new java.awt.Color(204, 204, 204));
        jpAbout.setPreferredSize(new java.awt.Dimension(225, 400));

        jsp3.setBackground(new java.awt.Color(0, 28, 57));
        jsp3.setBorder(null);
        jsp3.setPreferredSize(new java.awt.Dimension(225, 360));

        jpAboutHide.setBackground(new java.awt.Color(204, 204, 204));
        jpAboutHide.setLayout(new javax.swing.BoxLayout(jpAboutHide, javax.swing.BoxLayout.Y_AXIS));
        jsp3.setViewportView(jpAboutHide);

        javax.swing.GroupLayout jpAboutLayout = new javax.swing.GroupLayout(jpAbout);
        jpAbout.setLayout(jpAboutLayout);
        jpAboutLayout.setHorizontalGroup(
            jpAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpAboutLayout.setVerticalGroup(
            jpAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAboutLayout.createSequentialGroup()
                .addGap(0, 356, Short.MAX_VALUE)
                .addComponent(jsp3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpMenu.setBackground(new java.awt.Color(21, 25, 28));
        jpMenu.setPreferredSize(new java.awt.Dimension(225, 400));

        jsp1.setBackground(new java.awt.Color(0, 28, 57));
        jsp1.setBorder(null);
        jsp1.setPreferredSize(new java.awt.Dimension(225, 360));

        menus.setBackground(new java.awt.Color(21, 25, 28));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jsp1.setViewportView(menus);

        jsp2.setBackground(new java.awt.Color(0, 28, 57));
        jsp2.setBorder(null);
        jsp2.setPreferredSize(new java.awt.Dimension(225, 360));

        jpAboutShow.setBackground(new java.awt.Color(21, 25, 28));
        jpAboutShow.setLayout(new javax.swing.BoxLayout(jpAboutShow, javax.swing.BoxLayout.Y_AXIS));
        jsp2.setViewportView(jpAboutShow);

        lbLogo.setBackground(new java.awt.Color(21, 25, 28));
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jsp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpContent.setBackground(new java.awt.Color(35, 40, 44));
        jpContent.setPreferredSize(new java.awt.Dimension(575, 400));
        jpContent.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 575, Short.MAX_VALUE)))
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addComponent(jpAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 575, Short.MAX_VALUE)))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuV3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jpAbout;
    private javax.swing.JPanel jpAboutHide;
    private javax.swing.JPanel jpAboutShow;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JScrollPane jsp1;
    private javax.swing.JScrollPane jsp2;
    private javax.swing.JScrollPane jsp3;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JPanel menus;
    // End of variables declaration//GEN-END:variables
}
