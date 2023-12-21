package restoreapplication;

import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class TelaNotas extends javax.swing.JFrame {

    /**
     * Creates new form TelaNotas
     */
    public TelaNotas() {
        initComponents();
    }
    public TelaNotas(String empresa, String numeroDOC) {
        initComponents();
        consultaPedido(empresa, numeroDOC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldStatus = new javax.swing.JTextField();
        jTextFieldNota = new javax.swing.JTextField();
        jTextFieldVersao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jTextFieldDataPedido = new javax.swing.JTextField();
        jTextFieldDataEmissao = new javax.swing.JTextField();
        jTextFieldDataChegada = new javax.swing.JTextField();
        jTextFieldDataEntrada = new javax.swing.JTextField();
        jTextFieldDataFatura = new javax.swing.JTextField();
        jTextFieldDataCancelamento = new javax.swing.JTextField();
        jTextFieldDataValidacao = new javax.swing.JTextField();
        jTextFieldChaveNFE = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldIdNatureza = new javax.swing.JTextField();
        jTextFieldCodigoFiscal = new javax.swing.JTextField();
        jTextFieldMovimentaEstoque = new javax.swing.JTextField();
        jTextFieldAtiva = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Mercadoria");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Emp."));

        jTextFieldStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jTextFieldNota.setToolTipText("teste");
        jTextFieldNota.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        jTextFieldNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNotaActionPerformed(evt);
            }
        });

        jTextFieldVersao.setBorder(javax.swing.BorderFactory.createTitledBorder("Versão"));
        jTextFieldVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVersaoActionPerformed(evt);
            }
        });

        jTextAreaObs.setColumns(20);
        jTextAreaObs.setRows(5);
        jTextAreaObs.setBorder(javax.swing.BorderFactory.createTitledBorder("Observação"));
        jScrollPane2.setViewportView(jTextAreaObs);

        jTextFieldDataPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pedido"));

        jTextFieldDataEmissao.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Emissão"));

        jTextFieldDataChegada.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Chegada"));

        jTextFieldDataEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Entrada"));

        jTextFieldDataFatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Fatura"));

        jTextFieldDataCancelamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Cancelamento"));

        jTextFieldDataValidacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Validação"));

        jTextFieldChaveNFE.setBorder(javax.swing.BorderFactory.createTitledBorder("Chave NFE"));

        jTextFieldTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Entrada"));
        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });

        jTextFieldIdNatureza.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Natureza"));

        jTextFieldCodigoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Fiscal"));

        jTextFieldMovimentaEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimenta Estoque"));

        jTextFieldAtiva.setBorder(javax.swing.BorderFactory.createTitledBorder("Ativa"));

        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNota, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmpresa)
                            .addComponent(jTextFieldVersao)
                            .addComponent(jTextFieldStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldChaveNFE, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTipo)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDataChegada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDataFatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldDescricao)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldIdNatureza, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCodigoFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMovimentaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDataValidacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDataCancelamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdNatureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigoFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMovimentaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChaveNFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldDataFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataValidacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao.setText("ENTRADA DE MERCADORIA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Produto", "Qtde", "Almox"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNotaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed


    }//GEN-LAST:event_formWindowClosed

    private void jTextFieldVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVersaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVersaoActionPerformed

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldAtiva;
    private javax.swing.JTextField jTextFieldChaveNFE;
    private javax.swing.JTextField jTextFieldCodigoFiscal;
    private javax.swing.JTextField jTextFieldDataCancelamento;
    private javax.swing.JTextField jTextFieldDataChegada;
    private javax.swing.JTextField jTextFieldDataEmissao;
    private javax.swing.JTextField jTextFieldDataEntrada;
    private javax.swing.JTextField jTextFieldDataFatura;
    private javax.swing.JTextField jTextFieldDataPedido;
    private javax.swing.JTextField jTextFieldDataValidacao;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldIdNatureza;
    private javax.swing.JTextField jTextFieldMovimentaEstoque;
    private javax.swing.JTextField jTextFieldNota;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldVersao;
    // End of variables declaration//GEN-END:variables
public void consultaPedido(String empresa, String numeroDOC) {
        TestNfe nfe = new TestNfe();
        TestNfeDAO nfeDAO = new TestNfeDAO();
        try {
            nfe = nfeDAO.buscaNota(empresa,numeroDOC);
            if(nfe.getSTATUS().equals("CA")){
            jTextFieldStatus.setForeground(Color.red);
            jTextFieldDataCancelamento.setForeground(Color.red);
            jLabelDescricao.setForeground(Color.red);
            }
            
            jTextFieldEmpresa.setText(nfe.getEMPRESA());
            jTextFieldStatus.setText(nfe.getSTATUS());
            jTextFieldNota.setText(nfe.getNUMERONFE());
            jTextFieldVersao.setText(nfe.getVERSAO());
            jTextAreaObs.setText(nfe.getOBS());
            jTextFieldDataPedido.setText(nfe.getDATAPEDIDO());
            jTextFieldDataEmissao.setText(nfe.getDATAEMISSAO());
            jTextFieldDataChegada.setText(nfe.getDATACHEGADA());
            jTextFieldDataEntrada.setText(nfe.getDATAENTRADA());
            jTextFieldDataFatura.setText(nfe.getDATAFATURA());
            jTextFieldDataCancelamento.setText(nfe.getDATACANCEL());
            jTextFieldDataValidacao.setText(nfe.getDATAVALIDACAO());
            jTextFieldChaveNFE.setText(nfe.getCHAVENFE());
            jTextFieldTipo.setText(nfe.getTIPO());
            jTextFieldIdNatureza.setText(nfe.getNATUREZA());
            //INER NATUREZA
            jTextFieldDescricao.setText(nfe.getDESCRICAO());
            jTextFieldCodigoFiscal.setText(nfe.getCODIGOFISCAL());
            jTextFieldMovimentaEstoque.setText(nfe.getMOVIMENTAESTOQUE());
            jTextFieldAtiva.setText(nfe.getATIVA());
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        ProdutoDAO produtoDAO = new ProdutoDAO();
        //PRODUTOS PEDIDO
        ArrayList<Produto> listaProdutos = new ArrayList();
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        try {
            listaProdutos = produtoDAO.produtosDaNota(numeroDOC, empresa);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
         }
        for (Produto produto : listaProdutos) {
           model.addRow(new Object[]{empresa,produto.getCODIGO(),produto.getQTDE(),produto.getALMOX()});
         }
    }
}
