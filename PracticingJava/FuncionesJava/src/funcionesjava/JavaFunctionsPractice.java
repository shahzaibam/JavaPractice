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
public class JavaFunctionsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        //divisiblesTres();
        //aprobadoOno(9,0, true);
        
        //tablasDeMultiplicar();
        
        //passwordAuth();
        
        System.out.println("Escribe el numero que quieres multiplicar");
        int num = sc.nextInt();
        
        for (int i = 0; i < 2; i++) {
                    tablaMultiplicarNum(num);

        }
        
    }
    
    public static void divisiblesTres() {
        
        for (int i = 1; i <= 100; i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }
    
    public static void aprobadoOno(double notaExamen, double notaTrabajoGrupo, boolean ratioAsistencia) {
        double notaExamenPorcentaje = notaExamen * 60/100;
        double notaTrabajoPorcentaje = notaTrabajoGrupo * 40/100;
        double notaFinal = notaExamenPorcentaje + notaTrabajoPorcentaje;
        
        if(notaFinal >= 5 && ratioAsistencia) {
            System.out.println("Enhorabuena has aprobado con un " + notaFinal);
        }else {
            System.out.println("Lo sentimos mucho, no has aprobado te ha quedado un " + notaFinal);
        }
    }
    
    public static void tablasDeMultiplicar() {
        int operacion;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                operacion = i*j;
                System.out.println(i + " x " + j + " = " + operacion);
            }
        }
    }
    
    public static void passwordAuth() {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        int passwd = 6135;
        int passwordIntroducido = 0;
 
        do{
            do{
                System.out.println("Escribe la contraseña");
                passwordIntroducido = sc.nextInt();
            }while(passwordIntroducido >= 9999 && passwordIntroducido < 0); 
            
            intentos++;
            System.out.println("Llevas " + intentos + " intentos");
        }while(!(intentos>3 || passwordIntroducido==passwd));
        
        if(intentos>3) {
            System.out.println("Adios");
        }else{
            System.out.println("Enhorabuena te has logeado");
        }
    }
    
    public static void tablaMultiplicarNum(int num) {
        int operacion;
        for (int i = 1; i <= 10; i++) {
            operacion = num*i;
            System.out.println(num + " x " + i + " = " + operacion);
        }
    }
    
}
