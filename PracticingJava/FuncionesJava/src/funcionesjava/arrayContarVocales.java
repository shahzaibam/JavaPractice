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
public class arrayContarVocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vocales = new int[5];

        System.out.println("Escribe vocales, para ver cuantos has esctrito");
        String vocal = sc.nextLine().toUpperCase();

        contadorVocales(vocal, vocales);

        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }

    }

    public static void contadorVocales(String vocal, int[] vocales) {

        for (int i = 0; i < vocal.length(); i++) {
            if (vocal.charAt(i) == 'A') {
                vocales[0] = vocales[0] + 1;
            } 
            
            if (vocal.charAt(i) == 'E') {
                vocales[1] = vocales[1] + 1;
            } 
            
            if (vocal.charAt(i) == 'I') {
                vocales[2] = vocales[2] + 1;
            }
            
            if (vocal.charAt(i) == 'O') {
                vocales[3] = vocales[3] + 1;
            }
            
            if (vocal.charAt(i) == 'U') {
                vocales[4] = vocales[4] + 1;
            }
        }

    }

}
