/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author shebi
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clientes cl1 = new Clientes("Antonio Banderas", "00001", 200000);
        Clientes cl2 = new Clientes("Rafael Nadal", "00002", 250000);
        Clientes cl3 = new Clientes("Penelope Cruz", "00003", 300000);
        Clientes cl4 = new Clientes("Julio Iglesias", "00004", 500000);
        Clientes cl5 = new Clientes("Julio Iglesias", "00005", 500000);
        Clientes cl6 = new Clientes("Antonio Banderas", "00001", 200000);

        //utilizaremos el metodo hashSet porque creemos que los clientes no se han de repetir, y de momento
        //no hace falta ordenarlos. 
        Set<Clientes> clientesBanco = new HashSet<Clientes>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        clientesBanco.add(cl6);

        for (Clientes clientes_rec : clientesBanco) {
            System.out.println(clientes_rec);
        }

    }

}
