package javaCoreProgramming.continueInsideLoop;

import javax.swing.*;

public class ContinueDemo1 {
    public static void main(String[] args) {
        String recenicaText = JOptionPane.showInputDialog("Upiši rečenicu koja sadrži slovo 'p': ");
        char[] slovaReceniceNiz = recenicaText.toCharArray();
        char slovo = 'p';
        int brojač = 0;
        for (int i = 0; i < slovaReceniceNiz.length; i++) {
            char slovoRecenice = slovaReceniceNiz[i];
            if (slovoRecenice != slovo) {
                continue;
            }
            brojač++;
        }
        String poruka = String.format("U unesenoj rečenici '%s' , slovo '%s' se ponavlja '%d' puta.", recenicaText, slovo, brojač);
        JOptionPane.showMessageDialog(null, poruka);
    }
}
