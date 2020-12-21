package javaCoreProgramming.breakWithLabel;

/**
 * <li>Zadatak: U datoj rečenici ispitati koliko se puta zadana riječ ponavlja!</li>
 * Imamo recenicu i imamo riječ
 * Trazi se da izbrojimo broj ponavljanja tako da će nam trebati tip varijable int, koju mozemo imenovati npr counter/brojač.
 * Znam da je String složeni tip, da je klasa i da je niz karaktera npr. {a,b,c,d}...
 * Ono sto sam i sam skontao nekako jeste da trebam String konvertovati u char, jer char skladisti karakter, tj. char[] skladisti NIZ karaktera.
 * Znam i to PETLJE najbolje sluze za rad sa nizovima
 */

public class BreakWithLable {
    public static void main(String[] args) {
        String recenica = "Svaka riba mora zivjeti u vodi, jer riba dise na skrge.";
        String rijec = "riba";
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();

        int count = 0;
        lable:
        for (int i = 0; i < recenicaNiz.length; i++) {
            int k = i;
            for (int j = 0; j < rijecNiz.length; j++) {// ova petlja mi sluzi za kontrolu/ulazak u niz rijecNiz
                char elementNizaRecenica = recenicaNiz[k++];
                char elementNizaRijec = rijecNiz[j];

                if (elementNizaRecenica != elementNizaRijec) {
                    continue lable;
                }
            }
            count++;
        }
        System.out.println(count);

    }
}
