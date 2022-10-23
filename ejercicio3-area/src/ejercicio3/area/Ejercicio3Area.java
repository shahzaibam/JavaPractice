/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.area;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ejercicio3Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Numero de lados para calcular el area");
        double lado = new Scanner(System.in).nextDouble();
        double area = lado * lado;
        System.out.println("El area es de " + area);
    }
    
}
