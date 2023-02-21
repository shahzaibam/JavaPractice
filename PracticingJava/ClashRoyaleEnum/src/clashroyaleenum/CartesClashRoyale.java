/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashroyaleenum;

/**
 *
 * @author shebi
 */
public enum CartesClashRoyale {
    GIGANTE("GIGANTE",5, 5), PEKKA("PEKKA", 7,7), CABALLERO("CABALLERO",3,3),VALQUIRIA("VALQUIRIA", 4,4), MONTAPUERCOS("MONTAPUERCOS",4,4);
    
    private String nomCarta;
    private int elixir;
    private int arena;

    private CartesClashRoyale(String nomCarta, int elixir, int arena) {
        this.nomCarta = nomCarta;
        this.elixir = elixir;
        this.arena = arena;
        
        if(this.elixir == 8) {
            this.arena = 10;
        }else if(this.elixir == 9) {
            this.arena = 13;
        }
    }
   
    public int getElixir() {
        return elixir;
    }

    public int getArena() {
        return arena;
    }
    
    public void cambiarCantitatElexir(int CantitatElexir) {
        this.elixir = CantitatElexir;
    }

    @Override
    public String toString() {
        return  "nomCarta ----> " + nomCarta + " elixir ----> " + elixir + " arena ----> " + arena;
    }
    
    
    
    
}
