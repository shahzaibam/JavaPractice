/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PracticandoFunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Que nota sacaste en la primera");
//        double nota1 = sc.nextInt();
//        
//        System.out.println("Que nota sacaste en la segunda");
//        double nota2 = sc.nextInt();
//        
//        System.out.println("Que nota sacaste en la tercera");
//        double nota3 = sc.nextInt();
//        
//        double nota = notaFinal(nota1, nota2, nota3);
//        
//        System.out.println(nota);
//////////////////////////////////////////////////////////////////////////////

//        System.out.println("Escribe el total de la compra");
//        int precioTotal = sc.nextInt();
//        
//        double total = calcularIva(precioTotal);
//        double precioFinal = precioTotal+total;
//                
//        System.out.println("el precio final es " + precioFinal);

/////////////////////////////////////////////////////////////////////////////

//        System.out.println("Que tabla de multiplicar quieres calcular?");
//        int num = sc.nextInt();
//
//        calcularTablaMultiplicar(num);

/////////////////////////////////////////////////////////////////////////////
//        boolean siNo = esPrimo(23);
//        System.out.println(siNo);
        
/////////////////////////////////////////////////////////////////////////////
//
//        System.out.println("Cuanto salario tienes?");
//        double salario = sc.nextDouble();
//        
//        System.out.println("Cuanto porcentaje te ha incrementado el salario");
//        double incremento = sc.nextDouble();
//        
//        double salarioConPorcentaje = CalcularPorcentajeSalario(salario, incremento);
//        System.out.println(salarioConPorcentaje);

////////////////////////////////////////////////////////////////////////////

        
//        System.out.println("Que figura quieres calcular? Circulo, Triangulo, Cuadrado");
//        String figura = sc.nextLine();
//        
//        double hola = calcularArea(figura);
//        System.out.println(hola);

//////////////////////////////////////////////////////////////////////////

        System.out.println("De que numero quieres hacer el factorial");
        int numFact = sc.nextInt();
        int resulFact = factorial(numFact);
        
        System.out.println(resulFact);


    }
    
    public static double notaFinal(double nota1, double nota2, double nota3) {
        return nota1*0.3+nota2*0.3+nota3*0.4;
    }
    
    public static double calcularIva(int precio) {
        return precio*0.19;
    }
    
    public static void calcularTablaMultiplicar(int num) {
        int operacion;
        for (int i = 0; i <= 12; i++) {
            operacion = num*i;
            System.out.println(num + " x " + i + " = " + operacion);
        }
        
    }
    
    public static boolean esPrimo(int primo){
        if(primo<=1) {
            return false;
        }else if(primo == 2) {
            return true;
        }else {
            for (int i = 2; i < primo; i++) {
                if(primo%i == 0) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static double CalcularPorcentajeSalario(double salario, double incremento) {
        double salarioConIncremento = salario*incremento/100;
        
        double salarioFinal = salario+salarioConIncremento;
        
        return salarioFinal;

    }

    public static double calcularArea(String figura) {
        
        Scanner sc = new Scanner(System.in);
        
        double calculoFigura = 0;
        double radio = 0;
        double base = 0;
        final double pi = 3.14;
        double altura = 0;
        double lado = 0;
        
        if(figura.equalsIgnoreCase("Circulo")){
            System.out.println("cual es el radio del circulo?");
            radio = sc.nextDouble();
            calculoFigura = Math.pow(radio, 2)*pi;
        }else if(figura.equalsIgnoreCase("Triangulo")) {
            System.out.println("Cual es la base del triangulo?");
            base = sc.nextDouble();
            
            System.out.println("Cual es la altura?");
            altura = sc.nextDouble();
            
            calculoFigura = (base*altura)/2;
        }else if(figura.equalsIgnoreCase("Cuadrado")) {
            System.out.println("Escribe el lado del cuadrado");
            lado = sc.nextDouble();
            calculoFigura = lado*lado;
        }
        return calculoFigura;
    }
    
    public static int factorial(int num) {
        int operacion = 0;
        int sumaFactorial = 0;
        int numMult = num;
        System.out.println(num);
        System.out.println(numMult);
        while(!(numMult <1)) {
            System.out.println("esto es " + numMult);
            operacion = num * numMult;
            System.out.println(num + " x " + (numMult) + " = " + operacion);
            sumaFactorial = sumaFactorial + operacion;
            
            numMult--;
        }
        
        System.out.println(sumaFactorial);
      
        return operacion;
    }
    
    /**
	Invertir una cadena en Java, método 1
	@author shas4605
*/
//class Main {
//	public static void main(String[] args) {
//		String cadena = "Programando en Java desde parzibyte.me";
//		// Esta será la cadena invertida, primero está vacía
//		String invertida = "";
//		// Recorremos la original del final al inicio
//		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
//			// Y vamos concatenando cada carácter a la nueva cadena
//			invertida += cadena.charAt(indice);
//		}
//		System.out.println("Cadena original: " + cadena);
//		System.out.println("Cadena invertida: " + invertida);
//
//	}
//}
    
}
