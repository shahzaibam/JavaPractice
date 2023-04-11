/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosuf3;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shebi
 */
public class EjerciciosUF3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un dato");
        String dato = sc.nextLine();
        
        try {
            EscrituraPorTeclado ficheroCharEscribir = new EscrituraPorTeclado("datos\\char.txt");
            
            ficheroCharEscribir.escribirCaracter(dato);
            
            ficheroCharEscribir.cerrarFichero();
        
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        
        
        
    }
    
}
