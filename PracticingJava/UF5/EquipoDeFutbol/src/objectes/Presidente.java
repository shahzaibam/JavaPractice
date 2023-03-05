/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author shebi
 */
public class Presidente extends EquipoDeFutbol{

    protected int anyos_cargo;

    public Presidente(int id, String nombre, int edad, int anyos_cargo) {
        super(id, nombre, edad);
        this.edad = 65;
        this.anyos_cargo = 4;
    }
    
    @Override
    public void Viajar() {
        super.Viajar(); 
        System.out.print(", Viatjo amb especial");
        System.out.println("");
    }

    @Override
    public void Concentrarse() {
        super.Concentrarse(); 
    }


    
    public void irPalcoPartido() {
        System.out.println("yo " + this.nombre + " voy al palco del partido");
    }
    
    public void Tratar_contrato(EquipoDeFutbol equipo) {
        if(equipo instanceof Entrenador) {
            System.out.println("Tenen que millorar el seu joc");
        }else if(equipo instanceof Futbolista) {
            System.out.println("Si vols cobrar mes, has de fer mes gols");
        }else if(equipo instanceof Masajista) {
            System.out.println("Com es lesioni algu, et foto fora");
        }
    }
    
}
