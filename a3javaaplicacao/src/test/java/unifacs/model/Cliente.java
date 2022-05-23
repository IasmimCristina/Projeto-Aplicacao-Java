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
    private String nomeCompleto;
    private String nomeUsuario;
    private String email;
    private String senha;
    private String cpf;
    private String numTelefone;
    //Não obrigatórios:    
    private String cartaoCredito;
    private String cartaoDebito;
    //Local de entrega? No pagamento.
    private LinkedList<Pedido> pedidosCliente;

    public Cliente() {
    }

    public Cliente(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
    }
    
    //Construtor para os testes:

    public Cliente(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone,  String cartaoCredito, String cartaoDebito, LinkedList<Pedido> pedidosCliente) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.numTelefone = numTelefone;        
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;
        this.pedidosCliente = pedidosCliente;
    }
    
    //Não contém o cartão de débito:
    public Cliente(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone, String cartaoCredito, LinkedList<Pedido> pedidosCliente) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
        this.cartaoCredito = cartaoCredito;
        this.pedidosCliente = pedidosCliente;
    }
    //Não contém o cartão de crédito com uma lista de pedidos não criada:

    public Cliente(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone, String cartaoDebito) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
        this.cartaoDebito = cartaoDebito;
    }
    
    
    @Override
    public Pedido fazerPedido(Pedido pedido) {
        return pedido;
    }

    @Override
    public void modificarConta(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone) {
    }

    @Override
    public void excluirConta() {
    }

    @Override
    public void configurarPagamento(String cartaoCredito, String cartaoDebito) {
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

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
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

    public LinkedList<Pedido> getPedidosCliente() {
        return pedidosCliente;
    }

    public void setPedidosCliente(LinkedList<Pedido> pedidosCliente) {
        this.pedidosCliente = pedidosCliente;
    }

    
    
    
    
    

    

}
