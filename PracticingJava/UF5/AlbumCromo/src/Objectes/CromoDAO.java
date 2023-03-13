/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.ArrayList;
import java.util.List;

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

    List<Cromo> album;
    List<Cromo> repes;
    int num_max_coleccio; //quants cromos hi ha

    public CromoDAO(int max) {
        album = new ArrayList<Cromo>();
        repes = new ArrayList<Cromo>();
        num_max_coleccio = max;
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
            throw new NumberOutofAlbum("Cromo no es de la col�leci�");
        }

        if (!album.contains(cromo_add)) {
            album.add(cromo_add);
            return true;
            //sout no porque esta prohibido MVC
        } else {
            repes.add(cromo_add);
            return false;
        }

    }

    /**
     *
     * @param del card con numero informado
     * @return 0 l'he boorat de repes 1 l'he tret del album i -1 no el tinc
     */
    public int removeCard(Cromo del) {
        if (repes.remove(del)) {
            return 0;
        } else if (album.remove(del)) {
            return 1;
        } else {
            return -1;
        }

    }

    public void removeCardRepes(Cromo del) {
        repes.remove(del);
    }

    public boolean isAlbum(Cromo add) {
        return album.contains(add);
    }

    public boolean isRepes(Cromo add) {
        return repes.contains(add);
    }
    //afegir

    //esborrar
    //canviar
    //buscar
    //retornar colecci�
    public List<Cromo> getAlbum() {
        return album;
    }

    public List<Cromo> getRepes() {
        return repes;
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

    public void mostrarAlbum() {
        for (int i = 0; i < this.album.size(); i++) {
            System.out.println(this.album.get(i));
        }
    }

    public void mostrarRepes() {
        for (int i = 0; i < this.repes.size(); i++) {
            System.out.println(this.repes.get(i) + " repesss");
        }
    }

    public boolean comprobar_al_Album(Cromo newCard) {
        for (int i = 0; i < this.album.size(); i++) {
            if (this.album.get(i).equals(newCard)) {
                System.out.println("esto es igual!!!!!!!!!!!1");
                return true;

            }
        }
        return false;
    }

    public boolean comprobar_al_Repes(Cromo oldCard) {
        for (int i = 0; i < this.repes.size(); i++) {
            if (this.repes.get(i).equals(oldCard)) {
                return true;
            }
        }
        return false;
    }

}
