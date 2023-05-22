package cat.proven.categprods;

import Views.MainFrame;
import cat.proven.categprods.model.persist.DbConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * Store application: user interface layer (control logic and view)
 *
 * @author ProvenSoft
 */
public class CategProdUI {

    /**
     * Main method
     *
     * @param args argument for command line invocation (not necessari here)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DbConnect.loadDriver();
                    MainFrame app = new MainFrame();
                    app.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CategProdUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

}
