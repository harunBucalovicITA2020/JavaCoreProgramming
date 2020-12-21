package vježbePrezentacija;

/**
 * <li>1.ZADATAK SA HARD KODIRANJEM </li>
 */
public class Vježba3 {
    public static void main(String[] args) {
        int regular = 1;
        int admin = 2;
        int superAdmin = 4;

        int userInput = 2;

        boolean input = userInput == admin;

        if (input) {
            System.out.println("User level is 2");
            System.out.println("Regular user level : " + !input);
            System.out.println("Admin user level: " + input);
            System.out.println("Super admin user level: " + !input);
        }
    }
}
