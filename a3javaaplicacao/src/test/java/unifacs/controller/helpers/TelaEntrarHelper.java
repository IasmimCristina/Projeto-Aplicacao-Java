/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import unifacs.view.TelaEntrar;






/**
 *
 * @author YellowRed
 */
public class TelaEntrarHelper {
    private final TelaEntrar viewEntrar;

    public TelaEntrarHelper(TelaEntrar viewEntrar) {
        this.viewEntrar = viewEntrar;
    }

    
    
    
    public String pegarSenha(){
        String senha = String.valueOf(viewEntrar.getjPEntrarSenha().getPassword());        
        return senha;
    }
    
    public String pegarEmail(){
        String email = String.valueOf(viewEntrar.getjTEntrarEmail().getText());
        return email;
    }
}
