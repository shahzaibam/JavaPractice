/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuapp;

/**
 *
 * @author shas4605
 */
public class UF5_MenuGenericMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu fifa = new Menu("fifa 23");

        
        fifa.AddOption(new OptionItem("Settings"));
        fifa.AddOptionByIndex(new OptionItem("probando"), 1);
        fifa.RemoveOption(new OptionItem("probando"));
        fifa.RemoveOptionByIndex(0);
        System.out.println("Numero de opciones añadidas " + fifa.NumeroOptionsMenu());
        System.out.println(fifa.toString());
    }
    
}
