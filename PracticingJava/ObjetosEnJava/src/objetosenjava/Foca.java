/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class Foca {

    private int pes;
    private int edat;
    private int resistencia;
    private int distancia_recorreguda;

    public Foca(int pes, int edat) {
        if (pes > 140) {
            System.out.println("El pes no pot ser mes que 140");
            this.pes = 140;
            System.out.println("Pes = " + this.pes);
        } else {
            this.pes = pes;
        }

        if (edat > 15) {
            System.out.println("L'edat no pot ser mes que 15");
            this.edat = 15;
            System.out.println("Edat = " + this.edat);
        }else {
            this.edat = edat;
        }
        
        this.resistencia = 3;
    }

    public int getPes() {
        return pes;
    }

    public int getEdat() {
        return edat;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }
    
    public void AugmentarResistencia(int res) {
        this.resistencia = this.resistencia + res;
    }
    
    public void Sprint() {
        
        if(this.resistencia > 0) {
            this.distancia_recorreguda = 2*(this.edat * (200-this.pes));
            this.resistencia--;
        }else {
            this.distancia_recorreguda = this.edat * (200-this.pes);
        }
        
        System.out.println("Foca ha recorregut una distancia de " + this.distancia_recorreguda);
    }
    
}
