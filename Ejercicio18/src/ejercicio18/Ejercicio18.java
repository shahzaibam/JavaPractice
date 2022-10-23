/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe aquí las horas que trabajas");
        double horas = sc.nextInt();
        
        System.out.println("Escribe cuanto cobras por la hora");
        double precio_hora = sc.nextDouble();
        
        if(horas>35) {
            double salarioHorasNormales = 35*precio_hora;
            double h_extra = horas-35;
            double salario_extra = precio_hora*h_extra*1.5;
            double salario = salario_extra + salarioHorasNormales;
            
            System.out.println("Tu salario es " + salario);
        } else {
            double salario = horas*precio_hora;
            System.out.println("Tu salario es " + salario);
        }
        
    }
    
}
