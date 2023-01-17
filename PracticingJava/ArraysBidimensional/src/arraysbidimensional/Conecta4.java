/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class Conecta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FILAS = 6;
        final int COLUMNAS = 7;
        int inicio = 0;
        
        int [][] tablero = new int[FILAS][COLUMNAS];
        
        String nombre1, nombre2;
        //pedir nombre
        String frase = "Escribe el nombre del jugador 1";
        nombre1 = pedirNom(frase);
        
        frase = "Escribe el nombre del jugador 2";
        nombre2 = pedirNom(frase);
        
        //inicialitzar tablero -- > no lo inicalizo porque ya esta a 0
        
        //triar inici
        inicio = triarInici();
        System.out.println("el inicio lo hará " + inicio);
        
        mostrarTauler(tablero);
//        FitxaVisual(tablero, FILAS, COLUMNAS);
        
    }
    
    /**
     * pedir el nombre del jugador y devolverlo
    */
    public static String pedirNom(String frase) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        nombre = sc.next();
        
        return nombre;
    }
    
    
    /**
     * retornar el valor del jugador que comença
     * @return 1 si comença el jugador 1 i 2 si comença el jugador 2
    */
    public static int triarInici() {
        Random rd = new Random();
        
        int comenzar = rd.nextInt(2)+1;
        
        return comenzar;
    }
    
    
    /**
     * muestra el tablero
     * mostrando separadas las filas
     * @param tablero 
     */
    public static void mostrarTauler(int[][] tablero) {
        for (int filas = 0; filas < tablero.length; filas++) {
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                System.out.print(tablero[filas][columnas] + " - ");
            }
            System.out.println("");
        }
    }
    
    
    /**
     * retornarà char ‘-’ si el valor es 0, 
     * ‘X’ si el valor és un 1, 
     * ‘O’ si és un 2
     * @param tablero
     * @param fila
     * @param columna
     * @return 
     */
    public static String FitxaVisual(int[][] tablero, int fila, int columna) {
        if(tablero[fila][columna] == 0) {
            return "-";
        }
        
        if(tablero[fila][columna] == 1) {
            return "X";
        }
        
        if(tablero[fila][columna] == 2) {
            return "O";
        }

        return "";
        
    }
    
    
    
    /**
     * Tirada,rebra tablero i 
     * rebrà la columna a la que es col·loca la fitxa, i de quin jugador és la fitxa. 
     * La fitxa es col·locara seguint les lleis de gravetat , 
     * a la fila més baixa on es pugui col·locar 
     * (Ajuda: S’hauria de començar per la fila de més abaix 
     * i anar pujant fins trobar la primera buida on la col·loques, o has pujat fins a dalt.)
V 2.0: Si no hi ha lloc a la columna una millora és que tornes a demanar columna on tirar.
     * @param tablero
     * @param columna
     * @param turno 
     */
    public static void Tirada(int [][]tablero, int columna, int turno) {
        /* porisico fixa es la columna */
        boolean trobat = false;
        for (int fila = tablero.length-1; fila >= 0; fila--) {
            if(tablero[fila][columna] == 0 && !trobat){
                tablero[fila][columna] = turno;
                
                trobat = true;
                /*break*/
            }
        }
    }
    
    /**
     * si trobem un cero no estara ple, sino en trobem cap 
     * return true(ple), false(buit)
     * @param tablero
     * @return 
     */
    public static boolean ple(int [][]tablero) {
        return false;
    }
}
