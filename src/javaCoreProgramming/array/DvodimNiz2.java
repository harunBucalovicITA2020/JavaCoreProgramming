package javaCoreProgramming.array;

public class DvodimNiz2 {
    public static void main(String[] args) {
        int[][] dvoD = new int[4][];
        dvoD[0] = new int[5];
        dvoD[1] = new int[5];
        dvoD[2] = new int[5];
        dvoD[3] = new int[5];

        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                dvoD[i][j] = k;
                k++;
            }
        System.out.println(k); // broj elemenata u ovom nizu je 20!


    }
}
