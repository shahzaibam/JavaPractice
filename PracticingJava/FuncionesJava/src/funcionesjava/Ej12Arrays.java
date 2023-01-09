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
public class Ej12Arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (i+1);
        }
        
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valores");
        System.out.println("c. Salir");
        char respuesta = sc.nextLine().charAt(0);

        
        while(!(respuesta == 'c')) {
            if(respuesta == 'a') {
                showArray(num);
            }else if(respuesta == 'b'){
                introducirArray(respuesta, respuesta, num);
            } 
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valores");
            System.out.println("c. Salir");
            respuesta = sc.nextLine().charAt(0);
        }
    }
    
    public static void showArray(int [] num) {
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
    
    public static int introducirArray(int valor, int posicion, int [] num) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que valor quieres introducir?");
        valor = sc.nextInt();
        
        System.out.println("En que posicion quieres introducir el valor");
        posicion = sc.nextInt();
        
        return num[posicion] = valor;
        
    }
    
    
}
