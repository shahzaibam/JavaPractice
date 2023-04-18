/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author shas4605
 */
public class FicheroEscrituraPrimitius {

    File fichero;
    FileOutputStream fos;
    DataOutputStream dos;

    /**
     * preparar el fichero para que apunte al fichero
     *
     * @param ruta es la ruta del fichero donde vamos a escribir
     * @throws FileNotFoundException excepcion si no encuentra la ruta
     */
    public FicheroEscrituraPrimitius(String ruta) throws FileNotFoundException {
        this.fichero = new File(ruta);
        fos = new FileOutputStream(ruta);
        this.dos = new DataOutputStream(fos);
    }

    public void cerrarFichero() throws IOException {
        dos.flush();
        dos.close();

        System.out.println("Fichero cerrado Ok");
    }

    public void escribirPrimitivosInt(int age) throws IOException {
        System.out.println("Escribiendo valor Entero");
        dos.writeInt(age);
    }

    public void escribirPrimitivosDouble(double salary) throws IOException {
        System.out.println("Escribiendo valor Double");
        dos.writeDouble(salary);
    }

    public void escribirPrimitivosString(String name) throws IOException {
        System.out.println("Escribiendo valor String");
        dos.writeUTF(name);
    }

    public void escribirPrimitivosAlumne(ArrayList<Alumne> alumnes) throws IOException {

        for (Alumne alumne : alumnes) {
            String nom = alumne.nom;
            int edat = alumne.edat;

            System.out.println("Escribiendo valores Alumne");
            dos.writeUTF(nom);
            dos.writeInt(edat);
        }

    }

    public String dameNombre() {
        return fichero.getName();
    }

}
