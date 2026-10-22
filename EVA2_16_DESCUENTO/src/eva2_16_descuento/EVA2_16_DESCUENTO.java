/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      String credencial, credencial2, estud;
      int edad;
       
      Scanner captu = new Scanner(System.in);
      System.out.println("Cual es tu Edad?");
      edad = captu.nextInt();
       
      if(edad < 18){
          System.out.println("OK, tienes descuento de Menor de Edad");
      }else if(edad >= 18){
          System.out.println("Eres Estudiante?");
          captu.nextLine();
          estud = captu.nextLine();
          if(estud.equals("si")){
             System.out.println("Tienes Credencial Vigente?");
             credencial = captu.nextLine();
             }if(credencial.equals("si")) && estud.equals("si");
             System.out.println("OK, te damos el Descuento");
          else{
             System.out.println("No te damos el Descuento");
          }
      }else if(edad > 60){
          System.out.println("Tienes Credencial del INSEN?");
          credencial2 = captu.nextLine();
          if(edad > 60 && credencial2.equals("si")){
             System.out.println("OK, te damos el Descuento");
          }else{
             System.out.println("No te damos el Descuento");
          }
          
      }
       
   }
   
}
