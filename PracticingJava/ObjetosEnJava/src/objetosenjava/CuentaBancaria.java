/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class CuentaBancaria {

    private final String IBAN;
    private final String titular;
    private double saldo;
    private double[] movimientos; //no he reservado espacio, por lo que en constructor haré el new
    private int num_movimientos;

    public CuentaBancaria(String IBAN, String titular) {
        this.IBAN = IBAN;
        this.titular = titular;
        this.saldo = 0;
        movimientos = new double[100];
    }

    public void Ingresar(int ingreso) {
        this.saldo += ingreso;
        if (ingreso >= 3000) {
            System.out.println("AVISO : NOTIFICAR HACIENDA");
        }
        boolean ingresado = false;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == 0 && !ingresado) {
                movimientos[i] = ingreso;
                ingresado = true;
            }
        }
    }

    public void Retirar(int retirar) {
        this.saldo = this.saldo - retirar;
        if (this.saldo < -50) {
            System.out.println("AVISO : SALDO NEGATIVO");
        } else if (retirar >= 3000) {
            System.out.println("AVISO : NOTIFICAR HACIENDA");
        }
        boolean retirado = false;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == 0 && !retirado) {
                movimientos[i] = retirar;
                retirado = true;
            }
        }
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double[] getMovimientos() {
        return movimientos;
    }

    public int getNum_movimientos() {
        return num_movimientos;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMovimientos(double[] movimientos) {
        this.movimientos = movimientos;
    }

    public void setNum_movimientos(int num_movimientos) {
        this.num_movimientos = num_movimientos;
    }

    public void mostrarDatos() {
        System.out.println("IBAN -->" + this.IBAN);
        System.out.println("Titular -->" + this.titular);
        System.out.println("Saldo -->" + this.saldo);
    }

    public void verMovimientos() {
        for (int i = 0; i < this.getMovimientos().length; i++) {
            System.out.println(this.getMovimientos()[i]);
        }
    }

}
