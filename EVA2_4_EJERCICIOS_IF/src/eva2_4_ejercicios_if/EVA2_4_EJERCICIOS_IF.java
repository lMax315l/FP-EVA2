/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        double salario, bono1, salariofnl, bono2, salariofnl2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu Nombre? ");
        nombre = captu.nextLine();
        System.out.println("Cual es tu salario? ");
        salario = captu.nextDouble();
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        
        if(salario <= 12000){
            bono1 = (salario / 100) * 10;
            System.out.println("Bono: 10% = $" + bono1);
            salariofnl = (salario + bono1);
            System.out.println("Tu salario Total es: $" + salariofnl);
        }
        else{
            bono2 = (salario / 100) * 5;
            System.out.println("Bono: 5% = $" + bono2);
            salariofnl2 = (salario + bono2);
            System.out.println("Tu salario Total es: $" + salariofnl2);
        }
       
        
    }
    
}
