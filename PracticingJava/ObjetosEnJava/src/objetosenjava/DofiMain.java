/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosenjava;

/**
 *
 * @author shebi
 */
public class DofiMain {

    public static void main(String[] args) {
        Foca uno = new Foca(200, 16);
        
        System.out.println("La resistencia es de " + uno.getResistencia());
        
        for (int i = 0; i < 4; i++) {
            uno.Sprint();
            System.out.println(uno.getResistencia());
        }
        
        uno.AugmentarResistencia(5);
        
        uno.setPes(100);
        
        System.out.println("AHORA PESO ES DE " + uno.getPes());
        System.out.println("-------");
        System.out.println("Resistencia es de " + uno.getResistencia());
        
        for (int i = 0; i < 6; i++) {
            uno.Sprint();
            System.out.println(uno.getResistencia());
        }

        Dofi dos = new Dofi(30, "austral");
        
        dos.Sprint();
        dos.sprint_final();

        System.out.println("Distancia recorrida es " + dos.getDistancia_recorreguda());
               
        
    }
}
