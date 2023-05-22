/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoimc;

import Vista.BmiFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author shas4605
 */
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BmiFrame app = new BmiFrame();
                app.setVisible(true);
            }
        });
    }
    
}
