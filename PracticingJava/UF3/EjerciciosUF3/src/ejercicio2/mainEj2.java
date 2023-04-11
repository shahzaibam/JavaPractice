/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shebi
 */
public class mainEj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo");
        String nombreArchivo = sc.nextLine();
        
        try {
            CrearFicheroNombreDesdeTeclado fichero = new CrearFicheroNombreDesdeTeclado(nombreArchivo);
            
            String frase = "hola soy el nuevo";
            
            fichero.escribirTexto(frase);
            
            fichero.cerrarFichero();
            
        } catch (IOException ex) {
            System.out.println("Input/Output error " + ex.getMessage());
        }
    }
}
