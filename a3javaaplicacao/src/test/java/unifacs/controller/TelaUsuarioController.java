/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import javax.swing.JOptionPane;
import unifacs.model.ICliente;
import unifacs.model.Pedido;
import unifacs.view.JIFazerPedido;
import unifacs.view.JITelaPagamento;
import unifacs.view.JITelaPedidoRestaurante1;
import unifacs.view.JITelaPedidoRestaurante2;
import unifacs.view.JITelaVisualizarConta;
import unifacs.view.TelaUsuario;

/**
 *
 * @author YellowRed
 */
public class TelaUsuarioController implements ICliente {

    //Sabor Estrangeiro e Tempero Baiano
    private static TelaUsuario viewUsuario;
    private static JITelaVisualizarConta viewVisualizarConta;
    private static JITelaPedidoRestaurante1 viewPedidoRestaurante1;
    private static JITelaPedidoRestaurante2 viewPedidoRestaurante2;
    private static JITelaPagamento viewTelaPagamento;
    private static JIFazerPedido viewFazerPedido;
    private static boolean botaoFazerPedidoSelecionado;
    private static boolean botaoVisualizarContaSelecionado;

    public TelaUsuarioController(TelaUsuario viewUsuario, JITelaVisualizarConta viewVisualizarConta, JITelaPedidoRestaurante1 viewPedidoRestaurante1, JITelaPedidoRestaurante2 viewPedidoRestaurante2, JITelaPagamento viewTelaPagamento, JIFazerPedido viewFazerPedido) {
        this.viewUsuario = viewUsuario;
        this.viewVisualizarConta = viewVisualizarConta;
        this.viewPedidoRestaurante1 = viewPedidoRestaurante1;
        this.viewPedidoRestaurante2 = viewPedidoRestaurante2;
        this.viewTelaPagamento = viewTelaPagamento;
        this.viewFazerPedido = viewFazerPedido;
        this.botaoFazerPedidoSelecionado = false;
        this.botaoVisualizarContaSelecionado = false;
    }

    //Exibição das telas:
    public static void abrirTelaFazerPedido() {
        if (botaoFazerPedidoSelecionado == false) {
            botaoFazerPedidoSelecionado = true;
            viewUsuario.getjAreaDeTrabalho().add(viewFazerPedido);
            viewFazerPedido.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(viewUsuario, "Um pedido já está em configuração!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }

        //Criando os métodos para a tela usuário. Usando os métodos já criados e fazendo validações.
    }

    //Configuração do pedido - Métodos
    //Terá ligação co as funções da classe Pedido.
    
    //Saída - Métodos
    public static void sairDoFastLunch() {
        //Nada será salvo!
    }

    public static void sairDurantePedido() {

    }

    //Cancelamento - Métodos
    public static void cancelarPedidoPago() {

    }

    public static void cancelarPedidoNaoPago() {

    }

    //Seleção de pedidos - Métodos
    public static void visualizarPedidoSelecionado() {

    }

    //Exibição - Métodos
    public static void abrirTelaVisualizarConta() {
        if (botaoVisualizarContaSelecionado == false) {
            if (botaoFazerPedidoSelecionado == false) {
                viewUsuario.getjAreaDeTrabalho().add(viewVisualizarConta);
                viewVisualizarConta.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(viewUsuario, "Uma conta não pode ser modificada enquanto um pedido está em configuração.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(viewUsuario, "Você já está visualizando as informações da sua conta.", "Aviso!", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void abrirTelaRestaurante1() {

    }

    public static void abrirTelaRestaurante2() {

    }

    public static void abrirTelaPagamento() {

    }

    public static void efetuarPagamento() {

    }

    public static void efetuarPagamentoEntrega() {

    }

    public static void efetuarPagamentoPix() {

    }

    public static void efetuarPagamentoCDebito() {

    }

    public static void efetuarPagamentoCCredito() {

    }

    public static void excluirContaUsuario() {

    }

    public static void desconectarContaUsuario() {

    }

    @Override
    public Pedido fazerPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarConta(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirConta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
