/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandoexamen;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shebi
 */
public class PracticandoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Pokemon> listaPokemon = new ArrayList<Pokemon>();
        
        listaPokemon.add(new Pokemon("Pikachu", 16));
        listaPokemon.add(new Pokemon("Go", 11));
        //listaPokemon.add(new Pokemon("Filipino", 19));
        
//        listaPokemon.set(1, new Pokemon("Filipino", 16));
//        
//        System.out.println(listaPokemon.get(1));
//        
//        for (Pokemon itemPok : listaPokemon) {
//            System.out.println(itemPok);
//        }
       
        Iterator <Pokemon> mi_iterador = listaPokemon.iterator();
        
        while(mi_iterador.hasNext()) {
            System.out.println(mi_iterador.next());
        }
    }
    
}
