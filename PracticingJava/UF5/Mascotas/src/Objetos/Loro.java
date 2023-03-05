/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public class Loro extends Aves{
        
    public Loro(String nombre, int edad, String estado, String fechaNacimiento, Picos pico, String vuela) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
    }
    
    public boolean saluda() {
        if(this.edad>4) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean volar() {
        return super.volar(); 
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Pico : " + this.pico + " Vuela : " + this.vuela;
    }
    
    
    
        
}
