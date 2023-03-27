/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class AgeNotNegativeException extends Exception{

    public AgeNotNegativeException() {
        super("Edad no pot ser negativa");
    }

    public AgeNotNegativeException(String message) {
        super(message);
    }
    
    
    
}
