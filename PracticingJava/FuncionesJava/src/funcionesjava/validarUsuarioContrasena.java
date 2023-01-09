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
public class validarUsuarioContrasena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "";
        String contrasena = "";
        do {
            System.out.println("Escribe tu nombre de usuario, que contenga @");
            usuario = sc.nextLine();
        } while (!(validarUsuario(usuario)));

        do {
            System.out.println("Escribe una contrasena");
            contrasena = sc.nextLine();
        } while (!(validarContrasena(contrasena)));

    }

    public static boolean validarUsuario(String usuario) {
        Scanner sc = new Scanner(System.in);

        boolean formato = false;

        for (int i = 0; i < usuario.length(); i++) {
            if (usuario.charAt(i) == '@') {
                formato = true;
            }
        }
        String[] usuarioSplit = usuario.split("@");
        
        for (int i = 0; i < usuarioSplit.length; i++) {
            System.out.println(usuarioSplit[i]);
            if(usuarioSplit[1] == "proven.cat") {
                formato = true;
            }else{
                formato = false;
            }
        }
        
        return formato;

    }

    public static boolean validarContrasena(String contrasena) {
        boolean formato = true;

        if (contrasena.length() < 8) {
            formato = false;
        }

        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) == ' ') {
                formato = false;
            }
            
        }
        

//        if(contrasena.split("@") == "proven.cat") {
//            
//        } 

        return formato;
    }
}
