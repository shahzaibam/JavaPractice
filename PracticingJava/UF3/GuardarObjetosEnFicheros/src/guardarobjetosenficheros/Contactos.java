/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardarobjetosenficheros;

import java.io.Serializable;

/**
 * serializable es la interface que permetra que guardem objectes de contacto a fitxers
 * @author shas4605
 */
public class Contactos implements Serializable{ 
    private String name;
    private int age;

    public Contactos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name --> " + name + "---- age --> " + age;
    }
    
    
}
