/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.Objects;

/**
 *
 * @author shebi
 */
public class Clientes {
    private String nombre;
    private String numeroCuenta;
    private double saldo;

    public Clientes(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    //para que el metodo hashSet no imprima duplicados, hacemos un equals por nombre, si dos nombre son iguales
    //el segundo nombre no lo guardará
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Clientes)) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        return this.nombre == other.nombre;
    }

    
    
}
