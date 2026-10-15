/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_ACCESO {
    static final String USUARIO = "admin";
    static final String PWD = "admin";
    //cuando no jale el == usa equals we
    
    public static void main(String[] args) {
        String usuario, pwd;
        Scanner captu = new Scanner(System.in);
        System.out.print("Usuario:");
        usuario = captu.nextLine();
        System.out.print("Contraseña:");
        pwd = captu.nextLine();
        
        if(usuario.equals(USUARIO) && pwd.equals(PWD)){
            System.out.print("ACCESO CONCEDIDO");
        }else{
            System.out.print("ACCESO DENEGADO");
        }
            
    }
    
}
