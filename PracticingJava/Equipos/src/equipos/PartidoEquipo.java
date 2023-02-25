/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;

/**
 *
 * @author shebi
 */
public abstract class PartidoEquipo {
    protected String fecha;
    protected String hora;

    public PartidoEquipo(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    protected abstract String diaPartido(String fecha, String hora);

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    

    @Override
    public String toString() {
        return "fecha= " + fecha + ", hora= " + hora;
    }
    
    
}
