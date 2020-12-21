package javaCoreProgramming.continueInsideLoop;



/**
 * Zadatak:
 * Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.
 * u datoj rečenici izračunati koliko se puta ponavlja riječ "adi".
 */

public class ContinueWithLable {
    public static void main(String[] args) {
        String recenica = "Trazim koliko puta se Adi nasmijao. Adi je zaista zabavan tip.";
        String rijec = "Adi";
        char[] recenicaChar = recenica.toCharArray();
        char[] rijecChar = rijec.toCharArray();
        boolean postojiNePostoji = false;
        int adiSePonvaljaPuta = 0;
        labela:
        for (int i = 0; i < recenicaChar.length; i++) {
            int k = i;
            for (int j = 0; j < rijecChar.length; j++) {
                char elementiRecenice = recenicaChar[k++];
                char elementiRijeci = rijecChar[j];
                //elementiRijeci = 'A';
                if (elementiRecenice != elementiRijeci) {
                    continue labela;
                }

            }
            adiSePonvaljaPuta++;
            postojiNePostoji = true;
        }
        String message2 = postojiNePostoji ? "Riječ 'Adi' postoji u ovoj rečenici": "Riječ 'Adi' ne postoji u rečenici. ";
        System.out.println(message2);
        if(postojiNePostoji) {
            String message = String.format("U ovoj rečenici '%s', riječ '%s' se ponavlja '%d' puta!",recenica,rijec, adiSePonvaljaPuta);
            System.out.println(message);
        }

    }

}



