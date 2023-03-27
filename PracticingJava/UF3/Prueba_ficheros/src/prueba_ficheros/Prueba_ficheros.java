/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_ficheros;

import Ficheros.FicheroEscrituraByte;
import Ficheros.FicheroEscrituraCaracteres;
import Ficheros.FicheroLecturaByte;
import Ficheros.FicheroLecturaCaracteres;
import java.io.File; //objectes input /output
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class Prueba_ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        try {

            FicheroLecturaByte ficheroByte = new FicheroLecturaByte("ficheros\\descarga.jfif");
            FicheroEscrituraByte ficheroEscrituraBt = new FicheroEscrituraByte("ficheros\\descarga.jfif");

            boolean final_archivo = false;

            int byte_leer = 0;

            while (!final_archivo) {
                try {
                    byte_leer = ficheroByte.leerByte();
                } catch (IOException ex) {
                    System.out.println("no se ha podido leer" + ex.getMessage());
                }

                if (byte_leer == -1) {
                    final_archivo = true;
                } else {
                    try {
                        ficheroEscrituraBt.escribirIntByte(byte_leer);
                    } catch (IOException ex) {
                        System.out.println("no se ha podido leer" + ex.getMessage());
                    }
                }

                System.out.println(byte_leer);

                contador++;
            }

            try {
                ficheroByte.cerrarFichero();
                ficheroEscrituraBt.cerrarFichero();
            } catch (IOException ex) {
                System.out.println("fichero no encontradi" + ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Ruta no encontrada" + ex.getMessage());
        }

        System.out.println(contador);
    }

    /**
     *
     * @param archivoAbs
     */
    private static void mostrarRutas(File fichero) {
        System.out.println("getParent() -> " + fichero.getParent());
        System.out.println("getName() -> " + fichero.getName());
        System.out.println("getAbsolutePath() -> " + fichero.getAbsolutePath());
        System.out.println("exists() -> " + fichero.exists());
        System.out.println("isDirectory() -> " + fichero.isDirectory());
        System.out.println("isFile() -> " + fichero.isFile());
        System.out.println("length() -> " + fichero.length());

    }

    private static void crearCarpeta(File carpeta_crear) {
        if (carpeta_crear.mkdir()) {
            System.out.println("Carpeta creada..." + carpeta_crear.getName());
        } else {
            System.out.println("No se ha creado carpeta");
        }
    }

    private static void borrarCarpeta(File carpeta_crear) {
        if (carpeta_crear.delete()) {
            System.out.println("Carpeta borrada... " + carpeta_crear.getName());
        } else {
            System.out.println("Carpeta no ha podido ser borrada");
        }
    }

    private static void mostrarFicherosDocumentos() {
        File dir = new File("C:\\Users\\mabardaji\\Documents");
        File[] lista = dir.listFiles();
        System.out.println("Contenido de " + dir.getAbsolutePath() + " :");
        // Recorremos el array y mostramos el nombre de cada elemento
        for (int i = 0; i < lista.length; i++) {
            File f = lista[i];
            if (f.isDirectory()) {
                System.out.println("[DIR] " + f.getName());
            } else {
                System.out.println("[ARX] " + f.getName());
            }
        }

    }

    private static void pruebas_ficheros() {
        File archivoAbs = new File("C:\\Users\\mabardaji\\Documents\\NetBeansProjects\\20222023M03\\UF5\\NF2- EstructuresDadesCollections\\Prueba_ficheros\\fotos\\tigre.jpg");
        File carpetaAbs = new File("C:\\Users\\mabardaji\\Documents\\NetBeansProjects\\20222023M03\\UF5\\NF2- EstructuresDadesCollections\\Prueba_ficheros\\fotos");
        File archivoRel = new File("fotos\\tigre2.jpg");
        File archivo_rel_inexistente = new File("fotos\\tigre3.jpg");
        File carpeta_crear = new File("fotos\\paises");
        mostrarRutas(archivoAbs);
        System.out.println("***********");
        mostrarRutas(carpetaAbs);
        System.out.println("***********");
        mostrarRutas(archivoRel);
        System.out.println("***********");
        mostrarRutas(archivo_rel_inexistente);

        crearCarpeta(carpeta_crear);
        borrarCarpeta(carpeta_crear);

        mostrarFicherosDocumentos();
//        otrosMetodos(archivoAbs);
//        otrosMetodos(carpetaAbs);
//        otrosMetodos(archivoRel);
    }

    private static void leerFicheroHacerCopia() {
        File fichero_leer = new File("ficheros\\datos.txt");
        File fichero_escritura = new File("ficheros\\copia_datos.txt");
        String linea;
        Scanner lectorArchivo;
        FileWriter escritura;
        try {
            escritura = new FileWriter(fichero_escritura, true);
            lectorArchivo = new Scanner(fichero_leer);
            while (lectorArchivo.hasNextLine()) {
                linea = lectorArchivo.nextLine();
                System.out.println("Frase leida-->" + linea);
                escritura.write(linea + "\n");
            }
            //IMPORTANT SEMPRE S'HA DE TANCAR EL ARXIU
            lectorArchivo.close();
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero " + fichero_leer.getName() + " no existe... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir fichero..." + ex.getMessage());
        }

    }

    private static void leer_fichero_enteros() {
        File fichero_leer = new File("ficheros\\numeros.txt");
        int numero;
        Scanner lectorArchivo;
        try {
            lectorArchivo = new Scanner(fichero_leer);
            while (lectorArchivo.hasNextInt()) {
                numero = lectorArchivo.nextInt();
                System.out.println("numero leida-->" + numero);
            }
            //IMPORTANT SEMPRE S'HA DE TANCAR EL ARXIU
            lectorArchivo.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero " + fichero_leer.getName() + " no existe... " + ex.getMessage());
        }

    }

    private static void ficheroLecturaEscrituraMain() {
        FicheroLecturaCaracteres lectura = null;
        FicheroEscrituraCaracteres escritura = null;
        int codigo_ascii;
        char letra;
        try {
            lectura = new FicheroLecturaCaracteres("ficheros\\vocales.txt");
            escritura = new FicheroEscrituraCaracteres("ficheros\\copia_vocales.txt");
            System.out.println("Preparado para escribir...");
            do {
                codigo_ascii = lectura.LeerCaracter();
                if (codigo_ascii != -1) {
                    letra = (char) codigo_ascii;
                    if (letra == 'a' || letra == 'e'
                            || letra == 'i' || letra == 'o'
                            || letra == 'u') {
                        letra = 'x';
                    }
                    escritura.escribirCaracter(letra);
                }
            } while (codigo_ascii != -1);
            System.out.println("copia realizada... " + escritura.dameNombreFichero());

            lectura.cerrarFichero();
            escritura.cerrarFichero();
        } catch (FileNotFoundException ex) {
            System.out.println("Error fichero entrada" + lectura.dameNombreFichero());
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error fichero escritura" + escritura.dameNombreFichero());
            System.out.println(ex.getMessage());
        }
    }

}
