/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuapp;

/**
 *
 * @author shas4605
 */
public class OptionItem {
    private String option_phrase;

    public OptionItem(String option_phrase) {
        this.option_phrase = option_phrase;
    }
    
    

    public String getOption_phrase() {
        return option_phrase;
    }

    public void setOption_phrase(String option_phrase) {
        this.option_phrase = option_phrase;
    }

    @Override
    public String toString() {
        return  "option_phrase=" + option_phrase;
    }
    
    //fer el equals també
}
