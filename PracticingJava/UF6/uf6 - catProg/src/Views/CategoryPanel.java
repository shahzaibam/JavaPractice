/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import cat.proven.categprods.model.Category;
import cat.proven.categprods.model.StoreModel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shas4605
 */
public class CategoryPanel extends JPanel {

    //variable model
    private StoreModel model;
    //camps importants
    private JLabel lbId;
    private JTextField tfCode;
    private JTextField tfName;

    private final ActionListener action_listener;

    public CategoryPanel() {
        this.action_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                processAction(action);
            }

        };
        try {
            //model de dades
            model = new StoreModel();
            initComponents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void processAction(String action) {
        switch (action) {
            case "add":
                doAdd();
                break;
            case "clear":

                break;
            case "search":
                doSearch();
                break;
            case "modify":

                break;
            case "remove":

                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Ha apretado la accion " + action);
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel lbHeader = new JLabel("Category form");
        lbHeader.setHorizontalAlignment(JLabel.CENTER);
        add(lbHeader, BorderLayout.NORTH);

        //panel informacio
        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridLayout(0, 2));

        fieldsPanel.add(new JLabel("Id:"));
        lbId = new JLabel("0");
        fieldsPanel.add(lbId);

        fieldsPanel.add(new JLabel("Code:"));
        tfCode = new JTextField(20);
        fieldsPanel.add(tfCode);

        fieldsPanel.add(new JLabel("Name:"));
        tfName = new JTextField(20);
        fieldsPanel.add(tfName);

        add(fieldsPanel, BorderLayout.CENTER);

        //panel solo para botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton btClear = new JButton("Clear");
        btClear.setActionCommand("clear");
        btClear.addActionListener(action_listener);
        buttonPanel.add(btClear);

        JButton btSearch = new JButton("Search");
        btSearch.setActionCommand("search");
        btSearch.addActionListener(action_listener);
        buttonPanel.add(btSearch);

        JButton btAdd = new JButton("Add");
        btAdd.setActionCommand("add");
        btAdd.addActionListener(action_listener);
        buttonPanel.add(btAdd);

        JButton btModify = new JButton("Modify");
        btModify.setActionCommand("modify");
        btModify.addActionListener(action_listener);
        buttonPanel.add(btModify);

        JButton btRemove = new JButton("Remove");
        btRemove.setActionCommand("remove");
        btRemove.addActionListener(action_listener);
        buttonPanel.add(btRemove);

        buttonPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        add(buttonPanel, BorderLayout.SOUTH);

    }

    /**
     * Add Category to Model
     */
    private void doAdd() {
        Category add = categoryFromFields();

        int result;
        try {
            result = model.addCategory(add);
            if (result == 1) {
                messageOK("Category added", "Result");
            } else {
                displayErrorDialog("Error category added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }

    }

    private Category categoryFromFields() {
        Category c;
        long id = Long.parseLong(lbId.getText());
        String code = tfCode.getText();
        String name = tfCode.getText();
        c = new Category(id, code, name);
        return c;
    }

    private void messageOK(String msg1, String title) {
        JOptionPane.showMessageDialog(this, msg1, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private void displayErrorDialog(String error) {
        JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * search a category
     */
    private void doSearch() {
        Category add = categoryFromFields();

        String code = add.getCode();


        try {
            add = model.findCategoryByCode(code);
            if (add != null) {
                messageOK("Category found", "Result");
                System.out.println(add.getId());
                
                String id = String.valueOf(add.getId());
                lbId.setText(id);
                
                tfCode.setText(add.getCode());
                tfName.setText(add.getName());

            } else {
                displayErrorDialog("Error category not found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
