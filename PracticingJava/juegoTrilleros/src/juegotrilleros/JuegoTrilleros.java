/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegotrilleros;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class JuegoTrilleros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char [] letra = new char [3];
        
        for (int i = 0; i < letra.length; i++) {
            letra[i] = 'X';
        }

        asignarO(letra);

        
//        for (int i = 0; i < letra.length; i++) {
//            System.out.println(letra[i]);
//        }
        
        cambiarPosiciones(letra);
        
        for (int i = 0; i < letra.length; i++) {
            System.out.println(letra[i]);
        }
        
        int pos = 0;
        
        do{
            System.out.println("dime en que posicion esta la pelota");
            pos = sc.nextInt();   
        }while(pos>3 || pos<0);
        
        if(letra[pos-1] == 'O') {
            System.out.println("Has acertado!!");
        }else{
            System.out.println("Muy mal, sigue intentando!!");
        }
        
        
        
        
        
    }
    
    public static void asignarO(char [] letra) {
        Random rd = new Random();
        
        
        letra[rd.nextInt(3)] = 'O';
    }
    
    public static void cambiarPosiciones(char [] letra) {
        
        Random rd = new Random();
        
        int primerVaso = rd.nextInt(3);
        int segundoVaso = rd.nextInt(3);
        
        while(!(primerVaso != segundoVaso)) {
            segundoVaso = rd.nextInt(3);
        }

        
        System.out.println("Valores intercambiados: A = " + primerVaso + "   B = " + segundoVaso);  

        
    }
    
    
}
