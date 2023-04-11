/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Programa que demana el nom del fitxer al usuario(no existeix), i el crea amb
 * la frase "Fitxer nou" (<--La ffrase la fiqueu amb un String, i recorrer el
 * string amb el charAt()) a dins. @author shebi
 */
public class CrearFicheroNombreDesdeTeclado {

    File fichero;
    FileWriter fw;
    

    public CrearFicheroNombreDesdeTeclado(String ruta) throws IOException {
        this.fichero = new File(ruta);
        this.fw = new FileWriter(fichero);
    }

    public void escribirTexto(String frase) throws IOException {
        for (int i = 0; i < frase.length(); i++) {
            fw.write(frase.charAt(i));
        }
    }

    public void cerrarFichero() throws IOException {
        fw.close();
    }

}
