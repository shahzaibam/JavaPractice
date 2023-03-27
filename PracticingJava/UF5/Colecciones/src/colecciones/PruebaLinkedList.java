/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.LinkedList;

/**
 *
 * @author shebi
 */
public class PruebaLinkedList {

    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();

        personas.add( "shebi");
        personas.add( "laura");
        personas.add( "jose");
        personas.add( "sara");
        personas.add( "abidal");
        
        System.out.println(personas.size());
        
        for (String persona_rec : personas) {
            System.out.println(persona_rec);
        }
    }

}
