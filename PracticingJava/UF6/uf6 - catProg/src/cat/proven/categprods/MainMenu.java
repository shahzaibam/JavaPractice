package cat.proven.categprods;
/** 
 * @author ProvenSoft
 */
public class MainMenu extends Menu {

    public MainMenu() {
        super("Category&Product Manager main menu");
        addOption(new Option("Exit","exit"));
        addOption(new Option("List all categories","category/all"));
        addOption(new Option("List all products","product/all"));
        addOption(new Option("List all suppliers","supplier/all"));
        addOption(new Option("List products by min. stock","product/minstock"));
        addOption(new Option("List products like name","product/name"));
        addOption(new Option("List supplier and his products","supplier/products"));
        addOption(new Option("Change price of products by category","product/changeprice"));
    } 
}