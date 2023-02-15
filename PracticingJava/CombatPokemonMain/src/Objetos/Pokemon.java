/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author shas4605
 */
public abstract class Pokemon implements AccionsCombat {
    protected final String nomPokemon;
    protected int CP;
    protected boolean Viu;

    public Pokemon(String nomPokemon) {
        this.nomPokemon = nomPokemon;
        //this.CP = CP;
        this.Viu = true;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public int getCP() {
        return CP;
    }

    public boolean isViu() {
        return Viu;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nomPokemon= " + nomPokemon + ", CP= " + CP + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon)) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return this.nomPokemon.equalsIgnoreCase(other.nomPokemon);
    }

    @Override
    public int Atac() {
        Random rd = new Random();
        int atac = rd.nextInt(10);

        return atac;
    }
    
    protected void mostrarPokemon() {
        String fraseCP;
        if(CP<=0) {
            fraseCP = "Mort";
        }else {
            fraseCP = "Viu";
        }
        System.out.println(this.nomPokemon + " " + this.CP + " CP " + fraseCP);

    }

    
    
    
    
}
    
    
    
    
    

