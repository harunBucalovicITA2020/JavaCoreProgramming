package javaCoreProgramming.petljeLoops.forLoop;

/**
 * Zadatak:
 * Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.
 * 1. Ispitati da li je riječ Adi sadržana unutar date rečenice.
 */

public class ForLoopEnhanced {
    public static void main(String[] args) {
        String recenica = "Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.";
        String rijec = "Adi";
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();

        boolean postojiNePostoji = false;
        label:
        for (int i = 0; i < recenicaNiz.length; i++) {
            int k = i;
            for (char slovoNizaRijec : rijecNiz) {
                char slovoNizaRecenica = recenicaNiz[k++];
                if (slovoNizaRijec != slovoNizaRecenica) {
                    continue label;
                }
            }
            postojiNePostoji = true;
            break;

        }
        String poruka = postojiNePostoji ? "postoji" : "ne postoji";
        System.out.println(poruka);
    }
}

