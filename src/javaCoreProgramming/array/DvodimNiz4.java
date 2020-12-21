package javaCoreProgramming.array;

public class DvodimNiz4 {
    public static void main(String[] args) {
        String recenica = "Ja idem u skolu, zato sto volim skolu.";
        String rijec = "skolu";
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        int brojPonavljanja = 0;
        boolean postojiNepostoji = false;

    LABELA :   for (int i = 0; i < recenicaNiz.length; i++) {
            int k = i;
            for(int j = 0; j<rijecNiz.length;j++){
                char elementiNizaRecenica = recenicaNiz[k++];
                char elementNizaRijec = rijecNiz[j];
                if(elementNizaRijec != elementiNizaRecenica){
                    continue LABELA;
                }
            }
            postojiNepostoji = true;
            brojPonavljanja++;
        }
        String poruka1 = postojiNepostoji ? "Ova rečenica sadrži riječ 'skolu'.": "Ova rečenica ne sadrži riječ 'skolu'.";
        String poruka2 = String.format("U rečenici '%s' riječ '%s' ponavlja se '%d' puta. ",recenica,rijec,brojPonavljanja);
        System.out.println(poruka1);
        System.out.println(poruka2);

    }

}

