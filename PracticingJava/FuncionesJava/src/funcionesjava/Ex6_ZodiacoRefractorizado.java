package funcionesjava;

import java.util.Scanner;

public class Ex6_ZodiacoRefractorizado {

    /**
     *  6) Obre la classe Ex6_Zodiaco i aplica les següents refraccions:
        1. Canvia el nom de la classe per Ex6_ZodiacoRefractorizado
        2. Canvia el nom de dues variables, les que vulguis.
        3. Converteix el número 31 i el número 12 en constants.
        4. Ubica el codi al voltant de la fase 3 en un mètode apart.
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOK = true;
        
        final int numdotze = 12;
        final int numtrentau = 31;
        
        System.out.println("¿Que dia naciste?(1-31)");
        int day = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int mesN = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOK = day > 0 && day <= numtrentau;
        respuestasOK = respuestasOK && mesN > 0 && mesN <= numdotze;

        System.out.println();
        String Signo="";
        if (respuestasOK) {
            //Fase tres (Calculando datos)
            System.out.println("Calculando");
            if (day >= 21 && mesN == 3 || day <= 20 && mesN == 4) {
                Signo="Aries";
            }

            if (day >= 21 && mesN == 4 || day <= 21 && mesN == 5) {
                Signo="Tauro";
            }

            if (day >= 22 && mesN == 5 || day <= 21 && mesN == 6) {
                Signo="Geminis";
            }

            if (day >= 21 && mesN == 6 || day <= 27 && mesN == 7) {
                Signo="Cancer";
            }

            if (day >= 24 && mesN == 7 || day <= 23 && mesN == 8) {
                Signo="Leo";
            }

            if (day >= 24 && mesN == 8 || day <= 23 && mesN == 9) {
                Signo="Virgo";
            }

            if (day >= 24 && mesN == 9 || day <= 23 && mesN == 10) {
                Signo="Libra";
            }

            if (day >= 24 && mesN == 10 || day <= 22 && mesN == 11) {
                Signo="Escorpio";
            }

            if (day >= 23 && mesN == 11 || day <= 21 && mesN == numdotze) {
                Signo="Sagitario";
            }

            if (day >= 22 && mesN == 11 || day <= 20 && mesN == 1) {
                Signo="Capricornio";
            }

            if (day >= 21 && mesN == 1 || day <= 19 && mesN == 2) {
                Signo="Acuario";
            }

            if (day >= 20 && mesN == 2 || day <= 20 && mesN == 3) {
                Signo="Picis";
            } 
            //Fin fase tres (Calculando datos)

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }
}
