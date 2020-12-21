package javaCoreProgramming.array;

public class DvodimNiz {
    public static void main(String[] args) {
        int[][] dvoD = new int[4][5];
        int i, j, k = 0;// to je isto kao da napisem odvojeno int i = 0; pa ispod int j = 0; pa opet ispod int k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                dvoD[i][j] = k;
                k++;
                //System.out.print(k + " "); //ovim sam dobio ukupan broj elemenata unutar dvodimenzionalnog niza.
            }// zaista je tacno jer ovaj niz nizova ima 4 niza i u svakom po 5 elemenata sto ukupno daje 20 elemenata
        // SVE GORE NAVEDENO IMA SMISLA , ALI ANALIZOM SAM UTVRDIO DA SAM DAO VRIJEDNOSTI ELEMNATA NA INDEXIMA TAKODA
        // SVAKI INDEX DOBIJA ELEMENT INKREMENTIRANE VRIJEDNOSTI ZA 1, PA JE TAKO ISPALO DA VRIJEDNOST PRVOG ELMENTA
        // NIZA NIZOVA IMA VRIJEDNOST 1, A ZADNJEG 20

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)//{ kada u ovaj blok koda unutrasnje for petlje ubacimo vitičaste zagrade
                System.out.print(dvoD[i][j] + " ");
            System.out.println();
            //} dobijemo u outputu broj indexa unutar dvodimenzionalnog niza poredanih od 0 do 19(sto opet znaci da
        }   // niz nizova int dvoD[4][5] ima ukupno 20 elemenata poredanih od indexa 0 do indexa 19

    }
}
