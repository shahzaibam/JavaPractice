/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author shebi
 */
public enum TipoVehiculos {
    TURISMO("HYUNDAI", 2018), CAMION("PEUGEOT", 2007), MOTO("HONDA", 2019);
    
    protected String marca;
    protected int modelo;

    private TipoVehiculos(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "TipoVehiculos{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
    
}
