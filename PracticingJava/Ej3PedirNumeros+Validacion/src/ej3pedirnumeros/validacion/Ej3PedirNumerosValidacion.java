/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3pedirnumeros.validacion;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ej3PedirNumerosValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos numeros vas a escribir?");
        int numEscribir = sc.nextInt();
        
        int numMayorCero = 0;
        int numMenorCero = 0;
        int numIgualCero = 0;
        
        for(int i = 1; i<= numEscribir; i++){
            System.out.println("Escribe un numero");
            int num = sc.nextInt();
            
            if(num>0) {
                numMayorCero++;
            }else if(num<0) {
                numMenorCero++;
            }else{
                numIgualCero++;
            }
            
        }
        
        System.out.println("En total has insertado " + numEscribir);
        
        System.out.println("En total hay " + numMayorCero + " numeros mayores que cero");
        
        System.out.println("En total hay " + numMenorCero + " numeros menores que cero");
        
        System.out.println("En total hay " + numIgualCero + " numeros iguales que cero");
    }
    
}
