/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecompras;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adm
 */
public class JListaDeCompras extends javax.swing.JFrame {

    /**
     * Creates new form JListaDeCompras
     */
    public JListaDeCompras() {
        initComponents();
    }
    
    public ArrayList<Produto> produtos = new ArrayList<>(); //criando um Array para incrementar a tabela

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprodutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listadecompras/photo.jpg"))); // NOI18N

        jLabel6.setText("jLabel6");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 55, 142, -1));
        getContentPane().add(txtpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 55, 142, -1));

        jButton1.setText("ADD");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        btnupdate.setText("UPDATE");
        btnupdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));

        btnexcluir.setText("EXCLUIR");
        btnexcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, -1));

        tbprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprodutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbprodutos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 375, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listadecompras/photo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        double soma = 0.0;
    public void atualizarlinha(){
        
        DefaultTableModel tabela = (DefaultTableModel) tbprodutos.getModel();
        tabela.setNumRows(0);
        
        for(Produto prod1: produtos){
            tabela.addRow(new Object[]{
               prod1.getNome(),
               prod1.getPreco()
            });
        }
    }

    public void limpar(){
        txtnome.setText("");
        txtpreco.setText("");
        txtnome.requestFocus();
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double preco = Double.parseDouble(txtpreco.getText());
        Produto prod = new Produto();
        
        prod.setNome(txtnome.getText());
        prod.setPreco(preco);
        //System.out.println(" " + prod.getNome() + " " + prod.getPreco());
        
       /* DefaultTableModel tabela = (DefaultTableModel) tbprodutos.getModel(); //chamei o modelo, fiz um casting pro tipo do modelo da tabela
        tabela.setNumRows(0); //aqui é para zerar as linhas da tabela */
           
        produtos.add(prod); //ADICIONANDO LINHA NA TABELA
        atualizarlinha();
        limpar();
        /*for(Produto prod1: produtos){   //vai adicionar um produto em produtos, enqaunto tiver produto
               tabela.addRow(new Object[]{ //agora adcionei uma linha na tabela com os valores digitados
               prod1.getNome(),
               prod1.getPreco()
             }); 
        }*/
        
        
        //NESSE CASO, VOU ADICIONAR O CÓDIGO QUE ADICIONA LINHA DENTRO DO FOR
        /*DefaultTableModel tabela = (DefaultTableModel) tbprodutos.getModel(); //chamei o modelo, fiz um casting pro tipo do modelo da tabela
           tabela.setNumRows(0); //aqui é para zerar as linhas da tabela 
        //CÓDIGO Q ADD LINHA 
        tabela.addRow(new Object[]{ //agora adcionei uma linha na tabela com os valores digitados
            prod.getNome(),
            prod.getPreco()
        });*/
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        int pos = tbprodutos.getSelectedRow();  //criei uma var para guardar qual posição o usuário selecionou
        produtos.remove(pos);   //chamei o array e removi a posição selecionada
        atualizarlinha();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        double preco = Double.parseDouble(txtpreco.getText());
        int pos = tbprodutos.getSelectedRow();
        produtos.get(pos).setNome(txtnome.getText());
        produtos.get(pos).setPreco(preco);
        atualizarlinha();;
        limpar();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutosMouseClicked
        int pos = tbprodutos.getSelectedRow();
        
        txtnome.setText(tbprodutos.getValueAt(pos, 0).toString());
        txtpreco.setText(tbprodutos.getValueAt(pos,1).toString());
        
    }//GEN-LAST:event_tbprodutosMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JListaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaDeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaDeCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbprodutos;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
