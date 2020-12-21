package javaCoreProgramming.array;

import javax.swing.*;

public class MultidimArrayWithLoop {
    public static void main(String[] args) {
        int[][] brojevi = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11, 13, 15, 17},
                {12, 14, 16, 18, 20},
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi sretni broj:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean pogodak = false;
        LABELA:
        for (int i = 0; i < brojevi.length; i++) {
            int[] nizovi = brojevi[i];
            for (int z = 0; z < nizovi.length; z++) {
                int brojeviUnutarNizova = brojevi[i][z];
                if (brojeviUnutarNizova != uneseniBroj) { //ako postavimo uslov ==
                    continue; //onda pisemo uslov bulean pogodak = true, a ispod break LABELA;. tada nam continue ne treba!

                }
                pogodak = true;
                break LABELA;
            }

        }
        String message = pogodak ? "Čestitamo pogodili ste broj!!!" : "Više sreće drugi put!";
        JOptionPane.showMessageDialog(null, message);

    }
}
