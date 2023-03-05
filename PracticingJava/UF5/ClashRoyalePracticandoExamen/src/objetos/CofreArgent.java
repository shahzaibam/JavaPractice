/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;


/**
 *
 * @author shebi
 */
public class CofreArgent extends CofreGeneric {


    @Override
    public void obrirCofre() {
        this.num_monedes = trobar_monedes(105, 120);
        
        this.primeraCarta = seleccionarCarta();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
