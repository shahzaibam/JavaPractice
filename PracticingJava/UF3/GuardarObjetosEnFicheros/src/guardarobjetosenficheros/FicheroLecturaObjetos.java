/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardarobjetosenficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author shas4605
 */
public class FicheroLecturaObjetos {

    File fichero;
    ObjectInputStream ois;
    int cont_objectes;

    public FicheroLecturaObjetos(String ruta_archivo) throws FileNotFoundException, IOException {
        fichero = new File(ruta_archivo);
        ois = new ObjectInputStream(new FileInputStream(fichero));
        cont_objectes = 0;
    }

    public void cerrarFichero() throws IOException {
        ois.close();
    }
    
    /**
     * Devuelve el siguiente objeto a leer sin darle la forma de la clase
     * se casteara fuera, es decir al main
     * @return objeto, si no hay objeto a leer devuelve un null
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object leerObjeto() throws IOException, ClassNotFoundException {
        cont_objectes++;
        return ois.readObject();
    }
}
