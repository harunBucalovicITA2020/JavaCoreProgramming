package javaCoreProgramming.petljeLoops;

import javax.swing.*;

public class LoopWithLable {
    public static void main(String[] args) {
        int[][] brojevi = {
                {3, 5, 11, 4},
                {23, 1, 7, 13},
                {12, 6, 8, 32}
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi broj i iskusaj sreću: ");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean pogodak = false;
        LABELA:
        for (int[] brojeviNizova : brojevi) {
            for (int z = 0; z < brojevi.length; z++) {
                int brojNiza = brojeviNizova[z];
                if (uneseniBroj == brojNiza) {
                    pogodak = true;
                    break LABELA;
                }

            }

        }
        String message = pogodak ? "Bingo!!!" : "Više sreće drugi put!";
        JOptionPane.showMessageDialog(null, message);

        labelica:
        for (int i = 0; i < brojevi.length; i++) {
            int[] brojeviUnutarNiza = brojevi[i];
            for (int y = 0; y < brojevi.length; y++) {
                int broj = brojevi[i][y];
                if (uneseniBroj == broj) {
                    pogodak = true;
                    break labelica;
                }
            }
        }
    }
}