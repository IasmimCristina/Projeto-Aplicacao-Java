/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import java.util.LinkedList;
import unifacs.model.Cliente;
import unifacs.model.Pedido;
import unifacs.view.TelaCadastrar;

/**
 *
 * @author YellowRed
 */
public class TelaCadastrarHelper {
    private final TelaCadastrar viewCadastrar;

    public TelaCadastrarHelper(TelaCadastrar viewCadastrar) {
        this.viewCadastrar = viewCadastrar;
    }
    
    public Cliente obterClienteDaTela(){
        String nomeCompleto = String.valueOf(viewCadastrar.getjTCadastrarNomeCompleto().getText());
        String nomeUsuario = String.valueOf(viewCadastrar.getjTCadastrarNomeUsuario().getText());

        String email = String.valueOf(viewCadastrar.getjTCadastrarEmail().getText());
        String senha = String.valueOf(viewCadastrar.getjPCadastrarSenha().getPassword());

        String cpf = String.valueOf(viewCadastrar.getjFCadastrarCPF().getText());
        String numTel = String.valueOf(viewCadastrar.getjFCadastrarNumTel().getText());             
        LinkedList<Pedido> pedidosCliente = new LinkedList<>(); 
        Cliente cliente = new Cliente(nomeCompleto, nomeUsuario, email, senha, cpf, numTel, pedidosCliente);
        return cliente;
    }
    
    public void definirClienteNaTela(){
        
    } 
    
    public void limparTela(){//Talvez não use essa ideia para este helper.
        
    }
    
}
