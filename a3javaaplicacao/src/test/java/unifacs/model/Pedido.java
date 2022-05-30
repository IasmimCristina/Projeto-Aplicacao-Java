/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author YellowRed
 */
public class Pedido implements IPedido  {
    Cliente cliente;
    private  static LocalDate geradorData;
    private final String dataPedido; //Variável final, talvez cause problemas!
    private  Random idGerador = new Random();
    private int idPedido;//Identificador específico de cada pedido feito na aplicação.
    private String estado;
    ArrayList<Refeicao> produtosEscolhidos = new ArrayList<>(); //Dois construtores: com quantidade disponivel e sem ela.
    
    RestauranteBr restauranteBr; //é possível usar os métodos de um objeto como atributo.
    RestauranteInternacional restauranteInternacional;
    private double precoTotalPedido;
    private double totalDescontos; //Pois poderá ocorrer a soma de descontos.

    public Pedido(Cliente cliente) { //Valores iniciais, irão mudar conforme o pedido se desenvolva. 
        this.cliente = cliente; 
        //Random?               
        this.dataPedido = String.valueOf(geradorData.getDayOfMonth() +"/"+ geradorData.getMonthValue() +"/"+  geradorData.getYear()); //Ordem da data incorreta!!! Talvez ValueOfString? SIM, FEITO EM PRINCIPAL!! Corrigida.
        this.idPedido = idGerador.nextInt(1000)+1; //Valor inicial sem a valiidação. Em tese.
        this.estado = ("Em configuração..."); //Pode mudar. Sendo preparado, a caminho,  cancelado.
        this.precoTotalPedido = 0d;
        
    }
    
    //Validar ID
    
    @Override
    public void removerProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void adicionarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mudarEstadoPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularPrecoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aplicarDescontos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salvarDataPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void validarIDPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(double totalDescontos) {
        this.totalDescontos = totalDescontos;
    }
    
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Random getIdGerador() {
        return idGerador;
    }

    public void setIdGerador(Random idGerador) {
        this.idGerador = idGerador;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Refeicao> getProdutosEscolhidos() {
        return produtosEscolhidos;
    }

    public void setProdutosEscolhidos(ArrayList<Refeicao> produtosEscolhidos) {
        this.produtosEscolhidos = produtosEscolhidos;
    }

    public RestauranteBr getRestauranteBr() {
        return restauranteBr;
    }

    public void setRestauranteBr(RestauranteBr restauranteBr) {
        this.restauranteBr = restauranteBr;
    }

    public RestauranteInternacional getRestauranteInternacional() {
        return restauranteInternacional;
    }

    public void setRestauranteInternacional(RestauranteInternacional restauranteInternacional) {
        this.restauranteInternacional = restauranteInternacional;
    }

    public double getPrecoTotalPedido() {
        return precoTotalPedido;
    }

    public void setPrecoTotalPedido(double precoTotalPedido) {
        this.precoTotalPedido = precoTotalPedido;
    }

    
    
    
    
    
    
    
}
