/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int prom;
        Scanner captu = new Scanner(System.in);
        System.out.println("Escribe tu Promedio:");
        prom = captu.nextInt();
        
        if(prom > 100){
            System.out.println("Dato Invalido");
        }else if(prom < 0){
            System.out.println("Dato Invalido");
        }else if(prom < 70){
            System.out.println("Insuficiente");
        }else if(prom < 80){
            System.out.println("Aceptable");
        }else if(prom < 90){
            System.out.println("Bueno!");
        }else if(prom >= 90){
            System.out.println("Sobresaliente!!!");
        }
              
    }
    
}
