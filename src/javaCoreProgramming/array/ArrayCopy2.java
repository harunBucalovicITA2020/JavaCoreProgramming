package javaCoreProgramming.array;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 's', 'k', 'Ž', 'e', 'l', 'j', 'e', 'z', 'n', 'i', 'č', 'a', 'r', 'm', 'f'};
        char[] copyTo = new char[11];
        System.arraycopy(copyFrom, 3,copyTo,0,copyTo.length);
        System.out.println(copyTo);

        char[]copyTo2= Arrays.copyOfRange(copyFrom,3,14);
        System.out.println(copyTo2);

    }
}
