package javaCoreProgramming.swich;

import javax.swing.*;
import java.util.ArrayList;

public class SwichCase2 {
    public static void main(String[] args) {
        /**
         * <li>OVO JE DRUGI NAČIN KOJI MI PREDLOŽI SAMA JAVA</li>
         */
        String nindžaKornjače = JOptionPane.showInputDialog("Tvoja omiljena lik iz nindža kornjača : ");
        int brojLikova = Integer.parseInt(nindžaKornjače);
        ArrayList<String> nizKarakteraIzStripa = new ArrayList<>();
        switch (brojLikova) {
            case 1 -> nizKarakteraIzStripa.add("Rafaelo");
            case 2 -> nizKarakteraIzStripa.add("Donatelo");
            case 3 -> nizKarakteraIzStripa.add("Leonardo");
            case 4 -> nizKarakteraIzStripa.add("Mikelanđelo");
            case 5 -> nizKarakteraIzStripa.add("Splinter");
            case 6 -> nizKarakteraIzStripa.add("Rokstedi");
            case 7 -> nizKarakteraIzStripa.add("Bibop");
            case 8 -> nizKarakteraIzStripa.add("Sjekač");
            default -> JOptionPane.showMessageDialog(null, "Nema toliko junaka u stripu o Nindža Kornjačama!");
        }
        JOptionPane.showMessageDialog(null,"odabrao si junaka : " + nizKarakteraIzStripa);
    }
}
