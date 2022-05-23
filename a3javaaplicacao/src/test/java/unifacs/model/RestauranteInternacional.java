/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

import java.util.ArrayList;

/**
 *
 * @author YellowRed
 */
public class RestauranteInternacional extends Restaurante {
    
    private Refeicao refeicao;
    private  ArrayList<Refeicao> cardapioAlmocoJantar = new ArrayList<>();
    private  ArrayList<Refeicao> cardapioPizzas = new ArrayList<>();
    private  ArrayList<Refeicao> cardapioBebidas = new ArrayList<>();
    private double desconto01; //Já recebe algo

    public RestauranteInternacional() {
        //Cardápio - Pizzaria
        refeicao = new Refeicao(255, "Pizza de 4 queijos e pepperoni", "Pequeno", 15d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de 4 queijos e pepperoni", "Médio", 30d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de 4 queijos e pepperoni", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de salame picante", "Pequeno", 13.5d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de salame picante", "Grande", 40d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de calabresa com cebola", "Médio", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza Marguerita", "Médio", 25d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza Marguerita", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de churrasco", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de churrasco", "Médio", 30d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de frango com catupiry", "Médio", 25d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de frango com catupiry", "Grande", 40d);
        cardapioPizzas.add(refeicao);
        
        //Cardápio - Bebidas
        refeicao = new Refeicao(255, "Garrafa de suco de uva", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de suco de morango", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de suco de laranja", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de suco de limão", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de suco de manga", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de refrigerante de uva", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa de refrigerante de limão", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Garrafa Coca Cola", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de churrasco", "Grande", 45d);
        cardapioBebidas.add(refeicao);
    }

    public double getDesconto01() {
        return desconto01;
    }

    public void setDesconto01(double desconto01) {
        this.desconto01 = desconto01;
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
    
        
    
}
