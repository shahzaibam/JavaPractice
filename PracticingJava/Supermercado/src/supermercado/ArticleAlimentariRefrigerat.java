/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author shebi
 */
public class ArticleAlimentariRefrigerat extends ArticleAlimentari{
    protected double temperaturaConservacio;

    public ArticleAlimentariRefrigerat() {
        super("Parametro desde ArticleAlimentariRefrigerat");
        System.out.println("Constructor classe ArticleAlimentariRefrigerat");
    }

    
    
    public double getTemperaturaConservacio() {
        return temperaturaConservacio;
    }

    public void setTemperaturaConservacio(double temperaturaConservacio) {
        this.temperaturaConservacio = temperaturaConservacio;
    }
    
    
}
