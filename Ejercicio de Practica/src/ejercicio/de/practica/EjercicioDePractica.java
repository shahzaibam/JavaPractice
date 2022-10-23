/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.de.practica;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class EjercicioDePractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escribe el primer numero");
//        int num1 = sc.nextInt();
//        System.out.println("Escribe el segundo numero");
//        int num2 = sc.nextInt();
//        
//        if(num1<num2) {
//            System.out.println("El numero " + num2 + " es mas grande");
//        } else if(num1>num2){
//            System.out.println("El numero " + num1 + " es mas grande");
//        }else {
//            System.out.println("Los dos numeros son iguales");
//        }

//          Scanner sc = new Scanner(System.in);
//          
//          System.out.println("Escribe un numero para ver si es par o impar");
//          int num1 = sc.nextInt();
//          
//          if(num1%2==0){
//              System.out.println("Este numero es par");
//          }else {
//              System.out.println("Este numero es impar");
//          }

//           Scanner sc = new Scanner(System.in);
//           
//           System.out.println("Escribe el primer numero");
//           int num1 = sc.nextInt();
//           System.out.println("Escribe el segundo numero");
//           int num2 = sc.nextInt();
//           int division = 0;
//           
//           
//           if(num2 != 0){
//               division = num1/num2;
//               System.out.println(division + "es el resultado");
//           }else{
//               System.out.println("Error");
//           }

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Cuanto cuesta el producto");
//            double precioDeVenta = sc.nextDouble();
//            System.out.println("Cuanto porcentaje de iva se le añade");
//            double porcentajeIva = sc.nextInt();
//            
//            double precioTotal = precioDeVenta * porcentajeIva / 100;
//            
//            System.out.println(precioTotal + precioDeVenta);

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Cuantas copas tienes");
            int copes = sc.nextInt();

            switch (copes) {
                case 100:
                    System.out.println("Eres noob");
                    break;
                case 200:
                    System.out.println("Lamentable");
                    break;
                case 300:
                    System.out.println("Personaje");
                    break;
                case 400:
                    System.out.println("Animal");
                    break;
                case 500: 
                    System.out.println("pre animal");
                    break;
            default:
                System.out.println("Persona");
        }
            
           
    }
    
}
