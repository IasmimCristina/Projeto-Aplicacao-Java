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

    @Override
    public void calcularParcelas() {
    }

    @Override
    public void efetuarPagamento() {
        //Com todos os tipos de pagamento
    }

    @Override
    public void cancelarPedidoPagamento() {
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Random getIdGerador() {
        return idGerador;
    }

    @Override
    public void setIdGerador(Random idGerador) {
        this.idGerador = idGerador;
    }

    @Override
    public ArrayList<Refeicao> getProdutosEscolhidos() {
        return produtosEscolhidos;
    }

    @Override
    public void setProdutosEscolhidos(ArrayList<Refeicao> produtosEscolhidos) {
        this.produtosEscolhidos = produtosEscolhidos;
    }

    @Override
    public RestauranteBr getRestauranteBr() {
        return restauranteBr;
    }

    @Override
    public void setRestauranteBr(RestauranteBr restauranteBr) {
        this.restauranteBr = restauranteBr;
    }

    @Override
    public RestauranteInternacional getRestauranteInternacional() {
        return restauranteInternacional;
    }

    @Override
    public void setRestauranteInternacional(RestauranteInternacional restauranteInternacional) {
        this.restauranteInternacional = restauranteInternacional;
    }
}
