/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandobucles;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PracticandoBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        
        do{

            System.out.println("******MENU******");
            System.out.println("0-Salir");
            System.out.println("1-Escribir 10 veces");
            System.out.println("2-Cuentas atrás timbre");
            System.out.println("3-Numero pares entre 2 valores");
        
            System.out.println("Elije tu opcion:");
            opcion = sc.nextInt();
            
            if(opcion>3 || opcion<0) {
                System.out.println("Opcion no valida");
                opcion = 0;
            } else if(opcion == 0) {
                System.out.println("has salido");
            }else if(opcion == 1) {
                for(int i=1; i<= 10; i++) {
                    System.out.println(i + " A clase se viene a trabajar");
                }
            }else if(opcion == 2) {
                for(int i=10; i>=0; i--) {
                    System.out.print(i + " ");
                    
                }
                System.out.println(" RIIIIIIIING");
                
            }else {
                System.out.println("Escribe el primer numero");
                int num1 = sc.nextInt();
                
                System.out.println("Escribe el segundo numero");
                int num2 = sc.nextInt();
                

                
                while(!(num1>num2)) {
                    if(num1%2==0) {
                        System.out.println("el num " + num1 +  " es par");
                        
                    }
                    num1++;
                }
                
            }
            
            
        }while(!(opcion == 0));
        

        
        
    }
    
}
