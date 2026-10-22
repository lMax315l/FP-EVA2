/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int cant, califa = 0;
      double prom;
      Scanner captu = new Scanner(System.in);
      System.out.println("Cuantas Calificaciones vas a Capturar?");
      cant = captu.nextInt();
      captu.nextLine();
      for(int i = 0; i < cant; i++){
         System.out.println("Captura la calificacion: ");
         califa = califa + captu.nextInt();
         captu.nextLine();
      }
      System.out.println("Acumulacion: " + califa);
      prom = califa / (cant * 1.0);
      System.out.println("Promedio: " + prom);
   }
   
}
