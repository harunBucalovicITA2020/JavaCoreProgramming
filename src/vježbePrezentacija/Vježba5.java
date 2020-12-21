package vježbePrezentacija;

/**
 * Da li je uneseni broj paran ili neparan
 * to se radi uz X(neki broj koji smo unijeli)%2==0;
 */
public class Vježba5 {
    public static void main(String[] args) {
        int number = 300;
        boolean parNePar = number % 2 == 0;
        if (parNePar) {
            System.out.println("Entered variable is " + number);
            System.out.println("Variable is even ? " + parNePar);

        } else {
            System.out.println("Entered variable is " + number);
            System.out.println("Variable is even ? " + parNePar);
        }
    }
}
