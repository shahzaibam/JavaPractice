/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author shebi
 */
public abstract class CofreGeneric {
    protected int num_monedes;
    protected CartesEnum primeraCarta;

    
    public abstract void obrirCofre();

    public int trobar_monedes(int min, int max) {
        Random rd = new Random();
        
        int numRan = rd.nextInt((max - min) + 1) + min;

        return numRan;
    }
    
    protected CartesEnum seleccionarCarta() {
        CartesEnum [] cartesClashRoyale = CartesEnum.values();
        
        Random rd = new Random();
        
        int numAle = rd.nextInt(cartesClashRoyale.length);
        
        return cartesClashRoyale[numAle];
    }
    
    @Override
    public String toString() {
        return "num_monedes : " + num_monedes + ", primeraCarta " + primeraCarta ;
    }
    
    
    
    
}
