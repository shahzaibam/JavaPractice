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
public class ArraySumaPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int [8];
        
        for (int i = 0; i<num.length; i++) {
            System.out.println("Introduce la nota " + (i+1));
            num[i] = sc.nextInt();
        }
        
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        
        for (int i = 0; i<num.length; i++) {
            if(num[i]>0) {
                sumaPositivos = sumaPositivos + num[i];
            }else if(num[i]<0) {
                sumaNegativos = sumaNegativos + num[i];
            }
        }
        
        System.out.println("la suma total de positivos es " + sumaPositivos);
        System.out.println("la suma total de negativos es " + sumaNegativos);
    }
    
    
}
