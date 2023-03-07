/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albumcromo;

/**
 *
 * @author shas4605
 */
public class AlbumCromos {

    /** la part de la app, la que llança el programa
     * fara la funcio controlador mque es comunicara amb DAO
     * i informarà al usuari.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCromos app = new AlbumCromos();
        
        app.run();
    }
    
    /**
     * ja no es estatic, aixo fa que ja ningu desde fora el pugui cridar
     */
    private void run() {
        //ho deixo aixi fins ara
    }
    
}
