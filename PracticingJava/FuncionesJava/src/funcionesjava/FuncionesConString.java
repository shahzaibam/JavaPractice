/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesjava;

import java.util.Scanner;

/**
 *
 * @author shas4605
 */
public class FuncionesConString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una frase para saber el numero de caracteres");
        String frase = sc.nextLine();
        int numeroCarac = numDeCaracteres(frase);
        System.out.println("El numero de caracteres de esta frase es " + numeroCarac);
        
        System.out.println("Escribe una palabra para convertir la a minuscula y mayusucla");
        String palabra = sc.nextLine();
        mayusAminus(palabra);
        
        System.out.println("Palabra escrita en vertical");
        fraseEnVertical(palabra);
        
        int charIn = letraFrase(palabra);
        System.out.println("La letra esta en la posicion "+charIn);
        
        int numVocal = contVocales(palabra);
        System.out.println("El numero de vocales es " + numVocal);
        
        int numCaracteres = contarCaracteres(palabra, 'a');
        System.out.println("Hay " + numCaracteres);
        
        eliminaEspacio(palabra);
    }
    
    public static int numDeCaracteres(String frase) {        
        
        int numCarac = frase.length();
        
        return numCarac;
    }
    
    public static void mayusAminus(String palabra) {
        String palabraAmayus; 
        String palabraAminus; 
        
        palabraAmayus = palabra.toUpperCase();
        palabraAminus = palabra.toLowerCase();
        
        System.out.println("En Mayuscula es " + palabraAmayus);
        System.out.println("En Minuscula es " + palabraAminus);
    }

    public static void fraseEnVertical(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }
    
    public static int letraFrase(String frase) {
        int indChar = frase.indexOf('a');
        return indChar;
    }
    
    public static int contVocales(String frase) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A' ||
                    frase.charAt(i) == 'e' || frase.charAt(i) == 'E' || 
                    frase.charAt(i) == 'i' || frase.charAt(i) == 'I' || 
                    frase.charAt(i) == 'o' || frase.charAt(i) == 'O' || 
                    frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                count++;
            }
        }
        
        return count;
    }

    public static int contarCaracteres(String palabra, char caracter) {
        int posicion, contador = 0;
        posicion = palabra.indexOf(caracter);
        while (posicion != -1) {
            contador++;           
            posicion = palabra.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
    
    public static void eliminaEspacio(String palabra) {
        String palabraReplaced = palabra.replace(" ", "");
        
        System.out.println(palabra + "-->" + palabraReplaced);
    }
    
    
}
