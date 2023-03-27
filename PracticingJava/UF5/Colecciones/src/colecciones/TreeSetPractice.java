/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.TreeSet;

/**
 *
 * @author shebi
 */
public class TreeSetPractice {
    public static void main(String[] args) {
//        TreeSet<String> ordenaPersonas = new TreeSet<String>();
//        
//        ordenaPersonas.add("sandra");
//        
//        ordenaPersonas.add("amanda");
//        
//        ordenaPersonas.add("diana");
//        
//        for (String ordenaPersona_rec : ordenaPersonas) {
//            System.out.println(ordenaPersona_rec);
//        }

        Articulo primero = new Articulo(1, "Hola");
        Articulo segundo = new Articulo(2, "heyyyy soy 2");
        Articulo tercer = new Articulo(3, "soy 3");
        
        TreeSet<Articulo> ordenaArticulo = new TreeSet<Articulo>();
        
        ordenaArticulo.add(tercer);
        
        ordenaArticulo.add(primero);
        
        ordenaArticulo.add(segundo);
        
        for (Articulo articulo_rec : ordenaArticulo) {
            System.out.println(articulo_rec);
        }

        
    }
    
    public static class Articulo implements Comparable<Articulo>{

        private int numero_articulo;
        private String description;
        
        public Articulo(int num, String desc) {
            this.numero_articulo = num;
            this.description = desc;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Articulo{" + "numero_articulo=" + numero_articulo + ", description=" + description + '}';
        }
        


        @Override
        public int compareTo(Articulo o) {
            return numero_articulo - o.numero_articulo;
        }
        
    }
}
