/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author Jose Ortega
 */
public class EVA2_25_EJERCICIOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num, acu = 0, op;
        System.out.println("Introduce un Numero");
        num = captu.nextInt();
        
        for(int i = 0; i < 10; i++){
            acu++;
            op = num * acu;
            System.out.println(num + " X " + acu + " = " + op);
        }
    }
    
}
