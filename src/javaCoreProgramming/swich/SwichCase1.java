package javaCoreProgramming.swich;

import javax.swing.*;
import java.util.ArrayList;

public class SwichCase1 {
    public static void main(String[] args) {
        /**
         * <li>OVO JE PRIMJER SA DINAMIČKIM NIZOM KOJI SAM UČIO NA PREDAVANJU</li>
         */
        String nindžaKornjače = JOptionPane.showInputDialog("Tvoja omiljena lik iz nindža kornjača : ");
        int brojLikova = Integer.parseInt(nindžaKornjače);
        ArrayList<String> nizKarakteraIzStripa = new ArrayList<String>();
        switch (brojLikova) {
            case 1:
                nizKarakteraIzStripa.add("Rafaelo");
                break;
            case 2:
                nizKarakteraIzStripa.add("Donatelo");
                break;
            case 3:
                nizKarakteraIzStripa.add("Leonardo");
                break;
            case 4:
                nizKarakteraIzStripa.add("Mikelanđelo");
                break;
            case 5:
                nizKarakteraIzStripa.add("Splinter");
                break;
            case 6:
                nizKarakteraIzStripa.add("Rokstedi");
                break;
            case 7:
                nizKarakteraIzStripa.add("Bibop");
                break;
            case 8:
                nizKarakteraIzStripa.add("Sjekač");
                break;
            default:
                /*
                JOptionPane.showMessageDialog(null, "Nema toliko junaka u stripu o Nindža Kornjačama!");
                                break;
                                 */
                nizKarakteraIzStripa.add("Nema toliko junaka u stripu o Nindža Kornjačama!");
                break;
        }
        JOptionPane.showMessageDialog(null, "odabrao si junaka : " + nizKarakteraIzStripa);


    }
}
