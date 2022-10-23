/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalebucles;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class ClashRoyaleBucles {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("quin nivell te el teu llenyataire?");
        int nivellLenyataire = sc.nextInt();
        
        
        while(nivellLenyataire <9 || nivellLenyataire > 13) {
            System.out.println("Posa un nivell entre 9 y 13");
            System.out.println("quin nivell te el teu llenyataire?");
            nivellLenyataire = sc.nextInt();
        }
        
        System.out.println("quin nivell te la torre atacada?");
        int nivellTorre = sc.nextInt();
        

        
        while(nivellTorre <9 || nivellTorre > 13) {
            System.out.println("Posa un nivell entre 9 y 13");
            System.out.println("quin nivell te la teva torre?");
            nivellTorre = sc.nextInt();
        }
        
        System.out.println("Nivel Lenyataire: "+nivellLenyataire);
        System.out.println("Nivel Torre: " + nivellTorre);
        
        int danoLenyataire = 0;     
        int danoTorre = 0;
        int puntosVidaTorre = 0;
        int puntosVidaLenyataire = 0;
        
        switch (nivellLenyataire) {
            case 9:
                danoLenyataire =  200;
                puntosVidaLenyataire = 1060;
                break;
            case 10:
                danoLenyataire =  220;
                puntosVidaLenyataire = 1166;
                break;
            case 11:
                danoLenyataire =  242;
                puntosVidaLenyataire = 1282;
                break;
            case 12:
                danoLenyataire =  266;
                puntosVidaLenyataire = 1409;
                break;
            case 13:
                danoLenyataire =  292;
                puntosVidaLenyataire = 1547;
                break;
        }
        
        switch (nivellTorre) {
            case 9:
                danoTorre = 90;
                puntosVidaTorre =  2534;
                break;
            case 10:
                danoTorre = 99;
                puntosVidaTorre =  2786;
                break;
            case 11:
                danoTorre = 109;
                puntosVidaTorre =  3052;
                break;
            case 12:
                danoTorre = 119;
                puntosVidaTorre =  3346;
                break;
            case 13:
                danoTorre = 131;
                puntosVidaTorre =  3668;
                break;
        }

        int contadorGolpesLenyataire = 0;
        int contadorGolpesTorre = 0;
        
        while(!(puntosVidaTorre <= 0) && !(puntosVidaLenyataire <= 0)) {
                        
            puntosVidaTorre = puntosVidaTorre - danoLenyataire;
            puntosVidaLenyataire = puntosVidaLenyataire - danoTorre;
            //puntosVidaLenyataire = puntosVidaLenyataire - danoTorre*2; //la torre ataca més rapid
            
            contadorGolpesLenyataire ++;
            contadorGolpesTorre ++;
            Thread.sleep(1000);
            System.out.println("Leñador ataca con fuerza de valor "  + danoLenyataire + " La torre le queda de vida =" + puntosVidaTorre);
            System.out.println("Torre ataca con fuerza de valor "  + danoTorre + " Lenyataire le queda de vida =" + puntosVidaLenyataire);
            System.out.println("******************************************");
        }
        

        
        System.out.println("Lenyataire ha atacado " + contadorGolpesLenyataire);
        System.out.println("La torre ha atacado " + contadorGolpesTorre);
        System.out.println("**********************************************");
        System.out.println("Lenyataire tiene de vida = "  + puntosVidaLenyataire);        
        System.out.println("La torre tiene de vida = "  + puntosVidaTorre);
        
        System.out.println("**********************************************");
        if(puntosVidaLenyataire<=0) {
            System.out.println("La torre ha ganado!!");
        } else {
            System.out.println("El lenyataire ha ganado!!");
        }
        
    }
    
}
