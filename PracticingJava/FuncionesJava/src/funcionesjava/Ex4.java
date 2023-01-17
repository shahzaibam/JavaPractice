/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Random;
import java.util.Scanner;

/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno1”, “Alumno2”, etc.) y 5 asignaturas. Las notas se pondran de forma
 * aleatoria. Y luego el programa mostrará la nota mínima, máxima y media de
 * cada alumno.
 *
 * @author mabardaji
 */
public class Ex4 {

    public static void main(String[] args) {
        final int ALUMNOS = 4;
        final int NOTAS = 5;
        int[][] notas_alumnos = new int[ALUMNOS][NOTAS];

        Random rd = new Random();

        for (int files = 0; files < ALUMNOS; files++) {
            for (int colum = 0; colum < NOTAS; colum++) {
                notas_alumnos[files][colum] = rd.nextInt(10) + 1;
            }
        }

        for (int files = 0; files < ALUMNOS; files++) {
            for (int colum = 0; colum < NOTAS; colum++) {
                System.out.print(notas_alumnos[files][colum] + " - ");
            }
            System.out.println("");
        }

        int minima;
        int maxima;
        int mitjana;
        for (int i = 0; i < ALUMNOS; i++) { //files

            minima = notas_alumnos[i][0];
            maxima = notas_alumnos[i][4];
            mitjana = 0;
            int suma = 0;
            for (int j = 0; j < NOTAS; j++) { //columna per obtenir alumne
                if (minima > notas_alumnos[i][j]) {
                    minima = notas_alumnos[i][j];
                }

                if (maxima < notas_alumnos[i][j]) {
                    suma = notas_alumnos[i][j];
                }

                mitjana = mitjana + suma;
                System.out.println("mitjaaaana  = " + mitjana);

            }
            //aqui han acabat les notes del alummne i
            System.out.println("La nota minima de " + (i + 1) + " es " + minima);
            System.out.println("La nota MAXIMA de " + (i + 1) + " es " + maxima);
            System.out.println("La nota MITJANA de " + " es " + (mitjana / 20));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("De que alumno quieres saber la nota");
        int alum = sc.nextInt();

        System.out.println(notas_alumnos[0][0]);
        mostrarDatosAlumno(notas_alumnos, alum);

    }

    /**
     * Funcion que nos da las notas minimas y maximas de un alumno en concreto
     *
     * @param notas_alumnos tablas de notas
     * @param alum alumno escogido.
     */
    private static void mostrarDatosAlumno(int[][] notas_alumnos, int alum) {

        int minima = 0;
        for (int files = 0; files < notas_alumnos.length; files++) {
            for (int colum = 0; colum < notas_alumnos[alum].length; colum++) {
                System.out.print(notas_alumnos[alum][colum] + " - ");

                if (minima > notas_alumnos[alum][colum]) {
                    minima = notas_alumnos[alum][colum];
                }

            }
            System.out.println("el minimo del alumno " + alum + " es " + minima);
        }

    }
}
