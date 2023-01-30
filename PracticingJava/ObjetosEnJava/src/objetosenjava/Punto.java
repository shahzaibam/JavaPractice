/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void imprime() {
        System.out.println("(" + this.x  + " , " +this.y + " )");
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    
    public int distancia(Punto p) {
        
        int calculo;
        calculo = (int)Math.sqrt((int) Math.pow(2,(this.x-x))+ (int) Math.pow(2,(this.y-y)));
        
        return calculo;
    }
    
}
