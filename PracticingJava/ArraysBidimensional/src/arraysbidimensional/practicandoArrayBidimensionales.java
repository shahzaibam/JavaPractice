/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class practicandoArrayBidimensionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //***********llenar un 3x3 del 1 al 9
//        int FILAS = 3;
//        int COLUM = 3;
//
//        int matriz[][] = new int[FILAS][COLUM];
//
//        for(int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[0].length;j++){
//                matriz[i][j]=(i*matriz.length)+(j+1);
//                System.out.print(matriz[i][j]+" ");
//                 
//            }
//            System.out.println("");
//        }

        //****2) Crear una matriz de 5 filas y n columnas (se pide al usuario). 
        //****Rellenarlo con números aleatorios entre 0 y 10.
//        int FILAS = 5;
//        int COLUM = 0;
//        
//        do{
//            System.out.println("cuantas columnas quieres?");
//            COLUM = sc.nextInt();
//        }while(!(COLUM>1 && COLUM<10));
//        
//        int matriz[][] = new int[FILAS][COLUM];
//        
//        for (int filas = 0; filas < matriz.length; filas++) {
//            for (int colum = 0; colum < matriz[0].length; colum++) {
//                matriz[filas][colum] = rd.nextInt(10);
//                
//                System.out.print(matriz[filas][colum] + " - ");
//                
//            }
//            System.out.println("");
//        }
        //*****3) Crear dos matrices de nxn y sumar sus valores, 
        //*****los resultados se deben almacenar en otra matriz. Los valores y la longitud, 
        //*****seran insertados por el usuario. Mostrar las matrices originales y el resultado.
        int FILAS = 0;
        int COLUM = 0;
        int suma = 0;

        do {
            System.out.println("Escribe las filas");
            FILAS = sc.nextInt();

            System.out.println("Escribe las colum");
            COLUM = sc.nextInt();
        } while (!(FILAS > 0 && FILAS < 10) && !(COLUM > 0 && COLUM < 10));

        int matriz[][] = new int[FILAS][COLUM];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.println("Escribe el valor de " + matriz[filas][colum]);

                matriz[filas][colum] = sc.nextInt();

            }
        }

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.print(matriz[filas][colum] + " ");
            }
            System.out.println("");
        }

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.print(matriz[filas][colum]);
                suma = suma + matriz[filas][colum];

//                int he = matriz[filas].length;
//                System.out.println("he soy he" + he);
            }

            System.out.println("");
        }

        System.out.println("La suma total de todo eeees " + suma);

        System.out.println("mostrando las filas alreveeeeeeesssssss----------------");

        for (int filas = matriz.length - 1; filas > -1; filas--) {
            System.out.println(matriz[filas][0] + " eeeeepa tammoh alreve");
        }

        System.out.println("mostrando las columnas alreveeeeeeesssssss----------------");

        for (int colum = matriz.length - 1; colum > -1; colum--) {
            System.out.println(matriz[0][colum] + " eeeeepa tammoh alreve");
        }

        System.out.println("todo al reves mostrando ********************************+");

        for (int filas = matriz.length - 1; filas > -1; filas--) {
            for (int colum = matriz.length - 1; colum > -1; colum--) {
                System.out.print(matriz[filas][colum] + " taaaaaaamoh al reveee ");
            }
            System.out.println("");
        }

        System.out.println("recorrrieeendo solo filas sin tocar colluuuuuuumnas");

        for (int filas = matriz.length - 1; filas > -1; filas--) {
            for (int colum = 0; colum < matriz[0].length; colum++) {
                System.out.print(matriz[filas][colum] + " taaaaaaamoh al reveee ");
            }
            System.out.println("");
        }
    }

}
