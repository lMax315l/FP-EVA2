/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int nume, facto = 1, nume2, facto2 = 1;
      Scanner captu = new Scanner(System.in);
      System.out.println("Que numero quieres calcular en factorial: ");
      nume = captu.nextInt();
      
      for(int i = nume; i >= 1; i--){
         System.out.print(i + " - ");
         facto = facto * i;
         
      }
      System.out.println("");
      System.out.println("Factorial de " + nume + " = " + facto);
      
      System.out.println("Que otro numero quieres calcular en factorial: ");
      nume2 = captu.nextInt();
      
      for(int i = 1; i <= nume2; i++){
         System.out.print(i + " - ");
         facto2 = facto2 * i;
         
      }
      System.out.println("");
      System.out.print("Factorial de " + nume2 + " = " + facto2);
   }  
   
}
