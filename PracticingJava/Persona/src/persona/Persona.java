/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.Random;

/**
 *
 * @author shebi
 */
public class Persona {

    protected String nombre;
    protected int edad;
    protected String DNI;
    protected char sexo;
    protected double peso;
    protected double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double calculoIMC = this.peso / Math.pow(this.altura, 2);
        int numDevolver = 0;

        if (calculoIMC < 20) {
            numDevolver = -1;
        } else if (calculoIMC <= 20 && calculoIMC >= 25) {
            numDevolver = 0;
        } else if (calculoIMC > 25) {
            numDevolver = 1;
        }

        return numDevolver;

    }

    public boolean esMayordeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean comprobarSexo(char sexo) {
        if(this.sexo == 'H' || this.sexo == 'M') {
            return true;
        }else{
            this.sexo = 'H';
            return false;
        }
    }

    @Override
    public String toString() {
        return  nombre + ", edad es " + edad + ", sexo es " + sexo + ", peso es " + peso + ", altura es " + altura;
    }
    
    public void generaDNI() {
        Random rd = new Random();
        
        int generarDni = rd.nextInt(12345678)+12345678;
        
        int numAlfa = rd.nextInt(3);
        
        char letra;
        
        if(numAlfa == 0) {
            letra = 'A';
        }else if(numAlfa == 1) {
            letra = 'B';
        }else if(numAlfa == 2) {
            letra = 'C';
        }
        
        this.DNI = generarDni + "" + numAlfa;
        
    }
    
    

}
