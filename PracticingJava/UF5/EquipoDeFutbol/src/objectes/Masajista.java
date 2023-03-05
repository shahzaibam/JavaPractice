/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author shebi
 */
public class Masajista extends EquipoDeFutbol{

    protected String titulacion;

    public Masajista(int id, String nombre, int edad, String titulacion) {
        super(id, nombre, edad);
        this.edad = 30;
        this.titulacion = "titulo1";
    }
    
    @Override
    public void Viajar() {
        super.Viajar(); 
        
    }

    @Override
    public void Concentrarse() {
        super.Concentrarse(); 
    }

    
    public void Dar_Masaje() {
        System.out.println("yo " + this.nombre + " doy masajes a los lesionados");
    }
    
}
