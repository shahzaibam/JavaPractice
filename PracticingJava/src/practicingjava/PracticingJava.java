/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicingjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PracticingJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu usuario");
        String usuario = new Scanner(System.in).next();
        System.out.println("Escribe tu contraseña");
        String passwd = new Scanner(System.in).next();
        
        //System.out.println("es " + usuario + " " + passwd);
        
        if("shebi".equals(usuario) && "shebi321".equals(passwd)){
            System.out.println("Bienvenido a tu sesión Sr " + usuario);
        }else {
            System.out.println("Está incorrecto");
        }
        
        for(int i = 1; i<11; i++){
            System.out.println(i + ". Correcto");
        }
        
    }
    
}
