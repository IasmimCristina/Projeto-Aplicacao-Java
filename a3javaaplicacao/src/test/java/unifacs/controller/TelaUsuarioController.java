/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unifacs.controller.helpers.TelaPagamentoHelper;
import unifacs.controller.helpers.TelaUsuarioHelper;
import unifacs.controller.helpers.TelaVisualizarContaHelper;
import unifacs.controller.helpers.TelasR1R2Helper;
import unifacs.model.Cliente;
import unifacs.model.ICliente;
import unifacs.model.Pedido;
import unifacs.view.JIFazerPedido;
import unifacs.view.JITelaPagamento;
import unifacs.view.JITelaPedidoRestaurante1;
import unifacs.view.JITelaPedidoRestaurante2;
import unifacs.view.JITelaVisualizarConta;
import unifacs.view.TelaInicial;
import unifacs.view.TelaUsuario;
import unifacs.model.Refeicao;
import unifacs.model.RestauranteBr;
import unifacs.model.RestauranteInternacional;

/**
 *
 * @author YellowRed
 */
public class TelaUsuarioController implements ICliente {

    //Controllers relacionados:
    private static TelasIniciaisController controllerInicial;

    //Sabor Estrangeiro e Tempero Baiano
    private static JITelaVisualizarConta viewVisualizarConta;
    private static JITelaPedidoRestaurante1 viewPedidoRestaurante1;
    private static JITelaPedidoRestaurante2 viewPedidoRestaurante2;
    private static JITelaPagamento viewTelaPagamento;
    private static JIFazerPedido viewFazerPedido;
    private static TelaUsuario viewUsuario;

    private static TelaInicial viewInicial;
    private static boolean pagamentoDefinido;
    private static boolean botaoFazerPedidoSelecionado;
    private static boolean botaoVisualizarContaSelecionado;
    private static boolean botaoR1Selecionado;
    private static boolean telaPagamentoCriada;
    private static boolean telaR1Criada;
    private static boolean telaR2Criada;
    private static boolean telaPedidoCriada;

    //Cárdapios e refeições
    private static RestauranteBr temperoBaiano = new RestauranteBr();
    private static RestauranteInternacional saborEstrangeiro = new RestauranteInternacional();
    private static Refeicao refeicao;
    private static Pedido pedidoInicial = new Pedido();

    //Validação da refeição - Restaurante
    private static Integer indicesSelecionadosAlmoco = 0;
    private static Integer indicesSelecionadosPizzas = 0;
    private static Integer indicesSelecionadosBebidasR2 = 0;
    private static Integer indicesSelecionadosCafeManha = 0;
    private static Integer indicesSelecionadosBebidasR1 = 0;
    private static Integer indicesSelecionadosLanches = 0;

    //Cliente:
    private static Cliente clienteUsuario = new Cliente();
    //Helpers:
    private static TelaUsuarioHelper helperUsuario;
    private static TelaVisualizarContaHelper helperVisualizarConta;
    private static TelaPagamentoHelper helperTelaPagamento;
    private static TelasR1R2Helper helperR1R2;

    public TelaUsuarioController(Cliente clienteUsuario, TelaUsuario viewUsuario, JITelaVisualizarConta viewVisualizarConta, JITelaPedidoRestaurante1 viewPedidoRestaurante1, JITelaPedidoRestaurante2 viewPedidoRestaurante2, JITelaPagamento viewTelaPagamento, JIFazerPedido viewFazerPedido) {
        //Cliente usuário virá da tela inixial!

        this.clienteUsuario = clienteUsuario;
        this.viewFazerPedido = viewFazerPedido;
        this.viewPedidoRestaurante1 = viewPedidoRestaurante1;
        this.viewPedidoRestaurante2 = viewPedidoRestaurante2;
        this.viewTelaPagamento = viewTelaPagamento;
        this.viewVisualizarConta = viewVisualizarConta;
        this.viewUsuario = viewUsuario;
        this.pagamentoDefinido = false;
        this.botaoFazerPedidoSelecionado = false;
        this.botaoVisualizarContaSelecionado = false;
        this.botaoR1Selecionado = false;
        this.telaPagamentoCriada = false;
        this.telaR1Criada = false;
        this.telaR2Criada = false;
        this.telaPedidoCriada = false;

        //Inicialização dos restaurantes:
        //this.temperoBaiano =  new RestauranteBr();
        //this.saborEstrangeiro = new RestauranteInternacional();
        //Controllers
        //controllerInicial = new TelasIniciaisController(viewInicial, viewCadastrar, viewEntrar, viewEsqueceuSenha, viewUsuario);
        //Helpers
        this.helperUsuario = new TelaUsuarioHelper(viewUsuario);
        helperVisualizarConta = new TelaVisualizarContaHelper(viewVisualizarConta);
        this.helperTelaPagamento = new TelaPagamentoHelper(viewTelaPagamento);
        this.helperR1R2 = new TelasR1R2Helper(viewPedidoRestaurante1, viewPedidoRestaurante2);

    }

    //Configuração do pedido - Métodos FAÇA A SAÍDA PARA AS ABAS!!
    //Terá ligação co as funções da classe Pedido.
    //Exibição de texto - Métodos
    public static void preencherMinhaConta(Cliente clienteModelo) {

        String nomeUsuario = clienteUsuario.getNomeUsuario();
        String nomeCompleto = clienteUsuario.getNomeCompleto();
        String email = clienteUsuario.getEmail();
        String cpf = clienteUsuario.getCpf();
        String numTel = clienteUsuario.getNumTelefone();
        String numPedidos = String.valueOf(clienteUsuario.getNumPedidos());

        helperVisualizarConta.infoUsuarioNaTela(nomeUsuario, nomeCompleto, email, cpf, numTel, numPedidos);

    }

    public static void darSaudacaoUsuario() {
        String mensagem = "Olá, " + clienteUsuario.getNomeUsuario() + "! :D";
        helperUsuario.exibirSaudacao(mensagem);

    }

    //Exibição dos pedidos na tela do usuário.
    public static void preencherListaPedidos() {
        if (clienteUsuario.getPedidosCliente().isEmpty()) {           
            
        } else{
        String idPedido = pedidoInicial.getIdPedido();
        String dataPedido = pedidoInicial.getDataPedido();
        helperUsuario.exibirListaPedidos(idPedido, dataPedido);
        }
       
    }

    public static void mostrarDescricaoPedidos() {
        if(clienteUsuario.getPedidosCliente().isEmpty()) {
            
        } else if (botaoFazerPedidoSelecionado == false && botaoVisualizarContaSelecionado == false) {
            Integer indiceP = viewUsuario.getjComboBoxPedidos().getSelectedIndex();
            Pedido pedidoLocal = clienteUsuario.getPedidosCliente().get(indiceP);
            String estado = pedidoLocal.getEstado();
            String restaurante = pedidoLocal.getRestauranteEscolhido();
            String id = pedidoLocal.getIdPedido();
            String qtdProdutos = String.valueOf(pedidoLocal.getNumProdutos());
            String tipoPagamento = pedidoLocal.getTipoPagamento();
            String precoTotal = String.valueOf(pedidoLocal.getPrecoTotalPedido());            

            JOptionPane.showMessageDialog(viewUsuario, "Pedido -"+id+"-      Quantidade de produtos: "+qtdProdutos+" - Estado: "+estado+".     - Restaurante:"+restaurante+" -     Tipo de pagamento:"+tipoPagamento+" -    Preço total:"+precoTotal+".", "Informações do Pedido -"+id+".", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(viewUsuario, "Você não pode visualizar seus pedidos enquanto outra tela de dados está aberta!", "Erro!", JOptionPane.WARNING_MESSAGE);

        }
    }

    //Exibicao de texto - Tabelas - Coloque essas funções antes da tela aparecer!!
    public static void gerarCafeManhaTable() {
        ArrayList<Refeicao> cafeManha; //Cópia por referência.
        cafeManha = temperoBaiano.getCardapioCafeDaManha();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante1.getjTabelaCafeManha().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < cafeManha.size(); i++) {
            produtoLinha[0] = cafeManha.get(i).getQtdLimite();
            produtoLinha[1] = cafeManha.get(i).getNome();
            produtoLinha[2] = cafeManha.get(i).getTamanho();
            produtoLinha[3] = cafeManha.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    public static void gerarBebidasR1Table() {
        ArrayList<Refeicao> bebidasR1; //Cópia por referência.
        bebidasR1 = temperoBaiano.getCardapioBebidasCafeDaManha();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante1.getjTabelaBebidas().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < bebidasR1.size(); i++) {
            produtoLinha[0] = bebidasR1.get(i).getQtdLimite();
            produtoLinha[1] = bebidasR1.get(i).getNome();
            produtoLinha[2] = bebidasR1.get(i).getTamanho();
            produtoLinha[3] = bebidasR1.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    public static void gerarLanchesTable() {
        ArrayList<Refeicao> lanches; //Cópia por referência.
        lanches = temperoBaiano.getCardapioLanches();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante1.getjTabelaLanches().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < lanches.size(); i++) {
            produtoLinha[0] = lanches.get(i).getQtdLimite();
            produtoLinha[1] = lanches.get(i).getNome();
            produtoLinha[2] = lanches.get(i).getTamanho();
            produtoLinha[3] = lanches.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    public static void gerarAlmocosTable() {
        ArrayList<Refeicao> almoco; //Cópia por referência.
        almoco = saborEstrangeiro.getCardapioAlmocoJantar();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante2.getjTabelaAlmoco().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < almoco.size(); i++) {
            produtoLinha[0] = almoco.get(i).getQtdLimite();
            produtoLinha[1] = almoco.get(i).getNome();
            produtoLinha[2] = almoco.get(i).getTamanho();
            produtoLinha[3] = almoco.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    public static void gerarPizzasTable() {
        ArrayList<Refeicao> pizzas; //Cópia por referência.
        pizzas = saborEstrangeiro.getCardapioPizzas();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante2.getjTabelaPizzas().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < pizzas.size(); i++) {
            produtoLinha[0] = pizzas.get(i).getQtdLimite();
            produtoLinha[1] = pizzas.get(i).getNome();
            produtoLinha[2] = pizzas.get(i).getTamanho();
            produtoLinha[3] = pizzas.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    public static void gerarBebidasR2Table() {
        ArrayList<Refeicao> bebidasR2; //Cópia por referência.
        bebidasR2 = saborEstrangeiro.getCardapioBebidas();
        DefaultTableModel model = (DefaultTableModel) viewPedidoRestaurante2.getjTabelaBebidas().getModel();
        Object produtoLinha[] = new Object[4];

        for (int i = 0; i < bebidasR2.size(); i++) {
            produtoLinha[0] = bebidasR2.get(i).getQtdLimite();
            produtoLinha[1] = bebidasR2.get(i).getNome();
            produtoLinha[2] = bebidasR2.get(i).getTamanho();
            produtoLinha[3] = bebidasR2.get(i).getPrecoProduto();
            model.addRow(produtoLinha);
        }

    }

    //Prencher JCombobox da tela de pagamento
    public static void prepararTelaPagamento() {
        ArrayList<Refeicao> produtosPagamento = pedidoInicial.getProdutosEscolhidos(); //Cópia feita for referência.
        helperTelaPagamento.exibirInfoJComboBox(produtosPagamento); //Tudo feito por um helper?
        String qtdProdutos = String.valueOf(pedidoInicial.getNumProdutos());
        String precoTotal = String.valueOf(pedidoInicial.getPrecoTotalPedido());
        helperTelaPagamento.exibirQtdPrecoPagamento(precoTotal, qtdProdutos);
    }

    //Exibição da quantidade de produtos e preço total na tela
    public static void exibirQtdPrecoTotal() {
        //Qtd de produtos selecionados e preço total.        

        //Definição da qtd e  do preço total do pedido atual!
        pedidoInicial.definirPrecoEQtd(pedidoInicial.getProdutosEscolhidos());
        String qtdProdutos = String.valueOf(pedidoInicial.getNumProdutos());
        String precoTotal = String.valueOf(pedidoInicial.getPrecoTotalPedido());

        if (pedidoInicial.getRestauranteEscolhido() == "Tempero Baiano") {
            helperR1R2.exibirInfoNaTelaPedidoR1(precoTotal, qtdProdutos);
        } else {
            helperR1R2.exibirInfoNaTelaPedidoR2(precoTotal, qtdProdutos);
        }
        //Helper para exibir na tela.
        //Usar o tipo de restaurante para diferenciar!
    }

    //Exibição dos produtos selecionados - Métodos
    public static void produtoSelecionadoTAlmoco() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante2.getjTabelaAlmoco().getSelectedRow();
        refeicao = saborEstrangeiro.getCardapioAlmocoJantar().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante2.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    public static void produtoSelecionadoTBebidasR2() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante2.getjTabelaBebidas().getSelectedRow();
        refeicao = saborEstrangeiro.getCardapioBebidas().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante2.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    public static void produtoSelecionadoTPizzas() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante2.getjTabelaPizzas().getSelectedRow();
        refeicao = saborEstrangeiro.getCardapioPizzas().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante2.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    public static void produtoSelecionadosTCafeManha() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante1.getjTabelaCafeManha().getSelectedRow();
        refeicao = temperoBaiano.getCardapioCafeDaManha().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante1.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    public static void produtoSelecionadosTBebidasR1() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante1.getjTabelaBebidas().getSelectedRow();
        indicesSelecionadosBebidasR1++; //Não é mais necessário?
        refeicao = temperoBaiano.getCardapioBebidasCafeDaManha().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante1.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    public static void produtoSelecionadosTLanches() {//Sem a quantidade selecionada ainda. Irá se repetir
        //  Adicione o pedido à lista!!
        int indiceL = viewPedidoRestaurante1.getjTabelaLanches().getSelectedRow();
        indicesSelecionadosLanches++; //Não é mais necessário?
        refeicao = temperoBaiano.getCardapioLanches().get(indiceL);
        pedidoInicial.getProdutosEscolhidos().add(refeicao);
        String descricao = (refeicao.getNome() + " - " + refeicao.getTamanho() + " - R$" + String.valueOf(refeicao.getPrecoProduto()));
        viewPedidoRestaurante1.getjComboBoxPdts().addItem(descricao);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.       

    }

    //Remoção = Produtos selecionados
    public static void removerPdtsSelecionadosR1() {//Somente uma função, indices selecionados não funcionará!!
        //  Retire o pedido da lista!!
        int indiceL = viewPedidoRestaurante1.getjComboBoxPdts().getSelectedIndex();
        pedidoInicial.getProdutosEscolhidos().remove(indiceL);
        viewPedidoRestaurante1.getjComboBoxPdts().removeItemAt(indiceL);
        //CONTINUAR
        exibirQtdPrecoTotal();
        //Use J combo box.       

    }

    public static void removerPdtsSelecionadosR2() {//Somente uma função, indices selecionados não funcionará!!
        //  Retire o pedido da lista!!
        int indiceL = viewPedidoRestaurante2.getjComboBoxPdts().getSelectedIndex();
        pedidoInicial.getProdutosEscolhidos().remove(indiceL);
        viewPedidoRestaurante2.getjComboBoxPdts().removeItemAt(indiceL);
        exibirQtdPrecoTotal();
        //CONTINUAR
        //Use J combo box.      

    }

    public static void removerTudoR1() {
        viewPedidoRestaurante1.getjComboBoxPdts().removeAllItems();
        pedidoInicial.getProdutosEscolhidos().removeAll(pedidoInicial.getProdutosEscolhidos());
        exibirQtdPrecoTotal();

    }

    public static void removerTudoR2() {
        viewPedidoRestaurante2.getjComboBoxPdts().removeAllItems();
        pedidoInicial.getProdutosEscolhidos().removeAll(pedidoInicial.getProdutosEscolhidos());
        exibirQtdPrecoTotal();

    }

    //Saída - Métodos
    public static void sairDoFastLunch() {
        //Nada será salvo!
        //Vou testar na classe principal.
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair do Fast Lunch? Qualquer operação em configuração não será salva.", "Sair - Fast Lunch", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            System.exit(resposta);
        }
    }

    public static void sairTelaFazerPedido() {
        viewFazerPedido.dispose();
        botaoFazerPedidoSelecionado = false;
        viewUsuario.getjAreaDeTrabalho().remove(viewFazerPedido);

    }

    public static void sairTelaMinhaConta() {
        viewVisualizarConta.dispose();
        botaoVisualizarContaSelecionado = false;
        viewUsuario.getjAreaDeTrabalho().remove(viewVisualizarConta);

    }

    public static void sairDurantePedidoR1() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;
            viewPedidoRestaurante1.dispose();
            viewUsuario.getjAreaDeTrabalho().remove(viewPedidoRestaurante1);
            //int indiceRemover = (clienteUsuario.getNumPedidos() - 1);
            //clienteUsuario.getPedidosCliente().remove(indiceRemover); //pode ser pedidoInicial. 
            clienteUsuario.getPedidosCliente().remove(pedidoInicial);
            clienteUsuario.setNumPedidos((clienteUsuario.getNumPedidos() - 1));
            viewPedidoRestaurante1.getjComboBoxPdts().removeAllItems();
            viewPedidoRestaurante1.getJlPrecoTotal().setText("");
            viewPedidoRestaurante1.getJlQtdProdutos().setText("");

            //Pedido será apagado. Ou pagamento
        }

    }

    public static void sairDurantePedidoR2() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;
            viewPedidoRestaurante2.dispose();
            viewUsuario.getjAreaDeTrabalho().remove(viewPedidoRestaurante2);
            //int indiceRemover = (clienteUsuario.getNumPedidos() - 1);
            //clienteUsuario.getPedidosCliente().remove(indiceRemover); //Pode ser pedidoInicial            
            clienteUsuario.getPedidosCliente().remove(pedidoInicial);
            clienteUsuario.setNumPedidos((clienteUsuario.getNumPedidos() - 1));
            viewPedidoRestaurante2.getjComboBoxPdts().removeAllItems();
            viewPedidoRestaurante2.getJlPrecoTotal().setText("");
            viewPedidoRestaurante2.getJlQtdProdutos().setText("");
            //Pedido será apagado. Ou pagamento
        }
    }

    public static void sairDuranteTelaPagamento() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;
            viewTelaPagamento.dispose();
            viewUsuario.getjAreaDeTrabalho().remove(viewTelaPagamento);
            //int indiceRemover = (clienteUsuario.getNumPedidos() - 1);
            // clienteUsuario.getPedidosCliente().remove(indiceRemover); 
            clienteUsuario.getPedidosCliente().remove(pedidoInicial);
            clienteUsuario.setNumPedidos((clienteUsuario.getNumPedidos() - 1));

            //Pedido será apagado. Ou pagamento
            //Esvazie a Jcombobox daqui.
        }

    }

    //Cancelamento - Métodos
    public static void cancelarPedidoPago() {

    }

    public static void cancelarPedidoNaoPago() {

    }

    //Seleção de pedidos - Métodos
    public static void visualizarPedidoSelecionado() {

    }

    //Exibição - Métodos
    //Exibição das telas:
    public static void abrirTelaFazerPedido() {
        if (botaoFazerPedidoSelecionado == false) {
            if (botaoVisualizarContaSelecionado == false) {
                viewUsuario.getjAreaDeTrabalho().add(viewFazerPedido);
                viewFazerPedido.setVisible(true);
                botaoFazerPedidoSelecionado = true;
            } else {
                JOptionPane.showMessageDialog(viewUsuario, "Para fazer um pedido, feche a aba com as informações da sua conta.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(viewUsuario, "Um pedido já está em configuração!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }

        //Criando os métodos para a tela usuário. Usando os métodos já criados e fazendo validações.
    }

    public static void abrirTelaVisualizarConta() {
        if (botaoVisualizarContaSelecionado == false) {
            if (botaoFazerPedidoSelecionado == false) {
                viewUsuario.getjAreaDeTrabalho().add(viewVisualizarConta);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Funcionará se eu modificar? Devo modificar o cliente.
                viewVisualizarConta.setVisible(true);
                botaoVisualizarContaSelecionado = true;
            } else {
                JOptionPane.showMessageDialog(viewUsuario, "Uma conta não pode ser modificada enquanto um pedido está em configuração.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(viewUsuario, "Você já está visualizando as informações da sua conta.", "Aviso!", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void abrirTelaRestaurante1() { //Num pedido será mostrado +1.
        viewFazerPedido.dispose();
        viewUsuario.getjAreaDeTrabalho().remove(viewFazerPedido);
        botaoR1Selecionado = true;
        pedidoInicial = new Pedido(clienteUsuario, "Tempero Baiano");
        clienteUsuario.getPedidosCliente().add(pedidoInicial);
        clienteUsuario.setNumPedidos(clienteUsuario.getNumPedidos() + 1);
        viewUsuario.getjAreaDeTrabalho().add(viewPedidoRestaurante1);
        gerarCafeManhaTable();
        gerarBebidasR1Table();
        gerarLanchesTable();
        viewPedidoRestaurante1.setVisible(true);
        botaoFazerPedidoSelecionado = true; //é necessário?

    }

    public static void abrirTelaRestaurante2() {
        viewFazerPedido.dispose();
        viewUsuario.getjAreaDeTrabalho().remove(viewFazerPedido);
        botaoR1Selecionado = false;
        pedidoInicial = new Pedido(clienteUsuario, "Sabor Estrangeiro");
        clienteUsuario.getPedidosCliente().add(pedidoInicial);
        clienteUsuario.setNumPedidos(clienteUsuario.getNumPedidos() + 1);
        viewUsuario.getjAreaDeTrabalho().add(viewPedidoRestaurante2);
        gerarAlmocosTable();
        gerarBebidasR2Table();
        gerarPizzasTable();
        viewPedidoRestaurante2.setVisible(true);
        botaoFazerPedidoSelecionado = true; //é necessário?

    }

    public static void abrirTelaPagamentoR1() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente configurar a forma de pagamento? Não haverá possibilidade de mudança alguma no pedido durante essa configuração. Certifique-se de que o pedido contém os itens desejados.", "Atenção! - Tela de pagamento - Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoR1Selecionado = true;
            viewPedidoRestaurante1.getjComboBoxPdts().removeAllItems();
            viewPedidoRestaurante1.getJlPrecoTotal().setText("");
            viewPedidoRestaurante1.getJlQtdProdutos().setText("");
            viewPedidoRestaurante1.dispose();
            viewUsuario.getjAreaDeTrabalho().remove(viewPedidoRestaurante1);
            viewUsuario.getjAreaDeTrabalho().add(viewTelaPagamento);
            prepararTelaPagamento();
            viewTelaPagamento.setVisible(true);
            botaoFazerPedidoSelecionado = true;
        }

    }

    public static void abrirTelaPagamentoR2() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente configurar a forma de pagamento? Não haverá possibilidade de mudança alguma no pedido durante essa configuração. Certifique-se de que o pedido contém os itens desejados.", "Atenção! - Tela de pagamento - Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoR1Selecionado = false;
            viewPedidoRestaurante2.getjComboBoxPdts().removeAllItems();
            viewPedidoRestaurante2.getJlPrecoTotal().setText("");
            viewPedidoRestaurante2.getJlQtdProdutos().setText("");
            viewPedidoRestaurante2.dispose();
            viewUsuario.getjAreaDeTrabalho().remove(viewPedidoRestaurante2);
            viewUsuario.getjAreaDeTrabalho().add(viewTelaPagamento);
            prepararTelaPagamento();
            viewTelaPagamento.setVisible(true);
            botaoFazerPedidoSelecionado = true;
        }

    }

    /*
    public static void abrirTelaPagamento() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente configurar a forma de pagamento? Não haverá possibilidade de mudança alguma no pedido durante essa configuração. Certifique-se de que o pedido contém os idens desejados.", "Atenção! - Tela de pagamento - Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta==0){
            if (pedidoInicial.getRestauranteEscolhido() == "Tempero Baiano"){
                
            
        }

    }
     */
    //Configuração do pagamento.
    public static void efetuarPagamentoFinal() { //Limpeza da tela e reinicialização
        if (pagamentoDefinido == true) {
            int resposta = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Pagamento já definido. Deseja finalizar?", "Pagamento - Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {
                pedidoInicial.setEstado("Produtos sendo preparados.");
                JOptionPane.showMessageDialog(viewTelaPagamento, "Agradecemos pela compra!", "Finalizar", JOptionPane.INFORMATION_MESSAGE);
                botaoFazerPedidoSelecionado = false;
                viewTelaPagamento.setVisible(false);
                viewUsuario.getjAreaDeTrabalho().remove(viewTelaPagamento);
                viewTelaPagamento.getjComboBoxPdts().removeAllItems();
                viewTelaPagamento.getJlTipoPagamento().setText("Não selecionada.");
                viewTelaPagamento.getJlQtdProdutos().setText("");
                viewTelaPagamento.getJlPrecoTotal().setText("");
                viewTelaPagamento.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(viewTelaPagamento, "A forma de pagamento ainda não foi definida!", "Atenção", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void efetuarPagamentoEntrega() {
        if (pagamentoDefinido == false) {

            int resposta = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Deseja realmente efetuar o pagamento durante a entrega, você não poderá definir outra forma de pagamento após esta. Certifique-se de já possuir a quantia quando seus produtos chegarem.", "Pagamento - Entrega", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {
                String endereco = JOptionPane.showInputDialog("Digite a localização da entrega com a rua, bairro e número do local da entrega:");
                if (endereco.isEmpty()) {
                    JOptionPane.showMessageDialog(viewTelaPagamento, "Campo não preenchido.", "Erro!", JOptionPane.WARNING_MESSAGE);

                } else {
                    int confirmacao = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Local da entrega: " + endereco + ". Id do pedido: " + pedidoInicial.getIdPedido() + ". Pagamento: durante a entrega. Salvar? ", "Pagamento - Entrega", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (confirmacao == 0) {
                        String tipoPagamento = "Durante a entrega.";
                        pedidoInicial.setTipoPagamento(tipoPagamento);
                        viewTelaPagamento.getJlTipoPagamento().setText(tipoPagamento);
                        pagamentoDefinido = true;
                    }
                }
            }
        } else {

            JOptionPane.showMessageDialog(viewTelaPagamento, "Tipo de pagamento já definido!", "Erro!", JOptionPane.WARNING_MESSAGE);

        }
    }

    public static void efetuarPagamentoPix() {

        if (pagamentoDefinido == false) {
            int resposta = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Deseja realmente efetuar o pagamento através do Pix? Você não poderá definir outra forma de pagamento após esta.", "Pagamento - Pix", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Pix: XXXXXXXXXXXXXXXX.", "Pagamento - Pix", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(viewVisualizarConta, "Pagamento efetuado com sucesso!", "Pagamento - Pix", JOptionPane.INFORMATION_MESSAGE);
                String tipoPagamento = "Por Pix.";
                pedidoInicial.setTipoPagamento(tipoPagamento);
                viewTelaPagamento.getJlTipoPagamento().setText(tipoPagamento);
                pagamentoDefinido = true;
            }
        } else {
            JOptionPane.showMessageDialog(viewTelaPagamento, "Tipo de pagamento já definido!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void efetuarPagamentoCDebito() {

        if (pagamentoDefinido == false) {

            int resposta = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Deseja realmente efetuar o pagamento com um cartão de débito, você não poderá definir outra forma de pagamento após esta.", "Pagamento - Cartão de débito", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {
                String cartao = JOptionPane.showInputDialog("Digite o número do cartão de débito:");
                if (cartao.isEmpty()) {
                    JOptionPane.showMessageDialog(viewTelaPagamento, "Campo não preenchido.", "Erro!", JOptionPane.WARNING_MESSAGE);

                } else {
                    int confirmacao = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Cartão : " + cartao + ". Id do pedido: " + pedidoInicial.getIdPedido() + ". Pagamento: 1 vez sem juros. Salvar? ", "Pagamento - Cartão de débito", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (confirmacao == 0) {
                        String tipoPagamento = "Cartão de débito.";
                        pedidoInicial.setTipoPagamento(tipoPagamento);
                        viewTelaPagamento.getJlTipoPagamento().setText(tipoPagamento);
                        pagamentoDefinido = true;
                        JOptionPane.showMessageDialog(viewVisualizarConta, "Pagamento efetuado com sucesso!", "Pagamento - Cartão de débito", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }
        } else {

            JOptionPane.showMessageDialog(viewTelaPagamento, "Tipo de pagamento já definido!", "Erro!", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void efetuarPagamentoCCredito() {
        if (pagamentoDefinido == false) {
            int resposta = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Deseja realmente efetuar o pagamento com um cartão de crédito, você não poderá definir outra forma de pagamento após esta.", "Pagamento - Cartão de débito", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {
                if (pedidoInicial.getPrecoTotalPedido() % 5 == 0) {
                    String cartao = JOptionPane.showInputDialog("O preço total será dividido em 5 parcelas sem juros. Digite o número do cartão de crédito:");
                    if (cartao.isEmpty()) {
                        JOptionPane.showMessageDialog(viewTelaPagamento, "Campo não preenchido.", "Erro!", JOptionPane.WARNING_MESSAGE);

                    } else {
                        int confirmacao = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Cartão: " + cartao + ". Id do pedido: " + pedidoInicial.getIdPedido() + ". Pagamento: 5 vezes sem juros. " + " 5 parcelas de R$" + (pedidoInicial.getPrecoTotalPedido() / 5d) + ". Salvar? ", "Pagamento - Cartão de débito", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (confirmacao == 0) {
                            String tipoPagamento = "Cartão de crédito.";
                            pedidoInicial.setTipoPagamento(tipoPagamento);
                            viewTelaPagamento.getJlTipoPagamento().setText(tipoPagamento);
                            pagamentoDefinido = true;
                            JOptionPane.showMessageDialog(viewVisualizarConta, "Pagamento efetuado com sucesso!", "Pagamento - Cartão de crédito", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    String cartao = JOptionPane.showInputDialog("O preço total será dividido em 2 parcelas sem juros. Digite o número do cartão de crédito:");
                    if (cartao.isEmpty()) {
                        JOptionPane.showMessageDialog(viewTelaPagamento, "Campo não preenchido.", "Erro!", JOptionPane.WARNING_MESSAGE);

                    } else {
                        int confirmacao = JOptionPane.showInternalConfirmDialog(viewTelaPagamento, "Cartão : " + cartao + ". Id do pedido: " + pedidoInicial.getIdPedido() + ". Pagamento: 2 vezes sem juros." + "2 parcelas de R$" + (pedidoInicial.getPrecoTotalPedido() / 2d) + ". Salvar?", "Pagamento - Cartão de crédito", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (confirmacao == 0) {
                            String tipoPagamento = "Cartão de crédito.";
                            pedidoInicial.setTipoPagamento(tipoPagamento);
                            viewTelaPagamento.getJlTipoPagamento().setText(tipoPagamento);
                            pagamentoDefinido = true;
                            JOptionPane.showMessageDialog(viewVisualizarConta, "Pagamento efetuado com sucesso!", "Pagamento - Cartão de crédito", JOptionPane.INFORMATION_MESSAGE);

                        }
                    }

                }
            } else {

                JOptionPane.showMessageDialog(viewTelaPagamento, "Tipo de pagamento já definido!", "Erro!", JOptionPane.WARNING_MESSAGE);

            }
        }
    }

    //Modificação da conta - Métodos
    public static void modificarNomeUsuario() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar o nome de usuário?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String nome = JOptionPane.showInputDialog("Digite o novo nome de usuário:");
            String nomeUsuarioNovo = nome.trim();
            if (nomeUsuarioNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (nomeUsuarioNovo.equals(clienteUsuario.getNomeUsuario())) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Nome inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNomeUsuario(nomeUsuarioNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarNomeCompleto() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar o nome completo cadastrado?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String nome = JOptionPane.showInputDialog("Digite o novo nome completo:");
            String nomeCompletoNovo = nome.trim();
            if (nomeCompletoNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (nomeCompletoNovo.equals(clienteUsuario.getNomeCompleto())) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Nome inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNomeCompleto(nomeCompletoNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarEmail() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar o endereço de email cadastrado?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String email = JOptionPane.showInputDialog("Digite o novo endereço de email:");
            String emailNovo = email.trim();
            if (emailNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (emailNovo.contains("@") && emailNovo.contains(".com")) {
                if (emailNovo.equals(clienteUsuario.getEmail())) {
                    JOptionPane.showMessageDialog(viewVisualizarConta, "Endereço de email é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
                } else {
                    clienteUsuario.setEmail(emailNovo);
                    preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                    JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Email inserido inválido.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void modificarCPF() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar o CPF cadastrado", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String cpf = JOptionPane.showInputDialog("Digite o novo CPF:");
            String cpfNovo = cpf.trim();
            if (cpfNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else if (cpfNovo.equals(clienteUsuario.getCpf())) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "CPF inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setCpf(cpfNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarNumTel() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar o número de telefone?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String numTel = JOptionPane.showInputDialog("Digite o novo número de telefone:");
            String numTelNovo = numTel.trim();
            if (numTelNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else if (numTelNovo.equals(clienteUsuario.getNumTelefone())) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Número de telefone inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNumTelefone(numTelNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarSenha() {
        int resposta = JOptionPane.showInternalConfirmDialog(viewVisualizarConta, "Deseja realmente modificar a sua senha?", "Modificar senha", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String senhaComprovacao = JOptionPane.showInputDialog("Digite a sua senha atual:");//Input aparece no meio da tela!
            if (senhaComprovacao.equals(clienteUsuario.getSenha())) {
                String senha = JOptionPane.showInputDialog("Digite a nova senha:");
                String senhaNova = senha.trim();
                if (senhaNova.isEmpty()) {
                    JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);
                } else if (senhaNova.equals(clienteUsuario.getSenha())) {
                    JOptionPane.showMessageDialog(viewVisualizarConta, "A nova senha interida é igual à atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
                } else {
                    clienteUsuario.setSenha(senhaNova);
                    //preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                    JOptionPane.showMessageDialog(viewVisualizarConta, "Modificação efetuada com sucesso!", "Modificação - Senha", JOptionPane.INFORMATION_MESSAGE);
                } //AQUI
            } else {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Senha incorreta.", "Erro!", JOptionPane.WARNING_MESSAGE);

            }
        }

    }

    public static void excluirContaUsuario() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja excluir a sua conta permanentemente?", "Excluir conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            viewUsuario.dispose(); //Somente criada ao cadastrar ou entrar. 
            clienteUsuario = new Cliente();
            controllerInicial.exibirTelaInicial();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso.", "Excluir conta", JOptionPane.INFORMATION_MESSAGE);

        }

        //Ir para a tela inicial
    }

    public static void desconectarContaUsuario() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Desconectar e voltar para a tela inicial? Qualquer operação em configuração não será salva.", "Desconectar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            viewUsuario.dispose(); //Somente criada ao cadastrar ou entrar.             
            controllerInicial.exibirTelaInicial();

        }

    }

    @Override
    public Pedido fazerPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarConta(String nomeCompleto, String nomeUsuario, String email, String senha, String cpf, String numTelefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirConta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
