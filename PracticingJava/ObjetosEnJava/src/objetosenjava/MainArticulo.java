/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class MainArticulo {
    public static void main(String[] args) {
        Articulo uno = new Articulo("Kinder Bueno", 1.85, 5);
        
        uno.imprimir();
        
        uno.getPVP();
        
        uno.imprimir();
        
        uno.getPVPDescuento(uno, 0.2);
        
        uno.imprimir();
        
        
        
    }
}
