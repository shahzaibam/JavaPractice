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
public final class Electric extends Pokemon {

    private int potenciador;

    public Electric(String nomPokemon) {
        super(nomPokemon);
        this.CP = 50;
        this.potenciador = 2;

    }

    @Override
    public int Atac() {
        int atac = super.Atac();

        if (atac < 5 && this.potenciador > 0) {
            atac = atac + 5;
            this.potenciador--;
        }
        return atac;
    }

    @Override
    public void rebreImpacte(Pokemon atacker) {
        int atac_atacker = atacker.Atac();
        System.out.println("Ataca con " + atac_atacker);
        if (atacker instanceof Aigua) {
            atac_atacker *= 0.75;
            System.out.println("Ataque restado");
        }

        this.CP = this.CP - atac_atacker;
        mostrarPokemon();
    }

    @Override
    protected void mostrarPokemon() {
        super.mostrarPokemon();
    }

}
