/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form;

/**
 *
 * @author Arthur
 */
public class Template extends javax.swing.JPanel {

    public Template() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 40, 44));
        setPreferredSize(new java.awt.Dimension(575, 400));

        jpHeader.setBackground(new java.awt.Color(35, 40, 44));
        jpHeader.setPreferredSize(new java.awt.Dimension(333, 58));

        lbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Título Lorem Ipsum");
        lbTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbTitulo.setPreferredSize(new java.awt.Dimension(321, 30));

        lbSubTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSubTitulo.setText("Título Lorem Ipsum");
        lbSubTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbSubTitulo.setPreferredSize(new java.awt.Dimension(300, 16));

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpHeader;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
