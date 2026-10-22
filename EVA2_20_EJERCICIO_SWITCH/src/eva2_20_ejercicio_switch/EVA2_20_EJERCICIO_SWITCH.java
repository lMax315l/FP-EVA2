/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      System.out.println("Introduce el Primer valor (Número Entero)");
      double x1 = captu.nextInt();
      System.out.println("Introduce el segundo valor (Número Entero)");
      double x2 = captu.nextInt();
      System.out.println("Que operacion quieres hacer?  (SUMA, RESTA, MULTIPLICACION, DIVISION)");
      captu.nextLine();
      String op =  captu.nextLine();
      
      switch(op){
         case "SUMA" :
            System.out.println("Resultado: " + (x1 + x2));
            break;
         case "RESTA":
            System.out.println("Resultado: " + (x1 - x2));
            break;
         case "MULTIPLICACION":
            System.out.println("Resultado: " + (x1 * x2));
            break;
         case "DIVISION":
            System.out.println("Resultado: " + (x1 / x2));
            break;
         default:
            System.out.println("Dato Invalido");
      }
      
   }
   
}
