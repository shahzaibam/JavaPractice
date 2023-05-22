/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.proven.pokedex.model;

/**
 *
 * @author hedo0495
 */
public class HeightException extends Exception 
{
    public HeightException()
    {
        super("La altura que has introducido es menor de 0");
        
    }
}
