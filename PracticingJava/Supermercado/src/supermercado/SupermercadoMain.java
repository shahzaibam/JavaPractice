/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class SupermercadoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int neveraTemp = 0;
        
        System.out.println("Que temperatura tiene la nevera?");
        neveraTemp = sc.nextInt();
        
        ArticleAlimentariRefrigerat uno = new ArticleAlimentariRefrigerat();
        uno.setNom("Yogur");
        uno.setFabricant("DANONE");
        uno.setPreu(100);
        uno.setCodiEAN("1234567890123");
        uno.setData("17/05/2018");
        uno.setTemperaturaConservacio(5);
        System.out.println("Precio = " + uno.getPVP());
        
        if(uno.getTemperaturaConservacio() == neveraTemp) {
            System.out.println("Es true");
        }else {
            System.out.println("Es false");
        }
        
        ArticleVestir av = new ArticleVestir();
        av.setPreu(100);
        System.out.println("PVP: " + av.getPVP());
    }
    
}
