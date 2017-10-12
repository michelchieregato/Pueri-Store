/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdstore.tela;
import java.sql.*;
import br.com.pdstore.dal.Conexao;
// Para usar a bibliote da tabela: r2xml
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import br.com.pdstore.tela.TelaCadastroUsuario;

/**
 *
 * @author Michel
 */
public class TelaPesquisaUsuario extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();

    public TelaPesquisaUsuario() {
        initComponents();
        conexao = Conexao.conector();

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisaUsuario = new javax.swing.JTextField();
        jBtnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaUsuarioActionPerformed(evt);
            }
        });
        txtPesquisaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaUsuarioKeyReleased(evt);
            }
        });

        jBtnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Lupa.png"))); // NOI18N

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTblClientes.setColumnSelectionAllowed(true);
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisaUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisaUsuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaUsuarioActionPerformed

    private void txtPesquisaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaUsuarioKeyReleased
        // O evento key realese é responsável pela tabela se atualizar em tempo real
        pesquisar_cliente();
    }//GEN-LAST:event_txtPesquisaUsuarioKeyReleased

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        setar_campos();
    }//GEN-LAST:event_jTblClientesMouseClicked
    private void pesquisar_cliente(){
        String sql = "select * from tblogin where usuario like ?";
        try {
            pst = conexao.prepareStatement(sql);
            // Passa conteudo da pesquisa para o ?
            // Atenção para o "%" - necessário para fazer a busca dinamica -> não incluido no string
            pst.setString(1, txtPesquisaUsuario.getText() + "%");
            rs=pst.executeQuery();
            // Usaremos a biblioteca p/ preencher a tabela
            jTblClientes.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
}
    // Método para setar os campos da tabela
       public void setar_campos(){
           int setar = jTblClientes.getSelectedRow();
           telaCadastroUsuario.txtIdUsuario.setText(jTblClientes.getModel().getValueAt(setar, 0).toString());
           telaCadastroUsuario.txtNomeUsuario.setText(jTblClientes.getModel().getValueAt(setar, 1).toString());
           telaCadastroUsuario.txtLoginUsuario.setText(jTblClientes.getModel().getValueAt(setar, 2).toString());
           telaCadastroUsuario.txtSenhaUsuario.setText(jTblClientes.getModel().getValueAt(setar, 3).toString());
           if(jTblClientes.getModel().getValueAt(setar, 4).toString().equals("Administrador")){
                telaCadastroUsuario.slctPerfilUsuario.setSelectedIndex(1);
           } else {
               telaCadastroUsuario.slctPerfilUsuario.setSelectedIndex(0);
           }
           this.dispose();
           telaCadastroUsuario.setVisible(true);
           
       }
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
            java.util.logging.Logger.getLogger(TelaPesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JTextField txtPesquisaUsuario;
    // End of variables declaration//GEN-END:variables

   

 
}
