/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author shebi
 */
public class Article {
    protected String nom;
    protected String fabricant;
    protected double preu;
    protected String codiEAN;

    public Article() {
        System.out.println("Constructor classe Article");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getCodiEAN() {
        return codiEAN;
    }

    public void setCodiEAN(String codiEAN) {
        this.codiEAN = codiEAN;
    }
    
    public double getPVP() {
        this.preu = this.preu+(this.preu*0.21);
        
        return this.preu;
    }
    
}
