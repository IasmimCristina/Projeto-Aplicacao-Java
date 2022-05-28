package unifacs.model;

import java.time.LocalDate;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YellowRed
 */
public class Principal {
    public static void main(String[] args) {
        
       
        
        System.out.println("Olá..."); //BreakPoint
        //System.out.println(exemplo.getCardapioCafeDaManha());
        //System.out.println("Teste!!"); //Primeiro teste e segundo teste.
        //RestauranteBr exemplo = new RestauranteBr();
        //RestauranteInternacional exemploInt = new RestauranteInternacional();
        System.out.println("Exemplo!"); //BreakPoint
        LocalDate geradorData = LocalDate.now();
        System.out.println(geradorData); //Ano, mês e dia.
        String data = String.valueOf(geradorData.getDayOfMonth() +"/"+ geradorData.getMonthValue() +"/"+  geradorData.getYear());// Funcionou!!
        System.out.println(data);
        
        //Teste uma variável Random estática!!
       
        
        
    }
    
}
