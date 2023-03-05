/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author shebi
 */
public enum ColorEnum {
    BLACK("Black"), WHITE("White"), GREEN("Green"), BLUE("Blue");
    
    protected String color;

    private ColorEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    
}
