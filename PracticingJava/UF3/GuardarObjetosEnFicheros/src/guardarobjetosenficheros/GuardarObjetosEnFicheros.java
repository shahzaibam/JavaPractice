/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guardarobjetosenficheros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shas4605
 */
public class GuardarObjetosEnFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuardarObjetosEnFicheros app = new GuardarObjetosEnFicheros();

        app.run();
    }

    private void run() {
        try {
            List<Contactos> agenda = new ArrayList<>();
            FicheroEscrituraObjetos fichero_escritura = new FicheroEscrituraObjetos("datos\\contactos.dat");
            cargarContactos(agenda);

            //recorro array list y cada objeto lo guardo en fichero_escritura
            for (Contactos anyadir : agenda) {
                fichero_escritura.escribirFicheros(anyadir);
            }

            System.out.println("Objetos guardaddos " + fichero_escritura.getCont_objecte());

            fichero_escritura.cerrarFichero();
        } catch (IOException ex) {
            System.out.println("Error escribiendo fichero " + ex.getMessage());
        }

        Object obj;
        FicheroLecturaObjetos lectura_obj = null;
        try {
            lectura_obj = new FicheroLecturaObjetos("datos\\contactos.dat");

            do {
                obj = lectura_obj.leerObjeto();

                if (obj != null) {
                    if (obj instanceof Contactos) {
                        Contactos c = (Contactos) obj;
                        System.out.println(c);
                    }
                }
            } while (obj != null);

            lectura_obj.cerrarFichero();

        } catch (IOException ex) {
            System.out.println("Registros listados " + lectura_obj.cont_objectes);
            try {
                lectura_obj.cerrarFichero();
            } catch (IOException ex1) {
                System.out.println("Error leyendo fichero " + ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("no se ha encontrado la clase " + ex.getMessage());
        }
    }

    private void cargarContactos(List<Contactos> agenda) {
        agenda.add(new Contactos("name1", 1));
        agenda.add(new Contactos("name2", 2));
        agenda.add(new Contactos("name3", 3));
        agenda.add(new Contactos("name4", 4));
        agenda.add(new Contactos("name5", 5));
        agenda.add(new Contactos("name6", 5));
    }

}
