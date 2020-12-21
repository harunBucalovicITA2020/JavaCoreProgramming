package javaCoreProgramming.array;

public class DvodimNiz6 {
    public static void main(String[] args) {
        int[][] dvoD = new int[4][];
        dvoD[0] = new int[1]; // dvoD [0][0] ->nulti red (tj. ima jedan red dvoD[0][](posto numerisanje krece od 0) i jedan element dvoD[][0])
        dvoD[1] = new int[2]; // dvoD [1][0] , dvoD[1][1] -> ima jedan red  i niz od dva elementa ([][0] i [][1]) nulti i prvi!
        dvoD[2] = new int[3]; // dvoD [2][0], dvoD[2][1] , dvoD[2][2] -> ima jedan red i niz od tri elementa ( [][0],[][1],[][2] ),
        dvoD[3] = new int[4]; // dvoD [3][0] , dvoD[3][1] , dvoD[3][2], dvoD [3][3] -> ima jedan red i niz od cetiri elementa ( [][0],[][1],[][2],[][3] )

        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                dvoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(dvoD[i][j] + " ");
            System.out.println();
        }
    }
}

