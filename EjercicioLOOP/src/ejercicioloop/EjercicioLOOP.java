/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioloop;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class EjercicioLOOP {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num1;

        int contador_positivos = 0;
        int contador_negativos = 0;
        
        do{
            System.out.println("Escribe el primer número");
            num1 = sc.nextInt();

            
            
            if(num1>0) {
                contador_positivos++;
            }else if(num1<0){
                contador_negativos++;
            }
            
//            if(num2>0) {
//                contador_positivos++;
//            }else{
//                contador_negativos++;
//            }
//            
//            if(num3>0) {
//                contador_positivos++;
//            }else {
//                contador_negativos++;
//            }
            
            
        }while(!(num1==0));
        System.out.println("Contador positivo es " + contador_positivos);
        System.out.println("Contador negativo es " + contador_negativos);
    }
    
}
