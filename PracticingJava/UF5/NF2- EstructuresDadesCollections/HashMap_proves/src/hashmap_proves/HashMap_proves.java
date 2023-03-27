/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap_proves;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author mabardaji
 */
public class HashMap_proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> lletres = new HashMap<>();
        Map<String, Integer> lletres_ordenades = new TreeMap<>();
        //afegir item al dictionari (hashmap)
        //put
        lletres.put("A", 1);
        lletres.put("B", 2);
        lletres.put("C", 3);
        lletres.put("D", 4);
        lletres.put("F", 6);
        lletres.put("I", 9);
        lletres.put("H", 8);
        lletres.put("Z", 26);
        
        lletres_ordenades.put("A", 1);
        lletres_ordenades.put("B", 2);
        lletres_ordenades.put("C", 3);
        lletres_ordenades.put("D", 4);
        lletres_ordenades.put("F", 6);
        lletres_ordenades.put("Z", 26);
        lletres_ordenades.put("I", 9);
        lletres_ordenades.put("H", 8);
        
        
        //recorrer un hashmap v1 amb iterador
        Set<Map.Entry<String,Integer>> set = lletres.entrySet();
        Iterator<Map.Entry<String,Integer>> iterador = set.iterator();
        
        while(iterador.hasNext())
        {
            Map.Entry<String,Integer> entry = iterador.next();
            String key = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("[" + key + "]=>"+valor+"");
        }
        
        //recorrer el conjunt amb les claus
        Set<String> keys = lletres.keySet();
        
        for (String clave : keys) {
            Integer valor = lletres.get(clave);
            System.out.println("foreach[" + clave + "]=>"+valor+"");
        }
        System.out.println("ordenada amb tree map");
        keys = lletres_ordenades.keySet();
        
        for (String clave : keys) {
            Integer valor = lletres.get(clave);
            System.out.println("foreachtreemap[" + clave + "]=>"+valor+"");
        }        
        
        Integer valor_recuperado = lletres.get("F");
        System.out.println("F->" + valor_recuperado);
        valor_recuperado = lletres.get("M");
        System.out.println("M->" + valor_recuperado);
        
        //Foreach 
        for (Map.Entry<String,Integer> entrada: lletres.entrySet()) {
            System.out.println("foreach2[" + entrada.getKey() + "]=>"+entrada.getValue()+"");
        }
        
        //borrar
        lletres.remove("I");
        System.out.println("Despres de borrar la I");
        for (Map.Entry<String,Integer> entrada: lletres.entrySet()) {
            System.out.println("foreach2[" + entrada.getKey() + "]=>"+entrada.getValue()+"");
        }
        
        //canviar
        lletres.replace("Z", 27);
        System.out.println("Canvio valor Z");
        for (Map.Entry<String,Integer> entrada: lletres.entrySet()) {
            System.out.println("foreach2[" + entrada.getKey() + "]=>"+entrada.getValue()+"");
        }
        
        
        lletres.putIfAbsent("G", 2);
        lletres.putIfAbsent("A", 150);
        for (Map.Entry<String,Integer> entrada: lletres.entrySet()) {
            System.out.println("putifabsent[" + entrada.getKey() + "]=>"+entrada.getValue()+"");
        }
        lletres.put("A", 150);
        System.out.println("values() ---------");
        Collection<Integer> valores = lletres.values();
        ArrayList<Integer> lista_valores = new ArrayList<Integer>(valores);
        for (Integer valor : lista_valores) {
            System.out.println(valor);
        }
        //Map<char, int> lletres = new HashMap<>();
    }
    
}
