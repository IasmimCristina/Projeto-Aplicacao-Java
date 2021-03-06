/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public class TelaInicialModelo implements  ITelaInicial{
    //Talvez possa ser substituída pela classe controller!
    private Cliente cliente;
    private final String codigoSenha;

    public TelaInicialModelo(Cliente cliente) {
        this.codigoSenha = ("8654ABCD");
        this.cliente = cliente;
    }
    
    
    @Override
    public void cadastrar() {
        //Deve abranger as opções com ou sem os cartões de crédito.
        
    }

    @Override
    public Cliente entrar() {
        //Apenas email e senha.
        
        return cliente;
    }

    @Override
    public void esqueceuSenha() {
        //Validação e modificação da senha.
        System.out.println(codigoSenha);//Exemplo
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
    
}
