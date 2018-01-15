/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdstore.tela;

import br.com.pdstore.dal.Conexao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.security.auth.callback.ConfirmationCallback;
import net.proteanit.sql.DbUtils;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author miche
 */
public class TelaConsultaVenda extends javax.swing.JFrame {
    
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    float preço;
    private int unidade;
    boolean administrador;

    /**
     * Creates new form TelaConsultaVenda
     */
    public TelaConsultaVenda(int unidade, boolean administrador) {
        this.unidade = unidade;
        this.administrador = administrador;
        conexao = Conexao.conector();
        initComponents();
        if (this.administrador)
            btnApaga.setEnabled(true);
        pesquisar_cliente();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.getWidth() * 0.6); 
        int height = (int) screenSize.getHeight();
        this.setSize(width-50, height-150);
        this.setLocationRelativeTo(null);
    }

    private TelaConsultaVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jTabela = new javax.swing.JTable();
        txtPesquisaUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabela2 = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        btnApaga = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtVenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        txtPesquisaUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesquisaUsuario.setToolTipText("Pesquisar por nome...");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Lupa.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquisar Vendas");

        jLabel3.setText("Codigo");

        jTabela2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabela2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabela2MouseClicked(evt);
            }
        });
        jTabela2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabela2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTabela2);

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnApaga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnApaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/lixo.png"))); // NOI18N
        btnApaga.setText("Apagar Compra");
        btnApaga.setEnabled(false);
        btnApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaActionPerformed(evt);
            }
        });

        jButton5.setText("Imprimir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVendaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(703, 703, 703))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnApaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(btnApaga)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        setar_tabela_2();
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabelaKeyPressed

    }//GEN-LAST:event_jTabelaKeyPressed

    private void txtPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaUsuarioActionPerformed

    private void txtPesquisaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaUsuarioKeyReleased
        // O evento key realese é responsável pela tabela se atualizar em tempo real
        pesquisar_cliente();
    }//GEN-LAST:event_txtPesquisaUsuarioKeyReleased

    private void jTabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabela2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabela2MouseClicked

    private void jTabela2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabela2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabela2KeyPressed

    private void btnApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaActionPerformed
        apagar_compra();
    }//GEN-LAST:event_btnApagaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            HashMap filtro = new HashMap();
            filtro.put("IdVenda", Integer.parseInt(txtCodigo.getText()));
            JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream("/br/com/pdstore/relatorio/CupomPueri.jasper"), filtro, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendaKeyReleased
        pesquisar_cliente(); // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaKeyReleased

    /**
     * @param args the command line arguments
     */
    
    private void pesquisar_cliente(){
        String sql;
        sql = "SELECT Venda.IdVenda, Nome, Telefone, Email, Preco, Dia FROM tbcliente AS Cliente JOIN tbvenda AS Venda ON Cliente.Id = Venda.idcliente WHERE Nome like ? and Preco like ? ORDER BY Dia DESC";
        try {
            pst = conexao.prepareStatement(sql);
            // Passa conteudo da pesquisa para o ?
            // Atenção para o "%" - necessário para fazer a busca dinamica -> não incluido no string
            pst.setString(1,"%" + txtPesquisaUsuario.getText() + "%");
            pst.setString(2,"%" + txtVenda.getText() + "%");
            rs=pst.executeQuery();
            // Usaremos a biblioteca p/ preencher a tabela
            jTabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    private void setar_tabela_2() {
        int setar = jTabela.getSelectedRow();
        String codigo = jTabela.getModel().getValueAt(setar, 0).toString();
        txtCodigo.setText(codigo);
        String sql = "SELECT Idproduto as Codigo, Descricao, Quantidade, Total, Venda.Vendedor FROM tbvenda as Venda JOIN tbitens_venda as Itens on Itens.IdVenda=Venda.IdVenda join tbprodutos as Produto ON Produto.Codigo = Itens.IdProduto WHERE Venda.IdVenda = " + codigo;
        try {
            pst = conexao.prepareStatement(sql);
            // Passa conteudo da pesquisa para o ?
            // Atenção para o "%" - necessário para fazer a busca dinamica -> não incluido no string
            rs=pst.executeQuery();
            // Usaremos a biblioteca p/ preencher a tabela
            jTabela2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
    private void apagar_compra(){
        int a = JOptionPane.showConfirmDialog(null, "Tem certeza?\n (A compra será apagada para sempre dos registros)", "Responda para prosseguir", ConfirmationCallback.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);        
        if (a==0) { // Se foi escolhido sim pelo usuário
            cancela_venda(txtCodigo.getText());
        }
        
    }
    
    private void cancela_venda(String aux) {
        repoe_estoque();
        try {
            // Deleta tabela de itens vendidos
            String sql = "delete from tbformapagamento where IdVenda=?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aux);
            pst.execute();
            // Deleta da tabela forma de pagamentos
            sql = "delete from tbitens_venda where IdVenda=?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aux);
            pst.execute();
            // Deleta da tabela Venda
            sql = "delete from tbvenda where IdVenda=?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1, aux);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda excluída com sucesso");
            txtCodigo.setText(null);
            pesquisar_cliente();
            jTabela2.clearSelection();

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            this.dispose();
        }

    }

    
    private void repoe_estoque(){
        // Declaração de variáveis
        String sql="";
        String aux = txtCodigo.getText();
        switch(this.unidade){
                // 0 = Verbo, 1 = Aldeia, 2 = Aclimacao, 3 = Itaim - Ver TelaQualUnidade
                case 0:
                    sql = "SELECT Itens.Quantidade, Estoque_Verbo, Produto.Codigo FROM tbitens_venda AS Itens JOIN tbprodutos AS Produto ON Itens.Idproduto = Produto.Codigo JOIN tbvenda AS Venda ON Itens.IdVenda = Venda.IdVenda WHERE Venda.IdVenda = " + aux;
                    break;
                case 1:
                    sql = "SELECT Itens.Quantidade, Estoque_Aldeia, Produto.Codigo FROM tbitens_venda AS Itens JOIN tbprodutos AS Produto ON Itens.Idproduto = Produto.Codigo JOIN tbvenda AS Venda ON Itens.IdVenda = Venda.IdVenda WHERE Venda.IdVenda = " + aux;
                    break;
                case 2:
                    sql = "SELECT Itens.Quantidade, Estoque_Aclimacao, Produto.Codigo FROM tbitens_venda AS Itens JOIN tbprodutos AS Produto ON Itens.Idproduto = Produto.Codigo JOIN tbvenda AS Venda ON Itens.IdVenda = Venda.IdVenda WHERE Venda.IdVenda = " + aux;
                    break;
                case 3:
                    sql = "SELECT Itens.Quantidade, Estoque_Itaim, Produto.Codigo FROM tbitens_venda AS Itens JOIN tbprodutos AS Produto ON Itens.Idproduto = Produto.Codigo JOIN tbvenda AS Venda ON Itens.IdVenda = Venda.IdVenda WHERE Venda.IdVenda = " + aux;
                    break;
            }
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            rs.first();
            do {                
                int quantidade = rs.getInt(1);
                int estoque = rs.getInt(2); 
                int soma = quantidade + estoque;
                switch(this.unidade){
                // 0 = Verbo, 1 = Aldeia, 2 = Aclimacao, 3 = Itaim - Ver TelaQualUnidade
                case 0:
                    sql = "update tbprodutos set Estoque_Verbo = " + Integer.toString(soma) + " where Codigo = " + rs.getInt(3);
                    break;
                case 1:
                    sql = "update tbprodutos set Estoque_Aldeia = " + Integer.toString(soma) + " where Codigo = " + rs.getInt(3);
                    break;
                case 2:
                    sql = "update tbprodutos set Estoque_Aclimacao = " + Integer.toString(soma) + " where Codigo = " + rs.getInt(3);
                    break;
                case 3:
                    sql = "update tbprodutos set Estoque_Itaim = " + Integer.toString(soma) + " where Codigo = " + rs.getInt(3);
                    break;
            }
                pst = conexao.prepareStatement(sql);
                pst.executeUpdate();
            } while (rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Atualizou o estoque!!!!!");
            JOptionPane.showMessageDialog(null, e);
        }
            
    }
    
    
    
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
            java.util.logging.Logger.getLogger(TelaConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApaga;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabela;
    private javax.swing.JTable jTabela2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPesquisaUsuario;
    private javax.swing.JTextField txtVenda;
    // End of variables declaration//GEN-END:variables
}
