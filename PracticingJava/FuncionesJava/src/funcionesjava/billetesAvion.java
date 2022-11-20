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
public class billetesAvion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBilletesEconomy = 10;
        int numBilletesBusiness = 30;
        int numBilletesExecutive = 5;
        double precioAcumulativo = 0;
        
        
        String quieresSeguir;
        
        do{
            
            System.out.println("Con cual divisa quieres pagar? - Euro / Dollar");
            String respuesta = sc.nextLine();
            String tipoDivisa;
        
            tipoDivisa = divisa(respuesta);

            System.out.println("Que tipo de billete quieres comprar ? (Economy, Business, Executive)");
            String tipoBillete = sc.nextLine();
        
            double precioBillete  = seleccionarBillete(tipoBillete, numBilletesEconomy, numBilletesBusiness, numBilletesExecutive);
        
            double precioFinal = 0;
            if("EURO".equals(tipoDivisa.toUpperCase())) {
                precioFinal = precioBillete*1.09;
            }else if("DOLLAR".equals(tipoDivisa.toUpperCase())) {
                precioFinal = precioBillete*0.96;
            }
        
        
            System.out.println("Quieres seguir comprando? SI/NO");
            quieresSeguir = sc.nextLine().toUpperCase();
            
            if("SI".equals(quieresSeguir)) {
                precioAcumulativo = precioAcumulativo + precioFinal;
            }else{
                System.out.println("el precio final es de " + precioFinal);
            }
            

        }while(!("NO".equals(quieresSeguir)));
        
    }
    
    public static String divisa(String respuesta) {

        switch (respuesta.toUpperCase()) {
            case "EURO":
                System.out.println("Has seleccionado euro");
                break;
            case "DOLLAR":
                System.out.println("Has seleccionado dollar");
                break;
        }
        
        return respuesta;
    }

    public static int seleccionarBillete(String tipoBillete, int numBilletesEconomy, int numBilletesBusiness, int numBilletesExecutive) {
        Scanner sc = new Scanner(System.in);
        
        int precioBilletesEconomy = 150;
        
        int precioBilletesBusiness = 300;
        
        int precioBilletesExecutive = 500;
        int precio = 0;
        
        int cantidadBilletes;
        
        

        switch (tipoBillete.toUpperCase()) {
            case "ECONOMY":              

                do{
                    System.out.println("cuantos quieres compraer del economy? ");
                    cantidadBilletes = sc.nextInt();
                } while(!(cantidadBilletes <= numBilletesEconomy));
                
                numBilletesEconomy = numBilletesEconomy - cantidadBilletes;
                                    
                precio = precioBilletesEconomy*cantidadBilletes;

                //System.out.println("El precio de los billetes es " + precio);
                System.out.println("Quedan " + numBilletesEconomy + " de economic");
                    
                break;
            case "BUSINESS":
                
                do{
                    System.out.println("cuantos quieres compraer del Business? ");
                    cantidadBilletes = sc.nextInt();
                } while(!(cantidadBilletes<=numBilletesBusiness));

                numBilletesBusiness = numBilletesBusiness- cantidadBilletes;
                
                precio = precioBilletesBusiness*cantidadBilletes;
                
                //System.out.println("El precio de los billetes es " + precio);
                System.out.println("Quedan " + numBilletesBusiness + " de Business");
                break;  
            case "EXECUTIVE":

                do{
                    System.out.println("cuantos quieres compraer del Executive? ");
                    cantidadBilletes = sc.nextInt();
                }while(!(cantidadBilletes<=numBilletesExecutive));
                
                numBilletesExecutive = numBilletesExecutive- cantidadBilletes;
                
                precio = precioBilletesExecutive*cantidadBilletes;
                
                //System.out.println("El precio de los billetes es " + precio);
                System.out.println("Quedan " + numBilletesExecutive + " de Executive");
                break; 
        }
        
        return precio;
    }
    
    
}
