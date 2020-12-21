package vježbePrezentacija;

public class Vježba2 {
    public static void main(String[] args) {
        int pozicijaTenka = 3;
        int projektil = 0;
        projektil++;
        System.out.println("Pogodak!" + (projektil >= pozicijaTenka));
        projektil++;
        System.out.println("Pogodak!" + (projektil >= pozicijaTenka));
        projektil++;
        System.out.println("Pogodak!" + (projektil >= pozicijaTenka));
        projektil++;

        int y = 20;
        y++; // da nisam ovo dodao rezultat bi bio false
        boolean b = y++ == 21; // true zato sto sam prije izvrsavanja dodao postInkrement y++ ispod deklarisane vrijednosti y!
        System.out.println(b);
        int x = 10;
        boolean b1 = ++x == 11; // rezultat je true zato sto sam int varijabli y dodao preInkrement ++
        System.out.println(b1);
        int z = 30;
        z++;
        boolean b2 = ++z == 32; // true
        System.out.println(b2);
        int o = 5;
        ++o;
        boolean b3 = o++ == 6;  // true
        System.out.println(b3);
        int p = 40;
        ++p;
        boolean b4 = ++p == 42; // true
        System.out.println(b4);

    }

}
