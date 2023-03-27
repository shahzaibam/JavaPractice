/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] valores = new int[5];
      Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(1, 10);
        }
      
      Scanner sc = new Scanner(System.in);
      int pos=0;
      do{
        System.out.println("Pon la posicion array y "
                  + "mostrare valor");
        try
            {
            pos = sc.nextInt();
              if (pos>=0)
              {
                  System.out.println("Valor " + valores[pos]);
              }
            }
        catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("posicion no valida --> " + pos+
                "posiciones validas 0-" + (valores.length-1));
            }
      }while(pos>=0);
      
        System.out.println("fin"); 
      
    }
    
}
