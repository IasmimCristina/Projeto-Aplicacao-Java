/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import java.util.ArrayList;
import unifacs.model.Refeicao;
import unifacs.view.JITelaPagamento;

/**
 *
 * @author YellowRed
 */
public class TelaPagamentoHelper {
    
    
    
    private final JITelaPagamento viewTelaPagamento;

    public TelaPagamentoHelper(JITelaPagamento viewTelaPagamento) {
        this.viewTelaPagamento = viewTelaPagamento;
    }
    
    
    //Preparar J combo Box.
    public void exibirInfoJComboBox(ArrayList<Refeicao> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            Refeicao produto = produtos.get(i); //Pegará na ordem selecionada.
            String nome = produto.getNome();
            String tamanho = produto.getTamanho();
            String preco = String.valueOf(produto.getPrecoProduto());
            String produtoJComboBox = (nome+" - "+ tamanho +" - R$"+preco);
            viewTelaPagamento.getjComboBoxPdts().addItem(produtoJComboBox);            
            
        }
        
    }
    
    
    //Preencher Qtd e preço total
    
    public void exibirQtdPrecoPagamento(String precoTotal, String qtdProdutos){
        String mensagemPrecoTotal = ("R$"+precoTotal);
        String mensagemQtd = (qtdProdutos);
        viewTelaPagamento.getJlPrecoTotal().setText(mensagemPrecoTotal);
        viewTelaPagamento.getJlQtdProdutos().setText(mensagemQtd);

    }
    
    
    
    
    
}
