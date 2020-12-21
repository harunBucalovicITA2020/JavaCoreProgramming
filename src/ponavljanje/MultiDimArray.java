package ponavljanje;

import javax.swing.*;

/**
 * <li>ZADATAK: Nagradna igra tipa bingo</li>
 */

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] dobitniBrojevi = {
                {5, 7, 11, 17, 23, 35},
                {1, 6, 12, 24, 36, 40},

        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi sretni broj i iskušaj sreću: ");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean pogodak = false;

     labela:   for (int[] brojeviNiza : dobitniBrojevi) {
            for (int brojUnutarNiza : brojeviNiza) {
                if (uneseniBroj == brojUnutarNiza) {
                    pogodak = true;
                    break labela;

                }

            }

        }

        String poruka = pogodak ? "Čestitamo pogodili ste broj!" : "Više sreće drugi put!";
        JOptionPane.showMessageDialog(null, poruka);
    }
}