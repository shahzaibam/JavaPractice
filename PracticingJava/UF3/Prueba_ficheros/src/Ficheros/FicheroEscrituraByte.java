/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class FicheroEscrituraByte {
    File fichero;
    FileOutputStream fos;

    public FicheroEscrituraByte(String ruta_archivo) throws FileNotFoundException {
        fichero = new File(ruta_archivo);
        fos = new FileOutputStream(fichero);
    }
    
    
    public void cerrarFichero() throws IOException
    {
        fos.close();
    }

     /**
     * retorna el nombre del fichero al que apunta
     * @return nombre fichero
     */
    public String dameNombreFichero()
    {
        return fichero.getName();
    }
    
    public void escribirByte(byte escribir) throws IOException
    {
        fos.write(escribir);
        fos.flush();
    }
    
    public void escribirIntByte(int escribir) throws IOException
    {
        
        fos.write((byte)escribir);
        fos.flush();
    }
    
}
