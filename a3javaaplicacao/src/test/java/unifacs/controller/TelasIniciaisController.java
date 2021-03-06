/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import unifacs.controller.helpers.TelaCadastrarHelper;
import unifacs.controller.helpers.TelaEntrarHelper;
import unifacs.model.Cliente;
import unifacs.model.ITelaInicial;
import unifacs.model.Pedido;
import unifacs.view.TelaCadastrar;
import unifacs.view.TelaEntrar;
import unifacs.view.TelaEsqueceuSenha;
import unifacs.view.Principal;
import unifacs.view.TelaUsuario;

/**
 *
 * @author YellowRed
 */
public class TelasIniciaisController implements ITelaInicial {

    private static Cliente clienteUsuario;
    private static Principal viewInicial;
    private static TelaCadastrar viewCadastrar;
    private static TelaEntrar viewEntrar;
    private static TelaEsqueceuSenha viewEsqueceuSenha;
    //private static TelaUsuario viewUsuario;
    private static TelaCadastrarHelper helperCadastrar;//Continuará com o nome helper caso utilizemos apenas m helper neste controller.
    private static TelaEntrarHelper helperEntrar;
    private static TelaUsuario viewUsuario;
    private static ArrayList<Cliente> listaClientesCadastrados;

    //Construtor para tela inicial
    public TelasIniciaisController(Principal viewInicial, TelaCadastrar viewCadastrar, TelaEntrar viewEntrar, TelaEsqueceuSenha viewEsqueceuSenha, TelaUsuario viewUsuario) {
        this.viewInicial = viewInicial;
        this.viewCadastrar = viewCadastrar;
        this.viewEntrar = viewEntrar;
        this.viewEsqueceuSenha = viewEsqueceuSenha;
        this.viewUsuario = viewUsuario;
        //Helpers:
        this.helperCadastrar = new TelaCadastrarHelper(viewCadastrar);
        this.helperEntrar = new TelaEntrarHelper(viewEntrar);

    }

    //Saída - Métodos
    public static void sairDoFastLunch() {
        //Nada será salvo!
    }

    //Fazer as funções de exibição das telas.
    //Configuração das telas - Voltar
    public static void voltarTelaEntrar() {
        viewEntrar.setVisible(false);
        viewInicial.setVisible(true);
    }

    public static void voltarTelaCadasrar() {
        viewCadastrar.setVisible(false);
        helperCadastrar.limparTelaCadastrar();
        viewInicial.setVisible(true);
    }

    public static void voltarTelaEsqueceu() {
        viewEsqueceuSenha.setVisible(false);
        viewEntrar.setVisible(true);
    }

    // Configuração das telas - Exibição
    public static void exibirTelaInicial() {
        viewInicial.setVisible(true);
    }

    public static void exibirTelaCadastro() {
        viewInicial.setVisible(false);
        viewCadastrar.setVisible(true);
    }

    public static void exibirTelaEntrar() {
        viewInicial.setVisible(false);
        viewEntrar.setVisible(true);
    }

    public static void exibirTelaEsqueceu() {
        viewEntrar.setVisible(false);
        viewEsqueceuSenha.setVisible(true);
    }

    // Configuração do cadastro   
    @Override
    public void cadastrar() {
        //Modifique a interface!
    }

    public static void cadastrarUsuario() { //Método estático também? Usaremos o cleinte depois.
        //Fazer as validações necessárias.
        //Pegar novo cliente.
        //Ir para a tela usuário.
        if (helperCadastrar.validarDadosTelaCadastrar() == true) {

            clienteUsuario = new Cliente();
            clienteUsuario = helperCadastrar.obterClienteDaTelaCadastrar();
            helperCadastrar.definirClienteNaTelaCadastrar(clienteUsuario);
            viewCadastrar.dispose();
            viewUsuario = new TelaUsuario(clienteUsuario); //Talvez comente para testes!!

            viewUsuario.setVisible(true);  //Estarão ligados? Os controllers?
            //Abrir a tela do usuário. Use dispose!!
        }

        //Parei aqui: obtive o cliente (sem validações) da tela.
        //Fazer: validações, criar e validar a entrada do usuário exibir a tela do usuário
        //Ainda estou efetuando o cadastro e entrada.
    }

    public static void entrarUsuario() {
        listaClientesCadastrados = viewInicial.getListaClientesCadastrados();
        boolean achouUsuario;
        String emailTela = viewEntrar.getjTEntrarEmail().getText();
        String senhaTela = String.valueOf(viewEntrar.getjPEntrarSenha().getPassword());
        if (emailTela.isEmpty() || senhaTela.isEmpty()) {
            JOptionPane.showMessageDialog(viewEntrar, "Erro! campo(s) vazio(s)! ", "Erro!", JOptionPane.WARNING_MESSAGE);

        } else {
            for (int i = 0; i < listaClientesCadastrados.size(); i++) {
                Cliente usuarioTeste = listaClientesCadastrados.get(i);
                String email = usuarioTeste.getEmail();
                String senha = usuarioTeste.getSenha();
                if (email.equals(emailTela) && senha.equals(senhaTela)) {
                    achouUsuario = true;
                    JOptionPane.showMessageDialog(viewEntrar, "Olá novamente, " + usuarioTeste.getNomeUsuario() + "!", "Entrada", JOptionPane.INFORMATION_MESSAGE);
                    viewEntrar.dispose();
                    viewUsuario = new TelaUsuario(usuarioTeste);
                    viewUsuario.setVisible(true);

                } else {
                    achouUsuario = false;
                }
            }
            if (achouUsuario = false) {
                JOptionPane.showMessageDialog(viewEntrar, "Dados inseridos não correspondem a nenhuma conta cadastrada.", "Erro!", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    @Override
    public Cliente entrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void esqueceuSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
