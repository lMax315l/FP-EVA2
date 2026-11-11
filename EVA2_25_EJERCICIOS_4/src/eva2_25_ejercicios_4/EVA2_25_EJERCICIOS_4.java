/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author Jose Ortega
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num, expo, acu = 1;
        System.out.println("Introduce un Numero");
        num = captu.nextInt();
        System.out.println("Introduce su Exponente");
        expo = captu.nextInt();
        
        for(int i = 0; i < expo; i++){
            acu = acu * num;
        }
        System.out.println(num + " Elevado a la " + expo + "ra Potencia es: " + acu);
        
    }
    
}
