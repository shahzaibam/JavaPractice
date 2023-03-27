/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albumcromos;

import Menu.Menu;
import Menu.OptionItem;
import Objectes.Cromo;

import Objectes.CromoDAO;
import Objectes.CromoDAO_Hash;
import Objectes.DescriptionTooShort;
import Objectes.NumberOutofAlbum;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class AlbumCromos {

    
    /** la part de la app, la que llança el programa 
     * fara la funció controlador que es comunicarse amb DAO
     * i informarà al usuari.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCromos app = new AlbumCromos();
        app.run();
       
    }
    
    /** ja no estatic , i aix? ja ningu desde el fora el pugui cridar.
     * 
     */
    private void run()
    {
        //ho deixo d'aquest form
        //creo un DAO (album)
        CromoDAO_Hash album = new CromoDAO_Hash(150);
        Menu cromos_menu = new Menu("Dragonball Collection");
        int option; 
        anyadirOpcionesMenu(cromos_menu);
        anyadirCromos(album);
        Cromo aux;
        do{
        cromos_menu.DisplayMenú();
        option = cromos_menu.chooseOption();
        switch(option)
        {
            case 1: 
                System.out.println("Adios");
                break;
            case 2://afegir cromo
                aux = CrearCromoUsuario();
            
                try {
                    boolean ok=album.afegirCromo(aux);
                    if(ok)
                    {
                        System.out.println("Cromo añadido al album. Num Cromos: " + album.getNumAlbum());
                    }
                    else
                    {
                        System.out.println("Cromo repetidos : "+ album.getNumRepes());
                    }
                } catch (NumberOutofAlbum ex) {
                    System.out.println(ex.getMessage());
                }
           
                //crear un objecte cromo, amb els camps informats
                //afegir-lo al album DAO
                break;
            case 3://borrar cromo
                aux = CrearCromoUsuario();
                //hacer un metodo que solo pida elñ numero
                int ok = album.removeCard(aux); 
                if(ok==1)
                {
                    System.out.println("Cromo borrado " + album.getNumAlbum());
                }
                else if(ok == 0)
                {
                    System.out.println("Cromo sacado repes " + album.getNumRepes());
                }
                else
                {
                    System.out.println("No tengo el cromo");
                }
                
                break;
            case 4://Listar
                listadoAlbum(album);
                break;
                //getAlbum
                //recorrer array list devuelto
                //mostrar el numero de cromos listado
            

            case 5://Canviar cromos
                canviarCromos(album);
                break;
                
                //getAlbum
                //recorrer array list devuelto
                //mostrar el numero de cromos listado
            case 6://Cromos pares
                listadoAlbumPares(album);
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Sleep exception" + ex.getMessage());
            }
        }while(option!=1); 
        
    }

    private void anyadirOpcionesMenu(Menu cromos_menu) {
        cromos_menu.AddOption(new OptionItem("Sortir"));
        cromos_menu.AddOption(new OptionItem("Afegir Cromo"));
        cromos_menu.AddOption(new OptionItem("Borrar Cromo"));
        cromos_menu.AddOption(new OptionItem("Mostrar Album"));
        cromos_menu.AddOption(new OptionItem("Cambiar cromo"));
        cromos_menu.AddOption(new OptionItem("Devolver cromos pares"));
    }

    /**
     * Pedira todos los datos de un cromo y creara un objeto cromo que retornara
     * @return Cromo creado
     */
    private Cromo CrearCromoUsuario() {
        Scanner sc = new Scanner(System.in);
        boolean num_introducido_ok =false;
        int num=0;
        Cromo card=null;
        while(!num_introducido_ok)
        {
           try{
            System.out.println("Pon el numero de cromo:");
            num = sc.nextInt();
            sc.nextLine();//eliminar buffer el return
            num_introducido_ok = true;
            }catch(InputMismatchException ex)
            {
                System.out.println("Valor no es numerico");
                sc.nextLine();
                num_introducido_ok =false;
            }
        }
        
        boolean description_ok = false;

        while(!description_ok)
        {
             System.out.println("Pon descripcion ");
             String descripcion = sc.nextLine();

             
             try {
                 card = new Cromo(num, descripcion);
                 description_ok = true;
             } catch(DescriptionTooShort ex1)
             {
                 System.out.println("Descripcion incorrecta" + ex1.getMessage());
                 description_ok = false;
             }
             catch (Exception ex) {
                 description_ok = true;
                 System.out.println("exception capturada " + ex.getMessage());
             } 
        }

        return card;
    }

    /**
     * similar al cromo usuario, pero solo nos pedira el numero cromo
     * @return Cromo con el numero informado
     */
    private Cromo CrearCromoRepes() {
        Scanner sc = new Scanner(System.in);
        boolean num_introducido_ok =false;
        int num=0;
        Cromo card=null;
        while(!num_introducido_ok)
        {
           try{
            System.out.println("Pon el numero de cromo:");
            num = sc.nextInt();
            sc.nextLine();//eliminar buffer el return
            num_introducido_ok = true;
            }catch(InputMismatchException ex)
            {
                System.out.println("Valor no es numerico");
                sc.nextLine();
                num_introducido_ok =false;
            }
        }
        
        try {
            card = new Cromo(num);
        } catch (Exception ex) {
            System.out.println("EL numero cromo es negativo " + ex.getMessage());
        }

        return card; //solo tiene num informado y la descripció es la del constructor
    }

    
    
    
    
    
    
    
    
    private void anyadirCromos(CromoDAO_Hash album) {
        try {
            album.afegirCromo(new Cromo(7,"Krilin"));
            album.afegirCromo(new Cromo(3,"Follet Tortuga"));
            album.afegirCromo(new Cromo(6,"Satanas Cor Petit"));
            album.afegirCromo(new Cromo(11,"Freezer"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    private void canviarCromos(CromoDAO_Hash album) {
        //demanar cromo obtens (NOU CROMO)
        System.out.println("Cromo que quieres....");
        Cromo new_card = CrearCromoUsuario();
                //demanar dades del que dones (CROMO VELL)
        System.out.println("Ahora el cromo que vas a dar...");
       Cromo old_card = CrearCromoRepes();
                //comprovar que no el tinc al album el nou
       if (!album.isAlbum(new_card) && 
               album.isRepes(old_card))
       {    
           try {
           //canvi ok
           //podria preguntar si el repe el tinc amb un altre if
                if(album.afegirCromo(new_card))
                {
                    System.out.println("Cromo añadido num=" + new_card.getNum());
                }
                if (album.removeCard(old_card)==0)
                {
                    System.out.println("Cromo eliminado repes num=" + old_card.getNum());
                }
                
            } catch (NumberOutofAlbum ex) {
                   System.out.println("Cromo no pertenece a esta colección");
            }
           
           
           
       }
       else
       {
           System.out.println("No puedo hacer el cambio"
                   + "por uqe no tengo el que me pides o ya lo tengo el que me das");
       }
 
    }

    private void listadoAlbum(CromoDAO_Hash album) {
        //ArrayList<Cromo> nuevos_album = (ArrayList<Cromo>) album.getAlbum();
        List<Cromo> nuevos_album = album.getAlbum();
        
        for (Cromo cromo_nuevo : nuevos_album) {
            System.out.println(cromo_nuevo); //toString implementado
        }
        System.out.println("Cromos en el album:" + album.getNumAlbum());
    }

    private void listadoAlbumPares(CromoDAO_Hash album) {
        //ArrayList<Cromo> nuevos_album = (ArrayList<Cromo>) album.getAlbum();
        List<Cromo> nuevos_album = album.getAlbum();
        int contador=0;
        for (Cromo cromo_nuevo : nuevos_album) {
            if (cromo_nuevo.getNum()%2==0)
            {
                System.out.println(cromo_nuevo); //toString implementado
                contador++;
            }
            
        }
        System.out.println("Cromos pares mostrados:" + contador);
    }


    
}
