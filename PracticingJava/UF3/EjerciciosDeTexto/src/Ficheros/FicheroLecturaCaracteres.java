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
 *
 * @author shebi
 */
public class FicheroLecturaCaracteres {

    File fichero;
    FileReader fr;
    BufferedReader br;

    public FicheroLecturaCaracteres(String ruta) throws FileNotFoundException {
        fichero = new File(ruta);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
    }
    
    public char leerFichero() throws IOException, Exception {
        int codigo_ascii = br.read();
        
        if(codigo_ascii==-1) {
            throw new Exception("se acabo el fichero");
        }
        
        return (char) codigo_ascii;
    }
    
    public int leerFicheroInt() throws IOException {
        int codigo_ascii = br.read();
        
        return codigo_ascii;
    }
    
    public void cerrarFichero() throws IOException {
        br.close();
    }
    
    public void getFicheroName() {
        fichero.getName();
    }

}
