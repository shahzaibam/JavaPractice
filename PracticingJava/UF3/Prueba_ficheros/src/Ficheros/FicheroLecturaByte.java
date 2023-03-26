/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * clase para poder leer un fichero byte a byte
 * @author mabardaji
 */
public class FicheroLecturaByte {
    File fichero;
    FileInputStream fis;

    public FicheroLecturaByte(String ruta_archivo) throws FileNotFoundException {
        fichero = new File(ruta_archivo);
        fis = new FileInputStream(fichero);
    }
    
    
    /**
     * cierra fichero
     * @throws IOException cuando hay problemas con el fichero.
     */
    
    public void cerrarFichero() throws IOException
    {
        fis.close();
    }
    
     /**
     * retorna el nombre del fichero al que apunta
     * @return nombre fichero
     */
    public String dameNombreFichero()
    {
        return fichero.getName();
    }
    
    /**
     * eads a byte of data from this input stream. 
     * This method blocks if no input is yet available
     * @return entero que representa byte --> para mostrarlo como byte castearlo asi (byte)
     * @throws IOException problema lectura del fichero
     */
    public int leerByte() throws IOException
    {
        int x = fis.read();
        return x;
    }
    
}
