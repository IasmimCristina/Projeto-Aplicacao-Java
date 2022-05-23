/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author YellowRed
 */
public class Pedido  {
    private LocalDate dataPedido;
    private int idPedido;//Identificador específico de cada pedido feito na aplicação.
    private String estado;
    ArrayList<Refeicao> produtosEscolhidos = new ArrayList<>(); //Dois construtores: com quantidade disponivel e sem ela.
    Restaurante restauranteBrasileiro; //é possível usar os métodos de um objeto como atributo.
    Restaurante restauranteInternacional;
    private double precoTotalPedido;
    
    
    
    
}
