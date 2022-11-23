
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shebi
 */
public class practicandoRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hasta que numero quieres hacer la suma");
//        
//        int num = sc.nextInt();
//        int sumaTotal = sumaNumeros(num);
//        
//        System.out.println(sumaTotal);
        
//        int numTotal = imprimirNum(6);
//        System.out.println(numTotal);

         imprimirNumInv(123);

    }
    
    public static int sumaNumeros(int num) {
        
        int suma = 0;
        
        if(num == 0) {
            return 1;
        }else if(num==1) {
            return 1;
        }
        else if(num>1) {
            System.out.println(num + "hola");
            suma = num+sumaNumeros(num-1);
        }
        
        return suma;
    }
    
    public static int imprimirNum(int numMax) {
        
        int num = 0;
        
        if(numMax==0) {
            return 0;
        }else if(numMax>0) {
            System.out.println(numMax);
            num = imprimirNum(numMax-1);        
        }
        
        return num;
    }
    
    public static void imprimirNumInv(int num) {
        
        
        if(num<10) {
            System.out.println(num);
        }else{
            System.out.print(num%10);
            imprimirNum(num/10);
        }

    }
    
}
