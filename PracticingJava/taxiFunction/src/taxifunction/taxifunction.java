/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxifunction;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class taxifunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ida;
        String vuelta;
        String url;
        
        System.out.println("Pon el dia que quieres viajar");
        int dia = sc.nextInt();
        System.out.println("Pon el mes que quieres viajar");
        int mes = sc.nextInt();
        System.out.println("Pon el año que quieres viajar");
        int any = sc.nextInt();
        
        int year = Year.now().getValue();
        System.out.println(year);
        
        getDate(dia, mes, any, year);
        
        System.out.println("De donde quieres que te recogamos");
        ida = sc.nextLine();
        
        System.out.println("Donde quieres que te dejemos");
        vuelta = sc.nextLine();
        
        url = "https://barcelonapickup.es/";
        
        System.out.println(url);
        
    }
    
    public static String getDate(int dia, int mes, int any, int year) {
        boolean correcto;
        String fechaIda = null;
        
        if(mes<=0 || mes>12) {
             System.out.println("Has puesto " + mes + " este mes no existe");
             correcto = false;
        }else{
            correcto = true;
        }
        
        if(mes == 2){
            if(dia<=0 || dia>28){
             System.out.println("Has puesto " + dia + " este mes no tiene tantos dias");
             correcto = false;
            }else{
                correcto = true;
            }
        }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia<=0 || dia>31) {
                System.out.println("Has puesto " + dia + " este mes no tiene tantos dias");
                correcto = false;
            }else{
                correcto = true;
            }
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia<=0 || dia>30){
                System.out.println("Has puesto " + dia + " este mes no tiene tantos dias");
                correcto = false;
            }else{
                correcto = true;
            }
        }
        
        if(any<year) {
            System.out.println("este año es invalido, has de poner un año mayor o igual que " + year);
            correcto = false;
        }
        
        if(correcto==true) {
            fechaIda = " el dia que quieres viajar es " + dia + "/"  + mes  + "/" + any;
        }
        
        return fechaIda;

    }
    
    
}
