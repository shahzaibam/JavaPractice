/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class Cromo implements Comparable<Cromo>{
    private int num;
    private String descripcio_cromo;

    public Cromo(int num) throws Exception {
        this.setNum(num);
        this.descripcio_cromo = "Descripcio sense valor";
    }

    public Cromo(int num, String descripcio_cromo) throws DescriptionTooShort, Exception {
        this.setNum(num);
        this.setDescripcio_cromo(descripcio_cromo);
        
    }

    public int getNum() {
        return num;
    }

    /**
     * canvia el valor de num
     * @param num introducido.
     * @throws Exception si el numero introducido es negativo
     */
    public void setNum(int num) throws Exception {
        if (num<0)
        {
            throw  new Exception("Numero no puede ser negativo");
        }
        else
        {
            this.num = num;
        }
        
    }

    public String getDescripcio_cromo() {
        return descripcio_cromo;
    }

    public void setDescripcio_cromo(String descripcio_cromo) throws DescriptionTooShort {
        if(descripcio_cromo.length()<3)
        {
            throw new DescriptionTooShort();
        }
        else
            this.descripcio_cromo = descripcio_cromo;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cromo)) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.num == other.num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("num");
        sb.append(num);
        sb.append("-");
        sb.append(descripcio_cromo);
        return sb.toString();
        //return "num=" + num + "-" + descripcio_cromo ;
    }

    @Override
    public int compareTo(Cromo o) {
        /*Compares this object with the specified object for order. 
        Returns a negative integer, zero, or a positive integer as 
        this object is less than, equal to, or greater than the specified object*/
        return (this.getNum() - o.getNum());
  //si la ordenació fos per un string
        //return this.descripcio_cromo.compareTo(o.getDescripcio_cromo())
    }


    
    
    
    
    
    
}
