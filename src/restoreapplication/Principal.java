package restoreapplication;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    Verifica verifica = new Verifica();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jTextFieldEntrada = new javax.swing.JTextField();
        jTextFieldSaida = new javax.swing.JTextField();
        jLabelMensagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNfe = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoquesProduto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstoques = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSaldo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extrato do Produto");
        setMaximumSize(new java.awt.Dimension(1029, 883));
        setResizable(false);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extrato (TESTEXTRATO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo"));
        jTextFieldSaldo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextFieldEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));
        jTextFieldEntrada.setMaximumSize(new java.awt.Dimension(64, 22));

        jTextFieldSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saida"));
        jTextFieldSaida.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabelMensagem.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMensagem.setMinimumSize(new java.awt.Dimension(10, 10));

        jTableNfe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP", "ALM", "E/S", "QTDE", "SALD", "SALD ESP", "DATAHORA", "DOC.", "ID", "DESCRICAO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNfeMouseClicked(evt);
            }
        });
        jTableNfe.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTableNfeCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTableNfe.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableNfePropertyChange(evt);
            }
        });
        jTableNfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableNfeKeyPressed(evt);
            }
        });
        jTableNfe.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTableNfeVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNfe);
        if (jTableNfe.getColumnModel().getColumnCount() > 0) {
            jTableNfe.getColumnModel().getColumn(0).setMinWidth(50);
            jTableNfe.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setMinWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setMaxWidth(50);
            jTableNfe.getColumnModel().getColumn(2).setMinWidth(60);
            jTableNfe.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableNfe.getColumnModel().getColumn(2).setMaxWidth(60);
            jTableNfe.getColumnModel().getColumn(3).setMinWidth(100);
            jTableNfe.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableNfe.getColumnModel().getColumn(4).setMinWidth(100);
            jTableNfe.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(4).setMaxWidth(100);
            jTableNfe.getColumnModel().getColumn(5).setMinWidth(100);
            jTableNfe.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(5).setMaxWidth(100);
            jTableNfe.getColumnModel().getColumn(6).setMinWidth(150);
            jTableNfe.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTableNfe.getColumnModel().getColumn(6).setMaxWidth(150);
            jTableNfe.getColumnModel().getColumn(7).setMinWidth(100);
            jTableNfe.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(7).setMaxWidth(100);
            jTableNfe.getColumnModel().getColumn(8).setMinWidth(40);
            jTableNfe.getColumnModel().getColumn(8).setPreferredWidth(40);
            jTableNfe.getColumnModel().getColumn(8).setMaxWidth(40);
            jTableNfe.getColumnModel().getColumn(9).setResizable(false);
            jTableNfe.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque (TESTPRODUTO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableEstoquesProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableEstoquesProduto);
        if (jTableEstoquesProduto.getColumnModel().getColumnCount() > 0) {
            jTableEstoquesProduto.getColumnModel().getColumn(0).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setMaxWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setMaxWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setMaxWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldDescricao.setEditable(false);
        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jTextFieldDescricao.setEnabled(false);

        jTextFieldProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        jTextFieldProduto.setMaximumSize(new java.awt.Dimension(64, 22));

        jButton2.setText("CARREGAR ");
        jButton2.setMaximumSize(new java.awt.Dimension(92, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(92, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(92, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setBorder(null);

        jComboBox2.setBorder(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Empresa");

        jLabel2.setText("Almox");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque (TESTESTOQUE)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableEstoques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEstoques);
        if (jTableEstoques.getColumnModel().getColumnCount() > 0) {
            jTableEstoques.getColumnModel().getColumn(0).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableEstoques.getColumnModel().getColumn(1).setMinWidth(50);
            jTableEstoques.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableEstoques.getColumnModel().getColumn(1).setMaxWidth(50);
            jTableEstoques.getColumnModel().getColumn(2).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(2).setMaxWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setMaxWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField1.setEditable(false);
        jTextField1.setText("C:\\ecosis\\dados\\ECODADOS.ECO");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saldo (TESTEXTRATOSALDOPRODUTO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP", "ALMOX", "ANOMES", "ANTERIOR", "ENTRADA", "SAIDA", "ATUAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableSaldo);
        if (jTableSaldo.getColumnModel().getColumnCount() > 0) {
            jTableSaldo.getColumnModel().getColumn(0).setMinWidth(50);
            jTableSaldo.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableSaldo.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableSaldo.getColumnModel().getColumn(1).setMinWidth(50);
            jTableSaldo.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableSaldo.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Produtos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Verificar o extrato de todos os produtos da base");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableNfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNfeMouseClicked
        int linha = jTableNfe.getSelectedRow();
        String numeroDOC = (String) jTableNfe.getValueAt(linha, 7);
        String movimentoID = (String) jTableNfe.getValueAt(linha, 8);
        String empresa = (String) jTableNfe.getValueAt(linha, 0);
        //01 = TVENPedido
        //02 = TEstNfe E e S S=Cancelamento
        //03 = TEstTransfAlmox
        //04 = TEstTransfProduto
        //05 = TEstInventario
        //06 = TVenRetirada
        //07 =  DEVOLUCAO DE VENDA
        //09 = TEstDevolucao
        if (movimentoID.equals("01")) {
            TelaPedidos telaPedidos = new TelaPedidos(empresa, numeroDOC);
            telaPedidos.setVisible(true);
        }
        if (movimentoID.equals("02")) {
            TelaNotas telaNotas = new TelaNotas(empresa, numeroDOC);
            telaNotas.setVisible(true);
        }
        if (movimentoID.equals("03")) {
        }
        if (movimentoID.equals("04")) {
        }
        if (movimentoID.equals("05")) {
        }
        if (movimentoID.equals("06")) {
        }
        if (movimentoID.equals("07")) {
        }
        if (movimentoID.equals("09")) {
        }


    }//GEN-LAST:event_jTableNfeMouseClicked

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tmp = jTextFieldProduto.getText();
        while (tmp.length() < 6) {
            tmp = "0" + tmp;
        }
        jTextFieldProduto.setText(tmp);

        ArrayList<Estoque> listaEstoque = new ArrayList();
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        String produtoString = jTextFieldProduto.getText();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto();
        try {
            produto = produtoDAO.consultaProduto(produtoString);
            listaEstoque = estoqueDAO.estoqueProduto(produtoString);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        if (produto.getCODIGO() == null) {
            jTextFieldDescricao.setText("Produto não encontrado");
        } else {
            jTextFieldDescricao.setText(produto.getDESCRICAO());
            DefaultTableModel model = (DefaultTableModel) jTableEstoquesProduto.getModel();
            while (jTableEstoquesProduto.getRowCount() > 0) {
                model.removeRow(0);
            }
            model.addRow(new Object[]{"TODOS", produto.getESTDISPONIVEL(), produto.getESTARETIRAR(), produto.getESTCONDICIONAL(), produto.getESTRESERVADO()});

            ExtratoProdutoDAO extratoDAO = new ExtratoProdutoDAO();
            ArrayList<ExtratoProduto> listaExtrato = new ArrayList();
            try {
                listaExtrato = extratoDAO.extratoProduto(produtoString);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            carregarTabela(listaExtrato);
            carregarTabelaEstoque(listaEstoque);
            carregaTabelaSaldo(produtoString);

            calculos(listaExtrato);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableNfeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableNfeKeyPressed

    }//GEN-LAST:event_jTableNfeKeyPressed

    private void jTableNfePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableNfePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNfePropertyChange

    private void jTableNfeVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTableNfeVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNfeVetoableChange

    private void jTableNfeCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableNfeCaretPositionChanged

    }//GEN-LAST:event_jTableNfeCaretPositionChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        verifica.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableEstoques;
    private javax.swing.JTable jTableEstoquesProduto;
    private javax.swing.JTable jTableNfe;
    private javax.swing.JTable jTableSaldo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldSaida;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
public void carregarTabela(ArrayList<ExtratoProduto> listaExtrato) {
    System.out.println("saldo");
        DefaultTableModel model = (DefaultTableModel) jTableNfe.getModel();

        while (jTableNfe.getRowCount() > 0) {
            model.removeRow(0);
        }
        System.out.println("saldo 99");
        String entradas;
        String saidas;
        String saldoTemp;
        Double entradasInt = 0.0;
        Double saidasInt = 0.0;
        Double entradasIntTEMP = 0.0;
        Double saidasIntTEMP = 0.0;
        Double saldo = 0.0;
        //calculo saldo esperado
        Double saldoC = 0.0;
        Double esperado = 0.0;
        Double saldoAtual = 0.0;
        Double saldoGravadoAnterior = 0.0;
        String saldoEsperado = "";
        System.out.println("saldo101");
        for (ExtratoProduto movimentacao : listaExtrato) {
            System.out.println("saldo102");
            //calculo saldo esperado
            saldoAtual = Double.valueOf(movimentacao.getSALDO());
            System.out.println("saldo103");
            System.out.println("Saldo");
            if (movimentacao.getENTRADASAIDA().equals("E")) {
                if (saldoAtual == 0) {
                    saldoAtual = 0.0;
                }
                saldoC = saldoGravadoAnterior + Double.valueOf(movimentacao.getQTDE());
                saldoGravadoAnterior = saldoGravadoAnterior + Double.valueOf(movimentacao.getQTDE());
                saldoC = Math.round(saldoC * 100.0) / 100.0;
                saldoGravadoAnterior = Math.round(saldoGravadoAnterior * 100.0) / 100.0;
                if (saldoC == 0) {
                    saldoC = 0.0;
                };
            } else {
                saldoC = saldoGravadoAnterior - Double.valueOf(movimentacao.getQTDE());
                saldoGravadoAnterior = saldoGravadoAnterior - Double.valueOf(movimentacao.getQTDE());
                saldoC = Math.round(saldoC * 100.0) / 100.0;
                saldoGravadoAnterior = Math.round(saldoGravadoAnterior * 100.0) / 100.0;
                if (saldoC == 0) {
                    saldoC = 0.0;
                };
            }
            saldoEsperado = Double.toString(saldoC);
            //fim calculo esperado
            if (movimentacao.getENTRADASAIDA().equals("E")) {
                entradasIntTEMP = Double.valueOf(movimentacao.getQTDE());
                entradasInt = entradasInt + entradasIntTEMP;
                //entrada
            } else {
                saidasIntTEMP = Double.valueOf(movimentacao.getQTDE());
                saidasInt = saidasInt + saidasIntTEMP;
                //saida
            }
            entradas = Double.toString(entradasInt);
            saidas = Double.toString(saidasInt);

            saldo = entradasInt - saidasInt;
            saldoTemp = Double.toString(saldo);
            jTextFieldEntrada.setText(entradas);
            jTextFieldSaida.setText(saidas);
            jTextFieldSaldo.setText(saldoTemp);
            jTableNfe.setDefaultRenderer(Object.class, new PintarTabela());
            String descricaoOperacao = "";
            if (movimentacao.getMOVIMENTOID().equals("01") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "VENDA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("01") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE VENDA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "COMPRA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "CANCELAMENTO COMPRA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("03")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE ALMOXARIFADO";
            }
            if (movimentacao.getMOVIMENTOID().equals("04")) {
                descricaoOperacao = "TRANSFERENCIA PRODUTO";
            }
            if (movimentacao.getMOVIMENTOID().equals("05")) {
                descricaoOperacao = "INVENTARIO";
            }
            if (movimentacao.getMOVIMENTOID().equals("06")) {
                descricaoOperacao = "RETIRADA";
            }
            if (movimentacao.getMOVIMENTOID().equals("07")) {
                descricaoOperacao = "DEVOLUÇÃO DE VENDA";
            }
            if (movimentacao.getMOVIMENTOID().equals("08")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE FILIAIS";
            }
            if (movimentacao.getMOVIMENTOID().equals("09")) {
                descricaoOperacao = "DEVOLUÇÃO";
            }
            if (movimentacao.getMOVIMENTOID().equals("09")) {
                descricaoOperacao = "PRODUÇAO";
            }
            if (movimentacao.getMOVIMENTOID().equals("10")) {
                descricaoOperacao = "SAIDA PRODUÇAO";
            }

            if (movimentacao.getENTRADASAIDA().equals("S")) {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "SAIDA", movimentacao.getQTDE(), movimentacao.getSALDO(), saldoEsperado, movimentacao.getDATAHORA(), movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao});
            } else {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "ENTRADA", movimentacao.getQTDE(), movimentacao.getSALDO(), saldoEsperado, movimentacao.getDATAHORA(), movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao});
            }

        }
        //Thread thread = new Thread() {
        //    @Override
        //    public void run() {
        //        System.out.println("Thread Running");
        //    }
        //};

        //thread.start();
    }

    public void carregarTabelaEstoque(ArrayList<Estoque> listaEstoque) {
        DefaultTableModel model = (DefaultTableModel) jTableEstoques.getModel();

        while (jTableEstoques.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Estoque estoque : listaEstoque) {
            model.addRow(new Object[]{estoque.getALMOX(), estoque.getESTDISPONIVEL(), estoque.getESTARETIRAR(), estoque.getESTCONDICIONAL(), estoque.getESTRESERVADO()});
        }
    }

    public void carregaTabelaSaldo(String produtoP) {
        DefaultTableModel model = (DefaultTableModel) jTableSaldo.getModel();
        ArrayList<Produto> listaSaldosProdutos = new ArrayList<>();
        while (jTableSaldo.getRowCount() > 0) {
            model.removeRow(0);
        }
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            listaSaldosProdutos = produtoDAO.buscaSaldo(produtoP);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Produto produto : listaSaldosProdutos) {
            model.addRow(new Object[]{produto.getEMPRESA(), produto.getALMOX(), produto.getANOSMES(), produto.getANTERIOR(), produto.getENTRADA(), produto.getSAIDA(), produto.getATUAL()});
        }
    }

    public void calculos(ArrayList<ExtratoProduto> listaProdutos) {
        jLabelMensagem.setText("");
        Double saldoC = 0.0;
        Double esperado = 0.0;
        Double saldoAtual = 0.0;
        Double saldoGravadoAnterior = 0.0;
        for (ExtratoProduto produto : listaProdutos) {
            saldoAtual = Double.valueOf(produto.getSALDO());
            if (produto.getENTRADASAIDA().equals("E")) {
                saldoC = saldoGravadoAnterior + Double.valueOf(produto.getQTDE());
                saldoGravadoAnterior = saldoGravadoAnterior + Double.valueOf(produto.getQTDE());
                saldoC = ArredondaDouble(saldoC);
                saldoGravadoAnterior = ArredondaDouble(saldoGravadoAnterior);
                if (saldoC == 0) {
                    saldoC = 0.0;
                };
                if (!saldoC.equals(saldoAtual)) {
                    jLabelMensagem.setText("Produto com erro no extrato.");
                }
            } else {
                saldoC = saldoGravadoAnterior - Double.valueOf(produto.getQTDE());
                saldoGravadoAnterior = saldoGravadoAnterior - Double.valueOf(produto.getQTDE());
                saldoC = ArredondaDouble(saldoC);
                saldoGravadoAnterior = ArredondaDouble(saldoGravadoAnterior);
                if (saldoC == 0) {
                    saldoC = 0.0;
                };
                if (!saldoC.equals(saldoAtual)) {
                    jLabelMensagem.setText("Produto com erro no extrato.");
                }
            }
        }

    }

    public Double ArredondaDouble(Double valor) {
        valor = Math.round(valor * 100.0) / 100.0;
        return valor;
    }

    public class PintarTabela extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.

            //INICIA AS CORES***************************************************
            Color background = Color.WHITE;
            Color foreground = Color.BLACK;
            Color Azul = new Color(0, 0, 255);
            Color VERDE = new Color(0, 179, 60);
            Color CINZACLARO = new Color(89, 89, 89);
            Color VERMELHO = new Color(214, 40, 40);
            Color AZUL2 = new Color(67, 97, 232);

            //if(isSelected){
            //    background = CINZA;
            //    foreground = Color.WHITE;
            // }
            Object objeto = table.getValueAt(row, 2);
            Object objeto1 = table.getValueAt(row, 8);

            String valor = objeto.toString();
            String valor2 = objeto1.toString();
            if (valor.equals("ENTRADA") && valor2.equals("02")) {
                foreground = Azul;
            }
            if (valor.equals("SAIDA") && valor2.equals("02")) {
                foreground = AZUL2;
            }
            if (valor.equals("ENTRADA") && valor2.equals("01")) {
                foreground = AZUL2;
            }
            //if(valor2.equals("03")){
            //    foreground = ROXO;
            //}

            //PINTA DESCONTOS***************************************************
            Object objeto2 = table.getValueAt(row, 4);
            Object objeto3 = table.getValueAt(row, 5);
            String saldo = objeto2.toString();
            String saldoEsperado = objeto3.toString();
            Double saldoD = 0.0;
            Double saldoEsperadoD = 0.0;
            saldoD = Double.valueOf(saldo);
            saldoEsperadoD = Double.valueOf(saldoEsperado);
            if (!saldoD.equals(saldoEsperadoD)) {
                foreground = VERMELHO;
            }

            label.setBackground(background);
            label.setForeground(foreground);
            if (isSelected) {
                background = Color.BLACK;
            }
            return label;
        }
    }

}
