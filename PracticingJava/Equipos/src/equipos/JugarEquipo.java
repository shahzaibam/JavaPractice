/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class JugarEquipo extends PartidoEquipo{
    
    EquipoEnum equipo;

    public JugarEquipo(String fecha, String hora) {
        super(fecha, hora);
    }

    @Override
    public String diaPartido(String fecha, String hora) {
        String frase  = "";
        Scanner sc = new Scanner(System.in);
//        System.out.println("de que equipo quieres saber ?");
//        String resp;
//        
//        resp = sc.next();
//        
        if(this.fecha == "30/08/2023" && this.hora == "17:00") {
            frase = "El " + equipo.FCBARCELONA + "\nJuega contra el " + equipo.REALMADRID + " el dia " + this.fecha + " a las " + this.hora;
        }else if(this.fecha == "01/07/2023" && this.hora == "16:00") {
            frase = "El " + equipo.REALMADRID + "\nJuega contra el " + equipo.VALENCIA + " el dia " + this.fecha + " a las " + this.hora;
        }else if(this.fecha == "31/07/2023" && this.hora == "21:00") {
            frase = "El " + equipo.VALENCIA + "\nJuega contra el " + equipo.FCBARCELONA + " el dia " + this.fecha + " a las " + this.hora;
        }
        
        return frase;
                
    }

    @Override
    public String toString() {
        return diaPartido(fecha, hora) ;
    }
    
    
    
    
}
