package javaCoreProgramming.petljeLoops.forLoop;

/**
 * Zadatak:
 * Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.
 * 1. Ispitati da li je riječ Adi sadržana unutar date rečenice.
 * 2. U datoj rečenici izračunati koliko se puta ponavlja riječ "Adi".
 */

public class ForLoopEnhancedVjezba1 {
    public static void main(String[] args) {
        String recenicaText = "Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.";
        String rijecText = "Adi";
        char[] recenica = recenicaText.toCharArray();
        char[] rijec = rijecText.toCharArray();
        boolean postojiNePostoji = false;
        int counter = 0;


        label:
        for (int i = 0; i < recenica.length; i++) {
            int k = i;
            for (char slovoNizaRijec : rijec) {
                char slovoNizaRecenica = recenica[k++];
                if (slovoNizaRijec != slovoNizaRecenica) {
                    continue label;
                }
            }
            postojiNePostoji = true;
            counter++;
            //break;


        }
        String poruka1 = postojiNePostoji ? "Riječ je sadržana u rečenici" : "Riječ ne postoji u datoj rečenici";
        String poruka2 = String.format("U rečenici '%s', riječ '%s', se ponavlja '%d' puta.", recenicaText, rijecText, counter);
        System.out.println(poruka1);
        System.out.println(poruka2);


    }
}
