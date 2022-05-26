/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unifacs.model;

/**
 *
 * @author YellowRed
 */
public interface IPagamento  {
    void calcularParcelas(); //Para pagamento por cartão de crédito.
    void efetuarPagamento();
    void cancelarPedidoPagamento();
    
    
    
    
    
}
