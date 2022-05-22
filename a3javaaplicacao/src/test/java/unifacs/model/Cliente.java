/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

import java.util.LinkedList;

/**
 *
 * @author YellowRed
 */
public class Cliente implements ICliente {
    String nomeCompleto;
    String nomeUsuario;
    String email;
    String senha;
    String cpf;
    String telefone;
    //Não obrigatórios:
    String pix;
    String cartaoCredito;
    String cartaoDebito;
    //Local de entrega?
    //LinkedList<Pedido> pedidosCliente;
    
    
    
    
    

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(String cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }
    

   
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

}
