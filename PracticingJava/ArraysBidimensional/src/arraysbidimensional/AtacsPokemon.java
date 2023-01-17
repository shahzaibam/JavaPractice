/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensionals;

import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class AtacsPokemon {

    public static void main(String[] args) {
        int pokemon = 0;
        String[] tiposPokemon = {
            "ACERO",
            "AGUA",
            "BICHO",
            "DRAGÓN",
            "ELÉCTRICO",
            "FANTASMA",
            "FUEGO",
            "HADA",
            "HIELO",
            "LUCHA",
            "NORMAL",
            "PLANTA",
            "PSÍQUICO",
            "ROCA",
            "SINIESTRO",
            "TIERRA",
            "VENENO",
            "VOLADOR"
        };

        /*
        FILAS = Pokemon atacante
        COLUMNAS = Pokemon que recibe el ataque
         
        Significados de los números:
            - 0.5: el atacante hace la mitad de daño al oponente (No es muy eficaz) 
            - 1: el atacante hace un daño neutro al oponente (No se da información pero diremos neutro)
            - 2: el atacante hace el doble de daño al oponente (Es muy eficaz)
            - 0: el atacante hace un daño nulo al oponente (No afecta)
 
         */
        double[][] efectividadesPokemon = {
            /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
            {0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1}, //ACERO
            {1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1}, //AGUA
            {0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5}, //BICHO
            {0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // DRAGÓN
            {1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2}, // ELÉCTRICO
            {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1}, // FANTASMA
            {2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1}, // FUEGO
            {0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1}, // HADA
            {0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2}, // HIELO
            {2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5}, // LUCHA
            {0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1}, // NORMAL
            {0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5}, // PLANTA
            {0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1}, // PSÍQUICO
            {0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2}, // ROCA
            {1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1}, // SINIESTRO
            {2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0}, // TIERRA
            {0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1}, // VENENO
            {0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1} // VOLADOR
        };

        mostrarTabla(tiposPokemon, efectividadesPokemon);

        mostrarImpacto(tiposPokemon, efectividadesPokemon);


    }

    public static void mostrarTabla(String[] tiposPokemon, double[][] efectividadesPokemon) {
        for (int i = 0; i < tiposPokemon.length; i++) {
            System.out.print(tiposPokemon[i] + " ");
        }
        System.out.println("");

        for (int filas = 0; filas < efectividadesPokemon.length; filas++) {
            for (int columnas = 0; columnas < efectividadesPokemon[0].length; columnas++) {
                System.out.print(efectividadesPokemon[filas][columnas] + "    ");
            }
            System.out.println("");
        }
    }

    public static void  mostrarImpacto(String[] tiposPokemon, double[][] efectividadesPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que pokemon quieres ver");
        String pokemon1 = sc.next();

        System.out.println("Que pokemon quieres ver");
        String pokemon2 = sc.next();
        
        int pokemonid1 = 0;
        int pokemonid2 = 0;

        for (int i = 0; i < tiposPokemon.length; i++) {
            if (pokemon1.equalsIgnoreCase(tiposPokemon[i])) {
                pokemonid1 = i;
            }else if(pokemon2.equalsIgnoreCase(tiposPokemon[i])) {
                pokemonid2 = i;
            }
            
            
        }
        
        System.out.println("pokemon 1 es " + (pokemonid1));       
        System.out.println("pokemon 2 es " + (pokemonid2));
        
        System.out.println("El ataque es de " + efectividadesPokemon[pokemonid1][pokemonid2]);


    }

}
