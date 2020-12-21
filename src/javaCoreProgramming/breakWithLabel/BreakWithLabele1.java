package javaCoreProgramming.breakWithLabel;

import java.util.Scanner;

public class BreakWithLabele1 {
    public static void main(String[] args) {
        int[][] brojevi = {
                {344, 34, 48, 36, 11},
                {2, 18, 21, 12, 6},
                {1, 3, 5, 7, 38, 24, 46},
        };
        System.out.println("Unesi broj i okušaj sreću: ");
        int sretniBroj = new Scanner(System.in).nextInt();
        boolean pogodak = false;

        labela:
        for (int[] elementiNiza : brojevi) {
            for (int broj : elementiNiza) {
                if (sretniBroj == broj) {
                    pogodak = true;
                    break labela;
                }
            }
        }
        String poruka = pogodak ? "Bravo, imamo Bingo!" : "Više sreće drugi put!";
        System.out.println(poruka);
    }
}
