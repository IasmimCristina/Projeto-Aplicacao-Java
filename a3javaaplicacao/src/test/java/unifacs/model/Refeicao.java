/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public class Refeicao {//Usado como base para os produtos do restaurante.
    
    //Terá dois construtores.
    private int qtdSelecionada;
    private int qtdLimite;
    private String nome;
    private double precoProduto;
    private String tamanho;

    
    //Para o pedido.
    public Refeicao(String nome, double precoProduto,String tamanho,int qtdSelecionada) {
        this.nome = nome;
        this.precoProduto = precoProduto;
        this.tamanho = tamanho;
        this.qtdSelecionada = qtdSelecionada;
    }   
    

    //Utilizado pelo restaurante.
    public Refeicao(int qtdLimite, String nome,String tamanho, double precoProduto) {
        this.qtdLimite = qtdLimite;
        this.nome = nome;
        this.tamanho = tamanho;
        this.precoProduto = precoProduto;
    }

    //Getters e setters.
    public int getQtdSelecionada() {
        return qtdSelecionada;
    }

    public void setQtdSelecionada(int qtdSelecionada) {
        this.qtdSelecionada = qtdSelecionada;
    }

    public int getQtdLimite() {
        return qtdLimite;
    }

    public void setQtdLimite(int qtdLimite) {
        this.qtdLimite = qtdLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    

    
    
}
