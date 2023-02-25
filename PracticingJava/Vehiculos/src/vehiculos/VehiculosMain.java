/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author shebi
 */
public class VehiculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculos primer = new ComprobarVehiculo();
        TipoVehiculos hyundai = TipoVehiculos.TURISMO;
        
        System.out.println(hyundai);
        primer.comprobarVehiculo();
        
        System.out.println(primer);
    }
    
}
