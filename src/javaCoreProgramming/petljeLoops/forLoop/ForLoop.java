package javaCoreProgramming.petljeLoops.forLoop;

public class ForLoop {
    public static void main(String[] args) {
        String recenicaText = "Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.";
        String rijecText = "Adi";
        char[] recenica = recenicaText.toCharArray();
        char[] rijec = rijecText.toCharArray();
        boolean postojiNePostoji = false;
        int counter = 0;
        int i;
        int j;
        int k = 0;

        label:
        for (i = 0; i < recenica.length; i++) {
            i = k;
            for (j = 0; j < rijec.length; j++) {
                char slovoNizaRecenica = recenica[k];
                k++;
                char slovoNizaRijec = rijec[j];
                if (slovoNizaRijec != slovoNizaRecenica) {
                    continue label;
                }
            }
            postojiNePostoji = true;
            counter++;

        }
        String poruka1 = postojiNePostoji ? "Riječ je sadržana u rečenici" : "Riječ ne postoji u datoj rečenici";
        String poruka2 = String.format("U rečenici '%s', riječ '%s', se ponavlja '%d' puta.", recenicaText, rijecText, counter);
        System.out.println(poruka1);
        System.out.println(poruka2);


    }
}
