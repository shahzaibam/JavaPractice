/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author shas4605
 */
public class BmiFrame extends JFrame implements ActionListener {

    private BmiPanel bmiPanel;
    private ActionListener listener;

    public BmiFrame() {
        listener = this; //el mateix objecte será el listener
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //menu
        setUpMenu();

        //panell
        displayBmiPanel();
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); //posa la ventana en el centre de la finestra
    }

    private void setUpMenu() {
        JMenuBar menuBar = new JMenuBar(); //barra principal
        JMenu menu;
        JMenuItem menuItem;

        menu = new JMenu("File");

        menuItem = new JMenuItem("Calc");
        menuItem.setActionCommand("calc");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        menuItem = new JMenuItem("Exit");
        menuItem.setActionCommand("exit");
        menuItem.addActionListener(listener);
        menu.add(menuItem);

        menuBar.add(menu);

        menu = new JMenu("About");
        menuItem = new JMenuItem("Acerca de");
        menuItem.setActionCommand("about");
        menuItem.addActionListener(listener);
        menu.add(menuItem);

        menuBar.add(menu);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "exit":
                doExit();
                break;
            case "calc":
                System.out.println("Hem fet click ... " + action);
                break;
            case "about":
                showAbout();
                break;

        }
    }

    private void doExit() {
        int option = JOptionPane.showConfirmDialog(this, "quiere salir", "salir", JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            System.exit(0);
        }

    }

    private void showAbout() {
        JOptionPane.showMessageDialog(this, "Creado por XXXXX", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    private void displayBmiPanel() {
        bmiPanel = new BmiPanel();
        //JFRAME
        this.setContentPane(bmiPanel);
        this.validate(); //refrescar
    }

}
