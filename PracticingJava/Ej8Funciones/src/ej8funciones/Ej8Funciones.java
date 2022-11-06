/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8funciones;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ej8Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        
        int suma = suma1aN(n);
        int prod = prod1aN(n);
        
        System.out.println("La suma es de " + suma);
        System.out.println("El producto es de " + prod);
    }
    
    
    public static int suma1aN(int n){
        int suma = 0;
        
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        
        return suma;
    }
    
    public static int prod1aN(int n){
        int prod = 1;
        
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        
        return prod;
    }
    
    
    
}
