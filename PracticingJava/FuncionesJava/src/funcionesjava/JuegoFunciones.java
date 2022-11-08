/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class JuegoFunciones {
    public static void main(String[] args) {
        
        int saldo = 100;
        int num_apostado;
        int bola;
        boolean resultado; 
        int dinero_apostado;
        int dinero_ganado;
        char respuestaSeguir;
        
        do{
        num_apostado = pedirNumero();
        dinero_apostado = pedirDineroApuesta(saldo);
        
        saldo = saldo - dinero_apostado;
        System.out.println("Saldo " + saldo);
        
        bola = caidaBola();
        pintaAsteriscos(bola);        
//        System.out.println(bola  + " es el numero de la maquina ");

        resultado = comprobarResultados(bola, num_apostado);
      
        if(resultado) {
            System.out.println("Has ganado");
            dinero_ganado = ganancias(dinero_apostado, num_apostado);
            saldo = saldo + dinero_ganado;
        }else{
            System.out.println("Has perdido");
        }
 
        respuestaSeguir = seguirJugando();
        
        }while(continuarJugando(respuestaSeguir, saldo));

        System.out.println("Tu saldo es " + saldo);
    }
    
    //Funcion para pedir el numero al usuario
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        
        int numEscogido;
        
        do{
            System.out.println("Elige un numero del 1 al 38, 37 es par y 38 impar");
            numEscogido = sc.nextInt();
        }while(numEscogido < 1 || numEscogido>38);
        
        return numEscogido;
        
    }
    
    //Funcion para asignar un numero aleatorio a la maquina del 0 al 36
    public static int caidaBola() {
        Random rd = new Random();
        
        int bola = rd.nextInt(37);
        
        return bola;
    }
    
    //Funcion para añadir los asteriscos segun el numero de la bola
    public static void pintaAsteriscos(int num) {
        for(int i = 1; i<=num; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
        System.out.println("El numero de ateriscos es " + num);
    }
    
    //Funcion para pedir el dinero que se quiere apostar
    public static int pedirDineroApuesta(int saldo) {
        
        Scanner sc = new Scanner(System.in);
        int dineroApostar = 0;
        
        do{
            System.out.println("Cuanto dinero quieres apostar ? Tienes " + saldo + " dinero");
            dineroApostar = sc.nextInt();
        }while(dineroApostar>saldo || dineroApostar<1);
        
        return dineroApostar;
    }
    
    //Comprobamos los resultados segun el numero de la bola y el numero apostado
    public static boolean comprobarResultados(int bola, int num_apostado) {
        
        boolean win = false;
        
        if(bola == num_apostado) {
            win = true;
        }else if(bola%3 == 1 && num_apostado == 37) {
            win = true;
        }else if(bola%2 == 0 && num_apostado == 38) {
            win = true;
        }
        
        return win;
    }
    
    //Funcion para calcular las ganancias
    public static int ganancias (int dinero_apostado, int num_apostado) {
        
        int calculo_ganancias = 0;
        
        if(num_apostado>=1 && num_apostado>=36) {
            calculo_ganancias = dinero_apostado * 35;
        }else if(num_apostado==37 || num_apostado == 38) {
            calculo_ganancias = dinero_apostado * 2;
        }
        
        return calculo_ganancias;
    }
    
    //Preguntamos si se quiere seguir jugando
    public static char seguirJugando() {
        Scanner sc = new Scanner(System.in);
        char respuestaSeguir;
        
        
        do{
            System.out.println("Quieres seguir jugando?");
            respuestaSeguir = sc.nextLine().charAt(0);
        }while(!(respuestaSeguir == 'S' || respuestaSeguir == 'N' || respuestaSeguir == 's' || respuestaSeguir == 'n'));
    
        return respuestaSeguir;
    }
    
    //Funcion para ver si el usuario puede seguir jugando segun el dinero que tiene.
    public static boolean continuarJugando​(char respuesta, int saldo) {
        boolean puedeSeguir = false;
        
        if((respuesta == 's' || respuesta == 'S') && saldo > 0) {
            puedeSeguir = true;
        }
        
        return puedeSeguir;
    }

    
}
