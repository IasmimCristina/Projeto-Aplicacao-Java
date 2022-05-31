/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unifacs.view;

import java.util.ArrayList;
import unifacs.controller.TelaUsuarioController;
import unifacs.controller.TelasIniciaisController;
import unifacs.model.Cliente;

/**
 *
 * @author YellowRed
 */
public class TelaInicial extends javax.swing.JFrame {

    private final TelaCadastrar viewCadastrar;
    private final TelaEntrar viewEntrar;
    private final TelaEsqueceuSenha viewEsqueceuSenha;
    private final TelaUsuario viewUsuario;
    private final TelasIniciaisController controller;
    //private ArrayList<Cliente> listaClientesCadastrados;
    //private Cliente usuario;

    //Fazer a validação da criação do cliente.
    //Criar clientes já cadastrados para testar a validação dos clientes criados.
    //Eles possuirão listas de pedidos vazias inicialmente.
    //Testar detalhes da classe Pedido na classe Principal.[V]
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        this.viewCadastrar = new TelaCadastrar();
        this.viewEntrar = new TelaEntrar();
        this.viewEsqueceuSenha = new TelaEsqueceuSenha();
        this.viewUsuario = new TelaUsuario();
        this.controller = new TelasIniciaisController(this, this.viewCadastrar, this.viewEntrar, this.viewEsqueceuSenha,viewUsuario);
        //Métodos ou funções estáticas
        //Exemplos de 10 clientes cadastrados:
        //this.listaClientesCadastrados = new ArrayList<>();
        //usuario = new Cliente Será feito quando já houver a configuração do pedido.
                
    //listaClientesCadastrados.add()
         

    
    
    
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlSair = new javax.swing.JLabel();
        jbEntrarInicial = new javax.swing.JButton();
        jbCadastrarseInicial = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 30));

        jlSair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jlSair.setForeground(new java.awt.Color(0, 0, 0));
        jlSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSair.setText("X");
        jlSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jlSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
        );

        jbEntrarInicial.setBackground(new java.awt.Color(102, 51, 0));
        jbEntrarInicial.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jbEntrarInicial.setForeground(new java.awt.Color(255, 255, 255));
        jbEntrarInicial.setText("Entrar");
        jbEntrarInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbEntrarInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntrarInicial.setMaximumSize(new java.awt.Dimension(80, 30));
        jbEntrarInicial.setMinimumSize(new java.awt.Dimension(80, 30));
        jbEntrarInicial.setPreferredSize(new java.awt.Dimension(500, 75));
        jbEntrarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarInicialActionPerformed(evt);
            }
        });

        jbCadastrarseInicial.setBackground(new java.awt.Color(102, 51, 0));
        jbCadastrarseInicial.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jbCadastrarseInicial.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrarseInicial.setText("Cadastrar-se");
        jbCadastrarseInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbCadastrarseInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrarseInicial.setMaximumSize(new java.awt.Dimension(80, 30));
        jbCadastrarseInicial.setMinimumSize(new java.awt.Dimension(80, 30));
        jbCadastrarseInicial.setPreferredSize(new java.awt.Dimension(500, 75));
        jbCadastrarseInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarseInicialActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jbEntrarInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(jbCadastrarseInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jbEntrarInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(jbCadastrarseInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1000, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarseInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarseInicialActionPerformed
        // TODO add your handling code here:
        this.controller.exibirTelaCadastro();

    }//GEN-LAST:event_jbCadastrarseInicialActionPerformed

    private void jbEntrarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarInicialActionPerformed
        // TODO add your handling code here:
        this.controller.exibirTelaEntrar();
    }//GEN-LAST:event_jbEntrarInicialActionPerformed

    private void jlSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseClicked
        TelaUsuarioController.sairDoFastLunch();
    }//GEN-LAST:event_jlSairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbCadastrarseInicial;
    private javax.swing.JButton jbEntrarInicial;
    private javax.swing.JLabel jlSair;
    // End of variables declaration//GEN-END:variables
}
