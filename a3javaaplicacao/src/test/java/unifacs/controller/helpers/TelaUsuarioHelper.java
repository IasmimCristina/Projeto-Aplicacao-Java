/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import unifacs.view.TelaUsuario;

/**
 *
 * @author YellowRed
 */
public class TelaUsuarioHelper {
    
    private final TelaUsuario viewUsuario;

    public TelaUsuarioHelper(TelaUsuario viewUsuario) {
        this.viewUsuario = viewUsuario;
    }
    
    
    public void exibirSaudacao(String mensagem){
        viewUsuario.getJlSaudacao().setText(mensagem);
        
    }
    
    
    
}
