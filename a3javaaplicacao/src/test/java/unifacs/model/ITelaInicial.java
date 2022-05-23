/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public interface ITelaInicial {
    Cliente cadastrar();
    Cliente entrar();
    void esqueceuSenha();//Somente modifica a senha de um cliente já cadastrado.
    
    
}
