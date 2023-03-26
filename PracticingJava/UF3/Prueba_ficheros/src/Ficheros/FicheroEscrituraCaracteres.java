/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase para leer un fichero caracter a caracter
 * En atributos contiene todas las clases necesarias para esta lectura
 * @author mabardaji
 */
public class FicheroEscrituraCaracteres {
    
    File fichero;
    BufferedWriter bw;
    FileWriter fw;

    public FicheroEscrituraCaracteres(String ruta_fichero) throws IOException {
        fichero = new File(ruta_fichero);
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);  
    }
    
    /**
     * escribe un caracter en el fichero
     * @param letra que queremos escribir
     * @throws IOException si en el momento de escribir hay error fichero, se lanza esta exceo.
     */
    public void escribirCaracter(char letra) throws IOException
    {
        bw.write(letra);
    }
    /**
     * cierra el bufferedwriter que apunta al fichero y lo libera    
     * @throws IOException error lectura escritura fichero
     */
    public void cerrarFichero() throws IOException
    {
        bw.close();
    }
    
     /**
     * retorna el nombre del fichero al que apunta
     * @return nombre fichero
     */
    public String dameNombreFichero()
    {
        return fichero.getName();
    }
}
