package javaCoreProgramming.continueInsideLoop;

import javax.swing.*;

/**
 * Zadatak:
 * u unesenoj rečenici izbroj koliko puta se zadato slovo nalazi u rečenici!
 */

public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = JOptionPane.showInputDialog("Upisi rečenicu koja ima slovo t : ");
        char[] slovoIzNiza = recenica.toCharArray();
        int brojac = 0;
        for (int i = 0; i < slovoIzNiza.length; i++) {
            char slovo = slovoIzNiza[i];
            if (slovo != 't') {
                continue;
            }
            brojac++;
        }
        String poruka = String.format("U ovoj rečenici broj slova 't' je : '%d'", brojac);
        JOptionPane.showMessageDialog(null, poruka);
    }
}
