
package View;

import Controller.MultasController;


public class FrMultas extends javax.swing.JFrame {

    MultasController multasController;
    
    public FrMultas() {
        multasController = new MultasController();
        initComponents();
        
     multasController.atualizarTabela(grdMultas);

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

        lblMenuPrincipal = new javax.swing.JLabel();
        jReturn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdMultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setText("Lista Multas");

        jReturn.setText("Retornar");
        jReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturn(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jReturn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturn
        FrFiscal janela = new FrFiscal();
        janela.show();
        setVisible(false);

    }//GEN-LAST:event_jReturn

    private void grdMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdMultasMouseClicked
        if (evt.getClickCount() == 2) {
        }
    }//GEN-LAST:event_grdMultasMouseClicked

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grdMultas;
    private javax.swing.JButton jReturn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
