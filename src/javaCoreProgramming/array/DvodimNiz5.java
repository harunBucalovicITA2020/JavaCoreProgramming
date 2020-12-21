package javaCoreProgramming.array;

import javax.swing.*;


public class DvodimNiz5 {
    public static void main(String[] args) {
        String recenica = "Ja idem u skolu, zato sto volim skolu.";
        String rijec = "skolu";
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        int brojPonavljanja = 0;
        boolean postojiNepostoji = false;
        int i = 0;
        int j = 0;
        labela:
        while (i < recenicaNiz.length) {
            int k = i;
            i++;
            while (j < rijecNiz.length) {

                char rijeciNiza = recenicaNiz[k++];
                char rijecNiza = rijecNiz[j];

                if (rijecNiza != rijeciNiza) {
                    postojiNepostoji = true;
                    //break;
                    continue labela;

                }
                brojPonavljanja++;

            }


           // continue labela;
        }



        String message1 = postojiNepostoji ? "Tražena riječ postoji" : "Tražena riječ ne postoji";
        JOptionPane.showMessageDialog(null, message1);
        String message2 = String.format("U rečenici '%s', riječ '%s' se ponavlja '%d'", recenica, rijec, brojPonavljanja);
        JOptionPane.showMessageDialog(null, message2);
    }
}