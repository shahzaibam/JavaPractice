/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Scanner;

/**
 *Pedir 10 numeros al usuario y ordenarlos de mayor a menor
 * @author shebi
 */
public class OrdenarMayorAmenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
 
        introducirArrays(numeros);
        ordenarArrays(numeros);
        
        System.out.println("----------------");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void introducirArrays(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el array " + (i+1));
            numeros[i] = sc.nextInt();
        }
    }
    
    public static void ordenarArrays(int[] numeros) {
        for (int i = 0; i > numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if(numeros[j] > numeros[j+1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }
}
