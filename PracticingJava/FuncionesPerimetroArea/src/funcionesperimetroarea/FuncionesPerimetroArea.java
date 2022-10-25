/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesperimetroarea;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class FuncionesPerimetroArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el ancho");
        double ancho = sc.nextDouble();
        
        System.out.println("Escribe el alto");
        double alto = sc.nextDouble();
        
        double calcularPerimetro = perimetroRectangulo(ancho, alto);
        double calcularArea = areaRectangulo(ancho, alto);
        
        System.out.println("El perimetro es de " + calcularPerimetro);
        System.out.println("El area es de " + calcularArea);
    }
    
    public static double perimetroRectangulo(double ancho, double alto) {
        double calculoPerimetro;
        
        calculoPerimetro = (ancho*2) + (alto*2);
        
        return calculoPerimetro;
    }
    
    public static double areaRectangulo(double ancho, double alto) {
        double calculoArea;
        
        calculoArea = ancho*alto;
        
        return calculoArea;
    }
}
