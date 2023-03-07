/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 * DAO el encarregat de tenir la estruictura d'emmagatzematge d'objectes
 * en aquest cas cromos.
 * tindra tots els metodes necesaris per manipular la estructura, afegir, treure, borrar
 * Aquest retorna objectes, exceptions o valor a la part de la app(controlador)
 * @author shas4605
 */
public class CromoDAO extends Cromo{
    //estructura d'emmagatzematge
    //
    List<Cromo> album;
    List<Cromo> repes;
    int num_max_de_colecc; //numero de cromos que podem coleccionar en el album

    public CromoDAO(int max) {
        album = new ArrayList<Cromo>();
        repes = new ArrayList<Cromo>();
        num_max_de_colecc = max;
        
    }
    
    //no se puede usar ni escanner ni sout
    public boolean afegirCromo(Cromo cromo_add) throws Exception{
        //comprobar que el numero no surt fora dels limits
        //i si surt fora, llançar l'excepcio demanada
        if(this.num_max_de_colecc > 150) {
            throw new Exception("Index Out of bounds, no puedes sobrepasar de 150");
        }
        
        //sino haig de mirar si no el tinc repetit.
        if(!album.contains(cromo_add)) {
            return true;
            //sout no porque esta prohibido en MVC
        }else {
            return false;
        }
        
    }
    
    //afegir
    
    
    //esborrar
    
    
    //canviar
    
    
    //buscar
    
    
    //retornar coleccio
    

    public List<Cromo> getAlbum() {
        return album;
    }

    public List<Cromo> getRepes() {
        return repes;
    }

    public int getNum_max_de_colecc() {
        return num_max_de_colecc;
    }
    
    
    
    
}
