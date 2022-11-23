
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shebi
 */
public class fractales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto es el perimetro del cuadrado");
        int ladoPerimetro = sc.nextInt();
        int totalFractales = calcularFractales(ladoPerimetro);
        
        System.out.println(totalFractales);
    }
    
    public static int calcularFractales(int ladoPerimetro) {
        
        
        if(ladoPerimetro == 1) {
            return 1*4;
        }else if(ladoPerimetro>1) {
            return (ladoPerimetro*4)+calcularFractales(ladoPerimetro/2);
        }
        
        return -1;
    }
}
