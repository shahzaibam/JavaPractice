/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero");
        double num1 = sc.nextDouble();
        
        System.out.println("Escribe el segundo numero");
        double num2 = sc.nextDouble();
        
        System.out.println("Escribe el tercer numero");
        double num3 = sc.nextDouble();
        
        if(num1>num2){
            if(num1>num3){
                System.out.println("el mayor es " + num1);
            }
        }else if(num2>num1){
            if(num2>num3){
                System.out.println("el mayor es " + num2);
            }
        }else if(num3>num1) {
            if(num3>num2){
                System.out.println("el mayor es " + num3);
            }
        }else{
            System.out.println("todos los numeros son iguales");
        }
    }
    
}
