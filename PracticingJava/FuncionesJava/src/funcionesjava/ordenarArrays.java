/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Random;
import java.util.Scanner;

/**
 ** Create 2 arrays of 5 positions, one is filled by the user and the other
 * with random values, * join the 2 in one array of 10 positions, order it from
 * smallest to largest and show all the arrays, all in functions.
 *
 * @author shebi
 */
public class ordenarArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        int[] finalArray = new int[10];

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println("Escribe el array " + (i + 1));
            arrayOne[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = rd.nextInt(200);
        }

        for (int i = 0; i < finalArray.length; i++) {
            if (!(i > 4)) {
                System.out.println(i + " in if ");
                finalArray[i] = arrayOne[i];

            } else {
                System.out.println(i + " in else ");
                finalArray[i] = arrayTwo[i - 5];
            }
        }

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + ", ");
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + ", ");
        }

        System.out.println("Final Array --------");

        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray.length - 1; j++) {

                if (finalArray[j] > finalArray[j + 1]) {
                    int aux = finalArray[j];
                    finalArray[j] = finalArray[j + 1];
                    finalArray[j + 1] = aux;
                }

            }
        }
        System.out.println("ORDENADO DE MENOR A MAYOR -----");

        for (int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }

    }

}
