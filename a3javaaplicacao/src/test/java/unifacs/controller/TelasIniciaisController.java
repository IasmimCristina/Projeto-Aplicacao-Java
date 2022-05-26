/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import unifacs.model.Cliente;
import unifacs.model.ITelaInicial;
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
    private  TelaInicial viewInicial;
    private  TelaCadastrar viewCadastrar;
    private  TelaEntrar viewEntrar;
    private  TelaEsqueceuSenha viewEsqueceuSenha;
    private  TelaUsuario viewUsuario;

    //Construtor para tela inicial
    public TelasIniciaisController(TelaInicial viewInicial, TelaCadastrar viewCadastrar, TelaEntrar viewEntrar, TelaEsqueceuSenha viewEsqueceuSenha, TelaUsuario viewUsuario) {
        this.viewInicial = viewInicial;
        this.viewCadastrar = viewCadastrar;
        this.viewEntrar = viewEntrar;
        this.viewEsqueceuSenha = viewEsqueceuSenha;
        this.viewUsuario = viewUsuario;        
    }

    //Para cadastro.
    public TelasIniciaisController(TelaInicial viewInicial, TelaCadastrar viewCadastrar, TelaUsuario viewUsuario) {
        this.viewInicial = viewInicial;
        this.viewCadastrar = viewCadastrar;
        this.viewUsuario = viewUsuario;       
    }

    //Para a entrada
    public TelasIniciaisController(TelaInicial viewInicial, TelaEntrar viewEntrar, TelaEsqueceuSenha viewEsqueceuSenha, TelaUsuario viewUsuario) {
        this.viewInicial = viewInicial;
        this.viewEntrar = viewEntrar;
        this.viewEsqueceuSenha = viewEsqueceuSenha;
        this.viewUsuario = viewUsuario;        
    }

    //Para a tela de esquecimento da senha
    public TelasIniciaisController(TelaEntrar viewEntrar, TelaEsqueceuSenha viewEsqueceuSenha) {
        this.viewEntrar = viewEntrar;
        this.viewEsqueceuSenha = viewEsqueceuSenha;
    }
    
    
    //Fazer as funções de exibição das telas.
    
    
    
    public void exibirTelaCadastro(){
        this.viewInicial.setVisible(false);
        this.viewCadastrar.setVisible(true);
    }
    
    

    @Override
    public Cliente cadastrar() {
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
