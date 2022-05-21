/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public interface ICliente {

    void fazerPedido(Pedido pedido);
    void modificarConta(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf);//Quase todos os atributos.
    void excluirConta();
    void configurarPagamento(String pix, String cartaoCredito, String cartaoDebito);
    

}
