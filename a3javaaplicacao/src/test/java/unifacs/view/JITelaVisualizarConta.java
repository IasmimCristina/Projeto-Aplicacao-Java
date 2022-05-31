/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package unifacs.view;

import javax.swing.JLabel;
import unifacs.controller.TelaUsuarioController;

/**
 *
 * @author YellowRed
 */
public class JITelaVisualizarConta extends javax.swing.JInternalFrame {

    private TelaUsuario viewUsuario;
    private TelaUsuarioController controller;
    /**
     * Creates new form JITelaVisualizarConta
     */
    public JITelaVisualizarConta() {
        initComponents();
        this.viewUsuario = viewUsuario;
        this.controller = controller;
        //controller.preencherMinhaConta(clienteModelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlNumTel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlNomeCompleto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        jbModificarNomeUsuario = new javax.swing.JButton();
        jbModificarNomeCompleto = new javax.swing.JButton();
        jbModificarCPF = new javax.swing.JButton();
        jbModificarNumTel = new javax.swing.JButton();
        jbModificarEmail = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbModificarSenha = new javax.swing.JButton();
        jbExcluirConta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Minha conta");
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setPreferredSize(new java.awt.Dimension(1100, 550));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));
        jPanel7.setForeground(new java.awt.Color(102, 51, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(850, 300));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número telefônico:");

        jlEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(0, 0, 0));
        jlEmail.setText("usuario@gmail.com");
        jlEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCPF.setForeground(new java.awt.Color(0, 0, 0));
        jlCPF.setText("12356 565 556 56");
        jlCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlNumTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlNumTel.setForeground(new java.awt.Color(0, 0, 0));
        jlNumTel.setText("(55)8895 566 556");
        jlNumTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email cadastrado:");

        jlNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        jlNomeCompleto.setText("Nome completo do usuário");
        jlNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nome de usuário:");

        jlNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jlNomeUsuario.setText("Apelido do usuário");
        jlNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jbModificarNomeUsuario.setBackground(new java.awt.Color(153, 0, 0));
        jbModificarNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbModificarNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarNomeUsuario.setText("Modificar");
        jbModificarNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbModificarNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarNomeUsuarioActionPerformed(evt);
            }
        });

        jbModificarNomeCompleto.setBackground(new java.awt.Color(153, 0, 0));
        jbModificarNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbModificarNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarNomeCompleto.setText("Modificar");
        jbModificarNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbModificarNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarNomeCompletoActionPerformed(evt);
            }
        });

        jbModificarCPF.setBackground(new java.awt.Color(153, 0, 0));
        jbModificarCPF.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbModificarCPF.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarCPF.setText("Modificar");
        jbModificarCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbModificarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarCPFActionPerformed(evt);
            }
        });

        jbModificarNumTel.setBackground(new java.awt.Color(153, 0, 0));
        jbModificarNumTel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbModificarNumTel.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarNumTel.setText("Modificar");
        jbModificarNumTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbModificarNumTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarNumTelActionPerformed(evt);
            }
        });

        jbModificarEmail.setBackground(new java.awt.Color(153, 0, 0));
        jbModificarEmail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jbModificarEmail.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarEmail.setText("Modificar");
        jbModificarEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jbModificarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarEmailActionPerformed(evt);
            }
        });

        jbModificarSenha.setBackground(new java.awt.Color(255, 255, 255));
        jbModificarSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jbModificarSenha.setForeground(new java.awt.Color(0, 0, 0));
        jbModificarSenha.setText("Modificar senha");
        jbModificarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbModificarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbModificarSenha.setMaximumSize(new java.awt.Dimension(80, 30));
        jbModificarSenha.setMinimumSize(new java.awt.Dimension(80, 30));
        jbModificarSenha.setPreferredSize(new java.awt.Dimension(110, 20));
        jbModificarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarSenhaActionPerformed(evt);
            }
        });

        jbExcluirConta.setBackground(new java.awt.Color(153, 0, 0));
        jbExcluirConta.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jbExcluirConta.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluirConta.setText("Excluir conta");
        jbExcluirConta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbExcluirConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluirConta.setMaximumSize(new java.awt.Dimension(80, 30));
        jbExcluirConta.setMinimumSize(new java.awt.Dimension(80, 30));
        jbExcluirConta.setPreferredSize(new java.awt.Dimension(110, 20));
        jbExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jbModificarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jlNomeUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificarNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlCPF)
                                    .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(jlNumTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator3)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbModificarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificarNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbModificarNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jlNomeUsuario)
                    .addComponent(jbModificarNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlNomeCompleto)
                    .addComponent(jbModificarNomeCompleto))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jlCPF))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jlNumTel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jlEmail)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jbModificarCPF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbModificarNumTel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbModificarEmail)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jbModificarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Minha conta");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Fechar");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setMaximumSize(new java.awt.Dimension(80, 30));
        jButton10.setMinimumSize(new java.awt.Dimension(80, 30));
        jButton10.setPreferredSize(new java.awt.Dimension(110, 20));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarSenhaActionPerformed
        // TODO add your handling code here:
        controller.modificarSenha();
    }//GEN-LAST:event_jbModificarSenhaActionPerformed

    private void jbExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirContaActionPerformed
        // Excluir conta:        
        controller.excluirContaUsuario();
    }//GEN-LAST:event_jbExcluirContaActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        controller.sairTelaMinhaConta();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbModificarNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarNomeUsuarioActionPerformed
        // Modificar o nome de usuário:
        controller.modificarNomeUsuario();
    }//GEN-LAST:event_jbModificarNomeUsuarioActionPerformed

    private void jbModificarNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarNomeCompletoActionPerformed
        // TODO add your handling code here:
        controller.modificarNomeCompleto();
    }//GEN-LAST:event_jbModificarNomeCompletoActionPerformed

    private void jbModificarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCPFActionPerformed
        // TODO add your handling code here:
        controller.modificarCPF();
    }//GEN-LAST:event_jbModificarCPFActionPerformed

    private void jbModificarNumTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarNumTelActionPerformed
        // TODO add your handling code here:
        controller.modificarNumTel();
    }//GEN-LAST:event_jbModificarNumTelActionPerformed

    private void jbModificarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarEmailActionPerformed
        // TODO add your handling code here:        
        controller.modificarEmail();
    }//GEN-LAST:event_jbModificarEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbExcluirConta;
    private javax.swing.JButton jbModificarCPF;
    private javax.swing.JButton jbModificarEmail;
    private javax.swing.JButton jbModificarNomeCompleto;
    private javax.swing.JButton jbModificarNomeUsuario;
    private javax.swing.JButton jbModificarNumTel;
    private javax.swing.JButton jbModificarSenha;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNomeCompleto;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlNumTel;
    // End of variables declaration//GEN-END:variables

    
    
    //Getters e setters usados:
    
    public JLabel getJlCPF() {
        return jlCPF;
    }

    public void setJlCPF(JLabel jlCPF) {
        this.jlCPF = jlCPF;
    }

    public JLabel getJlEmail() {
        return jlEmail;
    }

    public void setJlEmail(JLabel jlEmail) {
        this.jlEmail = jlEmail;
    }

    public JLabel getJlNomeCompleto() {
        return jlNomeCompleto;
    }

    public void setJlNomeCompleto(JLabel jlNomeCompleto) {
        this.jlNomeCompleto = jlNomeCompleto;
    }

    public JLabel getJlNomeUsuario() {
        return jlNomeUsuario;
    }

    public void setJlNomeUsuario(JLabel jlNomeUsuario) {
        this.jlNomeUsuario = jlNomeUsuario;
    }

    public JLabel getJlNumTel() {
        return jlNumTel;
    }

    public void setJlNumTel(JLabel jlNumTel) {
        this.jlNumTel = jlNumTel;
    }


 
    
    
    
    
    
    
    
    




}
