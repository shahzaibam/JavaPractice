/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author shas4605
 */
public class Veri extends Pokemon {

    protected boolean defensa;

    public Veri(String nomPokemon) {
        super(nomPokemon);
        this.CP = 40;

        this.defensa = false;

    }

    @Override
    public int Atac() {
        return super.Atac();
    }

    @Override
    public void rebreImpacte(Pokemon atacker) {
        int atac_atacker = atacker.Atac();
        System.out.println("Ataca con " + atac_atacker);

        if (atacker instanceof Electric) {
            atac_atacker *= 0.75;
            System.out.println("Ataque restado");
        }

        this.CP = this.CP - atac_atacker;

        mostrarPokemon();
    }

    @Override
    public String toString() {
        return "Veri{" + "defensa=" + defensa + nomPokemon + CP + '}';
    }

    @Override
    protected void mostrarPokemon() {
        super.mostrarPokemon();
    }

}
