/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.*;
/**
 *
 * @author shebi
 */
public class ArrayListPersona {

    public static void main(String[] args) {

//        Persona listaPersonas[] = new Persona[3];
//
//        listaPersonas[0] = new Persona("Shebi", 20, 'H', 78, 1.82);
//        listaPersonas[1] = new Persona("Luis", 17, 'H', 52, 1.76);
//        listaPersonas[2] = new Persona("Asia", 22, 'M', 54, 1.72);

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        listaPersonas.add(new Persona("Shebi", 20, 'H', 78, 1.82));
        
        listaPersonas.add(new Persona("Luis", 17, 'H', 57, 1.76));
        
        listaPersonas.add(new Persona("Asia", 22, 'M', 54, 1.72));
        
        listaPersonas.add(new Persona("Sara", 26, 'M', 72, 1.78));
        
        listaPersonas.add(new Persona("David", 10, 'H', 49, 1.45));
        
        System.out.println(listaPersonas.size());


    }
}
