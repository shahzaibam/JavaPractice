/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanzarexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class LanzarExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int v=-7;
        
        try {
            valorPositivo(v);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }
        
    }
    
    public static void valorPositivo(int v) throws Exception
    {
        if (v<0)
        {
            throw new Exception("Valor no positivo");
        }
        else
        {
            v = v*2;
            System.out.println("v--> " + v);
        }
    }
    
}
