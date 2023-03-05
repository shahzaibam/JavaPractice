/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author shebi
 */
public enum CartesEnum {
    GIGANTE("Gigante", 5), PRINCIPE("Principe", 5), LANZAFUEGOS("LanzaFuegos", 3), MOSQUETERA("Mosquetera", 4), ESBIRROS("Esbirros", 3);

    protected String nomCarta;
    protected int elexir;
    protected int arena;

    private CartesEnum(String nomCarta, int elexir) {
        this.nomCarta = nomCarta;
        this.elexir = elexir;

        if (this.elexir == 8) {
            this.arena = 10;
        } else if (this.elexir == 9) {
            this.arena = 13;
        } else {
            this.arena = this.elexir;
        }
    }

    public String getNomCarta() {
        return nomCarta;
    }

    public int getElexir() {
        return elexir;
    }

    public int getArena() {
        return arena;
    }

    public void setElexir(int elexir) {
        if (elexir == 8) {
            this.arena = 10;
        } else if (this.elexir == 9) {
            this.arena = 13;
        } else {
            this.arena = elexir;
            this.elexir = elexir;
        }

    }

    @Override
    public String toString() {
        return this.nomCarta + ", elexir : " + this.elexir;
    }

}
