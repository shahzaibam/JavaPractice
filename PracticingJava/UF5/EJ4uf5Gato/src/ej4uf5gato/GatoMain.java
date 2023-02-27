/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4uf5gato;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shebi
 */
public class GatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato garfield;
        try {
            garfield = new Gato("ssss", 12);
            System.out.println("G1. Mi nombre es " + garfield.getNombre() + " y tengo " + garfield.edad + " anyos");
        } catch (Exception ex) {
            System.out.println("G1. El nombre o la edad estan mal, revisa los requisitos.");
        }

        Gato garfieldDos;
        try {
            garfieldDos = new Gato("ss", 12);
            garfieldDos.setNombre("garfield");
            System.out.println(garfieldDos.getNombre());

        } catch (Exception ex) {
            System.out.println("G2. El nombre tiene que tener mas de tres letras");
        }

        Gato garfieldTres;
        try {
            garfieldTres = new Gato("has", -5);
            garfieldTres.setEdad(2);

        } catch (Exception ex) {
            System.out.println("G3. La edad esta mal, tiene que ser positiva");
        }

    }

}
