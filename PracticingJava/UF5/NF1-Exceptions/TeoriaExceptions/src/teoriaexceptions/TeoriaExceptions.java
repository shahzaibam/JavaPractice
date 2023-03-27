/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TeoriaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try
        {
            
            // 2 variables numeriques
            //la segona val 0
            //fer la divisio primera entre segona i mostrar
            //mostrar resultat
//        try
//            {
//            int a=6,b=0;
//            double div = a/b;
//            System.out.println("resultat" + div);
//            }
//        catch (Exception e)
//                {
//                    System.out.println("Exception generada en main " + e.getMessage());
//                    e.printStackTrace(); //dintre mostra el volcat que ens mostra per defecte
//                    //java ...
//                }
            //declareu un array de int de 3 posicions
            //recorreu el arrat de la posicio 0
            //fins que la posicio menor de 10
            //mostra el array[posicio]
//        int[] valores = new int[3];
//        for (int i = 0; i < 10; i++) {
//            System.out.println(valores[i]);
//        }
            
            //pedir al usuario un entero
            //al ejecutarlo en lugar de poner numero
            //pon la letra a
            
            try
            {
                metodoPedirEntero();
            }
            catch (InputMismatchException ex)
            {
                System.out.println("No has puesto un entero. Estoy en el main");
            }
            
            
            pausa1segundo();
            
            
            
            System.out.println("Final programa");
            
        }
        catch (InterruptedException ex)
        {
            System.out.println("Pausa interrumpida" + ex.getMessage());
        }
        
    }

    private static void metodoPedirEntero() {
        Scanner sc = new Scanner(System.in);
        int valor ;
        boolean dato_correcto=true;

            System.out.println("Pon un entero");
            valor = sc.nextInt(); //InputMismatch Exception
            dato_correcto=true;
    }

    private static void pausa1segundo() throws InterruptedException {

            Thread.sleep(1000);

    }
    
}
