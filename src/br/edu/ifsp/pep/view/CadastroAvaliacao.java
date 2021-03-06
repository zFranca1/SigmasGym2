/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.AlunoDAO;
import br.edu.ifsp.pep.dao.AvaliacaoDAO;
import br.edu.ifsp.pep.dao.PersonalDAO;
import br.edu.ifsp.pep.dao.UsuarioDAO;
import br.edu.ifsp.pep.model.Aluno;
import br.edu.ifsp.pep.model.Avaliacao;
import br.edu.ifsp.pep.model.Personal;
import br.edu.ifsp.pep.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaop
 */
public class CadastroAvaliacao extends javax.swing.JDialog {

    private AlunoDAO dao = new AlunoDAO();

    private AvaliacaoDAO avaDAO = new AvaliacaoDAO();

    private Aluno aluno;

    List<Avaliacao> lft = new ArrayList<>();

    public CadastroAvaliacao() {
        initComponents();
//        txtNo.setText(UsuarioDAO.getUsu().getNome());
        if (UsuarioDAO.getUsu().getTipo() == 'P') {
            DefaultTableModel model = (DefaultTableModel) tabelaAvaliacao.getModel();
            lft = avaDAO.listAvaliacao();
            for (Avaliacao av : avaDAO.listAvaliacao()) {
                System.out.println(av.getAluno().toString());
                model.addRow(new Object[]{av.getCodigo(), av.getAluno().getNome(), av.getPeso(), av.getAltura(), av.getPercentualGordura()});
            }

            for (Aluno alu : dao.listAluno()) {

                comboAluno.addItem(alu);
            }

            atualiza();

            return;
        }
        lft = avaDAO.listbyName(UsuarioDAO.getUsu());
        DefaultTableModel model = (DefaultTableModel) tabelaAvaliacao.getModel();
        for (Avaliacao av : lft) {
            model.addRow(new Object[]{av.getCodigo(), av.getAluno().getNome(), av.getPeso(), av.getAltura(), av.getPercentualGordura()});
        }
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtAltura.setEditable(false);
        txtAltura.setEnabled(false);
        txtBuscar.setEnabled(false);
        txtBuscar.setEditable(false);
        txtPercentual.setEditable(false);
        txtPercentual.setEnabled(false);
        txtPeso.setEnabled(false);
        txtPeso.setEditable(false);
        comboAluno.setEnabled(false);
        comboAluno.setEditable(false);

    }

    public void atualiza() {

        DefaultTableModel model = (DefaultTableModel) tabelaAvaliacao.getModel();

        while (model.getRowCount() > 0) {//pega a quantidade de linhas da tabela
            model.removeRow(0);
        }

        for (Avaliacao av : avaDAO.listAvaliacao()) {
            System.out.println(av.getAluno().toString());
            model.addRow(new Object[]{av.getCodigo(), av.getAluno().getNome(), av.getPeso(), av.getAltura(), av.getPercentualGordura()});
        }
    }

    public Avaliacao getAvaliacao() {

        Avaliacao av = new Avaliacao();

        av.setAltura(Float.parseFloat(txtAltura.getText()));
        av.setPeso(Float.parseFloat(txtPeso.getText()));
        av.setPercentualGordura(Float.parseFloat(txtPercentual.getText()));

        av.setAluno((Usuario) comboAluno.getSelectedItem());

        return av;

    }

    public Avaliacao setAvaliacao(Avaliacao av) {

        txtAltura.setText(String.valueOf(av.getAltura()));
        txtPeso.setText(String.valueOf(av.getPeso()));
        txtPercentual.setText(String.valueOf(av.getPercentualGordura()));
        comboAluno.setSelectedItem(av.getAluno());

        return av;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAvaliacao = new javax.swing.JTable();
        txtPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPercentual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        comboAluno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelMenu.setBackground(new java.awt.Color(36, 49, 59));
        painelMenu.setPreferredSize(new java.awt.Dimension(732, 608));

        tabelaAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome Aluno", "Peso", "Altura", "Percentual de Gordura"
            }
        ));
        tabelaAvaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAvaliacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAvaliacao);

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Avalia????o");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso");

        txtPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPercentualActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Percentual de Gordura");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Altura");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/images/small_logo.png"))); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar Avalia????o");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aluno");

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMenuLayout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel4)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(comboAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmail)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addComponent(jLabel5)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(4, 4, 4))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelMenuLayout.createSequentialGroup()
                            .addComponent(labelEmail)
                            .addGap(36, 36, 36))
                        .addGroup(painelMenuLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(comboAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPercentualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercentualActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        // TODO add your handling code here:

        float altura = Float.parseFloat(txtAltura.getText());
        float peso = Float.parseFloat(txtPeso.getText());
        float percentual = Float.parseFloat(txtPercentual.getText());

        Avaliacao ava = getAvaliacao();

        ava.getAluno().getNome();

        avaDAO.insert(ava);

        atualiza();

        JOptionPane.showMessageDialog(this, "Avaliacao Cadastrado com sucesso!");

    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        // TODO add your handling code here:

        int linha;

        linha = tabelaAvaliacao.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "voce deve selecionar uma Avaliacao para alterar.");

        } else {

            avaDAO.delete(avaDAO.listAvaliacao().get(linha));

        }

        atualiza();

        JOptionPane.showMessageDialog(this, "Avaliacao Deletada com sucesso!");


    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:

        int linha;

        Avaliacao av = getAvaliacao();

        linha = tabelaAvaliacao.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "voce deve selecionar uma Avaliacao para alterar.");

        } else {

            avaDAO.atualizaAvaliacao(av, Integer.parseInt((String) tabelaAvaliacao.getValueAt(tabelaAvaliacao.getSelectedRow(), 0).toString()));

        }
        atualiza();
        JOptionPane.showMessageDialog(this, "Aluno alterado com sucesso!");
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tabelaAvaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAvaliacaoMouseClicked
        // TODO add your handling code here:

        if (tabelaAvaliacao.getSelectedRow() != -1) {
            txtPeso.setText(tabelaAvaliacao.getValueAt(tabelaAvaliacao.getSelectedRow(), 2).toString());
            txtAltura.setText(tabelaAvaliacao.getValueAt(tabelaAvaliacao.getSelectedRow(), 3).toString());
            txtPercentual.setText(tabelaAvaliacao.getValueAt(tabelaAvaliacao.getSelectedRow(), 4).toString());
//            tabelaAvaliacao.getValueAt(tabelaAvaliacao.getSelectedRow(), 0);
        }
    }//GEN-LAST:event_tabelaAvaliacaoMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:

        UsuarioDAO usuDAO = new UsuarioDAO();

        List<Usuario> lu = new ArrayList<>();

        lu = usuDAO.listbyName(txtBuscar.getText());

        List<Avaliacao> list = new ArrayList<>();
        for (Usuario usu : lu) {

            if (avaDAO.listbyName(usu).size() > 0) {
                list.add(avaDAO.listbyName(usu).get(0));
            }
        }
        DefaultTableModel model = (DefaultTableModel) tabelaAvaliacao.getModel();
        model.setNumRows(0);
        for (Avaliacao av : list) {
            System.out.println(av.getAluno().toString());
            model.addRow(new Object[]{av.getCodigo(), av.getAluno().getNome(), av.getPeso(), av.getAltura(), av.getPercentualGordura()});
        }
        txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroAluno().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<Aluno> comboAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JTable tabelaAvaliacao;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtPercentual;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
