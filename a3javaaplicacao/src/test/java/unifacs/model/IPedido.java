/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public interface IPedido {
    void removerProduto();
    void adicionarProduto();
    void removerTodos();
    void mudarEstadoPedido();
    void calcularPrecoTotal(); //Talvez já aplique os descontos!
    void deletarPedido(); //É preciso criar uma nova instancia somente.
    void aplicarDescontos(); //Talvez retorne double.
    void salvarDataPedido();
    
    
}
