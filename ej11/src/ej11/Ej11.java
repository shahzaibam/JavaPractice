/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

/**
 *
 * @author shebi
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        int sumapares = 0;
        int sumaimpares = 0;
        
        for (contador = 100; contador <= 200; contador++) {
            if(contador%2 == 0) {
                sumapares = sumapares + contador;
//                System.out.println("Suma Par de " + sumapares);
            }else {
                sumaimpares = sumaimpares + contador;
//                System.out.println("Suma Impar **********" + sumaimpares);
            }
        }
        
        System.out.println("La suma de numeros pares es " + sumapares);
        System.out.println("La suma de numeros impares es " + sumaimpares);
        
    }
    
}
