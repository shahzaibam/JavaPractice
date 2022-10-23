/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaciondivisiblespor3;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class ValidacionDivisiblespor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 
        int num1;

        int contadorNum = 0;
        int contadordivTres = 0;
        
        int sumaContadorDivTres = 0;
        
        do{
            System.out.println("Escribe un numero");
            num1 = sc.nextInt();
            contadorNum++;
            if(num1%3==0) {
                contadordivTres++;
                sumaContadorDivTres = sumaContadorDivTres + num1;
            }
        }
        while(!(contadordivTres==3));
        
        System.out.println("En total has insertado " + contadorNum);
        System.out.println("Has conseguido " + contadordivTres + " numeros divisibles entre tres");
        System.out.println("La suma de los numeros divisibles entre tres es de " + sumaContadorDivTres);
        
    }
    
}
