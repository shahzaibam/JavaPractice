/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    protected void cumpleanyos() {
        System.out.println("Cumple anyos el dia " + this.fechaNacimiento);
    } 
    
    protected boolean morir() {
        if(this.edad>15) {
            return true;
        }else{
            return false;
        }
    }
    
    protected boolean habla() {
        if(this.edad>3) {
            return true;
        }else{
            return false;
        }
    }
}
