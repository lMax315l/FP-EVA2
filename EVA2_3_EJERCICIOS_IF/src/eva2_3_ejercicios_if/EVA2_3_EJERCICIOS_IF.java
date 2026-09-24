/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double precio, subtotal, subdes;
        int cantidad;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Precio del Producto: ");
        precio = captu.nextDouble();
        System.out.println("Cantidad del Producto: ");
        cantidad = captu.nextInt();
        subtotal = (precio * cantidad);
        System.out.println("Subtotal: $" + subtotal);
        
        if(subtotal >= 1000){
            double des;
            des = (subtotal / 100) * 10;
            subdes = (subtotal - des);
            System.out.println("10% de Descuento: $" + des);
            System.out.println("Total: $" + subdes);
        }else{
            System.out.println("Descuento: $0");
            System.out.println("Total: $" + subtotal);
        }
     
    }
    
}
