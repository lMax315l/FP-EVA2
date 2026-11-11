/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
      Scanner captu = new Scanner(System.in);
      System.out.print("Cual es tu Numero?");
      num = captu.nextInt();
      for(int i = 1; i <= num; i++){
          for(int o = 1;o <= i; o++){
              System.out.print("*");
          }
          System.out.println("");
        }
    }
}
