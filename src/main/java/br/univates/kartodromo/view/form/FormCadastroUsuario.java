/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form;

import br.univates.kartodromo.controller.UsuarioController;
import br.univates.kartodromo.model.dao.UsuarioDAO;
import br.univates.kartodromo.model.entity.Usuario;
import br.univates.kartodromo.model.type.GeneroType;
import br.univates.kartodromo.model.type.PerfilType;
import br.univates.kartodromo.util.Formatacao;
import br.univates.kartodromo.util.SoNumeros;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormCadastroUsuario extends javax.swing.JPanel {

    int idUsuario = 0;
    private Usuario usuario;
    UsuarioController UsuarioController = new UsuarioController();
    private List<Usuario> listaUsuario;

    public FormCadastroUsuario() {
        initComponents();

        UsuarioController UsuarioController = new UsuarioController();

        listaUsuario = new ArrayList();

        listaUsuario = UsuarioController.getAll();

        this.popularTabelaUsuarios(listaUsuario);
        
        formatacoes();
        
    }
    
    public void formatacoes(){

        //campoTelefone.setDocument(new SoNumeros());
        //campoCPF.setDocument(new SoNumeros());

        Formatacao.formatarTelefone(campoTelefone);
        Formatacao.formatarCpf(campoCPF);
        
        comboSexo.setModel(new DefaultComboBoxModel<>(GeneroType.values()));
        ((DefaultComboBoxModel) comboSexo.getModel()).insertElementAt(null, 0);
        comboSexo.setSelectedIndex(0);
        
        comboPerfil.setModel(new DefaultComboBoxModel<>(PerfilType.values()));
        ((DefaultComboBoxModel) comboPerfil.getModel()).insertElementAt(null, 0);
        comboPerfil.setSelectedIndex(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        jpBody = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        campoCPF = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        comboPerfil = new javax.swing.JComboBox<>();
        campoSenha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        campoRSenha = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 40, 44));
        setPreferredSize(new java.awt.Dimension(575, 400));

        jPanel1.setBackground(new java.awt.Color(35, 40, 44));
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 400));

        jpHeader.setBackground(new java.awt.Color(35, 40, 44));
        jpHeader.setPreferredSize(new java.awt.Dimension(333, 58));

        lbTitulo.setBackground(new java.awt.Color(255, 211, 0));
        lbTitulo.setFont(new java.awt.Font("Open Sans Semibold", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitulo.setText("Cadastro Usuário");
        lbTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbTitulo.setPreferredSize(new java.awt.Dimension(321, 30));

        lbSubTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSubTitulo.setText("Formulário para o Cadastro de Usuários");
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

        jPanel2.setBackground(new java.awt.Color(21, 25, 28));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome *");

        campoNome.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone *");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login *");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Repita sua Senha *");

        campoLogin.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        comboSexo.setMinimumSize(new java.awt.Dimension(6, 23));
        comboSexo.setName(""); // NOI18N
        comboSexo.setPreferredSize(new java.awt.Dimension(6, 23));

        campoCPF.setMinimumSize(new java.awt.Dimension(6, 23));
        campoCPF.setPreferredSize(new java.awt.Dimension(6, 23));
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        campoTelefone.setMinimumSize(new java.awt.Dimension(6, 23));
        campoTelefone.setPreferredSize(new java.awt.Dimension(6, 23));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaUsuarios.setGridColor(new java.awt.Color(21, 25, 28));
        tabelaUsuarios.setSelectionBackground(new java.awt.Color(255, 211, 0));
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Perfil *");

        comboPerfil.setMinimumSize(new java.awt.Dimension(91, 23));
        comboPerfil.setPreferredSize(new java.awt.Dimension(91, 23));
        comboPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPerfilActionPerformed(evt);
            }
        });

        campoSenha.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Senha *");

        campoEmail.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(21, 25, 28));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 211, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        btnCancelar.setMaximumSize(new java.awt.Dimension(123, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(123, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(21, 25, 28));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 211, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(21, 25, 28));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 211, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 211, 0)));
        btnExcluir.setMaximumSize(new java.awt.Dimension(123, 23));
        btnExcluir.setMinimumSize(new java.awt.Dimension(123, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 211, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 211, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoNome)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(campoLogin)
                                                .addGap(30, 30, 30)
                                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel11)
                                                .addGap(101, 101, 101))
                                            .addComponent(campoEmail))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                    .addComponent(campoRSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(comboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSenha)
                            .addComponent(campoRSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Campos Obrigatórios *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean continuar = true;

        if (campoNome.getText().equals("") || campoTelefone.getText().equals("") || campoLogin.getText().equals("") || campoSenha.getText().equals("") || campoRSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não completou todos Campos Obrigatórios!");
            continuar = false;
        }

        if (continuar) {
            if (campoSenha.getText().equals(campoRSenha.getText())) {

                Usuario usuario = new Usuario();

                usuario.setNome(getCampoNome().getText());
                usuario.setSexo(getComboSexo().getSelectedItem().toString());
                usuario.setCpf(Long.parseLong(getCampoCPF().getText().replaceAll("[\\D]", "")));
                usuario.setPerfil((PerfilType) getComboPerfil().getSelectedItem());
                usuario.setEmail(getCampoEmail().getText());
                usuario.setTelefone(Long.parseLong(getCampoTelefone().getText().replaceAll("[\\D]", "")));
                usuario.setLogin(getCampoLogin().getText());
                usuario.setSenha(getCampoSenha().getText());

                UsuarioDAO usuarioDAO = new UsuarioDAO();

                if (idUsuario > 0) {
                    usuario.setId(idUsuario);
                    usuarioDAO.update(usuario);
                } else {
                    usuarioDAO.insert(usuario);
                }
                
                listaUsuario = UsuarioController.getAll();
                this.limparTela();
                refreshTable();

                JOptionPane.showMessageDialog(this, "Cadastrado", "Usuário Salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Erro", "Suas senhas são Incompatíveis", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro", "Erro no Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        int row = tabelaUsuarios.getSelectedRow();
        listaUsuario = UsuarioController.getAll();
        
        if (row >= 0) {

            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaUsuarios.getModel();

            try {
                String idString = String.valueOf(tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(), 0));

                idUsuario = Integer.parseInt(idString);

                UsuarioDAO cDAO = new UsuarioDAO();

                usuario = cDAO.getById(idUsuario);

                if (usuario != null) {

                    this.getCampoNome().setText(usuario.getNome());
                    this.getCampoLogin().setText(usuario.getLogin());
                    this.getCampoCPF().setText(String.valueOf(usuario.getCpf()));
                    this.getCampoTelefone().setText(String.valueOf(usuario.getTelefone()));
                    this.getCampoEmail().setText(usuario.getEmail());
                    this.getComboSexo().getModel().setSelectedItem(usuario.getSexo());
                    this.getComboPerfil().getModel().setSelectedItem(usuario.getPerfil());

                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível localizar o cadastro do usuário");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Selecione um registro para editar");
            }

        }
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void comboPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPerfilActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int row = tabelaUsuarios.getSelectedRow();

        if (row >= 0) {

            if (idUsuario > 0) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");

                if (confirmacao == JOptionPane.YES_OPTION) {
                    UsuarioDAO tracadoDAO = new UsuarioDAO();

                    usuario.setId(idUsuario);
                    tracadoDAO.delete(usuario);
                    refreshTable();

                    JOptionPane.showMessageDialog(null, "Usuário Excluido");
                } else {
                    refreshTable();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um registro para Excluir");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void limparTela() {

        getCampoLogin().setText("");
        getCampoSenha().setText("");
        getCampoRSenha().setText("");
        getCampoEmail().setText("");
        getCampoNome().setText("");
        getCampoTelefone().setText("");
        getCampoCPF().setText("");
        getComboSexo().setSelectedIndex(WIDTH);
        getComboPerfil().setSelectedIndex(WIDTH);
    }

    void popularTabelaUsuarios(List<Usuario> pListaUsuarios) {

        DefaultTableModel modeloTabela = new DefaultTableModel();

        this.tabelaUsuarios.setModel(modeloTabela);
        modeloTabela.addColumn("Id");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Sexo");
        modeloTabela.addColumn("CPF");
        modeloTabela.addColumn("Perfil");
        modeloTabela.addColumn("Email");
        modeloTabela.addColumn("Telefone");

        for (Usuario usuario : pListaUsuarios) {
            modeloTabela.addRow(
                    new Object[]{
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getSexo(),
                        usuario.getCpf(),
                        usuario.getPerfil(),
                        usuario.getEmail(),
                        usuario.getTelefone(),});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoRSenha;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox<PerfilType> comboPerfil;
    private javax.swing.JComboBox<GeneroType> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables

    public JFormattedTextField getCampoCPF() {
        return campoCPF;
    }

    public void setCampoCPF(JFormattedTextField campoCPF) {
        this.campoCPF = campoCPF;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoLogin() {
        return campoLogin;
    }

    public void setCampoLogin(JTextField campoLogin) {
        this.campoLogin = campoLogin;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JPasswordField getCampoRSenha() {
        return campoRSenha;
    }

    public void setCampoRSenha(JPasswordField campoRSenha) {
        this.campoRSenha = campoRSenha;
    }

    public JTextField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JTextField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JFormattedTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JFormattedTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    public JComboBox<PerfilType> getComboPerfil() {
        return comboPerfil;
    }

    public void setComboPerfil(JComboBox<PerfilType> comboPerfil) {
        this.comboPerfil = comboPerfil;
    }

    public JComboBox<GeneroType> getComboSexo() {
        return comboSexo;
    }

    public void setComboSexo(JComboBox<GeneroType> comboSexo) {
        this.comboSexo = comboSexo;
    }

    private void refreshTable() {
        List<Usuario> listaUsuario = new ArrayList();
        listaUsuario = UsuarioController.getAll();
        this.popularTabelaUsuarios(listaUsuario);
    }

}
