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
    //Métodos.

    Pedido fazerPedido(Pedido pedido);
    void modificarConta(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone);//Quase todos os atributos. Várias funções?
    void excluirConta();
    

}
