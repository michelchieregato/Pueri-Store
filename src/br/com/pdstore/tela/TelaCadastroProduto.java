/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdstore.tela;
import java.sql.*;
import javax.swing.JOptionPane;
import br.com.pdstore.dal.Conexao;

/**
 *
 * @author Michel
 */
public class TelaCadastroProduto extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    String salvaNome;
    ResultSet rs = null;
    String tamanhos[] = new String[15];


    public TelaCadastroProduto() {
        initComponents();
        conexao = Conexao.conector();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jDescricao = new javax.swing.JTextField();
        jGrade1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jGrade2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTipo1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSigla = new javax.swing.JTextField();
        jTipo3 = new javax.swing.JComboBox<>();
        jTipo2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPrecoCusto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPrecoVenda = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setText("Descrição");

        jLabel4.setText("Grade");

        jCodigo.setEditable(false);
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });

        jDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescricaoActionPerformed(evt);
            }
        });

        jGrade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ST", "00", "02", "04", "06", "08", "10", "12", "14", "PP", "P", "M", "G", "GG", "ESP", " " }));
        jGrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGrade1ActionPerformed(evt);
            }
        });

        jLabel1.setText("à");

        jGrade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ST", "00", "02", "04", "06", "08", "10", "12", "14", "PP", "P", "M", "G", "GG", "ESP", "" }));
        jGrade2.setSelectedIndex(14);
        jGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGrade2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipos");

        jTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAMISETA", "BERMUDA", "CALÇA", "BLUSAO", "REGATA", "SHORT", "JALECO" }));
        jTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipo1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Sigla");

        jSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiglaActionPerformed(evt);
            }
        });

        jTipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "COLEGIAL", "SUPLEX", "COM FLANELA", "LISO", "UNISEX", "FEMININO" }));
        jTipo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipo3ActionPerformed(evt);
            }
        });

        jTipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "MC", "ML", "CICLISTA", "CORSARIO", "MOLETOM", "SAIA", "SARJA" }));
        jTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipo2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Preço Custo");

        jPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecoCustoActionPerformed(evt);
            }
        });

        jLabel8.setText("Preço Venda");

        jPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecoVendaActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Adicionar.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Adicionar");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Pesquisar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Pesquisar");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Editar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Editar");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pdstore/imagem/Apagar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Apagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(jTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(241, 241, 241)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel11)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel12)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addComponent(jCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoActionPerformed

    private void jDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescricaoActionPerformed

    private void jGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGrade2ActionPerformed

    private void jTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipo1ActionPerformed
        // TODO add your handling code here:
        preencheDescricao();
    }//GEN-LAST:event_jTipo1ActionPerformed

    private void jSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSiglaActionPerformed

    private void jTipo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipo3ActionPerformed
        preencheDescricao();
    }//GEN-LAST:event_jTipo3ActionPerformed

    private void jTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipo2ActionPerformed
        preencheDescricao();
    }//GEN-LAST:event_jTipo2ActionPerformed

    private void jGrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGrade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGrade1ActionPerformed

    private void jPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecoCustoActionPerformed

    private void jPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecoVendaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        alterar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        apagar();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void preencheDescricao(){
        jDescricao.setText(jTipo1.getSelectedItem().toString() + " " + jTipo2.getSelectedItem().toString() + " " + jTipo3.getSelectedItem().toString());
        String a = ""; String b = ""; String c= "";
        
        if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("Camiseta")){
            a = "CAM";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("Bermuda")){
            a = "BERM";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("Calça")){
            a = "CAL";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("Bermuda")){
            a = "CAM";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("Blusao")){
            a = "BLUS";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("REGATA")){
            a = "REG";
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("SHORT")){
            a = "SHORT"; 
        } else if (jTipo1.getSelectedItem().toString().equalsIgnoreCase("JALECO")){
            a = "JAL";}
        
        if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("MC")){
            b = "MC";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("ML")){
            b = "ML";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("CICLISTA")){
            b = "CICL";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("CORSARIO")){
            b = "CORS";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("MOLETOM")){
            b = "MOL";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("SAIA")){
            b = "SAIA";
        } else if (jTipo2.getSelectedItem().toString().equalsIgnoreCase("SARJA")){
            b = "SHORT"; }
        
        if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("COLEGIAL")){
            c = "COL";
        } else if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("SUPLEX")){
            c = "SUP";
        } else if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("COM FLANELA")){
            c = "FLAN";
        } else if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("LISO")){
            c = "LISO";
        } else if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("UNISEX")){
            c = "UNISEX";
        } else if (jTipo3.getSelectedItem().toString().equalsIgnoreCase("FEMININO")){
            c = "FEM";
        }
        jSigla.setText(a + ' ' + b + ' ' + c);
        
    }
    
    private void adicionar(){
        String sql = "insert into tbprodutos(Descricao, Sigla, Preco_Custo, Preco_Venda, Tamanho, Estoque_Central, Estoque_Aldeia, Estoque_Itaim, Estoque_Verbo, Estoque_Aclimacao) values(?,?,?,?,?,0,0,0,0,0)";
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1, jDescricao.getText());
            pst.setString(2, jSigla.getText());
            if (!jPrecoCusto.getText().isEmpty())
                pst.setString(3, jPrecoCusto.getText().replaceAll(",", "."));
            else
                pst.setString(3, "0");
            pst.setString(4, jPrecoVenda.getText().replaceAll(",", "."));
            tamanhos[0] = "ST"; tamanhos[1] = "00"; tamanhos[2] = "02"; tamanhos[3] = "04"; tamanhos[4] = "06"; tamanhos[5] = "08"; tamanhos[6] = "10"; tamanhos[7] = "12"; tamanhos[8] = "14"; tamanhos[9] = "PP"; tamanhos[10] = "P"; tamanhos[11] = "M"; tamanhos[12] = "G"; tamanhos[13] = "GG"; tamanhos[14] = "ESP";
            if (jDescricao.getText().isEmpty() || jSigla.getText().isEmpty() || jPrecoVenda.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios (Preenchidos com asterisco)");
            } else {
                int aux;
                int adicionado = 1;
                for (int i = jGrade1.getSelectedIndex(); i < jGrade2.getSelectedIndex()+1; i++){
                    pst.setString(5, tamanhos[i]);
                    aux = pst.executeUpdate();
                    adicionado *= aux;
                }
                    
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                    jDescricao.setText(null);
                    jSigla.setText(null);
                    jPrecoCusto.setText(null);
                    jPrecoVenda.setText(null);
                    }
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void consultar(){
        try {
            TelaPesquisaProdutos telaPesquisaProdutos = new TelaPesquisaProdutos();
            telaPesquisaProdutos.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void alterar(){
        String sql = "update tbprodutos set Descricao=?, Sigla=?, Preco_Custo=?, Preco_Venda=? where Descricao=? and Tamanho=?";
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1, jDescricao.getText());
            pst.setString(2, jSigla.getText());
            if (!jPrecoCusto.getText().isEmpty())
                pst.setString(3, jPrecoCusto.getText().replaceAll(",", "."));
            else
                pst.setString(3, "0");
            pst.setString(4, jPrecoVenda.getText().replaceAll(",", "."));
            tamanhos[0] = "ST"; tamanhos[1] = "00"; tamanhos[2] = "02"; tamanhos[3] = "04"; tamanhos[4] = "06"; tamanhos[5] = "08"; tamanhos[6] = "10"; tamanhos[7] = "12"; tamanhos[8] = "14"; tamanhos[9] = "PP"; tamanhos[10] = "P"; tamanhos[11] = "M"; tamanhos[12] = "G"; tamanhos[13] = "GG"; tamanhos[14] = "ESP";
            if (jDescricao.getText().isEmpty() || jSigla.getText().isEmpty() || jPrecoVenda.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios (Preenchidos com asterisco)");
            } else {
                pst.setString(5, salvaNome);
                int aux;
                int adicionado = 1;
                for (int i = jGrade1.getSelectedIndex(); i < jGrade2.getSelectedIndex()+1; i++){
                    pst.setString(6, tamanhos[i]);
                    aux = pst.executeUpdate();
                    //adicionado *= aux;
                }
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
                    jDescricao.setText(null);
                    jSigla.setText(null);
                    jPrecoCusto.setText(null);
                    jPrecoVenda.setText(null);
                    jCodigo.setText(null);
                    }
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void apagar(){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esses produtos?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
        String sql = "delete from tbprodutos where Descricao=? and Tamanho=?";
        try {
            pst=conexao.prepareStatement(sql);
            tamanhos[0] = "ST"; tamanhos[1] = "00"; tamanhos[2] = "02"; tamanhos[3] = "04"; tamanhos[4] = "06"; tamanhos[5] = "08"; tamanhos[6] = "10"; tamanhos[7] = "12"; tamanhos[8] = "14"; tamanhos[9] = "PP"; tamanhos[10] = "P"; tamanhos[11] = "M"; tamanhos[12] = "G"; tamanhos[13] = "GG"; tamanhos[14] = "ESP";
            if (jDescricao.getText().isEmpty() || jSigla.getText().isEmpty() || jPrecoVenda.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios (Preenchidos com asterisco)");
            } else {
                pst.setString(1, salvaNome);
                int aux;
                int adicionado = 1;
                for (int i = jGrade1.getSelectedIndex(); i < jGrade2.getSelectedIndex()+1; i++){
                    pst.setString(2, tamanhos[i]);
                    aux = pst.executeUpdate();
                    //adicionado *= aux;
                }
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
                    jDescricao.setText(null);
                    jSigla.setText(null);
                    jPrecoCusto.setText(null);
                    jPrecoVenda.setText(null);
                    jCodigo.setText(null);
                    }
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JTextField jCodigo;
    public javax.swing.JTextField jDescricao;
    private javax.swing.JComboBox<String> jGrade1;
    private javax.swing.JComboBox<String> jGrade2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jPrecoCusto;
    public javax.swing.JTextField jPrecoVenda;
    public javax.swing.JTextField jSigla;
    private javax.swing.JComboBox<String> jTipo1;
    private javax.swing.JComboBox<String> jTipo2;
    private javax.swing.JComboBox<String> jTipo3;
    // End of variables declaration//GEN-END:variables
}
