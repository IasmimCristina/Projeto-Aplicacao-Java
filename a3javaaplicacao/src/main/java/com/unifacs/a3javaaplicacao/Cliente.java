/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unifacs.a3javaaplicacao;

import java.util.logging.Logger;

public class Cliente implements IMenuCliente {

    //Atributos do cliente.
    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String senha;
    private String cpf;
    private String cep;
    //Não obrigatórios.    
    private String cartaoCredito;
    private String cartaoDebito;
    private String pix;

   

    
  
    
    

   
    

    @Override
    public void fazerPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void configurarConta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vizualizarPedidosAtivos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
