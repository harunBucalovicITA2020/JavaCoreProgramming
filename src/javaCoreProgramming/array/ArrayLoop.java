package javaCoreProgramming.array;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] nizVoca = {"jabuka", "kruska", "sljiva", "banana", "naranca", "tresnja", "malina", "visnja","mandarina"};
        for (String voce: nizVoca){
            System.out.println(voce);
        }
        for(int i = 0; i< nizVoca.length;i++){
            String voce1 = nizVoca[i];
            System.out.println(voce1);
        }
        int z = 0;
        while (z<nizVoca.length){
            String voce2 = nizVoca[z];
            System.out.println(voce2);
            z++;


        }
    }
}
