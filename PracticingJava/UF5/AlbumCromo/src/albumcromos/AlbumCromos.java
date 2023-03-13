/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albumcromos;

import Menu.Menu;
import Menu.OptionItem;
import Objectes.Cromo;

import Objectes.CromoDAO;
import Objectes.DescriptionTooShort;
import Objectes.NumberOutofAlbum;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class AlbumCromos {

    /**
     * la part de la app, la que llan�a el programa fara la funci� controlador
     * que es comunicarse amb DAO i informar� al usuari.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCromos app = new AlbumCromos();
        app.run();

    }

    /**
     * ja no estatic , i aix? ja ningu desde el fora el pugui cridar.
     *
     */
    private void run() {
        //ho deixo d'aquest form
        //creo un DAO (album)
        CromoDAO album = new CromoDAO(150);
        Menu cromos_menu = new Menu("Dragonball Collection");
        int option;
        anyadirOpcionesMenu(cromos_menu);
        anyadirCromos(album);
        Cromo aux;
        do {
            cromos_menu.DisplayMenu();
            option = cromos_menu.chooseOption();
            switch (option) {
                case 1:
                    System.out.println("Adios");
                    break;
                case 2://afegir cromo
                    aux = CrearCromoUsuario();

                    try {
                        boolean ok = album.afegirCromo(aux);
                        if (ok) {
                            System.out.println("Cromo a�adido al album. Num Cromos: " + album.getNumAlbum());
                        } else {
                            System.out.println("Cromo repetidos : " + album.getNumRepes());
                        }
                    } catch (NumberOutofAlbum ex) {
                        System.out.println(ex.getMessage());
                    }

                    //crear un objecte cromo, amb els camps informats
                    //afegir-lo al album DAO
                    break;
                case 3://borrar cromo
                    aux = CrearCromoUsuario();
                    //hacer un metodo que solo pida el� numero
                    int ok = album.removeCard(aux);
                    if (ok == 1) {
                        System.out.println("Cromo borrado " + album.getNumAlbum());
                    } else if (ok == 0) {
                        System.out.println("Cromo sacado repes " + album.getNumRepes());
                    } else {
                        System.out.println("No tengo el cromo");
                    }

                    break;
                case 4://Listar
                    album.mostrarAlbum();
                    album.mostrarRepes();
                    //getAlbum
                    //recorrer array list devuelto
                    //mostrar el numero de cromos listado
                    break;
                case 5: {
                    try {
                        //Canviar cromos
                        canviarCromos(album);
                    } catch (NumberOutofAlbum ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                //getAlbum
                //recorrer array list devuelto
                //mostrar el numero de cromos listado
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 1);

    }

    private void anyadirOpcionesMenu(Menu cromos_menu) {
        cromos_menu.AddOption(new OptionItem("Sortir"));
        cromos_menu.AddOption(new OptionItem("Afegir Cromo"));
        cromos_menu.AddOption(new OptionItem("Borrar Cromo"));
        cromos_menu.AddOption(new OptionItem("Mostrar Album"));
        cromos_menu.AddOption(new OptionItem("Canviar cromo"));

    }

    /**
     * Pedira todos los datos de un cromo y creara un objeto cromo que retornara
     *
     * @return Cromo creado
     */
    private Cromo CrearCromoUsuario() {
        Scanner sc = new Scanner(System.in);
        boolean num_introducido_ok = false;
        int num = 0;
        Cromo card = null;
        while (!num_introducido_ok) {
            try {
                System.out.println("Pon el numero de cromo:");
                num = sc.nextInt();
                sc.nextLine();//eliminar buffer el return
                num_introducido_ok = true;
            } catch (InputMismatchException ex) {
                System.out.println("Valor no es numerico");
                sc.nextLine();
                num_introducido_ok = false;
            }
        }

        boolean description_ok = false;

        while (!description_ok) {
            System.out.println("Pon descripcion ");
            String descripcion = sc.nextLine();

            try {
                card = new Cromo(num, descripcion);
                description_ok = true;
            } catch (DescriptionTooShort ex1) {
                System.out.println("Descripcion incorrecta" + ex1.getMessage());
                description_ok = false;
            } catch (Exception ex) {
                description_ok = true;
                System.out.println("exception capturada " + ex.getMessage());
            }
        }

        return card;
    }

    private Cromo pedirCromo() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        Cromo card = null;
        try {
            System.out.println("Pon el numero de cromo:");
            num = sc.nextInt();
            sc.nextLine();//eliminar buffer el return
        } catch (InputMismatchException ex) {
            System.out.println("Valor no es numerico");
            sc.nextLine();
        }

        boolean description_ok = false;

        while (!description_ok) {
            System.out.println("Pon descripcion ");
            String descripcion = sc.nextLine();

            try {
                card = new Cromo(num, descripcion);
                description_ok = true;
            } catch (DescriptionTooShort ex1) {
                System.out.println("Descripcion incorrecta" + ex1.getMessage());
                description_ok = false;
            } catch (Exception ex) {
                description_ok = true;
                System.out.println("exception capturada " + ex.getMessage());
            }
        }

        return card;
    }

    private void anyadirCromos(CromoDAO album) {
        try {
            album.afegirCromo(new Cromo(7, "Krilin"));
            album.afegirCromo(new Cromo(3, "Follet Tortuga"));
            album.afegirCromo(new Cromo(6, "Satanas Cor Petit"));
            album.afegirCromo(new Cromo(11, "Freezer"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void canviarCromos(CromoDAO album) throws NumberOutofAlbum  {
        //demanar cromo obtens (NOU CROMO)
        Cromo new_card;
        //demanar dades del que dones (CROMO VELL)
        System.out.println("Ahora el cromo que quieres dar");
        Cromo old_card;
        //comprovar que no tinc el nou al album , si ho tinc true, si no hi tinc false

//        boolean tinc_nou_al_album;
//        do {
        System.out.println("ESCRIBE EL NUEVO CROMO");
        new_card = pedirCromo();
//            tinc_nou_al_album = album.comprobar_al_Album(new_card);
        album.comprobar_al_Album(new_card);
//        } while (!tinc_nou_al_album);

        //comprovar que SI TINC ALS REPES el vell, si ho tinc repe true, si no ho tinc false
        System.out.println("ESCRIBE EL CROMO REPETIDO QUE QUIERES DAR");
        old_card = CrearCromoUsuario();
        boolean tinc_el_repetit = album.comprobar_al_Repes(old_card);

        if (tinc_el_repetit) {
            album.removeCardRepes(old_card);
            album.afegirCromo(new_card);
            System.out.println("Els cromos se han canviat");
        }else{
            System.out.println("INCORRECTO");
        }
    }

}
