package javaCoreProgramming.ifElseIfElse;

import javax.swing.*;

/**
 * <li>PRIMJER KADA SE PROGRAM IZVRSAVA LINE BY LINE NIJE DOBRO RIJEŠENJE U SLUČAJU KADA SE PROMJENI REDOSLJED</li>
 * OVO JE DRUGI PRIMJER KADA SE DODA I OPERATER AND(&&)
 * ISTI REZULTAT U OVOM SLUČAJU DOBIJEM KADA UPOTRIJEBIM SAMO USLOV ==, JER JE BESPOTREBNO U OVOM PRIMJERIU DODAVATI VISE OPERATERA!
 */

public class IfElseIfElse2 {
    public static void main(String[] args) {
        String mjesecString = JOptionPane.showInputDialog("Unesi neki mjesec od 1 do 12: ");
        int mjesec = Integer.parseInt(mjesecString);
        String imeMjeseca;
        if (mjesec == 12) {
            imeMjeseca = "Decembar";
        } else if (mjesec == 11) {
            imeMjeseca = "Novembar";
        } else if (mjesec == 10) {
            imeMjeseca = "Oktobar";
        } else if (mjesec == 9) {
            imeMjeseca = "Septembar";
        } else if (mjesec == 8) {
            imeMjeseca = "August";
        } else if (mjesec == 7) {
            imeMjeseca = "Juli";
        } else if (mjesec == 6) {
            imeMjeseca = "Juni";
        } else if (mjesec == 5) {
            imeMjeseca = "Maj";
        } else if (mjesec == 4) {
            imeMjeseca = "April";
        } else if (mjesec == 3) {
            imeMjeseca = "Mart";
        } else if (mjesec == 2) {
            imeMjeseca = "Februar";
        } else if (mjesec == 1) {
            imeMjeseca = "Januar";
        } else {
            imeMjeseca = "Taj broj mjeseci ne postoji";
        }
        JOptionPane.showMessageDialog(null, "Tvoj kalendarski odabir je : " + imeMjeseca);
    }
}
