/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * DAO el encarregat de tenir la estructura d'enmagatzematge d'objectes en
 * aquest cas cromos tindra tots els metodes necessaris per manipular la
 * estructura (afegir, treure borrar) Aquest retorna objectes, exceptions o
 * valor a la part de la app(controlador)
 *
 * @author mabardaji
 */
public class CromoDAO {
    //estructura enmagatzermatge
    //

    private HashMap<Integer, String> album;
    private HashMap<Integer, String> repes;
    int num_max_coleccio; //quants cromos hi ha
    private boolean ordenado;
    private boolean ordenadoRepes;

    public CromoDAO(int max) {
        album = new HashMap<Integer, String>();
        repes = new HashMap<Integer, String>();

        num_max_coleccio = max;
        ordenado = false;
        ordenadoRepes = false;
    }

    //no scanner i tamb� els sout
    /**
     *
     * @param cromo_add cromo a poner en el album
     * @return true si se a�ade al albulm /false si se pone en repes
     * @throws NumberOutofAlbum cromo tiene un numero fuera del album
     */
    public boolean afegirCromo(Cromo cromo_add) throws NumberOutofAlbum {
        if (this.num_max_coleccio < cromo_add.getNum()) {
            throw new NumberOutofAlbum("Cromo no es de la coleccio");
        }

        Integer clave = cromo_add.getNum();

        if (!album.containsKey(clave)) {
            album.put(clave, cromo_add.getDescripcio_cromo());
            ordenado = false;
            return true;
            //sout no porque esta prohibido MVC
        } else {
            repes.put(clave, cromo_add.getDescripcio_cromo());
            ordenadoRepes = false;
            return false;
        }

    }

    /**
     *
     * @param del card con numero informado
     * @return 0 l'he boorat de repes 1 l'he tret del album i -1 no el tinc
     */
    public int removeCard(Cromo del) {
        if (repes.remove(del.getNum(), del.getDescripcio_cromo())) {
            return 0;
        } else if (album.remove(del.getNum(), del.getDescripcio_cromo())) {
            return 1;
        } else {
            return -1;
        }

    }

    public boolean isAlbum(Cromo add) {
        return album.containsKey(add.getNum());
    }

    public boolean isRepes(Cromo add) {
        return repes.containsKey(add.getNum());
    }
    //afegir

    //esborrar
    //canviar
    //buscar
    //retornar colecci�
    public List<Cromo> getAlbum() {

        List<Cromo> album_list = null;
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
        return album_list;

    }

    public List<Cromo> getRepes() {
        List<Cromo> repes_list = null;
        Set<Integer> keys = album.keySet();

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

    public int getNumAlbum() {
        return album.size();
    }

    public int getNumRepes() {
        return repes.size();
    }

}
