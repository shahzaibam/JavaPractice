/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_ficheros;

import java.io.File; //objectes input /output

/**
 *
 * @author mabardaji
 */
public class Prueba_ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivoAbs = new File("C:\\Users\\mabardaji\\Documents\\NetBeansProjects\\20222023M03\\UF5\\NF2- EstructuresDadesCollections\\Prueba_ficheros\\fotos\\tigre.jpg");
        File carpetaAbs = new File("C:\\Users\\mabardaji\\Documents\\NetBeansProjects\\20222023M03\\UF5\\NF2- EstructuresDadesCollections\\Prueba_ficheros\\fotos");
        File archivoRel = new File("fotos\\tigre2.jpg");
        File archivo_rel_inexistente = new File("fotos\\tigre3.jpg");
        mostrarRutas(archivoAbs);
        System.out.println("***********");
        mostrarRutas(carpetaAbs);
        System.out.println("***********");
        mostrarRutas(archivoRel);
        System.out.println("***********");
        mostrarRutas(archivo_rel_inexistente);
//        otrosMetodos(archivoAbs);
//        otrosMetodos(carpetaAbs);
//        otrosMetodos(archivoRel);
    }

    /**
     * 
     * @param archivoAbs 
     */
    private static void mostrarRutas(File fichero) {
        System.out.println("getParent() -> " + fichero.getParent());
        System.out.println("getName() -> " + fichero.getName() );
        System.out.println("getAbsolutePath() -> " + fichero.getAbsolutePath());
        System.out.println("exists() -> "  + fichero.exists());
        System.out.println("isDirectory() -> "  + fichero.isDirectory());
        System.out.println("isFile() -> "  + fichero.isFile());
    }
    
}
