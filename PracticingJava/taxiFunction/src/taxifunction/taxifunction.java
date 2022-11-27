/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxifunction;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class taxifunction {

    public static void main(String[] args) {

        checkDateToGo(0,0,0);

    }
    
    public static void checkDateToGo(int dia, int mes, int any) {
        
        Scanner sc = new Scanner(System.in);
        
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();
        int currentMonth = localDate.getMonthValue();
        int currentDate = localDate.getDayOfMonth();
        
        System.out.println("year is " + currentYear);
        System.out.println("month is " + currentMonth);
        System.out.println("date is " + currentDate);
        
        do{
            System.out.println("que dia quieres viajar");
            dia = sc.nextInt();
        }while(!(dia>=currentDate || dia<=currentDate));
        
        
        do{
            System.out.println("que mes quieres viajar");
            mes = sc.nextInt();
        }while(!(mes>=currentMonth && mes<=currentMonth));
        
        currentYear = any;
        
        System.out.println("el año es " + any);
        
        boolean correcto = true;
        
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

        
        if(correcto==true) {
            System.out.println("el dia que quieres viajar es " + dia + "/"  + mes  + "/" + any);
        }
        

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
