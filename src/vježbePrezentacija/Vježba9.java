package vježbePrezentacija;

import javax.swing.*;

public class Vježba9 {
    public static void main(String[] args) {
        int[][] brojevi = {
                {23, 38, 56, 44},
                {12, 17, 29, 31},
                {48, 3, 7, 5, 9},
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi sretni broj:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean pogodak = false;
        LABELA:
        for (int i = 0; i < brojevi.length; i++) {
            int[] elementNiza = brojevi[i];
            for (int z = 0; z < elementNiza.length; z++) {
                int broj = brojevi[i][z];
                if (broj == uneseniBroj) {
                    pogodak = true;
                    break LABELA;
                }
            }
        }
        String poruka = pogodak ? "Bingo!!!" : "Više sreće drugi put!";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
