/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6gato;

import Objetos.AgeNotNegativeException;
import Objetos.Gato;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class Ex6Gato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      
            Gato cat1;
         try {
            Gato cat4 = null;
            Gato cat2=new Gato("Doraemon", 500);
      
            cat4=new Gato("Doeee", -5500);
        } catch (Exception ex) {
            System.out.println("Excepción capturada " + ex);
            ex.printStackTrace();
        }
       
       
       cat1 = new Gato();
       
        try {
            cat1.setEdad(-30);
        } catch (AgeNotNegativeException ex) {
            System.out.println(ex + " Edad del gato quedara con la que tenia");
        }
       
       
    }
    
}
