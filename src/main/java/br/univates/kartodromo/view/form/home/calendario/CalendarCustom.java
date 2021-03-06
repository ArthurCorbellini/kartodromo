/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form.home.calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Arthur
 */
public class CalendarCustom extends javax.swing.JPanel {

    private Calendar anoMes;

    public CalendarCustom() {
        initComponents();

        anoMes = Calendar.getInstance();

        slide.setAnimate(15);
        slide.show(new PanelDate(anoMes.get(Calendar.MONTH), anoMes.get(Calendar.YEAR)), PanelSlide.AnimateType.TO_RIGHT);
        showMonthYear();
    }

    private void showMonthYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yyyy");
        lbMonthYear.setText(sdf.format(anoMes.getTime()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slide = new br.univates.kartodromo.view.form.home.calendario.PanelSlide();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cmdNext = new javax.swing.JLabel();
        cmdBack = new javax.swing.JLabel();
        lbMonthYear = new javax.swing.JLabel();

        setBackground(new java.awt.Color(21, 25, 28));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        cmdNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cmdNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuIcons/icon-next-light.png"))); // NOI18N
        cmdNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmdNextMouseReleased(evt);
            }
        });

        cmdBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cmdBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuIcons/icon-back-light.png"))); // NOI18N
        cmdBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmdBackMouseReleased(evt);
            }
        });

        lbMonthYear.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbMonthYear.setForeground(new java.awt.Color(204, 204, 204));
        lbMonthYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMonthYear.setText("M??s/Ano");

        jLayeredPane1.setLayer(cmdNext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cmdBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbMonthYear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdBack)
                .addGap(18, 18, 18)
                .addComponent(lbMonthYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cmdNext)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMonthYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdNextMouseReleased
        anoMes.add(Calendar.MONTH, +1);
        slide.show(new PanelDate(anoMes.get(Calendar.MONTH), anoMes.get(Calendar.YEAR)), PanelSlide.AnimateType.TO_LEFT);
        showMonthYear();
    }//GEN-LAST:event_cmdNextMouseReleased

    private void cmdBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdBackMouseReleased
        anoMes.add(Calendar.MONTH, -1);
        slide.show(new PanelDate(anoMes.get(Calendar.MONTH), anoMes.get(Calendar.YEAR)), PanelSlide.AnimateType.TO_RIGHT);
        showMonthYear();
    }//GEN-LAST:event_cmdBackMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cmdBack;
    private javax.swing.JLabel cmdNext;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbMonthYear;
    private br.univates.kartodromo.view.form.home.calendario.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
