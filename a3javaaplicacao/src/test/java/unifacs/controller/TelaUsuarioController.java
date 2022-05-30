/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import javax.swing.JOptionPane;
import unifacs.controller.helpers.TelaUsuarioHelper;
import unifacs.controller.helpers.TelaVisualizarContaHelper;
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
    private static boolean botaoFazerPedidoSelecionado;
    private static boolean botaoVisualizarContaSelecionado;
    private static boolean botaoR1Selecionado;
    private static boolean telaPagamentoCriada;
    private static boolean telaR1Criada;
    private static boolean telaR2Criada;
    private static boolean telaPedidoCriada;

    //Cliente:
    private static Cliente clienteUsuario = new Cliente();
    //Helpers:
    private static TelaUsuarioHelper helperUsuario;
    private static TelaVisualizarContaHelper helperVisualizarConta;

    public TelaUsuarioController(Cliente clienteUsuario, TelaUsuario viewUsuario, JITelaVisualizarConta viewVisualizarConta, JITelaPedidoRestaurante1 viewPedidoRestaurante1, JITelaPedidoRestaurante2 viewPedidoRestaurante2, JITelaPagamento viewTelaPagamento, JIFazerPedido viewFazerPedido) {
        //Cliente usuário virá da tela inixial!

        this.clienteUsuario = clienteUsuario;
        this.viewFazerPedido = viewFazerPedido;
        this.viewPedidoRestaurante1 = viewPedidoRestaurante1;
        this.viewPedidoRestaurante2 = viewPedidoRestaurante2;
        this.viewTelaPagamento = viewTelaPagamento;
        this.viewVisualizarConta = viewVisualizarConta;
        this.viewUsuario = viewUsuario;
        this.botaoFazerPedidoSelecionado = false;
        this.botaoVisualizarContaSelecionado = false;
        this.botaoR1Selecionado = false;
        this.telaPagamentoCriada = false;
        this.telaR1Criada = false;
        this.telaR2Criada = false;
        this.telaPedidoCriada = false;

        //Controllers
        //controllerInicial = new TelasIniciaisController(viewInicial, viewCadastrar, viewEntrar, viewEsqueceuSenha, viewUsuario);
        //Helpers
        this.helperUsuario = new TelaUsuarioHelper(viewUsuario);
        helperVisualizarConta = new TelaVisualizarContaHelper(viewVisualizarConta);

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

        helperVisualizarConta.infoUsuarioNaTela(nomeUsuario, nomeCompleto, email, cpf, numTel);

    }

    public static void darSaudacaoUsuario() {
        String mensagem = "Olá, " + clienteUsuario.getNomeUsuario() + "!   :D";
        helperUsuario.exibirSaudacao(mensagem);

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
    }

    public static void sairTelaMinhaConta() {
        viewVisualizarConta.dispose();
        botaoVisualizarContaSelecionado = false;
    }

    public static void sairDurantePedidoR1() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;            
            viewPedidoRestaurante1.dispose();
            //Pedido será apagado. Ou pagamento
        }

    }
    
    public static void sairDurantePedidoR2() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;            
            viewPedidoRestaurante2.dispose();
            //Pedido será apagado. Ou pagamento
        }
    }
    public static void sairDuranteTelaPagamento() { //Não está pronto!! USE DISPOSE
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair durante a configuração do pedido? Produtos selecionados não serão salvos.", "Sair - Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            botaoFazerPedidoSelecionado = false;            
            viewTelaPagamento.dispose();
            //Pedido será apagado. Ou pagamento
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
                //f (telaPedidoCriada = false) {
                viewUsuario.getjAreaDeTrabalho().add(viewFazerPedido);
                viewFazerPedido.setVisible(true);
                // telaPedidoCriada = true;
                //} else {
                //   viewFazerPedido.setVisible(true);
                //}
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

    public static void abrirTelaRestaurante1() {
        viewFazerPedido.dispose();
        botaoR1Selecionado = true;
        //if (telaR1Criada = false) {
        viewUsuario.getjAreaDeTrabalho().add(viewPedidoRestaurante1);
        viewPedidoRestaurante1.setVisible(true);
        //    telaR1Criada = true;

        //} else {
        //    viewPedidoRestaurante1.setVisible(true);
        //}
        botaoFazerPedidoSelecionado = true; //é necessário?

    }

    public static void abrirTelaRestaurante2() {
        viewFazerPedido.dispose();
        botaoR1Selecionado = false;
        //if (telaR2Criada == false) {
        viewUsuario.getjAreaDeTrabalho().add(viewPedidoRestaurante2);
        viewPedidoRestaurante2.setVisible(true);
        //   telaR2Criada = true;
        //} else {
        //   viewPedidoRestaurante2.setVisible(true);
        // }

        botaoFazerPedidoSelecionado = true; //é necessário?

    }

    

   

    public static void abrirTelaPagamentoR1() {
        botaoR1Selecionado = true;
        viewPedidoRestaurante1.dispose();
        //if (telaPagamentoCriada == false) {
        viewUsuario.getjAreaDeTrabalho().add(viewTelaPagamento);
        viewTelaPagamento.setVisible(true);
        //   telaPagamentoCriada = true;
        //} else {
        //   viewTelaPagamento.setVisible(true);
        // }
        botaoFazerPedidoSelecionado = true;

    }

    public static void abrirTelaPagamentoR2() {
        viewPedidoRestaurante2.dispose();
        // if (telaPagamentoCriada == false) {
        viewUsuario.getjAreaDeTrabalho().add(viewTelaPagamento);
        viewTelaPagamento.setVisible(true);
        //    telaPagamentoCriada = true;
        // } else {
        //viewTelaPagamento.setVisible(true);
        // }
        botaoFazerPedidoSelecionado = true;

    }

    

    public static void efetuarPagamento() {
        botaoFazerPedidoSelecionado = false;

    }

    public static void efetuarPagamentoEntrega() {

    }

    public static void efetuarPagamentoPix() {

    }

    public static void efetuarPagamentoCDebito() {

    }

    public static void efetuarPagamentoCCredito() {

    }

    //Modificação da conta - Métodos
    public static void modificarNomeUsuario() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente modificar o nome de usuário?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String nome = JOptionPane.showInputDialog("Digite o novo nome de usuário:");
            String nomeUsuarioNovo = nome.trim();
            if (nomeUsuarioNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (nomeUsuarioNovo.equals(clienteUsuario.getNomeUsuario())) {
                JOptionPane.showMessageDialog(viewUsuario, "Nome inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNomeUsuario(nomeUsuarioNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewUsuario, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarNomeCompleto() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente modificar o nome completo cadastrado?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String nome = JOptionPane.showInputDialog("Digite o novo nome completo:");
            String nomeCompletoNovo = nome.trim();
            if (nomeCompletoNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (nomeCompletoNovo.equals(clienteUsuario.getNomeCompleto())) {
                JOptionPane.showMessageDialog(viewUsuario, "Nome inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNomeCompleto(nomeCompletoNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewUsuario, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarEmail() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente modificar o endereço de email cadastrado?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String email = JOptionPane.showInputDialog("Digite o novo endereço de email:");
            String emailNovo = email.trim();
            if (emailNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);

            } else if (emailNovo.contains("@") && emailNovo.contains(".com")) {
                if (emailNovo.equals(clienteUsuario.getEmail())) {
                    JOptionPane.showMessageDialog(viewUsuario, "Endereço de email é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
                } else {
                    clienteUsuario.setEmail(emailNovo);
                    preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                    JOptionPane.showMessageDialog(viewUsuario, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(viewUsuario, "Email inserido inválido.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void modificarCPF() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente modificar o CPF cadastrado", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String cpf = JOptionPane.showInputDialog("Digite o novo CPF:");
            String cpfNovo = cpf.trim();
            if (cpfNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else if (cpfNovo.equals(clienteUsuario.getCpf())) {
                JOptionPane.showMessageDialog(viewUsuario, "CPF inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setCpf(cpfNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewUsuario, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void modificarNumTel() {
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente modificar o número de telefone?", "Modificar conta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            String numTel = JOptionPane.showInputDialog("Digite o novo número de telefone:");
            String numTelNovo = numTel.trim();
            if (numTelNovo.isEmpty()) {
                JOptionPane.showMessageDialog(viewVisualizarConta, "Campo não preenchido. Nehuma alteração foi efetuada.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else if (numTelNovo.equals(clienteUsuario.getNumTelefone())) {
                JOptionPane.showMessageDialog(viewUsuario, "Número de telefone inserido é igual ao atual!.", "Erro!", JOptionPane.WARNING_MESSAGE);
            } else {
                clienteUsuario.setNumTelefone(numTelNovo);
                preencherMinhaConta(viewUsuario.getClienteUsuario()); //Atualizar exibição.
                JOptionPane.showMessageDialog(viewUsuario, "Modificação efetuada com sucesso!", "Modificação - Conta", JOptionPane.INFORMATION_MESSAGE);
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
