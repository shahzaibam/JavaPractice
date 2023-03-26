/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase para leer un fichero caracter a caracter
 * En atributos contiene todas las clases necesarias para esta lectura
 * @author mabardaji
 */
public class FicheroLecturaCaracteres {

    File fichero;
    BufferedReader br;
    FileReader fr;    

    /**
     * prepara todos los objetos para que se pueda leer el fichero
     * @param ruta_fichero donde se ubica fichero
     * @throws FileNotFoundException el fichero no existe en esa ruta
     */
    public FicheroLecturaCaracteres(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
    }

    public FicheroLecturaCaracteres() {
    }
    
    /**
     * prepara todos los objetos para que se pueda leer el fichero
     * @param ruta  donde se ubica fichero
     */
    public void prepararFicherosLectura(String ruta_fichero) throws FileNotFoundException
    {
        fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);        
    }
    
    /**
     * The character read, as an integer in the range 0 to 65535 (0x00-0xffff), 
     * or -1 if the end of the stream has been reached
     * @return codigo ascii del caracter, si devuelve -1 es final de fichero
     */
    public int LeerCaracter() throws IOException
    {
        int codigo_ascii= br.read();
        return codigo_ascii;
    }
    
    /**
     * The character read, as an integer in the range 0 to 65535 (0x00-0xffff), 
     * or -1 if the end of the stream has been reached
     * @return codigo ascii del caracter, si devuelve -1 es final de fichero
     */
    public char LeerCaracterChar() throws IOException, FinFicheroException 
    {
        int codigo_ascii= br.read();
        if(codigo_ascii==-1)
        {
            throw new FinFicheroException(fichero.getName());
        }
        return (char) codigo_ascii;
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
     *
     * cierra el bufferedreader que apunta al fichero y lo libera
     
     * @throws IOException error lectura escritura fichero
     */
    public void cerrarFichero() throws IOException
    {
        br.close();
    }
}
