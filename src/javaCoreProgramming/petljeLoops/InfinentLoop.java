package javaCoreProgramming.petljeLoops;

public class InfinentLoop {
    public static void main(String[] args) {
        int number = 1;
        while(number<10){
            System.out.println(number);
            number++;
        }
        while(number<10001){
            System.out.println(number++);
        }
    }
}
