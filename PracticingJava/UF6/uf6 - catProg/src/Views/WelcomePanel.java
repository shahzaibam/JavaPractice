/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author shas4605
 */
public class WelcomePanel extends JPanel{

    public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBackground(Color.MAGENTA);
        JLabel etiqueta = new JLabel("Welcome to store application");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(etiqueta, BorderLayout.CENTER);
        
        
    }
    
}
