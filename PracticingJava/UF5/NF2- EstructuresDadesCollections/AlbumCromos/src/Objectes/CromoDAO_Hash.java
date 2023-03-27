/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class CromoDAO_Hash {
   //estructura enmagatzermatge
    //
    
    private Map<Integer,String> album;
    private Map<Integer,String> repes;
    private int num_max_coleccio; //quants cromos hi ha
    private boolean ordenado;
    
    public CromoDAO_Hash(int max) {
//        album = new ArrayList<Cromo>();
//        repes = new ArrayList<Cromo>();
        album = new TreeMap<Integer,String>();
        repes = new HashMap<Integer,String>();
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
        
        Integer clave = cromo_add.getNum();
        //if(album.get(clave)==null) //no existeix la clau   
        if(!album.containsKey(clave))
        {
            album.put(clave,cromo_add.getDescripcio_cromo());
           //ordenado = false; Si es treeMap no fa falta.
            return true; 
            //sout no porque esta prohibido MVC
        }
        else
        {   
            repes.put(clave,cromo_add.getDescripcio_cromo());
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
//        if(repes.remove(del.getNum())!=null) //no l'ha trobat
//           {
//            return 0;
//            }
        
        if(repes.remove(del.getNum(),del.getDescripcio_cromo()))
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
        //album.containsValue(add.getDescripcio_cromo())
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

    public List<Cromo> getAlbum() {
        
        List<Cromo> album_list=null;
        
        Set<Integer> keys = album.keySet();
        Cromo anyadir;
        for (Integer clave : keys) {
            try {
                anyadir = new Cromo(clave, album.get(clave));
                album_list.add(anyadir);
            } catch (Exception ex) {
                System.out.println("Descripcion muy corta");
            }
           
            
        }
//        if(!ordenado)
//        {
//            Collections.sort(album);
//            ordenado = true;
//        }
        
        return album_list;
    }

    
    public Map<Integer,String> getAlbum2() {
        return album;
    }
    
    
    public List<Cromo> getRepes() {
          List<Cromo> repes_list=null;
        
        Set<Integer> keys = repes.keySet();
        Cromo anyadir;
        for (Integer clave : keys) {
            try {
                anyadir = new Cromo(clave, album.get(clave));
                 repes_list.add(anyadir);
            } catch (Exception ex) {
                System.out.println("Descripcion muy corta");
            }
        }
        return repes_list;
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
