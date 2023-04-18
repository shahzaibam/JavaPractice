/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisfitxersserialitzats;

import Clases.Alumne;
import java.util.ArrayList;
import Clases.FicheroEscrituraPrimitius;
import Clases.FicheroLecturaPrimitius;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shas4605
 */
public class ExercicisFitxersSerialitzats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExercicisFitxersSerialitzats app = new ExercicisFitxersSerialitzats();
        app.run();
    }

    public void run() {
        ArrayList<Alumne> alumnes = new ArrayList<Alumne>();

        carregarAlumnes(alumnes);
        escribirNombreEdat(alumnes);
        leerNombreEdat(alumnes);
    }

    public void carregarAlumnes(ArrayList<Alumne> alumnes) {

        alumnes.add(new Alumne("lucas", 18, "1234"));
        alumnes.add(new Alumne("maria", 23, "1234"));
        alumnes.add(new Alumne("juanjo", 19, "1234"));
        alumnes.add(new Alumne("david", 29, "1234"));
        alumnes.add(new Alumne("montse", 16, "1234"));
    }

    public void escribirNombreEdat(ArrayList<Alumne> alumnes) {
        try {
            FicheroEscrituraPrimitius escribir = new FicheroEscrituraPrimitius("ficheros\\escribirNomEdat.txt");

            escribir.escribirPrimitivosAlumne(alumnes);

            escribir.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Entrada o salida incorrectos " + ex.getMessage());
        }

    }

    public void leerNombreEdat(ArrayList<Alumne> alumnes) {

        try {
            FicheroLecturaPrimitius leer = new FicheroLecturaPrimitius("ficheros\\escribirNomEdat.txt");

            for (Alumne alumne : alumnes) {
                int age = leer.leerAlumneEdat(alumnes);
                String nom = leer.leerAlumneNom(alumnes);
                System.out.println("Nom es " + nom);
                System.out.println("Edat es " + age);
            }

            leer.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de inpur output " + ex.getMessage());
        }

    }

}
