/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclashroyal.pkg2;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class EjercicioClashRoyal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quantes copes tens aconseguides?");
        Scanner sc = new Scanner(System.in);
        int copes = sc.nextInt();
        
        if(copes<2000) {
            System.out.println("Tria una carta d'aquestes");
            System.out.println("M.- Mago Electrico");
            System.out.println("E.- Esbirro Mega");
            char option = sc.next().charAt(0);
            switch (option) {
                case 'm':
                case 'M':
                    System.out.println("Has escollit Mago Electrico");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escollit Esbirro Mega");
                    break;
                default:
                    System.out.println("Aquesta carta no existeix");
            }
        } else if(copes>2000 && copes<3000 ){
            System.out.println("Tria una carta d'aquestes");
            System.out.println("M.- Cavallero");
            System.out.println("E.- Bandida");
            char option = sc.next().charAt(0);
            switch (option) {
                case 'm':
                case 'M':
                    System.out.println("Has escollit Cavallero");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escollit Bandida");
                    break;
                default:
                    System.out.println("Aquesta carta no existeix");
            }
        } else if(copes>=3000) {
            System.out.println("Tria una carta d'aquestes");
            System.out.println("M.- Ejercitos de Esqueletos");
            System.out.println("E.- Gigante");
            char option = sc.next().charAt(0);
            switch (option) {
                case 'm':
                case 'M':
                    System.out.println("Has escollit Ejercitos de Esqueletos");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escollit Gigante");
                    break;
                default:
                    System.out.println("Aquesta carta no existeix");
            }
        }
    }   
}
    


