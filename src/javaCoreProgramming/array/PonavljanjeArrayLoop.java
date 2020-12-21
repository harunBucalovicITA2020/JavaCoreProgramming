package javaCoreProgramming.array;


public class PonavljanjeArrayLoop {
    public static void main(String[] args) {
        String[] fudbalskiKlubovi = {"Bayern", "Manchester United", "Barcelona", "Chelsea", "Željezničar", "Ajax", "Dortmund"};
        int i = 0;
        while (i < fudbalskiKlubovi.length) {
            String klubovi = fudbalskiKlubovi[i];
            System.out.println(klubovi);
            i++;
        }
        for (int z = 0; z < fudbalskiKlubovi.length; z++) {
            String klubovi1 = fudbalskiKlubovi[z];
            System.out.println(klubovi1);
        }
        for (String klubovi2 : fudbalskiKlubovi) {
            System.out.println(klubovi2);
        }
    }

}
