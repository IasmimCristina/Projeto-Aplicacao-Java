/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

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
    private  static JITelaPedidoRestaurante1 viewPedidoRestaurante1;
    private  static JITelaPedidoRestaurante2 viewPedidoRestaurante2;
    private static JITelaPagamento viewTelaPagamento;
    private static JIFazerPedido viewFazerPedido;

    public TelaUsuarioController(TelaUsuario viewUsuario, JITelaVisualizarConta viewVisualizarConta, JITelaPedidoRestaurante1 viewPedidoRestaurante1, JITelaPedidoRestaurante2 viewPedidoRestaurante2, JITelaPagamento viewTelaPagamento, JIFazerPedido viewFazerPedido) {
        this.viewUsuario = viewUsuario;
        this.viewVisualizarConta = viewVisualizarConta;
        this.viewPedidoRestaurante1 = viewPedidoRestaurante1;
        this.viewPedidoRestaurante2 = viewPedidoRestaurante2;
        this.viewTelaPagamento = viewTelaPagamento;
        this.viewFazerPedido = viewFazerPedido;
    }

   
    //Exibição das telas:
    
    public static void abrirTelaFazerPedido(){
        viewUsuario.getjAreaDeTrabalho().add(viewFazerPedido);
        viewFazerPedido.setVisible(true);
        boolean telaFazerPedidoAberta = true;
                //Criando os métodos para a tela usuário. Usando os métodos já criados e fazendo validações.
    }
    
    public static void abrirTelaVisualizarConta(){
        viewUsuario.getjAreaDeTrabalho().add(viewVisualizarConta);
        viewVisualizarConta.setVisible(true);
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
