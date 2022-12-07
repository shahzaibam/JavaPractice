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
public class HeadBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] premios = new int[4];

        llenarArray(premios);
        aleatoriPos(premios);
        mostrarArray(premios);
        int posicion = 0;

        do {
            System.out.println("Que posicion quieres elegir?");
            posicion = sc.nextInt();
        } while (posicion > 4 || posicion < 1);

        int premio = premio(premios, posicion);

        System.out.println("Tu premio es " + premio);

        System.out.println("Quieres seguir jugando? SI/NO");
        char seguirJugando = sc.nextLine().charAt(0);
        
        System.out.println(seguirJugando);

    }

    public static void llenarArray(int[] premios) {
        Random rd = new Random();

        for (int i = 0; i < premios.length; i++) {
            premios[i] = rd.nextInt(20) + 1;
        }

//        for (int i = 0; i < premios.length; i++) {
//            System.out.println(premios[i]);
//        }
    }

    public static void aleatoriPos(int[] premios) {
        Random rd = new Random();

        premios[rd.nextInt(4)] = -1;

    }

    public static void mostrarArray(int[] premios) {
        for (int i = 0; i < premios.length; i++) {
            System.out.println(premios[i]);
        }
    }

    public static int premio(int[] premios, int posicion) {
        int premio = premios[posicion - 1];

        return premio;
    }

}
