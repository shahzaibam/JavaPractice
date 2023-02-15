/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalequipo;

/**
 *
 * @author shebi
 */
public class futbolista extends PersonalDeEquipo {

    protected int goles;

    public futbolista(int goles, int id, String nombre) {
        super(id, nombre);
        this.goles = goles;
    }

    public void jugarPartido() {
        viatjar(salari);

        this.salari = this.salari + 1000;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    

}
