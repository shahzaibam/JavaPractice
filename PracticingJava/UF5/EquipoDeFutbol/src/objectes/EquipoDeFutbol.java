/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author shebi
 */
public abstract class EquipoDeFutbol {
    protected int id;
    protected String nombre;
    protected int edad;
    protected int salary = 1500;

    public EquipoDeFutbol(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    public void Viajar() {
        System.out.print(this.nombre + " viatjo al partit");
    };
    
    
    public void Concentrarse() {
        System.out.println(this.nombre + " em concentro al hotel");
    }

    @Override
    public String toString() {
        return "id : " + id + ", nombre : " + nombre + ", edad : " + edad;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EquipoDeFutbol)) {
            return false;
        }
        final EquipoDeFutbol other = (EquipoDeFutbol) obj;
        return this.id == other.id;
    }
    
    
    
}
