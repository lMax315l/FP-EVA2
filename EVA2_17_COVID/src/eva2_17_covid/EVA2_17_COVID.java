/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PERSONAS DE RIESGO mayores 65 enfermos cronicos masa corporal
        int edad;
        double peso,altura, imc;
        boolean croni ;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        edad = captu.nextInt();
        System.out.println("Introduce altura en metros");
        altura = captu.nextDouble();
        System.out.println("Introduce tu peso en kg");
        peso = captu.nextDouble();
        System.out.println("¿Tienes alguna enfermedad crónica?(true/false)");
        croni = captu.nextBoolean();
        imc = peso / (altura * altura);
        
        if (edad > 65 || imc > 25 || croni){
            System.out.println("Tienes mayor riesgo de contraer covid");
        }
        else {
            System.out.println("No tienes mayor riesgo de contraer covid");
       }
        
    }
    
}
