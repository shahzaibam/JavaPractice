/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class NumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random rand = new Random();
        
        int num =  rand.nextInt(100)+1;
        
        int numIntro = 0;
        
        int intentos = 10;
        
        
     
        while(!(intentos<=0 || num==numIntro) ) {
            System.out.println("Adivina el numero, tienes " +  intentos + " intentos");
            numIntro = sc.nextInt();
            
            if(numIntro > num) {
                System.out.println("El numero que has introducido es mayor");
            } else if(numIntro<num) {
                System.out.println("El numero que has introducido es menor");
            }else{
                System.out.println("Enhorabuena lo has adivinado");
            }

            System.out.println("******************************************");
            intentos--;
        }
        
        System.out.println("El numero es " + num);
    }
    
}
