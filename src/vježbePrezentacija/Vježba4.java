package vježbePrezentacija;

import javax.swing.*;

public class Vježba4 {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Unesi svoj pristupni nivo(1,2,ili 4): ");
        int brojInputa = Integer.parseInt(userInput);

        boolean input = brojInputa == 2;// moguce je u boolean dodati jos uslova. tada ih odvajamo zarezom a na kraju zadnjeg ;
        String message = "User level is 2\n"
                + "Regular user level: " + !input + "\n"
                + "Admin user level: " + input + "\n"
                + "Superadmin user level: " + !input + "\n";
        if (input) {
            /*JOptionPane.showMessageDialog(null, "User level is 2");
            JOptionPane.showMessageDialog(null, "Regular user level: " + !input);
            JOptionPane.showMessageDialog(null, "Admin user level: " + input);
            JOptionPane.showMessageDialog(null, "Superadmin user level: " + !input);

             */
            JOptionPane.showMessageDialog(null, message);
        } else {
            JOptionPane.showMessageDialog(null, "Pogresan unos!...");
        }

    }
}
