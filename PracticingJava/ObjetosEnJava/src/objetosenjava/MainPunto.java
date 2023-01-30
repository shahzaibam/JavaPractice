/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

import objetosenjava.Punto;

/**
 *
 * @author shebi
 */
public class MainPunto {

    public static void main(String[] args) {
        Punto A = new Punto(4, 1);
        Punto B = new Punto(1, 8);
        Punto C = new Punto(2, -6);

        A.imprime();
        B.imprime();
        C.imprime();
        System.out.println("");

        System.out.println("CAMBIANDO.........");
        System.out.println("");
        A.setXY(0, 1);
        B.setXY(2, 3);
        C.setXY(4, 5);
        
        C.desplaza(6, 5);
        
        C.distancia(C);

        A.imprime();
        B.imprime();
        C.imprime();
    }
}
