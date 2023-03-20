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
import java.util.List;
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
                    listadoAlbum(album);
                    System.out.println("repetidos---");
//                    listadoCromosRepetidos(album);
                    break;
                case 5: {
                    canviarCromos(album);
                    break;
                }

                //getAlbum
                //recorrer array list devuelto
                //mostrar el numero de cromos listado
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Sleep exception" + ex.getMessage());
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

    public void listadoAlbum(CromoDAO album) {
        List<Cromo> nuevos_album = album.getAlbum();
        for (Cromo cromo : nuevos_album) {
            System.out.println(cromo);
        }
        System.out.println("Cromos en el album " + album.getNumAlbum());
    }

//    public void listadoCromosRepetidos(CromoDAO album) {
//        List<Cromo> nuevos_album = album.getRepes();
//        for (Cromo cromo : nuevos_album) {
//            System.out.println(cromo);
//        }
//        System.out.println("------------------------");
//        System.out.println("Cromos en el album repetido " + album.getNumRepes());
//    }

    private void canviarCromos(CromoDAO album) {
        System.out.println("Que cromo quieres");
        Cromo new_card = CrearCromoUsuario();

        System.out.println("Ahora el cromo que quieres dar");
        Cromo old_card = CromoCrearRepes();

        if (!album.isAlbum(new_card) && album.isRepes(old_card)) {
            try {
                if (album.afegirCromo(new_card)) {
                    System.out.println("cromo añadido num = " + new_card.getNum());
                }

                if (album.removeCard(old_card) == 0) {
                    System.out.println("cromo eliminado de repes num = " + old_card.getNum());
                }
            } catch (NumberOutofAlbum ex) {
                System.out.println("cromo no pertence al album");
            }

        } else {
            System.out.println("no puedo hacer el cammbio" + " porque no tengo el que me pides op ya lo tengo el que me das");
        }

    }

    
    /**
     * similar al cromo usuario per solo nos pedira el numero
     * @return 
     */
    private Cromo CromoCrearRepes() {
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
        
        try {
            card = new Cromo(num);
        } catch (Exception ex) {
            System.out.println("numero cromo es negativo " + ex.getMessage());
        }

        return card; //retorna el card con el numero informado solamente, y la descripcion es por defecto la del constructor
    }
    
}

