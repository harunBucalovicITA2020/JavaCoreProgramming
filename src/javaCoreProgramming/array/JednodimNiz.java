package javaCoreProgramming.array;
/*
ZADATAK: Izračunati srednju vrijednost brojeva unutar niza double!
 */

public class JednodimNiz {
    public static void main(String[] args) {
        double[] brojevi = {12.3, 13.4, 8.7, 5.9, 15.1};
        double rezultat = 0;
       // int i; moze se i prvo deklarisati varijabla i ,pa se onda uvuči u blok koda for loopa
        for (int i = 0; i < 5; i++)// u tom slučaju ovdje ne bismo deklarisali tip vaijable i (int i = 0;) već bi samo
            rezultat = rezultat + brojevi[i];// stavili i = 0 ,posto je varijaabla i koja je tipa int vidljiva unutar
        System.out.println("Srednja vijenost je " + rezultat / 5);// for konstrukcije
    }
}
