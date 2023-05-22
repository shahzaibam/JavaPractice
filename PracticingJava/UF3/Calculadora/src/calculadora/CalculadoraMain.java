/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author shebi
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        
        double suma =  calc.sumar(5, 10);
        System.out.println(suma);
        
        double resta =  calc.restar(5, 10);
        System.out.println(resta);
        
        double multi =  calc.multiplicar(5, 10);
        System.out.println(multi);
        
        double dividir =  calc.dividir(5, 10);
        System.out.println(dividir);
        
        
    }
}
