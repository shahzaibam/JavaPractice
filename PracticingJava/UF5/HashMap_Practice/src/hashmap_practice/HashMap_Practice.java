/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap_practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shebi
 */
public class HashMap_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, Empleado> personal = new HashMap<Integer, Empleado>();

        personal.put(100, new Empleado("shahzaib"));

        personal.put(110, new Empleado("javier"));

        personal.put(119, new Empleado("bali"));

        personal.put(109, new Empleado("lucia"));

        personal.put(100, new Empleado("ali")); // los que tienen el key igual a otro, se reemplazan los valores

        personal.forEach((k, v) -> System.out.println("Numero Clave : " + k + " || " + "Valores - " + v));

        //eliminamos un objeto del mapa
        personal.remove(109);
        
        System.out.println("-------");
        
        //personal.forEach((k,v) -> System.out.println("Numero Clave : " + k + " || " + "Valores - " + v));
        
        for (Map.Entry<Integer, Empleado> entrada : personal.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }

}
