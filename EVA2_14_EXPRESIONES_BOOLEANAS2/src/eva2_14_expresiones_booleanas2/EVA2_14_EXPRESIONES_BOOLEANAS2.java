/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int prom;
      String er;
      
      System.out.println("Cual es u Promedio?");
      prom = captu.nextInt();
      System.out.println("Perteneces a un Equipo Representativo?");
      captu.nextLine();
      er = captu.nextLine();
        
        if(prom >= 95 || er.equals("si")){
           System.out.print("Ok te la damos");
        }else{
           System.out.print("No te la damos");
        }
    }
   
}
