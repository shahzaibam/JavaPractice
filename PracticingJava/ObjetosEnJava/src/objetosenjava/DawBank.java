/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

import java.util.Scanner;

/**
 *
 * @author shebi
 */
public class DawBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion_menu;
        // falta codigo
        //pedir datos para crear cuenta bancaria
        CuentaBancaria uno = new CuentaBancaria("ES6621000418401234567891", "SHAHZAIB");
        //crear cuenta bancaria
        int ingreso = 0;
        int retiro = 0;

        do {
            opcion_menu = menu();

            //switch
            switch (opcion_menu) {
                case 1:
                    uno.mostrarDatos();
                    break;
                case 2:
                    System.out.println(uno.getIBAN());
                    break;
                case 3:
                    System.out.println(uno.getTitular());
                    break;
                case 4:
                    System.out.println("Tu saldo es " + uno.getSaldo());
                    break;
                case 5:
                    System.out.println("Cuanto quieres ingresar?");
                    ingreso = sc.nextInt();
                    uno.Ingresar(ingreso);
                    System.out.println("Has ingresado " + ingreso);
                    break;
                case 6:
                    System.out.println("Cuanto quieres retirar?");
                    retiro = sc.nextInt();
                    uno.Retirar(retiro);
                    System.out.println("Has retirado " + retiro);
                    break;
                case 7:
                    uno.verMovimientos();
                    break;
            }
        } while (!(opcion_menu == 8));
        
        System.out.println("Has salido.");

    }

    /**
     * muestra menú, devuelve la opción que has escogido del menú el
     * usuario(valida)
     *
     * @return opcion escogida por el usuario
     *
     */
    public static int menu() {
        int opcion;
        do {
            System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n"
                    + "2. IBAN. Mostrará el IBAN.\n"
                    + "3. Titular. Mostrará el titular.\n"
                    + "4. Saldo. Mostrará el saldo disponible.\n"
                    + "5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n"
                    + "6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.\n"
                    + "7. Movimientos. Mostrará una lista con el historial de movimientos.\n"
                    + "8. Salir. Termina el programa.");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 8);
        return opcion;
    }

}
