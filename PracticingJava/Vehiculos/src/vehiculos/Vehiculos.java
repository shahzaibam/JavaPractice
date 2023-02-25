/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author shebi
 */
public abstract class Vehiculos {
    protected String nombre;
    protected int modelo;
    protected TipoVehiculos tipoVehiculo;

    protected abstract void comprobarVehiculo();

    @Override
    public String toString() {
        return "Vehiculo --> " + "nombre es " + nombre + " y modelo es" + modelo;
    }
    
    
    
}
