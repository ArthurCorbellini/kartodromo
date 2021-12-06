/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form;

import br.univates.kartodromo.view.form.vo.LogVO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arthur
 */
public class FormLog extends javax.swing.JPanel {

    private List<LogVO> logList;

    public FormLog() {
        initComponents();

        loadTableContent();
        buildTableLog();
    }

    private void loadTableContent() {
        logList = new ArrayList<>();

        String arquivoCru = null;
        try {
            arquivoCru = new String(Files.readAllBytes(Paths.get("logs/log4j-application.log")));
        } catch (IOException ex) {
            Logger.getLogger(FormLog.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<String> list = Arrays.asList(arquivoCru.split("!-!-!Cabecalho!-!-! "));

        list.stream().filter(p -> !p.isEmpty()).forEach(p -> {
            String[] erro = p.split(" :: ");

            Calendar cal = Calendar.getInstance();
            try {
                cal.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(erro[0]));
            } catch (ParseException ex) {
                Logger.getLogger(FormLog.class.getName()).log(Level.SEVERE, null, ex);
            }

            logList.add(new LogVO(cal, erro[1], erro[2], erro[3], erro[4]));
        });

        // Regex do log: (\d{4}-\d{2}-\d{2}\s\d{2}:\d{2}:\d{2})\s(\w+)\s(\w+):(\w+).*
    }

    private void buildTableLog() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        jpBody = new javax.swing.JPanel();

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

        jpBody.setBackground(new java.awt.Color(35, 40, 44));

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
