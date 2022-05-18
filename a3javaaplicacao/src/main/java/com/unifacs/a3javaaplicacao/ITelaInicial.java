/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unifacs.a3javaaplicacao;


public interface ITelaInicial {
    Cliente cadastrar(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String cep);
    void entrar(String email, String senha); //Retorna tela inicial.
    void recuperarConta();

}
