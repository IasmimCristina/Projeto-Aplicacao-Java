/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import java.util.LinkedList;
import javax.swing.JOptionPane;
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
    
    public Cliente obterClienteDaTelaCadastrar(){
        String nomeCompleto = String.valueOf(viewCadastrar.getjTCadastrarNomeCompleto().getText());
        String nomeUsuario = String.valueOf(viewCadastrar.getjfCadastrarNomeUsuario().getText());
        //Validar email! -Cheque com contains
        String email = String.valueOf(viewCadastrar.getjTCadastrarEmail().getText());
        String senha = String.valueOf(viewCadastrar.getjPCadastrarSenha().getPassword());
        //A senha pode ser de qualquer tamanho.

        String cpf = String.valueOf(viewCadastrar.getjFCadastrarCPF().getText());
        String numTel = String.valueOf(viewCadastrar.getjFCadastrarNumTel().getText());             
        LinkedList<Pedido> pedidosCliente = new LinkedList<>(); 
        Cliente cliente = new Cliente(nomeCompleto, nomeUsuario, email, senha, cpf, numTel, pedidosCliente);
        return cliente;
    }
    
    public void definirClienteNaTelaCadastrar(Cliente modeloCliente){
        String nomeUsuario = modeloCliente.getNomeUsuario();
        JOptionPane.showMessageDialog(this.viewCadastrar, "Cadastro efetuado com sucesso, "+ nomeUsuario + ".");
        
        
    } 
    
    public void limparTela(){//Talvez não use essa ideia para este helper.
        
    }
    
}
