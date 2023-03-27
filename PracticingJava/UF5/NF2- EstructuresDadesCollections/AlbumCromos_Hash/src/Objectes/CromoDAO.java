/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * DAO el encarregat de tenir la estructura d'enmagatzematge d'objectes
 * en aquest cas cromos
 * tindra tots els metodes necessaris per manipular la estructura (afegir, treure
 * borrar)
 * NO HA D'HAVER CAP METODE QUE TINGUI SORTIDA AL USUARI (caP sout)
 * Aquest retorna objectes, exceptions o valor a la part de la app(controlador)
 * @author mabardaji
 */
public class CromoDAO {
   //estructura enmagatzermatge
    //
    
    //private List<Cromo> album;
    private Map<Integer, String> album ;
    private Map<Integer, Cromo> repes;
    private int num_max_coleccio; //quants cromos hi ha
    private boolean ordenado;
    
    public CromoDAO(int max) {
//        album = new ArrayList<Cromo>();
//        repes = new ArrayList<Cromo>();
        album =  new HashMap<>();
        repes = new HashMap<>();
        num_max_coleccio = max;
        ordenado = false;
    }
    
    //no scanner i també els sout
    
    /**
     * 
     * @param cromo_add cromo a poner en el album
     * @return true si se añade al albulm /false si se pone en repes
     * @throws NumberOutofAlbum  cromo tiene un numero fuera del album
     */
    public boolean afegirCromo(Cromo cromo_add) throws NumberOutofAlbum
    {
        if(this.num_max_coleccio < cromo_add.getNum())
        {
            throw new NumberOutofAlbum("Cromo no es de la col·leció");
        }
        
        
        if (album.get(cromo_add.getNum())!= null)
        {
            System.out.println("Cromo ya existe");
             repes.put(cromo_add.getNum(),cromo_add);
            return false;
        }
        else
        {
            album.put(cromo_add.getNum(), cromo_add.getDescripcio_cromo());
            ordenado=false;
            return false;
        }
        
        
    }
    
    /**
     * 
     * @param del card con numero informado
     * @return 0 l'he boorat de repes 
     * 1 l'he tret del album i 
     * -1 no el tinc
     */
    public int removeCard(Cromo del)
    {
        if(repes.remove(del.getNum(),del))
        {
            return 0;
        }
        else if(album.remove(del.getNum(),del.getDescripcio_cromo()))
        {
            return 1;
        }
        else
        {
            return -1;
        }
        
    }
    
    public boolean isAlbum(Cromo add)
    {
        return album.containsKey(add.getNum());
    }
    
    
    public boolean isRepes(Cromo add)
    {
        return repes.containsKey(add.getNum());
    }
    //afegir
    
    //esborrar
    
    //canviar
    
    //buscar
    
    //retornar colecció

    /**
     *
     * @return
     */

    public Map<Integer,String> getAlbum() {
        
        if(!ordenado)
        {
            Map<Integer,String> ordenador = new TreeMap<Integer, String>(album);
            ordenado = true;
            album.clear();
            album.putAll(ordenador);
            return ordenador;
        }
       
        return album;
    }

    public Map<Integer,Cromo> getRepes() {
        return repes;
    }

    public int getNum_max_coleccio() {
        return num_max_coleccio;
    }
    
    public int getNumAlbum()
    {
        return album.size();
    }
    
    public int getNumRepes()
    {
        return repes.size();
    }
    
    
}
