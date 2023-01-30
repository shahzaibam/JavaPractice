/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class MainPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona uno;
        Persona dos;

        //pedir por teclado datos para informarlos
        //scanner
        System.out.println("Escribe el DNI");
        String DNI = sc.next();

        System.out.println("Escribe el nombre");
        String nombre = sc.next();

        System.out.println("Escribe el apellido");
        String apellidos = sc.next();

        System.out.println("Escribe la edad");
        int edad = sc.nextInt();

        uno = new Persona(DNI, nombre, apellidos, edad);

        uno.imprime();

        System.out.println("");
        System.out.println("Persona dos");
        System.out.println("");
        dos = new Persona("26614385");
        dos.setNombre("Sara");
        dos.setApellidos("Asghar");
        dos.setEdad(23);
        dos.imprime();

        if (uno.isMayorEdad()) {
            System.out.print(uno.getNombre() + " " + uno.getApellidos() + ", "
                    + uno.getDNI() + " es mayor de edad");
            if (uno.esJubilado()) {
                System.out.print( " es jubilado");
                System.out.println("");
            }
        } else {
            
            System.out.println(uno.getNombre() + " " + uno.getApellidos() + ", "
                    + uno.getDNI() + " es menor de edad");
        }

        if (dos.isMayorEdad()) {
            System.out.println("");
            System.out.println(dos.getNombre() + " " + dos.getApellidos() + ", "
                    + dos.getDNI() + " es mayor de edad");
            if (dos.esJubilado()) {
                System.out.print(dos.getNombre() + " " + dos.getApellidos() + ", "
                        + dos.getDNI() + " es jubilado");
            }
        } else {
            System.out.println("");
            System.out.println(dos.getNombre() + " " + dos.getApellidos() + ", "
                    + dos.getDNI() + " es menor de edad");
        }
        
        int diferencia = dos.diferenciaEdad(uno);
        
        System.out.println("la diferencia de edad es " + diferencia);

    }
}
