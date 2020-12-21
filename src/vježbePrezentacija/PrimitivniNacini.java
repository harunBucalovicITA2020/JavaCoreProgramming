package vježbePrezentacija;

import java.util.Scanner;

public class PrimitivniNacini {
    public static void main(String[] args) {
        System.out.println("Enter user level: ");
        int userInput = new Scanner(System.in).nextInt();
        int regular; //1
        int admi;//2
        int superAdmin;//4
        boolean parNepar = userInput % 2 == 0;
        System.out.println("User level is " + userInput);
        System.out.println("Regular user level: " + !parNepar);
        System.out.println("Admin user level: "+ parNepar);
        System.out.println("Superadmin user level: " + !parNepar);

    }
}
