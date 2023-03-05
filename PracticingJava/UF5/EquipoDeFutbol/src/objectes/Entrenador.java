/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author shebi
 */
public class Entrenador extends EquipoDeFutbol implements PersonaAmable {

    protected boolean tiene_titulo;

    public Entrenador(int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.edad = 40;
        this.tiene_titulo = true;
    }

    @Override
    public void Viajar() {
        super.Viajar();
        System.out.print(", Viatjo amb primera");
        System.out.println("");
    }

    @Override
    public void Concentrarse() {
        super.Concentrarse();
    }

    public void DirigirPartido() {
        System.out.println(this.nombre + " dirigo el partido");
    }

    public void Entrenar() {
        System.out.println("yo " + this.nombre + " entreno a los jugadores");
    }

    @Override
    public void saludar() {
        System.out.println("Hola que tal estas? jo em dic " + this.nombre);
    }

}
