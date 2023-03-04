/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author shas4605
 */
public class Menu {

    private String title;
    List<OptionItem> options_menu;

    public Menu(String title) {
        this.title = title;
        options_menu = new ArrayList<OptionItem>();
    }

    /**
     * Añade la nueva opcion al array de opciones
     *
     * @param afegir opcion a añadir
     */
    public void AddOption(OptionItem afegir) {
        this.options_menu.add(afegir);
    }

    public void AddOptionByIndex(OptionItem afegir, int index) {
        this.options_menu.add(index, afegir);
    }

    public void RemoveOption(OptionItem afegir) {
        for (OptionItem optionItem : options_menu) {
            if (optionItem.equals(this)) {
                this.options_menu.remove(afegir);
            }
        }
    }

    public void RemoveOptionByIndex(int index) {
        this.options_menu.remove(index);
    }

    public int NumeroOptionsMenu() {
        return options_menu.size();
    }

    public String String() {
        StringBuilder builder = new StringBuilder();
        // ... Loop and append values.
        System.out.println("Menu fifa");
        System.out.println("------------");
        for (int i = 0; i < this.options_menu.size(); i++) {
            builder.append(i).append(options_menu.get(i));
        }

        // Part 2: convert to string.
        String result = builder.toString();
        // ... Print result.
//        System.out.println(result);
        
        return result;
    }

    @Override
    public String toString() {
        return String();
    }

}
