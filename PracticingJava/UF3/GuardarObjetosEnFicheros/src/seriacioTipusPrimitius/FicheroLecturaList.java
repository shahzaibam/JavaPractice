/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriacioTipusPrimitius;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author shebi
 */
public class FicheroLecturaList {

    File fichero;
    FileInputStream fis;
    DataInputStream dis;

    public FicheroLecturaList(String ruta) throws FileNotFoundException {
        fichero = new File(ruta);
        fis = new FileInputStream(fichero);
        dis = new DataInputStream(fis);
    }

    public void cerrarFichero() throws IOException {
        dis.close();
    }

    public String dameNombre() {
        return fichero.getName();
    }
    
    public double leerDouble() throws IOException {
        double x = dis.readDouble();
        return x;
    }
    
    public int hayValor() throws IOException {
        return dis.available();
    }

}
