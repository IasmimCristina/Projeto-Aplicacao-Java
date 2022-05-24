/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author YellowRed
 */
public class Pagamento extends Pedido implements IPagamento {
    //Apague o cache!

    @Override
    public void calcularParcelas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fazerPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelarPedidoPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
}
        
