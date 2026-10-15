/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author Usuario
 */
public class EVA2_13_EXPRESIONES_BOOLEANAS {

    //and = Y = &&
    //or = o = ||
    //not = negacion = !
   
   public static void main(String[] args) {
      boolean entrarAntro, credencial = false;
      int edad = 18;
      
      entrarAntro = (edad >= 18) && (credencial == true);
      System.out.println("Puedes Entrar" + entrarAntro);
      
      boolean sol = false, dinero = false;
      boolean permiso;
      
      permiso = (sol == true) ||(dinero == true);
      System.out.println("Puedes Salir" + permiso);
   }
   
}
