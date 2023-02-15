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
public final class Aigua extends Pokemon {

    private int corassa;

    public Aigua(String nomPokemon) {
        super(nomPokemon);
        this.CP = 45;
        this.corassa = 2;

    }

    public int getCP() {
        return CP;
    }

    @Override
    public int Atac() {
        return super.Atac();
    }

    @Override
    public String toString() {
        return "Aigua{" + "corrasa = " + this.corassa + this.nomPokemon + this.CP + '}';
    }
    
    

    @Override
    public void rebreImpacte(Pokemon atacker) {
        int atac_atacker = atacker.Atac();

        System.out.println("Ataca con " + atac_atacker);

        if (atacker instanceof Veri) {
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
