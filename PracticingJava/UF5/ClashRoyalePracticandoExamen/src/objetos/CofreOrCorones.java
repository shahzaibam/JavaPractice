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
public class CofreOrCorones extends CofreGeneric{
    
    protected CartesEnum carta2;
    protected CartesEnum carta3;
    protected int gemasAleatoria;

    @Override
    public void obrirCofre() {
        Random rd = new Random();
        this.num_monedes = trobar_monedes(1050, 1200);
        
        gemasAleatoria = rd.nextInt(5)+1;
        
        do{
            this.primeraCarta = seleccionarCarta();
            this.carta2 = seleccionarCarta();
            this.carta3 = seleccionarCarta();
        }while(this.primeraCarta.equals(this.carta2) || this.carta2.equals(this.carta3) || this.carta3.equals(this.primeraCarta));
        
    }

    @Override
    public String toString() {
        return super.toString() + " Gemas = " + this.gemasAleatoria + "\n" + "Segunda carta : " + this.carta2 + "\n" + "Tercera carta : " + this.carta3;
    }
    
    
    
}
