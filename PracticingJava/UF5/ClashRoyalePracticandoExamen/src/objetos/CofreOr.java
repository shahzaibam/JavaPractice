/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author shebi
 */
public class CofreOr extends CofreGeneric {

    protected CartesEnum carta2;

    @Override
    public void obrirCofre() {
        this.num_monedes = trobar_monedes(420, 480);
        this.primeraCarta = seleccionarCarta();

        do {
            this.carta2 = seleccionarCarta();
        } while (this.primeraCarta.equals(this.carta2));

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Segunda carta : " + this.carta2;
    }

}
