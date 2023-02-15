/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalequipo;

/**
 *
 * @author shebi
 */
public class PersonalDeEquipo {

    protected int id;
    protected String nombre;
    protected int edad;
    protected int salari = 1500;

    public PersonalDeEquipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void concentrarse(int salari) {
        System.out.println(this.nombre + " Em concentro a l'Hotel");
    }

    public void viatjar(int salari) {
        System.out.println(this.nombre + " viajto al partit");
        if (this.nombre.equalsIgnoreCase("president")) {
            System.out.println("viatjo amb especial");
        } else if (this.nombre.equalsIgnoreCase("masajista")) {
            System.out.println("");
        } else {
            System.out.println("viatjo amb primera");
        }
    }

}
