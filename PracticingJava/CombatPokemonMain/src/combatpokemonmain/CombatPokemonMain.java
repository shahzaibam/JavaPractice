/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combatpokemonmain;

import Objetos.Aigua;
import Objetos.Veri;

/**
 *
 * @author shebi
 */
public class CombatPokemonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aigua water = new Aigua("Squirtle");
        Veri poison = new Veri("Golbar");

        do {
            if (water.getCP() > 0 && poison.getCP() > 0) {
                water.rebreImpacte(poison);
                poison.rebreImpacte(water);
            }
        } while (!(water.getCP() <= 0 || poison.getCP() <= 0));

        if (water.getCP() == 0) {
            System.out.println("Ha ganado " + poison.getNomPokemon());
        } else {
            System.out.println("Ha ganado " + water.getNomPokemon());
        }

    }

}
