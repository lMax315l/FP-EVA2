/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorrio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_34_AHORRO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);  
      int deposito,cuenta = 0, ahorro = 15000;
      while(true){
         System.out.println("Introduce el deposito");
         deposito = captu.nextInt();
         captu.nextLine();
         if((cuenta + deposito > 15000)){
            System.out.println("Te pasaste de la meta");
            continue;
         }
         cuenta += deposito;
         System.out.println("Cuenta = " + cuenta);
         if(cuenta == 15000){
            System.out.println("Meta Alcanzada");
            break;
         }
      }
   }
   
}
