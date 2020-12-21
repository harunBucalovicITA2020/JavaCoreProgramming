package two;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.util.Scanner;

public class IfFunkcijaOperatoriPoredjenja2 {
    public static void main(String[] args) {
      System.out.println("Unesi prvi broj : ");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj : ");
        int broj2 = new Scanner(System.in).nextInt();

        boolean usporedba = broj1 > broj2;
        if (usporedba) {
            System.out.println("Prvi broj je veći od drugog broja!");
        }

        if (broj1 == broj2) {
            System.out.println("Brojevi su jednaki!");
        }
        if (broj1 != broj2) {
            System.out.println("Brojevi su nejednaki!");
        }
        if (broj1 >= broj2) {
            System.out.println("Prvi broj je veći, ili jednak drugom!");
        }
        if (broj1 <= broj2) {
            System.out.println("Prvi broj je manji, ili jednak drugom!");
        }
        if (broj1 < broj2) {
            System.out.println("Prvi broj je manji od drugog!");
        }



    }
}
