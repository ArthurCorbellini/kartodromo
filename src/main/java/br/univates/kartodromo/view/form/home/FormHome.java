/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form.home;

import br.univates.kartodromo.controller.ClienteController;
import br.univates.kartodromo.model.entity.Auditoria;
import br.univates.kartodromo.model.entity.Cliente;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur
 */
public class FormHome extends javax.swing.JPanel {

    private List<Cliente> clientes;

    public FormHome() {
        initComponents();

        clientes = new ClienteController().getAll()
                .stream()
                .filter(p -> p.getMelhorTempo()!= null)
                .sorted(Comparator.comparing(Cliente::getMelhorTempo))
                .collect(Collectors.toList());

        init();
    }

    private void init() {
        lbRankingGeral.setText("Ranking Geral");
        lbIconRankingGeral.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon-trophy-light.png")));
        buildTableRankingGeral();

        lbRankingMensal.setText("Ranking Mensal");
        lbIconRankingMensal.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon-trophy-light.png")));
        buildTableRankingMensal();

//        lbPrevisaoTempo.setText("Previsão do Tempo");
//        lbIconPrevisaoTempo.setIcon(new ImageIcon(getClass().getResource("/images/menuIcons/icon-sun-cloud-light.png")));
    }

    private void buildTableRankingMensal() {
        fillTableRankingMensal();

        jtRankingMensal.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        jtRankingMensal.getTableHeader().setOpaque(false);
//        jtRankingMensal.getTableHeader().setBackground(new Color(69, 73, 74));
        jtRankingMensal.getTableHeader().setForeground(new Color(51, 51, 51));
        jtRankingMensal.setRowHeight(20);

        setColumnCustomWidth(jtRankingMensal, 0, 35);
        setColumnCustomWidth(jtRankingMensal, 2, 90);
        setColumnCustomWidth(jtRankingMensal, 3, 70);
        jtRankingMensal.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    private void fillTableRankingMensal() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        tableModel.addColumn("Pos");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Tempo");
        tableModel.addColumn("Dia");

        AtomicInteger index = new AtomicInteger(1);
        clientes.stream().filter(p -> applyTableFilters(p)).forEach(p -> {
            tableModel.addRow(
                    new Object[]{
                        index.getAndIncrement(),
                        p.getNome(),
                        new SimpleDateFormat("HH:mm:ss.SSSS").format(p.getMelhorTempo().getTime()),
                        new SimpleDateFormat("dd/MM/yyyy").format(p.getDiaMelhorTempo().getTime())
                    }
            );
        });

        this.jtRankingMensal.setModel(tableModel);
    }

    private void buildTableRankingGeral() {
        fillTableRankingGeral();

        jtRankingGeral.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        jtRankingGeral.getTableHeader().setOpaque(false);
//        jtRankingGeral.getTableHeader().setBackground(new Color(69, 73, 74));
        jtRankingGeral.getTableHeader().setForeground(new Color(51, 51, 51));
        jtRankingGeral.setRowHeight(20);

        setColumnCustomWidth(jtRankingGeral, 0, 35);
        setColumnCustomWidth(jtRankingGeral, 2, 90);
        setColumnCustomWidth(jtRankingGeral, 3, 70);
        jtRankingGeral.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    private void fillTableRankingGeral() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        tableModel.addColumn("Pos");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Tempo");
        tableModel.addColumn("Dia");

        AtomicInteger index = new AtomicInteger(1);
        clientes.stream().forEach(p -> {
            tableModel.addRow(
                    new Object[]{
                        index.getAndIncrement(),
                        p.getNome(),
                        new SimpleDateFormat("HH:mm:ss.SSSS").format(p.getMelhorTempo().getTime()),
                        new SimpleDateFormat("dd/MM/yyyy").format(p.getDiaMelhorTempo().getTime())
                    }
            );
        });

        this.jtRankingGeral.setModel(tableModel);
    }

    private void setColumnCustomWidth(JTable table, int index, int width) {
        table.getColumnModel().getColumn(index).setMaxWidth(width);
        table.getColumnModel().getColumn(index).setMinWidth(width);
    }

    private boolean applyTableFilters(Cliente cli) {
        Calendar dataMesPassado = Calendar.getInstance();
        dataMesPassado.add(Calendar.MONTH, -1);
        if (cli.getDiaMelhorTempo().compareTo(dataMesPassado) < 0) {
            return false;
        }

        return true;
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
        jpBody = new javax.swing.JPanel();
        jpCalendario = new javax.swing.JPanel();
        calendarCustom2 = new br.univates.kartodromo.view.form.home.calendario.CalendarCustom();
        jpRankingGeral = new javax.swing.JPanel();
        lbRankingGeral = new javax.swing.JLabel();
        lbIconRankingGeral = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtRankingGeral = new javax.swing.JTable();
        jpRankingMensal = new javax.swing.JPanel();
        lbIconRankingMensal = new javax.swing.JLabel();
        lbRankingMensal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtRankingMensal = new javax.swing.JTable();

        setBackground(new java.awt.Color(35, 40, 44));
        setPreferredSize(new java.awt.Dimension(575, 400));

        jpHeader.setBackground(new java.awt.Color(35, 40, 44));
        jpHeader.setPreferredSize(new java.awt.Dimension(333, 58));

        lbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Página inicial");
        lbTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbTitulo.setPreferredSize(new java.awt.Dimension(321, 30));

        lbSubTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        jpCalendario.setBackground(new java.awt.Color(21, 25, 28));
        jpCalendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        jpCalendario.setPreferredSize(new java.awt.Dimension(247, 150));

        javax.swing.GroupLayout jpCalendarioLayout = new javax.swing.GroupLayout(jpCalendario);
        jpCalendario.setLayout(jpCalendarioLayout);
        jpCalendarioLayout.setHorizontalGroup(
            jpCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCalendarioLayout.setVerticalGroup(
            jpCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpRankingGeral.setBackground(new java.awt.Color(21, 25, 28));
        jpRankingGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        jpRankingGeral.setPreferredSize(new java.awt.Dimension(100, 312));

        lbRankingGeral.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbRankingGeral.setForeground(new java.awt.Color(204, 204, 204));
        lbRankingGeral.setText(".");

        lbIconRankingGeral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconRankingGeral.setPreferredSize(new java.awt.Dimension(50, 50));

        jtRankingGeral.setModel(new javax.swing.table.DefaultTableModel(
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
        jtRankingGeral.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtRankingGeral);

        javax.swing.GroupLayout jpRankingGeralLayout = new javax.swing.GroupLayout(jpRankingGeral);
        jpRankingGeral.setLayout(jpRankingGeralLayout);
        jpRankingGeralLayout.setHorizontalGroup(
            jpRankingGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRankingGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRankingGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRankingGeralLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpRankingGeralLayout.createSequentialGroup()
                        .addComponent(lbIconRankingGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbRankingGeral)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpRankingGeralLayout.setVerticalGroup(
            jpRankingGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRankingGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRankingGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRankingGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIconRankingGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpRankingMensal.setBackground(new java.awt.Color(21, 25, 28));
        jpRankingMensal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        jpRankingMensal.setPreferredSize(new java.awt.Dimension(100, 312));

        lbIconRankingMensal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIconRankingMensal.setPreferredSize(new java.awt.Dimension(50, 50));

        lbRankingMensal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbRankingMensal.setForeground(new java.awt.Color(204, 204, 204));
        lbRankingMensal.setText(".");

        jtRankingMensal.setModel(new javax.swing.table.DefaultTableModel(
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
        jtRankingMensal.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtRankingMensal);

        javax.swing.GroupLayout jpRankingMensalLayout = new javax.swing.GroupLayout(jpRankingMensal);
        jpRankingMensal.setLayout(jpRankingMensalLayout);
        jpRankingMensalLayout.setHorizontalGroup(
            jpRankingMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRankingMensalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRankingMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRankingMensalLayout.createSequentialGroup()
                        .addComponent(lbIconRankingMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbRankingMensal)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRankingMensalLayout.setVerticalGroup(
            jpRankingMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRankingMensalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRankingMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRankingMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIconRankingMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRankingGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jpRankingMensal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addComponent(jpRankingGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(jpRankingMensal, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addComponent(jpCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap())
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
                        .addGap(0, 198, Short.MAX_VALUE)))
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
    private br.univates.kartodromo.view.form.home.calendario.CalendarCustom calendarCustom2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpCalendario;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpRankingGeral;
    private javax.swing.JPanel jpRankingMensal;
    private javax.swing.JTable jtRankingGeral;
    private javax.swing.JTable jtRankingMensal;
    private javax.swing.JLabel lbIconRankingGeral;
    private javax.swing.JLabel lbIconRankingMensal;
    private javax.swing.JLabel lbRankingGeral;
    private javax.swing.JLabel lbRankingMensal;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
