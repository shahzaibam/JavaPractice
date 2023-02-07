/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author shebi
 */
public class ArticleAlimentari extends Article{
    protected String data;

    public ArticleAlimentari(String paramtre) {
        System.out.println("Constructor ArticleAlimentari amb parmetre : " + paramtre);
    }

    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public double getPVP() {
        return preu * 1.04;
    }
    
    
    
}
