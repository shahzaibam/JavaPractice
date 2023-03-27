/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuapp;

import Objetos.Menu;
import Objetos.OptionItem;

/**
 *
 * @author mabardaji
 */
public class MenuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu Fifa = new Menu("FIFA 23");
        
//        OptionItem add = new OptionItem("Settings");
//        Fifa.AddOption(add);
        Fifa.AddOption(new OptionItem("Settings"));
        System.out.println("Numero de opciones anyadidas" + Fifa.NumeroOptionsMenu());
          Fifa.AddOption(new OptionItem("Profile"));
          Fifa.AddOption(new OptionItem("Online Settings"));
          Fifa.AddOption(new OptionItem("Exit"));
          
          Fifa.DisplayMenú();
          Fifa.chooseOption();
          Fifa.AddOption(new OptionItem("Profile"));
          Fifa.DisplayMenú();
          if(Fifa.removeOption(new OptionItem("Profile")))
          {
              System.out.println("opcio esborrada");
          }
          Fifa.DisplayMenú();
          Fifa.removeOptionByIndex(0);
          Fifa.DisplayMenú();
          Fifa.AddOptionByIndex(new OptionItem("Opcio afegida"), 1);
           Fifa.DisplayMenú();
              
    }
    
}
