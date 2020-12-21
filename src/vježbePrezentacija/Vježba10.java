package vježbePrezentacija;

public class Vježba10 {
    public static void main(String[] args) {
        char[][] karakteri = {
                {'a'},
                {'d'},
                {'i'},

        };
        System.out.println(karakteri.length);
        System.out.println(karakteri[0]);

        int [] array = {1,3,7,12};
        int[] array1 = array;
        array1[2] = 8;
        System.out.println(array[2]);
    }

}
