package vježbePrezentacija;

import java.util.Arrays;

public class Vježba13 {
    public static void main(String[] args) {
        char[] znakovi = {'k', 'o', 'p', 'H', 'a', 'r', 'u', 'n', 'e', 'c'};
        char[] znakoviCopyTo = new char[5];
        System.arraycopy(znakovi, 3, znakoviCopyTo, 0, znakoviCopyTo.length);
        System.out.println(znakoviCopyTo);

        char[] znakoviCopyTo2 = Arrays.copyOfRange(znakovi, 3, 8);
        System.out.println(znakoviCopyTo2);

        String[][] pozivnice = new String[2][10];
        pozivnice[0][0] = "Gospodin ";
        pozivnice[0][1] = "Gospođa ";
        pozivnice[1][0] = "Amar";
        pozivnice[1][1] = "Emir";
        pozivnice[1][2] = "Amir";
        pozivnice[1][3] = "Irfan";
        pozivnice[1][4] = "Faruk";
        pozivnice[1][5] = "Lejla";
        pozivnice[1][6] = "Aida";
        pozivnice[1][7] = "Ruzmira";
        pozivnice[1][8] = "Azra";
        pozivnice[1][9] = "Anesa";

        String gđa = pozivnice[0][1] + pozivnice[1][9];
        System.out.println(gđa);

        String[][] pozivniceCopy = new String[2][5];
        pozivniceCopy[0][0] = pozivnice[0][1];
        pozivniceCopy[1][0] = pozivnice[1][5];
        pozivniceCopy[1][1] = pozivnice[1][6];
        pozivniceCopy[1][2] = pozivnice[1][7];
        pozivniceCopy[1][3] = pozivnice[1][8];
        pozivniceCopy[1][4] = pozivnice[1][9];

        String gđa1 = pozivniceCopy[0][0] + pozivniceCopy[1][0];
        System.out.println(gđa1);

/*
        String[][] pozivniceGđa = new String[2][10];
        System.arraycopy(pozivnice,1,pozivniceGđa,0,pozivniceGđa.length);
        System.out.println(pozivniceGđa);

        String[][] pozivniceGdin = Arrays.copyOfRange(pozivnice,5,10);
        System.out.println(pozivniceGdin);
*/
        System.out.println(pozivnice.length);// rez : 2 , sto znaci na prvom indexu ima 2 mjesta
        System.out.println(pozivnice[0].length);// rez : 10 , sto znavi da na drugom indexu ima 10 mjesta

        String name1 = "Harun";
        String name2 = new String("Harun");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
