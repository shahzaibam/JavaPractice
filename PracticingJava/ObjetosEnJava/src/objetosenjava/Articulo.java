/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class Articulo {
    private String nombre;
    private double precio;
    private final double IVA = 0.21;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    
    public void imprimir() {
        System.out.println("-Nombre : " + this.nombre + " -Precio : " + this.precio + " -Quedan " + this.cuantosQuedan);
    }
    
    public void getPVP() {
        this.precio = this.precio + (this.precio*IVA);
    }
    
    public void getPVPDescuento(Articulo ej, double descuento) {
        this.precio = this.precio - descuento;
    }
    
    public void vender(Articulo ej) {
        
    }
    
    public void almacenar(Articulo ej) {
        
    }
}
