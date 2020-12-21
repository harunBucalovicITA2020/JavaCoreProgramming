package javaCoreProgramming.swich;
/*
<li>Zadatak je napraviti program koji nam na osnovu unosa korisnika govori koliko koji mjesec ima dana</li>
 Parametri koji nam trebaju da se unesu od strane korisnika su :
 1. redni broj mjeseca
 2. broj godine
 Moguci ishodi su :
 1. 28
 3. 30
 2. 29 prestupna godina -> godina djeljiva sa 4 , a nije djeljiva sa 100. I godina dijeljiva sa 400.
 4. 31
*/

import javax.swing.*;

public class SwichCase3 {
    public static void main(String[] args) {
        String redniBrojMjesecText = JOptionPane.showInputDialog("Unesi redni broj mjeseca:");
        int redniBrojMjeseca = Integer.parseInt(redniBrojMjesecText);
        String brojGodineText = JOptionPane.showInputDialog("Unesi broj godine:");
        int brojGodine = Integer.parseInt(brojGodineText);
        int brojDanaUMjesecu = 0;
        switch (redniBrojMjeseca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;
            case 2:
                boolean condition1 = brojGodine % 4 == 0 && brojGodine % 100 != 0;
                boolean condition2 = brojGodine % 400 == 0;
                boolean prestupna = condition1 || condition2;
                if (prestupna) {
                    brojDanaUMjesecu = 29;

                } else {
                    brojDanaUMjesecu = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pogresan unos. Godina ima 12 mjeseci!");
                break;
        }
        String message1 = "Za uneseni broj mjeseca '"
                + redniBrojMjeseca +
                "' i godinu '"
                + brojGodine +
                "' broj dana u mjesecu je '"
                + brojDanaUMjesecu + "'";

        JOptionPane.showMessageDialog(null, message1);


    }

}

