/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_BECA {
   
   public static void main(String[] args) {
     Scanner captu = new Scanner(System.in);
      int prom;
      double ingresos;
      
      System.out.println("Cual es u Promedio?");
      prom = captu.nextInt();
      System.out.println("Cuales son tus ingresos mensuales?");
      ingresos = captu.nextDouble();
      
      if(prom >= 80 && (ingresos < 10000)){
           System.out.print("Ok te la damos");
        }else{
           System.out.println("No te la damos");
        }
      
   }
   
}
