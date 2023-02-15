/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalequipo;

/**
 *
 * @author shebi
 */
public class entrenador extends PersonalDeEquipo{
    protected boolean tiene_titulo;

    public entrenador(int id, String nombre, boolean tiene_titulo) {
        super(id, nombre);
        this.tiene_titulo = tiene_titulo;
    }

    public boolean isTiene_titulo() {
        return tiene_titulo;
    }

    public void setTiene_titulo(boolean tiene_titulo) {
        this.tiene_titulo = tiene_titulo;
    }

    
}
