/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public enum RazasPerros {
    LABRADOR("Labrador"), PUGS("Pugs"), HUSKY("Husky"), PITBULL("Pitbull");
    
    protected String nombrePerro;

    private RazasPerros(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }
    
    
}
