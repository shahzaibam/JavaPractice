/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public class Perro extends Mascotas{
    
    protected RazasPerros raza;
    protected boolean pulgas;
    
    public Perro(String nombre, int edad, String estado, String fechaNacimiento, RazasPerros raza, String pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        if(pulgas.equalsIgnoreCase("si")) {
            this.pulgas = true;
        }else{
            this.pulgas = false;
        }
    }



    @Override
    protected boolean habla() {
        return super.habla(); 
    }

    @Override
    protected boolean morir() {
        return super.morir();
    }

    @Override
    protected void cumpleanyos() {
        super.cumpleanyos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "pulgas : " + this.pulgas + " raza : " + this.raza + "\n" +"Morir : " + morir(); 
    }

    
    
    
    
}
