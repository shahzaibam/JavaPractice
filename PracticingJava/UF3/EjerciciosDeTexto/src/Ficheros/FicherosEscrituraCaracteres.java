/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shebi
 */
public class FicherosEscrituraCaracteres {

    File fichero;
    FileWriter fw;
    BufferedWriter bw;

    public FicherosEscrituraCaracteres(String ruta) throws IOException {
        fichero = new File(ruta);
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);
    }
    
    public void escribirCaracter(char letra) throws IOException {
        bw.write(letra);
    }
    
    public void cerrarFichero() throws IOException {
        bw.close();
    }

    
    public void getFileName() {
        fichero.getName();
    }
    
}
