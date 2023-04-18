/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author shas4605
 */
public class FicheroLecturaPrimitius {

    File fichero;
    FileInputStream fis;
    DataInputStream dis;

    public FicheroLecturaPrimitius(String ruta) throws FileNotFoundException {
        fichero = new File(ruta);
        fis = new FileInputStream(ruta);
        dis = new DataInputStream(fis);
    }

    public void cerrarFichero() throws IOException {
        dis.close();
    }

    public String dameNombre() {
        return fichero.getName();
    }

    public int leerInt() throws IOException {
        int x = dis.readInt();
        return x;
    }

    public double leerDouble() throws IOException {
        double x = dis.readDouble();
        return x;
    }

    public String leerString() throws IOException {
        String x = dis.readUTF();
        return x;
    }

    public String leerAlumneNom(ArrayList<Alumne> alumnes) throws IOException {
        String x = "";

        for (Alumne alumne : alumnes) {
            x = alumne.nom;
        }
        return x;

    }

    public int leerAlumneEdat(ArrayList<Alumne> alumnes) throws IOException {
        int x = 0;

        for (Alumne alumne : alumnes) {
            x = alumne.edat;
        }
        return x;

    }

}
