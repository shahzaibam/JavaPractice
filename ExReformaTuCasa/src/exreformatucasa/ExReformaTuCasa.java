/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exreformatucasa;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class ExReformaTuCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char resp  = 0;
        int anchura;
        int longitud;
        int espacioTotal = 0;
        
        
        while(!(resp  == 'N' || resp == 'n')) {
            
            System.out.println("Cuanta anchura tiene la habitacion?");
            anchura = sc.nextInt();
            
            System.out.println("Cuanta longitud tiene la habitacion");
            longitud = sc.nextInt();
            
            espacioTotal = espacioTotal + (longitud*anchura);
            
            System.out.println("Existe otra estancia? (S/N)");
            resp = sc.next().charAt(0);
        }
                
        System.out.println("El espacio total es de " + espacioTotal);
        
        
    }
    
}
