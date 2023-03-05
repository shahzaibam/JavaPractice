/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocuentapracticando;

/**
 *
 * @author shebi
 */
public class EjercicioCuentaPracticando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta1 = new Cuenta("Shah Zaib");
        
        System.out.println(cuenta1);
        
        cuenta1.ingresar(100);
        cuenta1.ingresar(20);
        cuenta1.ingresar(-100);
        
        cuenta1.retirar(10);
        cuenta1.retirar(100);
        cuenta1.retirar(20);
        System.out.println(cuenta1);
    }
    
}
