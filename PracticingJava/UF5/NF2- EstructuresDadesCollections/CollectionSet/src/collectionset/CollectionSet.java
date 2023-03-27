/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mabardaji
 */
public class CollectionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> conjunt = new HashSet<Integer>();
        Set<Integer> conjunt2 = new HashSet<Integer>();
        Set<Integer> conjunt_ord = new TreeSet<Integer>(); //conjunt ordenat
        boolean add;
        
        add = conjunt.add(3);
        conjunt_ord.add(3);
        System.out.println("S'ha afegit el 3? " + add);
        add = conjunt.add(7);
        conjunt_ord.add(7);
        System.out.println("S'ha afegit el 7? " + add);
        add = conjunt.add(17);
        conjunt_ord.add(17);
        System.out.println("S'ha afegit el 17? " + add);
        add = conjunt.add(7);
        conjunt_ord.add(7);
        System.out.println("S'ha afegit el 7? " + add);
        for (Integer num : conjunt) {
            System.out.println(num);
        }
        System.out.println("Ordenat");
        for (Integer num : conjunt_ord) {
            System.out.println(num);
        }
        
        add = conjunt2.add(7);
        add = conjunt2.add(100);
        add = conjunt2.add(50);
        System.out.println("conjunt 2");
        for (Integer integer : conjunt2) {
            System.out.println(integer);
        }
        conjunt.addAll(conjunt2); //UNION
        System.out.println("union poner todos "
                + "los elementos del primer y del segundo conjunto");
        for (Integer valor : conjunt) {
            System.out.println(valor);
        }
        conjunt2.retainAll(conjunt_ord);
        System.out.println("retainAll es igual al intersect");
        for (Integer valor : conjunt2) {
            System.out.println(valor);
        }
        conjunt_ord.removeAll(conjunt2);
        System.out.println("remove all: minus, tots els elementos que"
                + "no es troben al segon conjunt");
        for (Integer valor : conjunt_ord) {
            System.out.println(valor);
        }
       
        
        
        /* proves cromo te que tenir equals per que funcioni
        Set<Cromo> conjunt_c = new HashSet<Cromo>();
        conjunt_c.add(new Cromo(1, "1"));
        conjunt_c.add(new Cromo(2, "2"));
        conjunt_c.add(new Cromo(1, "1"));
        for (Cromo card : conjunt_c) {
            System.out.println("cromo- " + card);
        }*/
        
    }
    
}
