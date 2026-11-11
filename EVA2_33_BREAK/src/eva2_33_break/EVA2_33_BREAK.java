/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_33_BREAK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int nume, valor = 10;
      while(true){//ciclo infinito wey
         System.out.println("Introduce un valor");
         nume = captu.nextInt();
         captu.nextLine();
         
         if(nume == valor){
            System.out.println("Leee Atinaste");
            break;
         }
      }
      
         
   }
   
}
