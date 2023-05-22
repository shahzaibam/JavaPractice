package cat.proven.categprods;

import cat.proven.categprods.model.Category;
import cat.proven.categprods.model.Product;
import cat.proven.categprods.model.StoreModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Store application: user interface layer (control logic and view)
 *
 * @author ProvenSoft
 */
public class CategProdUI2 {

    private final Menu mainMenu;
    private final Scanner uiReader;
    
    private boolean exit;
    
    private final StoreModel model;

    public CategProdUI2(StoreModel model) {
        this.model = model;
        mainMenu = new MainMenu();
        uiReader = new Scanner(System.in);
        uiReader.useDelimiter("\n");
    }

    /**
     * application logic entry point
     */
    public void start() {
        exit = false;  //set exit flag to false
        //control loop
        do {
            //display menu and read user's choice
            mainMenu.show();
            String action = mainMenu.getSelectedOptionActionCommand();
            if (action == null) {
                action = "nooption";  //default option if any valid option selected
            }
            //process user's choice: one control method for each functionality
            switch (action) {
                case "exit":  //exit application
                    doExit();
                    break;
                case "category/all":  //list all categories
                    doListAllCategories();
                    break;
                case "product/all":
                    doListAllProducts();
                    break;
/*                case "supplier/all":
                    doListAllSuppliers();
                    break;*/
                case "product/minstock":
                    doListProductsByMinStock();
                    break;
                case "product/name":
                    doListProductsLikeName();
                    break;
                case "supplier/products":
                    doListSupplierAndProducts();
                    break;
                case "product/changeprice":
                    doChangePriceByCategory();
                    break;
                default:  //default option
                    doDefault();
                    break;
            }
        } while (!exit);
    }

    /**
     * Main method
     * @param args argument for command line invocation (not necessari here)
     */
    public static void main(String[] args) {
        //instantiate model (data service)
        StoreModel model;
        try 
        {
            model = new StoreModel();
        
        //instantiate presentation class (controller+view) and pass model to it
        CategProdUI2 ap = new CategProdUI2(model);
        //start interacting with user
        ap.start();
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception -> " + ex.getMessage());
        }
    }

    /* ==== Control methods ==== */
    
    /**
     * asks for confirmation and exits application
     */
    public void doExit() {
        boolean confirm = doConfirm("Sure to exit(yes/no)? ");
        if (confirm) {
            exit = true;
        }
    }

    /**
     * process default action
     */
    public void doDefault() {
        //System.out.println("Unknown option!");
        System.out.println("Not implemented yet!");
    }

    /**
     * gets all categories and displays them
     */
    public void doListAllCategories() {
        try {
            List<Category> result = model.findAllCategories();
            if (result != null) {
                displayMultiple(result);
            } else {
                doAlert("No data has been obtained");
            }
        } catch (SQLException ex) {
            doAlert("Error querying database");
        }
    }

    /**
     * gets all categories and displays them
     */
    public void doListAllProducts() {
        try {
            List<Product> result = model.findAllProducts();
            if (result != null) {
                displayMultiple(result);
            } else {
                doAlert("No data has been obtained");
            }
        } catch (SQLException ex) {
            doAlert("Error querying database");
        }
    }    

    /**
     * gets all categories and displays them
     */
/*    public void doListAllSuppliers() {
        try {
            List<Supplier> result = model.findAllSuppliers();
            if (result != null) {
                displayMultiple(result);
            } else {
                doAlert("No data has been obtained");
            }
        } catch (SQLException ex) {
            doAlert("Error querying database");
        }
    } 
 */   
    private void doListProductsByMinStock() {
        //TODO
    }
    
    private void doListProductsLikeName() {
         //TODO
    }
    
    private void doListSupplierAndProducts() {
        //TODO
    }
    
    private void doChangePriceByCategory() {
         //TODO
    }
    
    
    /* ==== View methods ==== */
    
    /**
     * displays a message to user
     * @param message the message to display
     */
    public void doAlert(String message) {
        System.out.println(message);
    }

    /**
     * displays a message and gets ans answer from user
     * @param message the message to display
     * @return user's answer
     */
    public String doInput(String message) {
        System.out.print(message);
        return uiReader.next();
    }

    /**
     * displays a message to user and asks for confirmation
     * @param message the message to display
     * @return true is user confirms action, false otherwiser
     */
    public boolean doConfirm(String message) {
        final char yesAnswer = 'y';
        System.out.print(message);
        char answer = uiReader.next().toLowerCase().charAt(0);
        return (answer == yesAnswer);
    }

    /**
     * displays a single object
     * @param <T> the type of the object
     * @param t the object to display
     */
    public <T> void displaySingle(T t) {
        System.out.println(t);
    }

    /**
     * displays a list of objects
     * @param <T> the type of the object
     * @param data the list to display 
     */
    public <T> void displayMultiple(List<T> data) {
        for (T t : data) { 
            System.out.println(t);
        }
    }

}
