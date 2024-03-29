
package View;

import Controller.MultasController;
import Exceptions.MultaException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Multas;


public class FrCadMultas extends javax.swing.JFrame {

    MultasController multasController;
    long idMultasEditando;

    public FrCadMultas() {
        multasController = new MultasController();
        initComponents();
        this.habilitarCampos(false);
        this.limparCampos();
        this.adicionarMascaraNosCampos();

        multasController.atualizarTabela(grdMultas);
    }

    public void adicionarMascaraNosCampos() {
        try {
            MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
            maskCnpj.install((JFormattedTextField) fEdtCnpj);
            
        } catch (ParseException ex) {
            Logger.getLogger(FrCadMultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void habilitarCampos(boolean flag) {
        fEdtCnpj.setEnabled(flag);
        edtDocumento.setEnabled(flag);
        edtVencimento.setEnabled(flag);
        edtMultas.setEnabled(flag);
        edtJuros.setEnabled(flag);
        edtTotal.setEnabled(flag);

    }

    public void limparCampos() {
        fEdtCnpj.setText("");
        edtDocumento.setText("");
        edtVencimento.setText("");
        edtMultas.setText("");
        edtJuros.setText("");
        edtTotal.setText("");

    }

    public void preencherFormulario(Multas m) {
        fEdtCnpj.setText(m.getCnpj());
        edtDocumento.setText(m.getDocumento() + "");
        edtVencimento.setText(m.getVencimento() + "");
        edtMultas.setText(m.getMulta() + "");
        edtJuros.setText(m.getJuros() + "");
        edtTotal.setText(m.getTotal() + "");
    }

    private Object getObjetoSelecionadoNaGrid() {
        int rowCliked = grdMultas.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdMultas.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jReturn = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        edtDocumento = new javax.swing.JTextField();
        lblSexo3 = new javax.swing.JLabel();
        lblSexo1 = new javax.swing.JLabel();
        lblSexo4 = new javax.swing.JLabel();
        lblSexo5 = new javax.swing.JLabel();
        edtMultas = new javax.swing.JTextField();
        lblSexo2 = new javax.swing.JLabel();
        lblSexo6 = new javax.swing.JLabel();
        edtTotal = new javax.swing.JTextField();
        edtJuros = new javax.swing.JTextField();
        lblMenuPrincipal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdMultas = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        fEdtCnpj = new javax.swing.JFormattedTextField();
        edtVencimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jReturn.setText("Retornar");
        jReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturn(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        edtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDocumentoActionPerformed(evt);
            }
        });

        lblSexo3.setText("Documento:");

        lblSexo1.setText("CNPJ:");

        lblSexo4.setText("Vencimento:");

        lblSexo5.setText("Juros:");

        edtMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMultasActionPerformed(evt);
            }
        });

        lblSexo2.setText("Multa:");

        lblSexo6.setText("Total:");

        edtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalActionPerformed(evt);
            }
        });

        edtJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtJurosActionPerformed(evt);
            }
        });

        lblMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setText("Cadastro Multas");

        grdMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdMultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grdMultas);

        btnNovo.setForeground(new java.awt.Color(0, 25, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        fEdtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEdtCnpjActionPerformed(evt);
            }
        });

        edtVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtVencimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSexo3)
                                            .addComponent(lblSexo1)
                                            .addComponent(lblSexo4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fEdtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSexo6)
                                            .addGap(18, 18, 18)
                                            .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblSexo5)
                                                .addComponent(lblSexo2, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(edtMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(edtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fEdtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo2)
                            .addComponent(edtMultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jReturn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturn
        FrEmpresa janela = new FrEmpresa();
        janela.show();
        this.setVisible(false);

    }//GEN-LAST:event_jReturn

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if (idMultasEditando > 0) {
                multasController.atualizarMultas(idMultasEditando, fEdtCnpj.getText(), edtDocumento.getText(), edtMultas.getText(), edtVencimento.getText(), edtJuros.getText(), edtTotal.getText());
            } else {
                multasController.cadastrarMultas(fEdtCnpj.getText(), edtDocumento.getText(), edtMultas.getText(), edtVencimento.getText(), edtJuros.getText(), edtTotal.getText());
            }
            this.idMultasEditando = -1;
            multasController.atualizarTabela(grdMultas);

            this.habilitarCampos(false);
            this.limparCampos();
        } catch (MultaException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void edtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDocumentoActionPerformed

    private void edtMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMultasActionPerformed

    private void edtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTotalActionPerformed

    private void edtJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtJurosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtJurosActionPerformed

    private void grdMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdMultasMouseClicked
        if (evt.getClickCount() == 2) {
            btnEditarActionPerformed(null);
        }
    }//GEN-LAST:event_grdMultasMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Multas multasEditando = (Multas) this.getObjetoSelecionadoNaGrid();

        if (multasEditando == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.preencherFormulario(multasEditando);
            this.idMultasEditando = multasEditando.getId();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        Multas multasExcluido = (Multas) this.getObjetoSelecionadoNaGrid();

        if (multasExcluido == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione uma multa cadastrada na tabela.");
        else {
            int response = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir a Multa  \n("
                    + multasExcluido.getCnpj() + ") ?",
                    "Confirmar exclusão",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                try {
                    multasController.excluirMultas(multasExcluido);

                    multasController.atualizarTabela(grdMultas);
                    JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
                } catch (MultaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void fEdtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEdtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fEdtCnpjActionPerformed

    private void edtVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtVencimentoActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadMultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadMultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JTextField edtDocumento;
    private javax.swing.JTextField edtJuros;
    private javax.swing.JTextField edtMultas;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtVencimento;
    private javax.swing.JFormattedTextField fEdtCnpj;
    private javax.swing.JTable grdMultas;
    private javax.swing.JButton jReturn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblSexo2;
    private javax.swing.JLabel lblSexo3;
    private javax.swing.JLabel lblSexo4;
    private javax.swing.JLabel lblSexo5;
    private javax.swing.JLabel lblSexo6;
    // End of variables declaration//GEN-END:variables
}
