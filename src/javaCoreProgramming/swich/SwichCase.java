package javaCoreProgramming.swich;

import javax.swing.*;

public class SwichCase {
    public static void main(String[] args) {

        /*
          <li>OVO JE PRVI NAČIN KOJI SAM UČIO NA PREDAVANJU!</li>
         */

        String imenaMjeseciText = JOptionPane.showInputDialog("Unesi numerički jedan od 12 mjeseci u godini: ");
        int brojMjeseci = Integer.parseInt(imenaMjeseciText);
        String imeMjeseca;
        switch (brojMjeseci) {
            case 1:
                imeMjeseca = "Januar";
                break;
            case 2:
                imeMjeseca = "Februar";
                break;
            case 3:
                imeMjeseca = "Mart";
                break;
            case 4:
                imeMjeseca = "April";
                break;
            case 5:
                imeMjeseca = "Maj";
                break;
            case 6:
                imeMjeseca = "Juni";
                break;
            case 7:
                imeMjeseca = "Juli";
                break;
            case 8:
                imeMjeseca = "August";
                break;
            case 9:
                imeMjeseca = "Septembar";
                break;
            case 10:
                imeMjeseca = "Oktobar";
                break;
            case 11:
                imeMjeseca = "Novembar";
                break;
            case 12:
                imeMjeseca = "Decembar";
                break;
            default:
                imeMjeseca = "U kalendarskoj godini ima samo dvanest mjeseci!";

        }
        JOptionPane.showMessageDialog(null, imeMjeseca);
        /*
        OVO JE NOVO RIJEŠENJE KOJE MI JAVA PREPORUČUJE!
         */

        String daniUSedmici = JOptionPane.showInputDialog("Unesi neki dan u sedmici koristeči numeričke tipke 1 - 7 : ");
        int brojDana = Integer.parseInt(daniUSedmici);
        String danUSedmici = switch (brojDana) {
            case 1 -> "Monday";
            case 2 -> "Tuseday";
            case 3 -> "Wedensday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Sedmica ima samo sedam dana!";
        };
        JOptionPane.showMessageDialog(null,"Tvoj izbor dana je : " + danUSedmici);

    }
}
