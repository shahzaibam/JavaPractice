/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tu nota");
        double num1 = sc.nextDouble();
        
        if(num1<3){
            System.out.println("Muy deficiente");
        }else if(num1==3 || num1<5){
            System.out.println("Insuficiente");
        }else if(num1==5 || num1<6){
            System.out.println("Bien");
        }else if(num1==6 || num1<9){
            System.out.println("Notable");
        }else if(num1==9 || num1<=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("escribe una nota valida");
        }
        
        
        
        
        
    }
    
}
