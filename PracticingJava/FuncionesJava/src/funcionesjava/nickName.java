/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class nickName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Escribe tu nombre");

        String nombre = sc.next();

        String respuesta = "";
        do {
            System.out.println("Quieres delante o detras?");
            respuesta = sc.next();
        } while (!(respuesta.equalsIgnoreCase("delante") || respuesta.equalsIgnoreCase("detras")));
    
        
        int[] hola = new int[5];
        
        for (int i = 0; i < hola.length; i++) {
            hola[i] = rd.nextInt(5);
        }
        
        for (int i = 0; i < hola.length; i++) {
            System.out.println(hola[i]);
        }
        
        
        
        nickname(nombre, respuesta, hola);

    
    }

    public static void nickname(String nombre, String respuesta, int[] hola) {
        char[] nickname = new char[4];
        if(respuesta.equalsIgnoreCase("delante")) {
            for (int i = 0; i < 4; i++) {
                nickname[i] = nombre.charAt(i);
            }
        }else if(respuesta.equalsIgnoreCase("detras")) {
            for (int i = 0; i < nombre.length(); i++) {
                System.out.print(nombre.charAt(nombre.length()-i));
//                System.out.println("nombree " +  hola[nombre.length()-i]);
            }
        }
        
        for (int i = 0; i < nickname.length; i++) {
            System.out.println(nickname[i]);
        }
        
    }
}
