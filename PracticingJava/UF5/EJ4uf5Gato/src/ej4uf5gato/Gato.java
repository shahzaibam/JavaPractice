/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4uf5gato;

/**
 *
 * @author shebi
 */
public class Gato {

    protected String nombre;
    protected int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (this.nombre.length() < 3) {
            throw new Exception("El nombre tiene que tener mas de tres caracteres. Intentalo de nuevo");
        } else {
            this.nombre = nombre;
        }

        if (this.edad < 0) {
            throw new Exception("La edad no puede ser negativa. Intentalo de nuevo.");
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (this.nombre.length() < 3) {
            throw new Exception("El nombre tiene que tener mas de tres caracteres. Intentalo de nuevo");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (this.edad < 0) {
            throw new Exception("La edad no puede ser negativa. Intentalo de nuevo");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
