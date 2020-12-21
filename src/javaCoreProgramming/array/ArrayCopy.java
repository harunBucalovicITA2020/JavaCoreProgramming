package javaCoreProgramming.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        char[] copyFrom = {'S', 'm', '?', 't', 'e', 'r', 'm', 'o', 's', 't', 'a', 't', 'a', 't', 'i', 'k', 'a'};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom, 3, copyTo, 0, copyTo.length);
        System.out.println(copyTo);

        char[] copyTo2 = Arrays.copyOfRange(copyFrom, 3, 12);
        System.out.println(copyTo2);

    }


}
