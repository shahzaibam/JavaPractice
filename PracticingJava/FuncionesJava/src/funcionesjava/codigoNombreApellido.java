/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class codigoNombreApellido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] codigoNom = new char[9];
        
        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        
        System.out.println("Cual es tu primer Apellido");
        String apellido = sc.nextLine();
        
        System.out.println("Cual es tu segundo apellido");
        String apellidoDos = sc.nextLine();
        
        pasarAcodigo(codigoNom, nombre, apellido, apellidoDos);    
        
        for (int i = 0; i < codigoNom.length; i++) {
            System.out.print(codigoNom[i]);
        }
    }
    
    public static void pasarAcodigo(char[] codigoNom, String nombre, String apellido, String apellidoDos) {
        for (int i = 0; i <= 2; i++) {
            codigoNom[i] = nombre.charAt(i);
        }
        
        for (int i = 0; i <= 2; i++) {
            codigoNom[i+3] = apellido.charAt(i);
        }
        
        for (int i = 0; i <= 2; i++) {
            codigoNom[i+6] = apellidoDos.charAt(i);
        }
//        

//            codigoNom[3] = apellido.charAt(0);
//            codigoNom[4] = apellido.charAt(1);
//            codigoNom[5] = apellido.charAt(2);
    }
}
