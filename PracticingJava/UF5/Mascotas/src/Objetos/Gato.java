/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public class Gato extends Mascotas{
    
    protected ColorEnum color;
    protected boolean peloLargo;
    
    public Gato(String nombre, int edad, String estado, String fechaNacimiento, ColorEnum color, String peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        if(peloLargo.equalsIgnoreCase("si")) {
            this.peloLargo = true;
        }else{
            this.peloLargo = false;
        }
    }

    @Override
    protected boolean habla() {
        return super.habla();
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "Color: " + this.color + " Pelo Largo : " + this.peloLargo;
    }
    
    
    
    
}
