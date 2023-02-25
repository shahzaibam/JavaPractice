/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class ComprobarVehiculo extends Vehiculos {

    @Override
    protected void comprobarVehiculo() {
        Scanner sc = new Scanner(System.in);
        String vehiculoAelegir;
        do {
            System.out.println("Que vehiculo quieres ?");
            vehiculoAelegir = sc.next();
        } while (!(vehiculoAelegir.equalsIgnoreCase(tipoVehiculo.getMarca())));

    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    

}
