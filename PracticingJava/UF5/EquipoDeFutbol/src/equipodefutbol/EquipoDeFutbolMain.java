/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipodefutbol;

import objectes.Entrenador;
import objectes.Futbolista;
import objectes.Presidente;


/**
 *
 * @author shebi
 */
public class EquipoDeFutbolMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolista cr7 = new Futbolista(7, "critiano", 38, 762);
        
        cr7.Concentrarse();
        cr7.Viajar();
        cr7.JugarPartido();
        cr7.Entrenar();
        cr7.saludar();
        
        System.out.println(cr7);
        
        System.out.println("--------------");
        System.out.println("Entrenador");
        
        Entrenador entr = new Entrenador(2, "gabi", 57);
        
        entr.Concentrarse();
        entr.Viajar();
        entr.DirigirPartido();
        entr.Entrenar();
        
        System.out.println(entr);
        
        System.out.println("--------------");
        System.out.println("Presidente");
        
        Presidente mourinho = new Presidente(9, "mourinho", 67, 8);
        
        mourinho.Concentrarse();
        mourinho.Viajar();
        mourinho.Tratar_contrato(entr);
        
        System.out.println(mourinho);
      
    }
    
}
