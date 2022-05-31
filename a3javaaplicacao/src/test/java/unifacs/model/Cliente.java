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
    
    //Local de entrega? No pagamento.
    private LinkedList<Pedido> pedidosCliente;
    private Integer numPedidos;

    public Cliente() {
    }

    //Sem a LinkedList.
   
    
    //Construtor
    //Cartão: somente na hora do pagamento.

    public Cliente(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone, LinkedList<Pedido> pedidosCliente) {
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
        this.pedidosCliente = pedidosCliente;
        this.numPedidos = 0;
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

    public Integer getNumPedidos() {
        return numPedidos;
    }

    public void setNumPedidos(Integer numPedidos) {
        this.numPedidos = numPedidos;
    }

    

   

    public LinkedList<Pedido> getPedidosCliente() {
        return pedidosCliente;
    }

    public void setPedidosCliente(LinkedList<Pedido> pedidosCliente) {
        this.pedidosCliente = pedidosCliente;
    }

    
    
    
    
    

    

}
