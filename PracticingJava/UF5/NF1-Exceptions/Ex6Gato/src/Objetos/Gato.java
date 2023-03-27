/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Gato {
    private String nombre;
    private int edad;

    public Gato() {
        nombre = "Tom";
        edad = 10;
    }

    
    public Gato(String nombre, int edad) throws AgeNotNegativeException, Exception  {
        this.setEdad(edad);
        this.setNombre(nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        
        if (nombre.length()>=3)
            {
                this.nombre = nombre;
            }
        else
            {
                throw new Exception("El nombre debe tener 3 caracteres");
            }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws AgeNotNegativeException {
        if (edad>=0)
        {
            this.edad = edad;
        }
        else
        {
            throw new AgeNotNegativeException();
        }
    }
    
    
    
}
