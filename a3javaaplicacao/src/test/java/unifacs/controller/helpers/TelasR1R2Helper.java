/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import unifacs.view.JITelaPedidoRestaurante1;
import unifacs.view.JITelaPedidoRestaurante2;

/**
 *
 * @author YellowRed
 */
public class TelasR1R2Helper {
    
    private final JITelaPedidoRestaurante1 viewITelaPedidoRestaurante1;
    private final JITelaPedidoRestaurante2 viewITelaPedidoRestaurante2;

    public TelasR1R2Helper(JITelaPedidoRestaurante1 viewITelaPedidoRestaurante1, JITelaPedidoRestaurante2 viewITelaPedidoRestaurante2) {
        this.viewITelaPedidoRestaurante1 = viewITelaPedidoRestaurante1;
        this.viewITelaPedidoRestaurante2 = viewITelaPedidoRestaurante2;
    }
    
    
    
    public void exibirInfoNaTelaPedidoR1(String precoTotal, String qtdProdutos){
        String mensagemPrecoTotal = ("R$"+precoTotal);
        String mensagemQtd = (qtdProdutos);
        viewITelaPedidoRestaurante1.getJlPrecoTotal().setText(mensagemPrecoTotal);
        viewITelaPedidoRestaurante1.getJlQtdProdutos().setText(mensagemQtd);

    }
    
    
    public void exibirInfoNaTelaPedidoR2(String precoTotal, String qtdProdutos){
        String mensagemPrecoTotal = ("R$"+precoTotal);
        String mensagemQtd = (qtdProdutos);
        viewITelaPedidoRestaurante2.getJlPrecoTotal().setText(mensagemPrecoTotal);
        viewITelaPedidoRestaurante2.getJlQtdProdutos().setText(mensagemQtd);

    }
    
    
}
