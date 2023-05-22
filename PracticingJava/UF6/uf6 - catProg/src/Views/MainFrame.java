/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author shas4605
 */
public class MainFrame extends JFrame {

    private final ActionListener action_listener;
    CategoryPanel panel;

    public MainFrame() {
        action_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String action = e.getActionCommand();

                processAction(action);

                System.out.println("No implementat..." + action);
            }

        };
        initComponents();
        //this.action_listener = action_listener;
    }

    private void initComponents() {
        setTitle("Store GUI App");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
            
        });
        
        //creare la barra menu
        createMenuBar();

        //afegir un panell rosa
        loadPanelWelcome();
        
        //tamany i posicio
        setLocationRelativeTo(null);
        setSize(400, 300);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar(); //barra principal
        JMenu menu;
        JMenuItem menuItem;

        menu = new JMenu("File");

        menuItem = new JMenuItem("Exit");
        menuItem.setActionCommand("exit");
        menuItem.addActionListener(action_listener);
        menu.add(menuItem);

        menuBar.add(menu);

        menu = new JMenu("Edit");
        menuItem = new JMenuItem("Manage Categories");
        menuItem.setActionCommand("manageCat");
        menuItem.addActionListener(action_listener);
        menu.add(menuItem);

        menuItem = new JMenuItem("Manage Products");
        menuItem.setActionCommand("manageProd");
        menuItem.addActionListener(action_listener);
        menu.add(menuItem);

        menuItem = new JMenuItem("Manage Suppliers");
        menuItem.setActionCommand("manageSupp");
        menuItem.addActionListener(action_listener);
        menu.add(menuItem);
        menuBar.add(menu);

        menu = new JMenu("Help");

        menuItem = new JMenuItem("About");
        menuItem.setActionCommand("about");
        menuItem.addActionListener(action_listener);
        menu.add(menuItem);
        menuBar.add(menu);

        this.setJMenuBar(menuBar);
    }

    private void processAction(String action) {

        switch (action) {
            case "exit":
                doExit();
                break;
            case "about":
                doAbout();
                break;
            case "manageCat":
                doCategory();
                break;
            case "manageProd":
                doManageProd();
                break;
            case "manageSupp":
                doManageSupp();
                break;
        }
    }

    private void doExit() {
        int option = JOptionPane.showConfirmDialog(this, "quiere salir", "salir", JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            System.exit(0);
        }
    }

    private void doAbout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doManageProd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doManageSupp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void doCategory() {
        panel = new CategoryPanel();
        setContentPane(panel);
        validate();
    }

    private void loadPanelWelcome() {
        WelcomePanel primerPanel = new WelcomePanel();
        setContentPane(primerPanel);
    }

}
