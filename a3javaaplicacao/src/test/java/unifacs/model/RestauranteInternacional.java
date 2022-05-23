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
        refeicao = new Refeicao(55, "Pizza de 4 queijos com pepperoni", "Pequeno", 15d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de 4 queijos com pepperoni", "Médio", 30d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(55, "Pizza de 4 queijos com pepperoni", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de salame picante", "Pequeno", 13.5d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de salame picante", "Grande", 40d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(255, "Pizza de calabresa com cebola", "Médio", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza Marguerita", "Médio", 25d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza Marguerita", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(200, "Pizza de churrasco", "Grande", 45d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de churrasco", "Médio", 30d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de frango com catupiry", "Médio", 25d);
        cardapioPizzas.add(refeicao);
        refeicao = new Refeicao(155, "Pizza de frango com catupiry", "Grande", 40d);
        cardapioPizzas.add(refeicao);
        
        //Cardápio - Bebidas
        refeicao = new Refeicao(55, "Garrafa de suco de uva", "Grande", 4.5d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de suco de morango", "Grande", 4.5d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de suco de laranja", "Grande", 4.5d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de suco de limão", "Médio", 4d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de suco de manga", "Médio", 4d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de refrigerante de uva", "Grande", 45d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa de refrigerante de limão", "Grande", 4.5d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa Coca-Cola", "Grande", 5d);
        cardapioBebidas.add(refeicao);
        refeicao = new Refeicao(55, "Garrafa Pepsi", "Grande", 4.5d);
        cardapioBebidas.add(refeicao);
        
        
        //Cardápio - Almoço e jantar
        refeicao = new Refeicao(55, "Porção de paella", "Grande", 70d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Torta de carne", "Médio", 65d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de yakisoba de carne", "Grande", 35d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de yakisoba de frango", "Grande", 35d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de yakisoba de vegetais", "Médio", 25d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção mista de churrasco", "Grande", 45d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Tigela de lámen", "Grande", 35d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de espaghetti alla carbonara", "Grande", 30d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de ratatouille", "Grande", 15d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de sashimi e tempurá", "Médio", 30d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de sushi com hot roll", "Grande", 55d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de sushi com hot roll", "Médio", 30d);
        cardapioAlmocoJantar.add(refeicao);
        refeicao = new Refeicao(55, "Porção de sushi com hot roll", "Pequeno", 15d);
        cardapioAlmocoJantar.add(refeicao);
        
        
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
