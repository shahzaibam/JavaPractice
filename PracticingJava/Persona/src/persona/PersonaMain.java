/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PersonaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe aqui el nombre");
        String nombre = sc.next();
        
        System.out.println("Escribe la edad");
        int edad = sc.nextInt();
        
        System.out.println("Escribe el sexo");
        char sexo = sc.next().charAt(0);
        
        System.out.println("Escribe tu pes");
        double peso = sc.nextDouble();
        
        System.out.println("Escribe tu altura");
        double altura = sc.nextDouble();
        
        Persona uno = new Persona(nombre, edad, sexo, peso, altura);
        
        uno.generaDNI();
        
        if(uno.esMayordeEdad()) {
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
        
        int IMC = uno.calcularIMC();
        
        System.out.println("Tu IMC es de " + IMC);
        
        System.out.println(uno);
    }
    
}
