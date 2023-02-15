/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalequipo;

/**
 *
 * @author shebi
 */
public class presidente extends PersonalDeEquipo{
    protected int años_cargo;

    public presidente(int id, int años_cargo,  String nombre) {
        super(id, nombre);
        this.años_cargo = años_cargo;
    }
    
    
}
