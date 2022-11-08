/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i =1;
        
        while(i<=6) {
            int jugador = tirada_jugador();
//          System.out.println(jugador);
        
            int ordenador = tirada_ordenador();
//          System.out.println(ordenador);
        

        
            imp_jugada(jugador,ordenador);
        
            int resultado = ganador(jugador, ordenador);
        

            imp_ganador(resultado);  

//            marcador(resultado);
            i++;
            
        }
        

        


    }
    
        
    public static int tirada_jugador() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("Escribe un numero, 0.Piedra, 1.Papel, 2.Tijeras");
            num = sc.nextInt();
        }while(!(num<3 || num<=0));

        return num;
    }
    
    public static int tirada_ordenador() {
        Random rd = new Random();
        
        System.out.println("Ya lo tengo elegido!");
        int numTiradaOrdenador = rd.nextInt(3);
        return numTiradaOrdenador;
    }
    

    
    public static void imp_jugada(int jugador, int ordenador) {
        switch (jugador) {
            case 0:
                System.out.print("Piedra (0)");
                break;
            case 1: 
                System.out.print("Papel (1)");
                break;
            case 2:
                System.out.print("Tijera (2)");
                break;
        }
        
        System.out.print(" Y....");
        
        switch (ordenador) {
            case 0:
                System.out.println(" Piedra (0)");
                break;
            case 1:
                System.out.println(" Papel (1)");
                break;
            case 2:
                System.out.println(" Tijera (2)");
                break;
        }
        
        
    }
         
    public static int ganador(int jugador, int ordenador) {
        int ganador = 0;
        if(jugador==0 && ordenador == 0) {
            ganador = 0;
        }else if(jugador==0 && ordenador == 1){
            ganador = 2;
        }else if(jugador==0 && ordenador == 2){
            ganador = 1;
        }else if(jugador == 1 && ordenador == 0) {
            ganador = 1;
        }else if(jugador == 1 && ordenador == 1){
            ganador = 0;
        }else if(jugador == 1 && ordenador == 2) {
            ganador = 2;
        }else if(jugador == 2 && ordenador == 0) {
            ganador = 2;
        }else if(jugador == 2 && ordenador == 1){
            ganador = 1;
        }else if(jugador == 2 && ordenador == 2) {
            ganador = 0;
        }
        return ganador;
    }
    
    public static void imp_ganador(int resultado) {

        if(resultado == 0) {
            System.out.println("Habeis quedado empate --> " +  resultado);
        }else if(resultado == 1) {
            System.out.println("Ha ganado el jugador --> " + resultado);
        }else {
            System.out.println("Ha ganado el ordenador --> " + resultado);
        }      
    }
    
    
    
//    public static void marcador(int resultado) {
//        
//        int puntosJugador = 0;
//        int puntosOrdenador = 0;
//        int empates = 0;
//
//        while(puntosJugador<=3 || puntosOrdenador<=3) {
//            if(resultado==1){
//                puntosJugador++;
//            }else if(resultado==2) {
//                puntosOrdenador++;
//            }else if(resultado == 0){
//                empates++;
//            }
//        }
//
//        
//        if(puntosJugador>puntosOrdenador) {
//            System.out.println("El ganador es el jugador con Jugador: " + puntosJugador + " Ordenador: " + puntosOrdenador );
//        }else if(puntosJugador<puntosOrdenador) {
//            System.out.println("El ganador es el ordenador con Jugador: " + puntosJugador + " Ordenador: " + puntosOrdenador );
//        }else{
//            System.out.println("Empate!!! Jugador: " + puntosJugador + " Ordenador: " + puntosOrdenador);
//        }        
//    }
}
