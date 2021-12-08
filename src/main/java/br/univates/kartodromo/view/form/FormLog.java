/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form;

import br.univates.kartodromo.view.form.vo.LogVO;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        // -------------- Popular dados
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        tableModel.addColumn("Data");
        tableModel.addColumn("Tipo");
        tableModel.addColumn("Local");
        tableModel.addColumn("Exception");
        tableModel.addColumn("Conteúdo");

        logList.forEach(p -> {
            tableModel.addRow(
                    new Object[]{
                        p.getData().getTime(),
                        p.getTipo(),
                        p.getLocal(),
                        p.getException(),
                        p.getConteudo()
                    }
            );
        });
        this.jtLog.setModel(tableModel);

        // -------------- Customizar tabela
        jtLog.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        jtLog.getTableHeader().setOpaque(false);
        jtLog.getTableHeader().setForeground(new Color(51, 51, 51));
        jtLog.setRowHeight(20);

        setColumnCustomWidth(jtLog, 0, 200);
        setColumnCustomWidth(jtLog, 1, 75);
        setColumnCustomWidth(jtLog, 2, 150);
        setColumnCustomWidth(jtLog, 3, 400);
        jtLog.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    private void setColumnCustomWidth(JTable table, int index, int width) {
        table.getColumnModel().getColumn(index).setMaxWidth(width);
        table.getColumnModel().getColumn(index).setMinWidth(width);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        jpBody = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLog = new javax.swing.JTable();

        setBackground(new java.awt.Color(35, 40, 44));
        setPreferredSize(new java.awt.Dimension(575, 400));

        jpHeader.setBackground(new java.awt.Color(35, 40, 44));
        jpHeader.setPreferredSize(new java.awt.Dimension(333, 58));

        lbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Logs");
        lbTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbTitulo.setPreferredSize(new java.awt.Dimension(321, 30));

        lbSubTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSubTitulo.setText("Registros de Logs do sistema");
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

        jtLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtLog.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtLog);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JTable jtLog;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
