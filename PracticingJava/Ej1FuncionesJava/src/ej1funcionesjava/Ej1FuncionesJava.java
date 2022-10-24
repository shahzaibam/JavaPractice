/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1funcionesjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class Ej1FuncionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un Numero");
        int dimeNumero = sc.nextInt();
        
        int signo = dimeSigno(dimeNumero);
        
        System.out.println( signo );
        
    }
    
    public static int dimeSigno(int dimeNumero) {
        int numSigno;
        if(dimeNumero>0) {
            numSigno = 1;
        }else if(dimeNumero<0) {
            numSigno = -1;
        }else{
            numSigno = 0;
        }
        
        return numSigno;
    }
    
}
