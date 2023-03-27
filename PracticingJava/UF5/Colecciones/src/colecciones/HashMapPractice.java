/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author shebi
 */
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Clientes> listaClientes = new HashMap<String, Clientes>();
        Set<String> keys = listaClientes.keySet(); //hacemos el Set para obtener los keys y luego poder imprimirlo con un for
        
        listaClientes.put("100", new Clientes("jorge", "00001", 1200));
        
        listaClientes.put("101", new Clientes("luisito", "00002", 1500));
        
        listaClientes.put("102", new Clientes("laura", "00003", 1700));
        
        listaClientes.put("100", new Clientes("jorge copia", "00001", 1200));
        
        for (String key : keys) {
            Clientes cl = listaClientes.get(key);
            
            System.out.println("clave -->" + key + " " + "valor --> " + cl);
        }
        
        //System.out.println(listaClientes);
        
        //tambien se puede hacer con un forEach pero es mas complejo
       
        /*
        for (Map.Entry<String, Clientes> entrada: listaClientes.entrySet()) {
            String clave=entrada.getKey();
            
            Clientes valor = entrada.getValue();
            
            System.out.println("Clave --> " + clave + " " + " Valor --> " + valor);
            
        }
        */
    }
}
