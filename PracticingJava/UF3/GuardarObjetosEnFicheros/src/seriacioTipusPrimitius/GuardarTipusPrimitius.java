/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriacioTipusPrimitius;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author shas4605
 */
public class GuardarTipusPrimitius {

    public static void main(String[] args) {

        GuardarTipusPrimitius app = new GuardarTipusPrimitius();

        app.run();
    }

    public void run() {
        try {
            FicheroEscrituraPrimitius fichero_escritura = new FicheroEscrituraPrimitius("datos\\primitivos.txt");

            fichero_escritura.escribirPrimitivosInt(19);

            fichero_escritura.escribirPrimitivosDouble(2500);

            fichero_escritura.escribirPrimitivosString("Shebi rj");

            fichero_escritura.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el fichero" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Los datos introducidos son incorrectos " + ex.getMessage());
        }

        try {
            FicheroLecturaPrimitius fichero_lectura = new FicheroLecturaPrimitius("datos\\primitivos.txt");

            int age = fichero_lectura.leerInt();
            double salary = fichero_lectura.leerDouble();
            String name = fichero_lectura.leerString();

            System.out.println("Age -> " + age);
            System.out.println("Salary -> " + salary);
            System.out.println("Name -> " + name);

            fichero_lectura.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Dato introducido Incorrecto " + ex.getMessage());
        }

        try {
            FicheroEscrituraList ficheroEscrituraList = new FicheroEscrituraList("datos\\list.txt");

            List<Double> data = Stream.of(11.0, 2.0, 3.0, 4.0, 5.0)
                    .collect(Collectors.toList());

            for (int i = 0; i < data.size(); i++) {
                ficheroEscrituraList.escribirPrimitivosDouble(data.get(i));
            }

            ficheroEscrituraList.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Valor introducido es incorrecto " + ex.getMessage());
        }

        try {
            FicheroLecturaList fichero_lectura_list = new FicheroLecturaList("datos\\list.txt");
            List<Double> data = new ArrayList<>();

            while (fichero_lectura_list.hayValor() > 0) {
                double d = fichero_lectura_list.leerDouble();
                data.add(d);
            }

            for (Double elem : data) {
                System.out.println(elem);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("valor introducido es incorrecto " + ex.getMessage());
        }

    }
}
