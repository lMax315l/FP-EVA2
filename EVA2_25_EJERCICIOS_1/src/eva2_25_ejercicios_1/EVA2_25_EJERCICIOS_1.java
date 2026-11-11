/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int num1, num2;
      Scanner captu = new Scanner(System.in);
      System.out.println("Cual es tu numero Inicial?");
      num1 = captu.nextInt();
      System.out.println("Cual es tu numero Final?");
      num2 = captu.nextInt();
      
      if(num1 < num2){
         for(int i = num1; i <= num2; i++){
         System.out.print(i + " - ");
      }
         
      }else if(num1 > num2){
         for(int i = num1; i >= num2; i--){
         System.out.print(i + " - ");
      }
         
      }
   }
   
}
