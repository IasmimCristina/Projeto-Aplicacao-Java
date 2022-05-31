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
public class RestauranteBr extends Restaurante {

    //O cardapio pode mudar, então usaremos LinkedList = acessar o começo e meio. Percorrendo- a completamente. ArrayList: acessa aleatoriamente e adiciona e remove apenas no fim.
    //ArrayList são mais rápidas de forma aleatoria.
    //LinkedList é mais rápida em posições específicas.
    //Adicionar e remover: LinkedList.Listas que mudam frequentemente.
    //Pegar valores: ArrayList. Listas que não mudam frequentemente.
    private Refeicao refeicao;
    private ArrayList<Refeicao> cardapioCafeDaManha = new ArrayList<>();
    private ArrayList<Refeicao> cardapioBebidasCafeDaManha = new ArrayList<>();
    private  ArrayList<Refeicao> cardapioLanches = new ArrayList<>();
    private double descontoComboCafe; // comida 4 bebida 2, comida 10 bebida 5, comida 3 bebida 3 = 5%
    private double descontoFesta; // 40+ doces, 45+ salgados, 35 doces 35 salgados, 25 doces 25 salgados 5 bebidas(grandes) = 10%



    public RestauranteBr() {
        //Informações - Restaurante (Talvez apareçam como informação extra.)
        super.nome = "Tempero Baiano";
        super.descricaoRestaurante = "Café da manhã brasileiro e lanches.";
        super.descricaoDesconto = "Descontos de 5% e 10%.";//Indisponível no momento.
        
        
        //Cárdapio - Café da manhã - Comidas
        refeicao = new Refeicao(55, "Tigela de cuscuz paulista", "Médio", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Tigela de cuscuz nordestino", "Médio", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Tigela de cuscuz tropeiro", "Médio", 8.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(70, "Hambúrguer", "Grande", 15d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Pão recheado com frango e queijo", "Grande", 9.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Pão recheado com  carne e queijo", "Grande", 10.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Pão recheado com  presunto e queijo", "Médio", 8d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Tigela de mingau de aveia simples", "Médio", 3.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Tigela de mingau de aveia com canela", "Médio", 3.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Tigela de mingau de maizena com chocolate", "Médio", 4d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Fatia de bolo de fubá com leite de coco", "Médio", 5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Porção de pães de queijo mineiro", "Médio", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Porção de bolinhos de chuva com banana", "Médio", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(70, "Fatia de bolo de chocolate", "Grande", 10d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Omelete de muçarela, orégano e tomate", "Pequeno", 5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Porção de pãezinhos de queijo", "Médio", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(70, "Porção de pastéis de forno de frango", "Grande", 15d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(70, "Porção de pastéis de forno de carne", "Pequeno", 7d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Mingau de aveia com morango e maças", "Pequeno", 3.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Mingau de aveia com bananas e maçãs", "Pequeno", 3.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Mingau de aveia com morango e maças", "Pequeno", 3.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Tapioca de carne e frango", "Grande", 10d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Esfirra de presunto", "Pequeno", 4.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Esfirra de peixe", "Médio", 4.5d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Esfirra de salame", "Grande", 6.8d);        
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(55, "Esfirra de carne", "Grande", 6.8d);
        cardapioCafeDaManha.add(refeicao);
        refeicao = new Refeicao(35, "Tigela de salada de frutas vermelhas", "Grande", 12.5d);
        cardapioCafeDaManha.add(refeicao);
        
        //Cárdapio - Café da manhã - Bebidas
        refeicao = new Refeicao(20, "Café com leite", "Médio", 2d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(20, "Café com canela", "Médio", 2d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(25, "Café com chocolate e canela", "Médio", 3.5d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(25, "Café preto", "Médio", 1d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(25, "Capuccino", "Grande", 5d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(30, "Suco da açerola", "Grande", 4.5d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(30, "Suco de laranja", "Grande", 4.5d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(30, "Suco de cajá", "Médio", 3d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Chá Matte", "Pequeno", 3d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Chá de capim santo", "Pequeno", 3d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Chá de erva cidreira", "Pequeno", 3d);
        cardapioBebidasCafeDaManha.add(refeicao);
        refeicao = new Refeicao(50, "Chá de limão e hortelã", "Pequeno", 3d);
        cardapioBebidasCafeDaManha.add(refeicao);
        
      
      
      
      //Cárdapio - Lanches - Salgados      
      refeicao = new Refeicao(370, "Coxinha de frango", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Croquete de carne", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Risole de frango", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Empada de frango e queijo", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Pastel de carne seca", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Pastél de queijo", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Pastél de carne", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Bolinho de queijo", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Bolinho de camarão", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Enroladinho de queijo", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Croquete", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Nugget de frango", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Quibe", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Empanada de carne", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      
      
      

      //Cárdapio - Lanches - Doces
      refeicao = new Refeicao(500, "Brigadeiro de morango e chocolate", "Médio", 2.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(270, "Trufa clássica", "Grande", 8.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(270, "Copo de mousse de maracujá", "Pequeno", 2.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(270, "Cakepop", "Médio", 3d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(270, "Bala de coco caramelizada", "Grande", 8d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(170, "Alfajor de doce de leite", "Pequeno", 3d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(170, "Cocada de colher", "Pequeno", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Trufa de maracujá", "Pequeno", 4d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Espeto de brigadeiro", "Pequeno", 4d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Bolo de chocolate no copo", "Pequeno", 4.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Brigadeiro de Nutella", "Médio", 3d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(270, "Pudim no copo", "Pequeno", 2d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Cupcake de chocolate e baunilha", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      refeicao = new Refeicao(370, "Cupcake de coco", "Médio", 5.5d);
      cardapioLanches.add(refeicao);
      
      
      
      
      
      
      
      
      

    }
    
    

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public ArrayList<Refeicao> getCardapioCafeDaManha() {
        return cardapioCafeDaManha;
    }

    public void setCardapioCafeDaManha(ArrayList<Refeicao> cardapioCafeDaManha) {
        this.cardapioCafeDaManha = cardapioCafeDaManha;
    }

    public ArrayList<Refeicao> getCardapioBebidasCafeDaManha() {
        return cardapioBebidasCafeDaManha;
    }

    public void setCardapioBebidasCafeDaManha(ArrayList<Refeicao> cardapioBebidasCafeDaManha) {
        this.cardapioBebidasCafeDaManha = cardapioBebidasCafeDaManha;
    }

     public ArrayList<Refeicao> getCardapioLanches() {
        return cardapioLanches;
    }

    public void setCardapioLanches(ArrayList<Refeicao> cardapioLanches) {
        this.cardapioLanches = cardapioLanches;
    }

    
    
    public double getDescontoComboCafe() {
        return descontoComboCafe;
    }

    public void setDescontoComboCafe(double descontoComboCafe) {
        this.descontoComboCafe = descontoComboCafe;
    }

    public double getDescontoFesta() {
        return descontoFesta;
    }

    public void setDescontoFesta(double descontoFesta) {
        this.descontoFesta = descontoFesta;
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
