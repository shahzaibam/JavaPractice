/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardarobjetosenficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author shas4605
 */
public class FicheroEscrituraObjetos {
    File fichero;
    ObjectOutputStream oos;
    int contador_objectes = 0;
    
    /**
     * preparo les variables per quan vulgui utilitzar
     * @param ruta on es troba el fitxer
     * @throws FileNotFoundException no existe el archivo
     * @throws IOException error de escritura
     */
    public FicheroEscrituraObjetos(String ruta) throws FileNotFoundException, IOException {
        fichero = new File(ruta);
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        contador_objectes = 0;
    }
    
    public void cerrarFichero() throws IOException {
        oos.close();
    }
    
    public void escribirFicheros(Contactos add) throws IOException {
        oos.writeObject(add);
        contador_objectes++;
    }
    
    public String dameNombre() {
        return fichero.getName();
    }
    
    public int getCont_objecte() {
        return contador_objectes;
    }
}
