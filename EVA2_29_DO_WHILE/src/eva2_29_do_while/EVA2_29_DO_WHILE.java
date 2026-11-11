/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_29_DO_WHILE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int monto, cuenta = 5000;
      
      do{
         System.out.println("Cuanto quiere retirar?");
         monto = captu.nextInt();
         cuenta = cuenta - monto;
         System.out.println("Tu saldo es: " + cuenta);
      }while(cuenta > 0);
      System.out.println("Fondos Insuficientes");
   }
   
}
