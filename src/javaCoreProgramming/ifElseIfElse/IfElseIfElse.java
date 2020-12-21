package javaCoreProgramming.ifElseIfElse;

import javax.swing.*;

public class IfElseIfElse {
    public static void main(String[] args) {
        String brojPoenaString = JOptionPane.showInputDialog("Unesi broj poena:");
        int brojPoena = Integer.parseInt(brojPoenaString);
        char ocjena;
        if (brojPoena >= 70 && brojPoena < 80) {
            ocjena = 'C';
        } else if (brojPoena >= 80 && brojPoena < 90) {
            ocjena = 'B';

        } else if (brojPoena >= 60 && brojPoena < 70) {
            ocjena = 'D';
        } else if (brojPoena >= 90) {
            ocjena = 'A';
        } else {
            ocjena = 'E';
        }

        JOptionPane.showMessageDialog(null,"Ocijean je: " + ocjena);

    }
}
