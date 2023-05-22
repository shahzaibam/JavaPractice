/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author shebi
 */
public class BotonCopiarPegarListener extends JFrame implements ActionListener {
    
    JTextField field;
    JLabel etiqueta;

    public BotonCopiarPegarListener() throws HeadlessException {
        super("Aprieta el Boton");
        this.setSize(400, 200); //JFrame.setSize
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        etiqueta = new JLabel("Hola soy etiqueta");
        JButton boton = new JButton("Aprietame");
        
        field = new JTextField(20);
        
        cp.add(etiqueta);
        cp.add(boton);
        cp.add(field);
        
        boton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        field.setText(etiqueta.getText());
    }
}
