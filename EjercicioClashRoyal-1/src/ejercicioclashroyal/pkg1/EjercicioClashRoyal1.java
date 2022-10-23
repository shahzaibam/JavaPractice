/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyal.pkg1;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class EjercicioClashRoyal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("******************************");
        System.out.println("Quina carta vols?");
        System.out.println("0.- Mago Electrico");
        System.out.println("1.- Esbirro Mega");
        
        Scanner sc = new Scanner(System.in);
        
        int option = sc.nextInt();
        
        switch (option) {
            case 0:
                System.out.println("Has escollit Mago Electrico");
                break;
            case 1:
                System.out.println("Has escollit Esbirro Mega");
                break;
            default:
                System.out.println("Esta carta no existe");
        }
        
    }
    
}
