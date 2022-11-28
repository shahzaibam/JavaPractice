/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class PracticandoRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("de que numero quieres hacer un factorial");
//        int num = sc.nextInt();
//        
//        int calculoFactorial = factorial(num);
//        System.out.println(calculoFactorial);
//        
//        int sumaNatural = sumaNumNatural(num);
//        System.out.println(sumaNatural);
//        
//        System.out.println("cuantos dias has comido turron?");
//        int dia = sc.nextInt();
        
//        int calorias = caloriasTurron(12);
//        
//        System.out.println(calorias);
//        
//        System.out.println("cuantos dias ha estado el virus?");
//        int dia = sc.nextInt();
//        
//        int numVirus = numDeVirus(dia);
//        
//        System.out.println(numVirus);
        
//        System.out.println("hasta que numero quieres sumar");
//        System.out.println("escribe un num");
//        int num = sc.nextInt();
//        int total = sumaNnums(num);
//        
//        System.out.println(" = " + total);
        
//        int sumaParell = sumaParells(12);
//        System.out.println(sumaParell + " hola");
        
//        int sumaDif = sumaValores(4,4);
//        System.out.println(" la suma de la diferencia es " + sumaDif );
        
//        int opera =  InvertirNumSuma(num);
//        System.out.println(opera);
//        
//        numInvertido(num);
        
//        String frase = recorrerPalabra("hello");
//        System.out.println(frase);

//        int genNum = generarCantidadNum(num);
//        System.out.println(genNum);
        
//        maximComuDivisor(36);
        
        numNaturalaBinario(24);
        
        System.out.println("con que base quieres hacer la operacion");
        int base = sc.nextInt();
        
        System.out.println("con que potencia quieres hacer la operacion");
        int potencia = sc.nextInt();
        
        double operacion = potenciaDeNum(base,potencia);
        System.out.println(operacion);
    }
    
//    public static int factorial(int num) {
//        
//        
//        if(num==1) {
//            return 1;
//        }else if(num>0) {
//            return num*factorial(num-1);
//        }
//        
//        return -1;
//        
//    }
    
//    public static int sumaNumNatural(int num) {
//        
//        int suma = 0;
//        
//        if(num==0) {
//            return suma = suma+0;
//        }else if(num>0) {
//            return suma = suma+num+(sumaNumNatural(num-1));
//        }
//        
//        return -1;
//    }
    
//    public static int caloriasTurron(int dia) {
//        
//        int calorias= 91;
//        if (dia==0){
//            return 0;
//        }else if (dia%3==0){
//            return (1*calorias)+caloriasTurron(dia-1);
//        }
//        else if (dia>0){
//            return (4*calorias)+caloriasTurron(dia-1);
//        }
//        
//        return -1;
//    }
    
//    public static int numDeVirus(int dia) {
//        
//        
//        if(dia==1){
//            return 1;
//        }else if(dia>1) {
//            return 3*numDeVirus(dia-1);
//        }
//        
//        return -1;
//    }
    
    
//    public static int sumaNnums(int num) {
//        if(num == 0) {
//            return 0;
//        }else if(num>0) {
//            System.out.print(num + " + ");
//            return num+sumaNnums(num-1);
//        }
//        
//        return -1;
//    }
    
    public static int sumaParells(int num) {
        if(num==2) {
            return 2;
        }else if(num%2 == 1) {
            return -11;
        }else if(num%2 == 0) {
            return num+sumaParells(num-2);
        }
        
        return -1;
    }
    
    public static int sumaValores(int min, int max) {
        if(min == max) {
            return min;
        }else if(min<max) {
            return max+sumaValores(min, max-1);
        }
        
        return -1;
    }
    
    public static void numInvertido(int num) {
        if(num<10) {
            System.out.print(num);
        }else {
            System.out.print(num%10);
            numInvertido(num/10);
        }
    }
    
    public static int InvertirNumSuma(int num) {
        
        
        if(num<10) {
            return num;
        }else if(num>10) {
            return num%10 + InvertirNumSuma(num/10);


        }
        
        return -1;
    }
    
//    public static int recorrerPalabra(String palabra) {
//        
//        int length = palabra.length();
//        
//        if(palabra.length() < 1){
//            System.out.println("adioososososoos");
//
//
//        }else if(palabra.length() > 1) {
//            System.out.println("length de la plarbra " + palabra.length());
//            System.out.println("hyey " + recorrerPalabra(palabra.indexOf(palabra.length()-1));
//
//        }
//        
//        return -1;
//
//    }
    
    public static int generarCantidadNum(int num) {
        Random rd = new Random();
        int numAl = 0;
        for (int i = 1; i < num; i++) {
            numAl = rd.nextInt(9+3);
            System.out.println(numAl);
        }
        
        return numAl;

        
    }
    
    public static void maximComuDivisor(int num) {
        if(num == 0) {
            System.out.println(0);
        }else if(num == 1) {
            System.out.println(0);
        }else if(num>1) {
            if(num%2 == 0) {
                System.out.println(num/2 + " --> 2 ");
                maximComuDivisor(num/2);
            }else if(num%3 == 0) {
                System.out.println(num/3 + " --> 3 ");
                maximComuDivisor(num/3);
            }else {
                System.out.println(num/num);
            }
            
        }
        
    }
    
    public static void numNaturalaBinario(int num) {
        if(num<2) {
            System.out.print(1);
        }else if(num>2) {
            numNaturalaBinario(num/2);
            System.out.print(num%2);
        }
    }
  
    public static double potenciaDeNum(int b, int p) {
        if(p==1) {
            return b;
        }else if(p>1) {
            return b*potenciaDeNum(b, p-1);
        }
        
        return -1;
    }
}
