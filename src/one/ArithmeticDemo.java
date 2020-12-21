package one;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj :");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj :");
        int broj2 = new Scanner(System.in).nextInt();
        int suma = broj1 + broj2;
        System.out.println("Suma = " + suma);

        int razlika = broj1 - broj2;
        System.out.println("Razlika = " + razlika);
        int proizvod = broj1 * broj2;
        System.out.println("Proizvod = " + proizvod);
        int kolicnik = broj1 / broj2;
        System.out.println("Količnik = " + kolicnik);
        int moduloRezultat = broj1 % broj2;
        System.out.println("Modulo rezultat = " + moduloRezultat);


    }
}
