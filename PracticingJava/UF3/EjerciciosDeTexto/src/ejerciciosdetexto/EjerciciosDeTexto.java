/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdetexto;

import Ficheros.FicheroEscrituraByte;
import Ficheros.FicheroLecturaByte;
import Ficheros.FicheroLecturaCaracteres;
import Ficheros.FicherosEscrituraCaracteres;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shebi
 */
public class EjerciciosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjerciciosDeTexto app = new EjerciciosDeTexto();

        app.run();
    }

    public void run() {
//        escribirCaracteres();
//        leerCaracteres();
//        ejercicio2();
//        ejercicio6();
//        ejercicio4();
        ejercicio8();
    }

    public void escribirCaracteres() {
        String texto = "hola yo soy el primer fichero";
        try {
            FicherosEscrituraCaracteres escribirFichero = new FicherosEscrituraCaracteres("datos\\fichero1.txt");

            for (int i = 0; i < texto.length(); i++) {
                escribirFichero.escribirCaracter(texto.charAt(i));
            }

            escribirFichero.cerrarFichero();
            System.out.println("fichero escrito y cerrado");

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero es incorrecto" + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EjerciciosDeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerCaracteres() {
        int codigo_ascii = 0;
        try {
            FicheroLecturaCaracteres leerFichero = new FicheroLecturaCaracteres("datos\\fichero1.txt");

            do {
                codigo_ascii = leerFichero.leerFicheroInt();
                if (codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    System.out.print(letra);
                }
            } while (codigo_ascii != -1);
            System.out.println("");

            System.out.println("fichero leido y cerrado");

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta es incorrecta " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(EjerciciosDeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Ejercicio 2, preguntar al usuario el nombre del fichero, y crearlo
     */
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del fichero");
        String rutaPadre = "datos\\";
        String nombre = sc.nextLine();
        String extension = ".txt";
        String frase = "Hola soy el ejercicio 2";
        String frase2 = "soy la frase 2";

        try {
            FicherosEscrituraCaracteres escribir = new FicherosEscrituraCaracteres(rutaPadre + nombre + extension);

            for (int i = 0; i < frase.length(); i++) {
                escribir.escribirCaracter(frase.charAt(i));
            }

            escribir.escribirCaracter('\n');

            for (int i = 0; i < frase2.length(); i++) {
                escribir.escribirCaracter(frase2.charAt(i));
            }

            escribir.cerrarFichero();
            System.out.println("Fichero escrito y cerrado");

        } catch (IOException ex) {
            System.out.println("Ruta del fichero es incorrecta" + ex.getMessage());
        }

        //LECTURA DE FICHERO
        try {
            FicheroLecturaCaracteres leerFichero = new FicheroLecturaCaracteres(rutaPadre + nombre + extension);
            int codigo_ascii;
            do {
                codigo_ascii = leerFichero.leerFicheroInt();

                if (codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    System.out.print(letra);
                }

            } while (codigo_ascii != -1);

            leerFichero.cerrarFichero();
            System.out.println("");
            System.out.println("fichero leido y cerrado");

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta del fichero es Incorrecta");
        } catch (IOException ex) {
            System.out.println("Input es incorrecto " + ex.getMessage());
        }

    }

    /**
     * Programa anomenat concat que concatena en concat.txt els fitxers de text
     * f1.txt i f2.txt
     */
    public void ejercicio6() {

        String textoF1 = "soy la linea uno weeey";
        String textoF2 = "pues yo soy la 2";

        try {
            FicherosEscrituraCaracteres escribirF1 = new FicherosEscrituraCaracteres("datos\\f1.txt");
            FicherosEscrituraCaracteres escribirF2 = new FicherosEscrituraCaracteres("datos\\f2.txt");

            for (int i = 0; i < textoF1.length(); i++) {
                escribirF1.escribirCaracter(textoF1.charAt(i));
            }

            for (int i = 0; i < textoF2.length(); i++) {
                escribirF2.escribirCaracter(textoF2.charAt(i));
            }

            escribirF1.cerrarFichero();
            escribirF2.cerrarFichero();

            System.out.println("Fichero F1 y F2 escritos correctamente");

        } catch (IOException ex) {
            System.out.println("Input es incorrecto " + ex.getMessage());
        }

        try {

            //importamos los de escritura tambien, primero leemos y luego los escribimos en Concat
            FicherosEscrituraCaracteres escribirConcat = new FicherosEscrituraCaracteres("datos\\concat.txt");

            FicheroLecturaCaracteres leerF1 = new FicheroLecturaCaracteres("datos\\f1.txt");
            FicheroLecturaCaracteres leerF2 = new FicheroLecturaCaracteres("datos\\f2.txt");

            int codigo_ascii;

            do {
                codigo_ascii = leerF1.leerFicheroInt();

                if (codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    escribirConcat.escribirCaracter(letra);
                }
            } while (codigo_ascii != -1);

            escribirConcat.escribirCaracter('\n');

            do {
                codigo_ascii = leerF2.leerFicheroInt();

                if (codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    escribirConcat.escribirCaracter(letra);
                }
            } while (codigo_ascii != -1);

            leerF1.cerrarFichero();
            leerF2.cerrarFichero();
            escribirConcat.cerrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta incorrecta" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Input incorrecto " + ex.getMessage());
        }

    }

    /**
     * Programa que obri un fitxer existent i el copia a un fitxer que es digui
     * copia.txt Fer el mateix amb un fitxer de bytes, (*.jpg)
     */
    public void ejercicio4() {
        try {
            FicheroLecturaCaracteres leerFichero = new FicheroLecturaCaracteres("datos\\concat.txt");
            FicherosEscrituraCaracteres escribirFichero = new FicherosEscrituraCaracteres("datos\\copia.txt");

            int codigo_ascii;

            do {
                codigo_ascii = leerFichero.leerFicheroInt();

                if (codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    escribirFichero.escribirCaracter(letra);
                }
            } while (codigo_ascii != -1);

            leerFichero.cerrarFichero();
            escribirFichero.cerrarFichero();

            System.out.println("Fichero Leido, escrito y cerrado correctamente");

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta incorrecta " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Input/Output incorrecto " + ex.getMessage());
        }

        try {
            FicheroLecturaByte leerByte = new FicheroLecturaByte("datos\\imagen.jpg");
            FicheroEscrituraByte escribirByte = new FicheroEscrituraByte("datos\\copiaImagen.jpg");

            int byte_leido;

            do {
                byte_leido = leerByte.leerByte();

                if (byte_leido != -1) {
                    byte acabadoDeLeer = (byte) byte_leido;
                    escribirByte.escribirByte(acabadoDeLeer);
                }
            } while (byte_leido != -1);

            leerByte.cerrarFichero();
            escribirByte.cerrarFichero();

            System.out.println("Imagen leida, copiada y cerrada correctamente");

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Input/Output Incorrecto");
        }

    }

    /**
     * Escriure un programa que llegeixi un fitxer existent, i faci dos fitxers
     * de sortida, un que tingui totes les vocals i el altre totes les
     * consonants.
     */
    public void ejercicio8() {
        try {
            FicheroLecturaCaracteres leerFichero = new FicheroLecturaCaracteres("datos\\f2.txt");
            FicherosEscrituraCaracteres escribirVocales = new FicherosEscrituraCaracteres("datos\\f2Vocales.txt");
            FicherosEscrituraCaracteres escribirConsonantes = new FicherosEscrituraCaracteres("datos\\f2cons.txt");

            int codigo_ascii;
            
            do{
                codigo_ascii = leerFichero.leerFicheroInt();
                
                if(codigo_ascii != -1) {
                    char letra = (char) codigo_ascii;
                    
                    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        escribirVocales.escribirCaracter(letra);
                    }else{
                        escribirConsonantes.escribirCaracter(letra);
                    }
                }
            }while(codigo_ascii != -1);
            
            leerFichero.cerrarFichero();
            escribirVocales.cerrarFichero();
            escribirConsonantes.cerrarFichero();
            
            System.out.println("Fichero leido, escritas las vocales y consonantes, ficheros cerrados correctamente");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Input/Output Exception " + ex.getMessage());
        }
    }

}
