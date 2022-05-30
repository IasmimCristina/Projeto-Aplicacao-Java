/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unifacs.controller.helpers;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import unifacs.model.Cliente;
import unifacs.model.Pedido;
import unifacs.view.TelaCadastrar;

/**
 *
 * @author YellowRed
 */
public class TelaCadastrarHelper {

    private final TelaCadastrar viewCadastrar;

    public TelaCadastrarHelper(TelaCadastrar viewCadastrar) {
        this.viewCadastrar = viewCadastrar;
    }

    public boolean validarDadosTelaCadastrar() { //Não está completo!!
        //Os valores já são pegos sem espaçoes.
        int camposVazios = 0;

        //Início da validação do nome completo:
        String nomeCompleto = String.valueOf(viewCadastrar.getjTCadastrarNomeCompleto().getText().trim());
        boolean campoNCompletoVazio = false;
        if (nomeCompleto.isEmpty()) {
            camposVazios++;
            campoNCompletoVazio = true;
        }

        //Validação do nome de usuário e nome completo.
        String nomeUsuario = String.valueOf(viewCadastrar.getJtCadastrarNomeUsuario().getText().trim());
        if (nomeUsuario.isEmpty() && campoNCompletoVazio == false) {
            camposVazios++;
            JOptionPane.showMessageDialog(viewCadastrar, "O nome de usuário é obrigatório.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
        } else if (campoNCompletoVazio == true && nomeUsuario.isEmpty()) {
            camposVazios++;
        } else if (campoNCompletoVazio == true) {
            JOptionPane.showMessageDialog(viewCadastrar, "O nome completo é obrigatório.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
        }

        //Validar email! -Cheque com contains
        //Trim: retira os espaços laterais.        
        String email = String.valueOf(viewCadastrar.getjTCadastrarEmail().getText().trim());//Testarei na classe Principal. Resultado: positivo.
        boolean erroEmail = false;

        if (email.isEmpty()) {
            camposVazios++;
            if (camposVazios == 1) {
                JOptionPane.showMessageDialog(viewCadastrar, "O endereço de email é obrigatório.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
            }
        } else if (email.contains("@") && email.contains(".com")) {
            erroEmail = false;
        } else {
            erroEmail = true;
            JOptionPane.showMessageDialog(viewCadastrar, "Email inserido inválido.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }

        //Validação - Senha
        String senha = new String(viewCadastrar.getjPCadastrarSenha().getPassword()).trim();
        String senhaConfirmacao = new String(viewCadastrar.getjPCadastrarValidarSenha().getPassword()).trim();        //A senha pode ser de qualquer tamanho. Não deve possuir espaços.
        if (senha.isEmpty()) {
            camposVazios++;
            if (camposVazios == 1) {
                JOptionPane.showMessageDialog(viewCadastrar, "Nenhuma senha inserida.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (senhaConfirmacao.isEmpty()) {
            camposVazios++;
            if (camposVazios == 1) {
                JOptionPane.showMessageDialog(viewCadastrar, "O campo de confirmação da senha não foi preenchido.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (!senha.equals(senhaConfirmacao)) {
            JOptionPane.showMessageDialog(viewCadastrar, "A senhas inseridas não são idênticas.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
        }

        //Validação - CPF  inicial- Sem a validação de letras(Talvez um remove traços.)        
        String cpf = String.valueOf(viewCadastrar.getJtCadastrarCPF().getText().trim());
        boolean campoCPFVazio = false;
        if (cpf.isEmpty()) {
            camposVazios++;
            campoCPFVazio = true;
        }

        //Validação - Número telefônico e CPF
        String numTel = String.valueOf(viewCadastrar.getJtCadastrarNumTel().getText().trim());
        if (numTel.isEmpty()) {
            camposVazios++;
            if (camposVazios == 1 && campoCPFVazio == false) {
                JOptionPane.showMessageDialog(viewCadastrar, "O número telefônico não foi inserido.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (camposVazios == 1 && campoCPFVazio == true) { //Esse número 1 representa o próprio campo aqui.
            JOptionPane.showMessageDialog(viewCadastrar, "O CPF não foi inserido.", "Erro! Campo não preenchido.", JOptionPane.WARNING_MESSAGE);
        }

        //Validação geral
        if (camposVazios > 1) {//Campos vazios.
            JOptionPane.showMessageDialog(viewCadastrar, "Há campos obrigatórios não preenchidos.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }

        //Validação final
        if (erroEmail == false && camposVazios == 0 && senha.equals(senhaConfirmacao)) {  //Redundante? 
            return true;
        } else {
            return false;
        }

    }

    public Cliente obterClienteDaTelaCadastrar() {
        //Validação não é feita aqui!!

        String nomeCompleto = String.valueOf(viewCadastrar.getjTCadastrarNomeCompleto().getText().trim());
        String nomeUsuario = String.valueOf(viewCadastrar.getJtCadastrarNomeUsuario().getText().trim());        
        String email = String.valueOf(viewCadastrar.getjTCadastrarEmail().getText().trim());//Testarei na classe Principal. Resultado: positivo.
        String senha = new String(viewCadastrar.getjPCadastrarSenha().getPassword()).trim();        
        String cpf = String.valueOf(viewCadastrar.getJtCadastrarCPF().getText().trim());
        String numTel = String.valueOf(viewCadastrar.getJtCadastrarNumTel().getText().trim());
        LinkedList<Pedido> pedidosCliente = new LinkedList<>();

        //Obtenção do cliente:
        Cliente clienteCadastrado;
        clienteCadastrado = new Cliente(nomeCompleto, nomeUsuario, email, senha, cpf, numTel, pedidosCliente);

        return clienteCadastrado;
    }

    public void definirClienteNaTelaCadastrar(Cliente modeloCliente) {
        String nomeUsuario = modeloCliente.getNomeUsuario();
        JOptionPane.showMessageDialog(this.viewCadastrar, "Cadastro efetuado com sucesso, " + nomeUsuario + ".");

    }

    public void limparTelaCadastrar() {//Talvez não use essa ideia para este helper.
        viewCadastrar.getjTCadastrarNomeCompleto().setText("");
        viewCadastrar.getJtCadastrarNomeUsuario().setText("");
        viewCadastrar.getjTCadastrarEmail().setText("");
        viewCadastrar.getjPCadastrarSenha().setText("");
        viewCadastrar.getJtCadastrarCPF().setText("");
        viewCadastrar.getJtCadastrarNumTel().setText("");
        viewCadastrar.getjPCadastrarValidarSenha().setText("");

    }

}
