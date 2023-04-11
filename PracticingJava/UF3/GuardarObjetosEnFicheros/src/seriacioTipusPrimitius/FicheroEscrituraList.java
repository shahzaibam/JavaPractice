/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriacioTipusPrimitius;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author shebi
 */
public class FicheroEscrituraList {

    File fichero;
    FileOutputStream fos;
    DataOutputStream dos;

    public FicheroEscrituraList(String ruta) throws FileNotFoundException {
        fichero = new File(ruta);
        fos = new FileOutputStream(fichero);
        dos = new DataOutputStream(fos);
    }

    public void cerrarFichero() throws IOException {
        dos.flush();
        dos.close();

        System.out.println("Fichero cerrado Ok");
    }

    public void escribirPrimitivosDouble(double num) throws IOException {
        System.out.println("Escribiendo valor Double");
        dos.writeDouble(num);
    }
    
    public String dameNombre() {
        return fichero.getName();
    }

}
