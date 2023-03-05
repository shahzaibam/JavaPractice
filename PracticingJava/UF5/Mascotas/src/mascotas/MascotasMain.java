/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotas;

import Objetos.ColorEnum;
import Objetos.Gato;
import Objetos.Loro;
import Objetos.Perro;
import Objetos.Picos;
import Objetos.RazasPerros;

/**
 *
 * @author shebi
 */
public class MascotasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro husky = new Perro("jan", 4, "bien", "24-05", RazasPerros.HUSKY, "no");
        Gato Garfield = new Gato("Garfield", 2, "perfecto", "23/09", ColorEnum.GREEN, "si");
        
        System.out.println(husky);
        
        System.out.println("----------------");
        
        System.out.println(Garfield);
        
        System.out.println("-------------AVES-------------");
        System.out.println();
        System.out.println();
        
        Loro janji = new Loro("janji", 3, "perfecto", "05/03", Picos.CORTO, "no");

        System.out.println(janji);
        
    }
    
}
