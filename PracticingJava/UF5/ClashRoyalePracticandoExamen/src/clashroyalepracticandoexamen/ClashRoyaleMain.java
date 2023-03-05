/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalepracticandoexamen;

import objetos.CartesEnum;
import objetos.CofreArgent;
import objetos.CofreOr;
import objetos.CofreOrCorones;

/**
 *
 * @author shebi
 */
public class ClashRoyaleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CofreArgent argent = new CofreArgent();
        
        argent.obrirCofre();
        System.out.println(argent);
        
        System.out.println("------------------------");
        System.out.println("ORO");
        
        CofreOr or = new CofreOr();
        
        or.obrirCofre();
        System.out.println(or);
        
        System.out.println("-----------------------");
        System.out.println("CORONES");
        
        CofreOrCorones corones = new CofreOrCorones();
        
        corones.obrirCofre();
        
        System.out.println(corones);
    }
    
}
