/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public abstract class Restaurante {
    protected String nome;
    protected String descricaoRestaurante;
    protected String descricaoDesconto;
    
    //Talvez mude para protected.
    public void mostrarNome(){
        
    }
    public void mostrarDescricao(){
        
    }
    
    public void mostrarDescricaoDesconto(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoRestaurante() {
        return descricaoRestaurante;
    }

    public void setDescricaoRestaurante(String descricaoRestaurante) {
        this.descricaoRestaurante = descricaoRestaurante;
    }

    public String getDescricaoDesconto() {
        return descricaoDesconto;
    }

    public void setDescricaoDesconto(String descricaoDesconto) {
        this.descricaoDesconto = descricaoDesconto;
    }
    
    
    
    
}
