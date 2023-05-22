/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mabardaji
 */
public class BotonVentana extends JFrame {

    public BotonVentana() throws HeadlessException {
        super("Aprieta el Boton");
        this.setSize(400,200); //JFrame.setSize
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("Aprietame");
        EventoBotonPulsado clickBoton = new EventoBotonPulsado();
        boton.addActionListener(clickBoton);
        //JButton boton2 = new JButton("No sirve");
        cp.add(boton);
        //boton2.addActionListener(clickBoton);
        //cp.add(boton2);
        
    }
    
    
    
    
}
