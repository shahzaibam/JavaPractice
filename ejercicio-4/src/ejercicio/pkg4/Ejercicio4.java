/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce el primer número");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = new Scanner(System.in).nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma es de " + suma);
        
        int resta = num1 - num2;
        System.out.println("La resta es de " + resta);
        
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es de " + multiplicacion);
        
        if(num2 == 0){
            System.out.println("No se puede hacer esta division");
        }else {
            int division = num1/num2;
            System.out.println("La division es de " + division);   
        }
        
        
    }
    
}
