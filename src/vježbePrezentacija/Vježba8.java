package vježbePrezentacija;

import javax.swing.*;

/**
 * <li>Zadatak je da se iz rečenice izbroji koliko se puta ponavlja odredženo slovo</li>
 */


public class Vježba8 {
    public static void main(String[] args) {
        String text = "riba ribi grize rep";
        char[] arrayText = text.toCharArray();
        int brojač = 0;
        for (int i = 0; i < arrayText.length; i++) {
            char slovo = arrayText[i];
            if (slovo != 'r') {
                continue;
            }
            brojač++;
        }
        String message = "Broj slova 'r' u navedenoj rečenici je " + "'" + brojač + "'";
        JOptionPane.showMessageDialog(null,message);

    }
}
