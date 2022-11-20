/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2;

/**
 *
 * @author shebi
 */
public class recursivitatActividades {

    public static void main(String[] args) {
        // TODO code application logic here
        int total = potesVer2(4);
        System.out.println(total);
    }
    
    public static int potes(int aranyes) {
        
        int op = 0;
        
        if(aranyes<=1) {
            return 8;
        }else if(aranyes>1) {
            op = 8+potes(aranyes-1);
        }
        
        return op;
    }
    
    public static int potesVer2(int aranyes) {
        
        int op = 0;
        if(aranyes<=1) {
            return 8;
        }else if(potesVer2(aranyes-1) %2 == 0) {
            op = 6+potesVer2(aranyes-1);
        }else if(potesVer2(aranyes-1) %2 == 1) {
            op = 8+potesVer2(aranyes-1);
        }
        
        return op;
    }
    
}
