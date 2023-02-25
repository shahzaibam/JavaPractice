/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;

/**
 *
 * @author shebi
 */
public enum EquipoEnum {
    FCBARCELONA("BARCELONA", "1000M"), REALMADRID("REAL MADRID", "950M"), VALENCIA("VALENCIA", "700M");
    
    private String nombreEquipo;
    private String precioEquipo;

    private EquipoEnum(String nombreEquipo, String precioEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.precioEquipo = precioEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPrecioEquipo() {
        return precioEquipo;
    }

    @Override
    public String toString() {
        return "nombreEquipo=" + nombreEquipo + ", precioEquipo=" + precioEquipo;
    }
    
}