package unifacs.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import unifacs.view.Principal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author YellowRed
 */
public class Testes {

    public static void main(String[] args) {

        System.out.println("Olá..."); //BreakPoint
        //System.out.println(exemplo.getCardapioCafeDaManha());
        //System.out.println("Teste!!"); //Primeiro teste e segundo teste.
        //RestauranteBr exemplo = new RestauranteBr();
        //RestauranteInternacional exemploInt = new RestauranteInternacional();
        System.out.println("Exemplo!"); //BreakPoint
        LocalDate geradorData = LocalDate.now();
        System.out.println(geradorData); //Ano, mês e dia.
        String data = String.valueOf(geradorData.getDayOfMonth() + "/" + geradorData.getMonthValue() + "/" + geradorData.getYear());// Funcionou!!
        System.out.println(data);

        //Teste uma variável Random estática!! -Resultado: Random não precisa ser estática.
        Random random = new Random();
        int idPedido = random.nextInt(1000) + 1; //0-999. Agora são valores de 1 até 1000.
        int idPedido01 = random.nextInt(1000) + 1; //O id pedido não pode se repetir em um cliente.
        int idPedido02 = random.nextInt(1000) + 1;

        System.out.println(idPedido);
        System.out.println(idPedido01);
        System.out.println(idPedido02);
        
        Principal viewInicial = new Principal();
        
        ArrayList<Cliente> exemplo =  viewInicial.getListaClientesCadastrados();
        System.out.println("Exemplo!");
        
        
        
        /*

        ArrayList<Pedido> exemplo = new ArrayList<>();
        System.out.println(exemplo.size());
        
        
        */
        
        /*
        int resposta = JOptionPane.showInternalConfirmDialog(null, "Tem certeza de que deseja sair do Fast Lunch? Qualquer operação em configuração não será salva.", "Sair - Fast Lunch", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        System.out.println(resposta);
        
        */
        

        // Teste da validação do email
        Scanner leitura = new Scanner(System.in);

        /*
        String email01 = leitura.next();
        String email02 = leitura.next();
        String email03 = leitura.next();
         */
 /*
        if (email01.contains("@") && email01.contains(".com")){
            System.out.println("Email válido!");
            
        } else{
            System.out.println("Email inválido.");
        }
        
        if (email02.contains("@") && email02.contains(".com")){
            System.out.println("Email válido!");
            
        } else{
            System.out.println("Email inválido.");
        }
        
        if (email03.contains("@") && email03.contains(".com")){
            System.out.println("Email válido!");
            
        } else{
            System.out.println("Email inválido.");
        }
            
         */
    }

}
