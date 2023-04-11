/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosuf3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shebi
 */
public class EscrituraPorTeclado {

    File fichero;
    BufferedWriter bw;
    FileWriter fw;

    public EscrituraPorTeclado(String ruta_fichero) throws IOException {
        fichero = new File(ruta_fichero);
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);
    }

    public void escribirCaracter(String letra) throws IOException {
        bw.write(letra);
    }

    public void cerrarFichero() throws IOException {
        bw.close();
    }

}
