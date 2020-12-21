package javaCoreProgramming.array;

public class DvodimNiz3 {
    public static void main(String[] args) {
        int[][] dvoD = new int[4][5];
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                dvoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++){
            for (j = 0; j < 5; j++)
                System.out.print(dvoD[i][j] + " ");
                System.out.println();
            }
    }
}

