/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author shebi
 */
public class Futbolista extends EquipoDeFutbol implements PersonaAmable{

    protected int goles;

    public Futbolista(int id, String nombre, int edad, int goles) {
        super(id, nombre, edad);
        this.edad = 20;
        this.goles = 0;
    }

    @Override
    public void Viajar() {
        super.Viajar(); 
        System.out.print(", Viatjo amb primera");
        System.out.println("");
    }

    @Override
    public void Concentrarse() {
        super.Concentrarse(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void JugarPartido() {
        System.out.println(this.nombre + " juego un partido y gano dinero");
        this.salary = this.salary + 1000;
    }
    
    public void Entrenar() {
        System.out.println(this.nombre + " entreno fuerte");
    }

    @Override
    public String toString() {
        return super.toString() + " goles : " + this.goles; 
    }

    @Override
    public void saludar() {
        System.out.println("Hola que tal estas? jo em dic " + this.nombre );
    }


    
    
}
