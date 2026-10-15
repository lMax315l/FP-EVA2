/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hora;
        double costo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Escribe las horas que estuiste estacionado");
        System.out.print("Horas:");
        hora = captu.nextInt();
        
        if(hora <= 2){
            costo = (hora * 25);
            System.out.print("Su costo es: $" + costo);
        }else if(hora <= 5){
            costo = (hora * 20);
            System.out.print("Su costo es: $" + costo);
        }else if(hora <= 10){
            costo = (hora * 15);
            System.out.print("Su costo es: $" + costo);
        }else if(hora > 10){
            costo = (150);
            System.out.print("Su costo es: $" + costo);
        }else{
            System.out.print("opcion invalida");
        }
            
        
    }
    
}
