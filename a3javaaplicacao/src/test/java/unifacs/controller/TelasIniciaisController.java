/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import java.util.LinkedList;
import unifacs.controller.helpers.TelaCadastrarHelper;
import unifacs.model.Cliente;
import unifacs.model.ITelaInicial;
import unifacs.model.Pedido;
import unifacs.view.TelaCadastrar;
import unifacs.view.TelaEntrar;
import unifacs.view.TelaEsqueceuSenha;
import unifacs.view.TelaInicial;
import unifacs.view.TelaUsuario;

/**
 *
 * @author YellowRed
 */
public class TelasIniciaisController implements ITelaInicial{
    private static  TelaInicial viewInicial;
    private static TelaCadastrar viewCadastrar;
    private static TelaEntrar viewEntrar;
    private static TelaEsqueceuSenha viewEsqueceuSenha;
    private static TelaUsuario viewUsuario;
    private static TelaCadastrarHelper helperCadastrar;//Continuará com o nome helper caso utilizemos apenas m helper neste controller.

    //Construtor para tela inicial
    public TelasIniciaisController(TelaInicial viewInicial, TelaCadastrar viewCadastrar, TelaEntrar viewEntrar, TelaEsqueceuSenha viewEsqueceuSenha, TelaUsuario viewUsuario) {
        this.viewInicial = viewInicial;
        this.viewCadastrar = viewCadastrar;
        this.viewEntrar = viewEntrar;
        this.viewEsqueceuSenha = viewEsqueceuSenha;
        this.viewUsuario = viewUsuario;
        //Helpers:
        this.helperCadastrar = new TelaCadastrarHelper(viewCadastrar);
        
    }
  
  
    //Fazer as funções de exibição das telas.
    
    //Configuração das telas - Voltar
    public static void voltarTelaEntrar(){
        viewEntrar.setVisible(false);
        viewInicial.setVisible(true);
    }
    
    public static void voltarTelaCadasrar(){
        viewCadastrar.setVisible(false);
        viewInicial.setVisible(true);
    }
    
    public static void voltarTelaEsqueceu(){
        viewEsqueceuSenha.setVisible(false);
        viewEntrar.setVisible(true);
    }
    
        
    
    // Configuração das telas - Exibição
    public static void exibirTelaCadastro(){
        viewInicial.setVisible(false);
        viewCadastrar.setVisible(true);
    }
    
    public static void exibirTelaEntrar(){
        viewInicial.setVisible(false);
        viewEntrar.setVisible(true);
    }
    
    public static void exibirTelaEsqueceu(){
        viewEntrar.setVisible(false);
        viewEsqueceuSenha.setVisible(true);
    }
    
    // Configuração do cadastro   
    
        

    @Override
    public Cliente cadastrar() { //Método estático também? Usaremos o cleinte depois.
        //Fazer as validações necessárias.
        //Pegar novo cliente.
        //Ir para a tela usuário.
        Cliente cliente = helperCadastrar.obterClienteDaTelaCadastrar();
        helperCadastrar.definirClienteNaTelaCadastrar(cliente);
        //Parei aqui: obtive o cliente (sem validações) da tela.
        //Fazer: validações, criar e validar a entrada do usuário exibir a tela do usuário
        //Ainda estou efetuando o cadastro e entrada.
        

        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente entrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esqueceuSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
