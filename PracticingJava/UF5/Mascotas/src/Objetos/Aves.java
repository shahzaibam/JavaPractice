/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public abstract class Aves extends Mascotas{
    
    protected Picos pico;
    protected boolean vuela;
    
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, Picos pico, String vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        
        this.pico = pico;
        
        if(vuela.equalsIgnoreCase("si")) {
            this.vuela = true;
        }else{
            this.vuela = false;
        }
     
    }
    
    public boolean volar() {
        if(this.edad > 5) {
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
}
