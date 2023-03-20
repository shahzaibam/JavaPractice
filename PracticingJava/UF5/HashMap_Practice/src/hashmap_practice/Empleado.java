/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap_practice;

/**
 *
 * @author shebi
 */
public class Empleado {

    private String nombre;
    private int salario;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = 3000;
    }

    @Override
    public String toString() {
        return nombre + " - " + salario;
    }
}
