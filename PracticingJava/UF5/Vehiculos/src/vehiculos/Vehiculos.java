/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author shebi
 */
public abstract class Vehiculos {
    protected String matricula;
    protected int modelo;

    public Vehiculos(String matricula, int modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    
}
