/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author shebi
 */
public class Terrestre extends Vehiculos {

    public Terrestre(String matricula, int modelo) {
        super(matricula, modelo);
        if (this.matricula.length() <= 7) {
            this.matricula = matricula;
        } else {
            this.matricula = "1234ABC";
        }
        this.modelo = modelo;
    }

}
