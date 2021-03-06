/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.UsuarioDAO;

/**
 *
 * @author joaop
 */
public class MenuPersonal extends javax.swing.JDialog {

    /**
     * Creates new form MenuPersonal
     */
    public MenuPersonal() {
        initComponents();
        txtNomePersonalLogado.setText(UsuarioDAO.getUsu().getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNomePersonalLogado = new javax.swing.JLabel();
        painelCadastroAluno = new javax.swing.JPanel();
        txtCadastroAluno = new javax.swing.JLabel();
        painelCadastroPersonal = new javax.swing.JPanel();
        txtCadastroPersonal = new javax.swing.JLabel();
        painelCadastroPersonal1 = new javax.swing.JPanel();
        txtCadastroAvaliacao = new javax.swing.JLabel();
        painelCadastroPersonal2 = new javax.swing.JPanel();
        txtCadastroExercicio = new javax.swing.JLabel();
        painelCadastroPersonal3 = new javax.swing.JPanel();
        txtCadastroFichaTreino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 49, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/images/SIGMA'S GYM.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(35, 53, 93));

        jPanel4.setBackground(new java.awt.Color(30, 43, 76));

        txtNomePersonalLogado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomePersonalLogado.setForeground(new java.awt.Color(255, 255, 255));
        txtNomePersonalLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNomePersonalLogado.setText("NOME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNomePersonalLogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomePersonalLogado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCadastroAluno.setBackground(new java.awt.Color(30, 43, 76));

        txtCadastroAluno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCadastroAluno.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroAluno.setText("Alunos");
        txtCadastroAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastroAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroAlunoLayout = new javax.swing.GroupLayout(painelCadastroAluno);
        painelCadastroAluno.setLayout(painelCadastroAlunoLayout);
        painelCadastroAlunoLayout.setHorizontalGroup(
            painelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadastroAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroAlunoLayout.setVerticalGroup(
            painelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadastroAluno)
                .addContainerGap())
        );

        painelCadastroPersonal.setBackground(new java.awt.Color(30, 43, 76));

        txtCadastroPersonal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCadastroPersonal.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroPersonal.setText("Personais");
        txtCadastroPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastroPersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroPersonalLayout = new javax.swing.GroupLayout(painelCadastroPersonal);
        painelCadastroPersonal.setLayout(painelCadastroPersonalLayout);
        painelCadastroPersonalLayout.setHorizontalGroup(
            painelCadastroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadastroPersonal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroPersonalLayout.setVerticalGroup(
            painelCadastroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadastroPersonal)
                .addContainerGap())
        );

        painelCadastroPersonal1.setBackground(new java.awt.Color(30, 43, 76));

        txtCadastroAvaliacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCadastroAvaliacao.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroAvaliacao.setText("Avalia????o");
        txtCadastroAvaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastroAvaliacaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroPersonal1Layout = new javax.swing.GroupLayout(painelCadastroPersonal1);
        painelCadastroPersonal1.setLayout(painelCadastroPersonal1Layout);
        painelCadastroPersonal1Layout.setHorizontalGroup(
            painelCadastroPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroPersonal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadastroAvaliacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroPersonal1Layout.setVerticalGroup(
            painelCadastroPersonal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroPersonal1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadastroAvaliacao)
                .addContainerGap())
        );

        painelCadastroPersonal2.setBackground(new java.awt.Color(30, 43, 76));

        txtCadastroExercicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCadastroExercicio.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroExercicio.setText("Exerc??cios");
        txtCadastroExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastroExercicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroPersonal2Layout = new javax.swing.GroupLayout(painelCadastroPersonal2);
        painelCadastroPersonal2.setLayout(painelCadastroPersonal2Layout);
        painelCadastroPersonal2Layout.setHorizontalGroup(
            painelCadastroPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroPersonal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadastroExercicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroPersonal2Layout.setVerticalGroup(
            painelCadastroPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroPersonal2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadastroExercicio)
                .addContainerGap())
        );

        painelCadastroPersonal3.setBackground(new java.awt.Color(30, 43, 76));

        txtCadastroFichaTreino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCadastroFichaTreino.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroFichaTreino.setText("Fichas de Treino");
        txtCadastroFichaTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastroFichaTreinoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroPersonal3Layout = new javax.swing.GroupLayout(painelCadastroPersonal3);
        painelCadastroPersonal3.setLayout(painelCadastroPersonal3Layout);
        painelCadastroPersonal3Layout.setHorizontalGroup(
            painelCadastroPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroPersonal3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadastroFichaTreino)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        painelCadastroPersonal3Layout.setVerticalGroup(
            painelCadastroPersonal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroPersonal3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCadastroFichaTreino)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastroAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCadastroPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCadastroPersonal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCadastroPersonal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCadastroPersonal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastroPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastroPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastroPersonal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadastroPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastroPersonalMouseClicked
        // TODO add your handling code here:

        CadastroPersonal cadpe = new CadastroPersonal();
        cadpe.setVisible(true);
        

    }//GEN-LAST:event_txtCadastroPersonalMouseClicked

    private void txtCadastroAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastroAlunoMouseClicked
        // TODO add your handling code here:
        
        CadastroAluno cadal = new CadastroAluno();
        cadal.setVisible(true);
        

    }//GEN-LAST:event_txtCadastroAlunoMouseClicked

    private void txtCadastroAvaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastroAvaliacaoMouseClicked
        // TODO add your handling code here:
        
        CadastroAvaliacao cadav = new CadastroAvaliacao();
        cadav.setVisible(true);
        

    }//GEN-LAST:event_txtCadastroAvaliacaoMouseClicked

    private void txtCadastroExercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastroExercicioMouseClicked
        // TODO add your handling code here:
        
        CadastroExercicio cade = new CadastroExercicio();
        cade.setVisible(true);
    }//GEN-LAST:event_txtCadastroExercicioMouseClicked

    private void txtCadastroFichaTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastroFichaTreinoMouseClicked
        // TODO add your handling code here:
        
        FichasTreino fic = new FichasTreino();
        fic.setVisible(true);
    }//GEN-LAST:event_txtCadastroFichaTreinoMouseClicked

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
//            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPersonal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel painelCadastroAluno;
    private javax.swing.JPanel painelCadastroPersonal;
    private javax.swing.JPanel painelCadastroPersonal1;
    private javax.swing.JPanel painelCadastroPersonal2;
    private javax.swing.JPanel painelCadastroPersonal3;
    private javax.swing.JLabel txtCadastroAluno;
    private javax.swing.JLabel txtCadastroAvaliacao;
    private javax.swing.JLabel txtCadastroExercicio;
    private javax.swing.JLabel txtCadastroFichaTreino;
    private javax.swing.JLabel txtCadastroPersonal;
    private javax.swing.JLabel txtNomePersonalLogado;
    // End of variables declaration//GEN-END:variables
}
