package restoreapplication;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Verifica extends javax.swing.JFrame {
    boolean interromper = false;

    public Verifica() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificando extrato de produtos com erro");
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setEditable(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));

        jButton1.setText("Verificar extrato dos produtos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregaProdutos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        interromper = true;
        jTextArea1.append("PROCESSO INTERROMPIDO \n");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
public void carregaProdutos() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                jTextArea1.append("PRODUTOS COM ERRO-----------------\n");
                ProdutoDAO produtoDAO = new ProdutoDAO();
                ArrayList<Integer> listaProdutos = new ArrayList();
                try {
                    listaProdutos = produtoDAO.buscaCodigos();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                }
                int tamanho;
                tamanho = listaProdutos.size();
                jProgressBar1.setMaximum(tamanho);
                jProgressBar1.setMinimum(0);
                int indice = 0;
                int erros = 0;
                for (Integer cod : listaProdutos) {
                    if(interromper){
                        break;
                    }
                    String codString = cod.toString();
                    while (codString.length() < 6) {
                        codString = "0" + codString;
                    }
                    indice++;
                    jTextField2.setText(codString);
                    jProgressBar1.setValue(indice);
                    ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                    ArrayList<ExtratoProduto> extratoDoProduto = new ArrayList();
                    try {
                        extratoDoProduto = extratoProdutoDAO.extratoProduto(codString);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Double saldoAnterior = 0.0;
                    for (ExtratoProduto produto : extratoDoProduto) {
                        double qtdMovimentada;
                        double saldoAtual;
                        double saldoEsperado;
                        saldoAtual = Double.parseDouble(produto.getSALDO());
                        saldoAtual = ArredondaDouble(saldoAtual);
                        qtdMovimentada = Double.parseDouble(produto.getQTDE());
                        qtdMovimentada = ArredondaDouble(qtdMovimentada);
                        if (produto.getENTRADASAIDA().equals("E")) {
                            saldoEsperado = saldoAnterior + qtdMovimentada;
                            saldoEsperado = ArredondaDouble(saldoEsperado);
                        } else {
                            saldoEsperado = saldoAnterior - qtdMovimentada;
                            saldoEsperado = ArredondaDouble(saldoEsperado);
                        }
                        //------------------------------------------------------
                        double temp = saldoEsperado - saldoAtual;
                             if (temp < 0.1) {
                                saldoEsperado = saldoAtual;
                             }
                        //------------------------------------------------------
                        if (saldoEsperado != saldoAtual) {
                            jTextArea1.append("Código do produto : " + produto.getPRODUTO() + "\n");
                            jTextArea1.append("Saldo atual : " + saldoAtual + " Saldo esperado : " + saldoEsperado + "\n");
                            erros++;
                            jTextArea1.setCaretPosition(jTextArea1.getText().length());
                            break;
                        }
                        saldoAnterior = saldoAtual;
                    }

                }
                jTextArea1.append("----------------------------------\n");
                jTextArea1.append("PROCESSO CONCLUIDO.\n");
                jTextArea1.append("----------------------------------\n");
                jTextArea1.append(erros + " - PRODUTOS COM ERRO.\n");
                jTextArea1.append("----------------------------------\n");
                jTextArea1.setCaretPosition(jTextArea1.getText().length());
            }
        };

        thread.start();
        

    }

    public Double ArredondaDouble(Double valor) {
        valor = Math.round(valor * 100.0) / 100.0;
        return valor;
    }
}
