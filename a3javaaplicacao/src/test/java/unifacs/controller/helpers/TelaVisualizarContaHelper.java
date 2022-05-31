/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import unifacs.view.JITelaVisualizarConta;

/**
 *
 * @author YellowRed
 */
public class TelaVisualizarContaHelper {

    private final JITelaVisualizarConta viewVisualizarConta;

    public TelaVisualizarContaHelper(JITelaVisualizarConta viewVisualizarConta) {
        this.viewVisualizarConta = viewVisualizarConta;
    }

    public void infoUsuarioNaTela(String nomeUsuario, String nomeCompleto, String email, String cpf, String numTel, String numPedidos) {
        this.viewVisualizarConta.getJlNomeUsuario().setText(nomeUsuario);
        this.viewVisualizarConta.getJlNomeCompleto().setText(nomeCompleto);
        this.viewVisualizarConta.getJlEmail().setText(email);
        this.viewVisualizarConta.getJlCPF().setText(cpf);
        this.viewVisualizarConta.getJlNumTel().setText(numTel);
        this.viewVisualizarConta.getJlNumPedidosUsuario().setText(numPedidos);

    }

}
