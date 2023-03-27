/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProvesCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class ProvesCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<Integer> llista;
        //List es una interface que pot agafar diferents formes
        //dins de clases que no siguin interface ni abstractes
        //per? tenen que derivar d'ella.
            llista = new ArrayList<Integer> ();
            
            System.out.println(llista.isEmpty());
            llista.add(7);
            llista.add(new Integer(5));
            llista.add(17);
            llista.add(2);
            System.out.println(llista.isEmpty());
            System.out.println("numero de elements..." 
                    + llista.size());
            
            /*recorrer llistes*/
            /* for each */
            for (Integer valor : llista) {
                System.out.println(valor);
            }
            
            /* amb el metode iterator
            amb collections molt grans, es una
            mica més ràpid (inconvenient que no pots tirar endarrera,
            has de començar pel principi un altre)
            */
            System.out.println("Recorrer iterador");
            Iterator<Integer> iter = llista.iterator();
            while(iter.hasNext())
            {
                Integer i = iter.next();
                System.out.println(i); //com Integer
                //te la funció toString implementado ho puc 
                //fer
            }
            
            System.out.println("Recorrent llista metode get");
            Integer val;
            for (int i = 0; i < llista.size(); i++) 
            {
                val = llista.get(i); //similar al array
                System.out.println(val);
            }
            
            /*afegir objecte a la mitad llista*/
            System.out.println("Canvio a la posició 100 poso valor 2");
            llista.set(2, 100);
            
            for (Integer num : llista) {
                System.out.println(num);
            }
            
            System.out.println("afegeixo 1000 a posició 2 i el que havia " 
                    + "a la posicio 2 passa a la 3 i així succesivament" );
            System.out.println("afegeixo 1000 a posició 3 i la resta es mou");
            llista.add(2, 1000);
            for (Integer num : llista) {
                System.out.println(num);
            }                
            llista.add(3, 1000);
            System.out.println("toString: " + llista.toString());
            System.out.println("Index of busquem el 1000 i es troba" 
                    + llista.indexOf(1000) + " contains " + llista.contains(100));
            System.out.println("Last Index of busquem el 1000 i es troba" 
                    + llista.lastIndexOf(1000)+ " contains " + llista.contains(100));
            System.out.println("Last Index of busquem el 50  i es troba" 
                    + llista.lastIndexOf(50)+ " contains " + llista.contains(50));
            
    }
    
}
