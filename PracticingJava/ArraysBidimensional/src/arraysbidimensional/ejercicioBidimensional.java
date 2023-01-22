/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensional;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class ejercicioBidimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FILES = 4;
        int COLUM = 4;
        int filaAsumar = 0;
        int sumaDeFila = 0;

        int matriz[][] = new int[FILES][COLUM];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.println("Escribe la posicion " + filas + "-" + colum);
                matriz[filas][colum] = sc.nextInt();
            }
        }

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.print(matriz[filas][colum] + " ");
            }
            System.out.println("");
        }

        do {
            System.out.println("Que fila quieres sumar?");
            filaAsumar = sc.nextInt();
        }while(!(filaAsumar<matriz.length));
        
        
        for (int filas = 0; filas < filaAsumar; filas++) {
            sumaDeFila = sumaDeFila + matriz[filas][0];
        }
        
        System.out.println("Suma de la fila " + filaAsumar + " es " + sumaDeFila);
        
    }
}
