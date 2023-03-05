/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public enum Picos {
    LARGO("Largo"), FINO("Fino"), GRUESO("Grueso"), CORTO("Corto");
    
    protected String tipoPico;

    private Picos(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    
}
