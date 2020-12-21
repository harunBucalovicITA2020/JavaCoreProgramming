package two;

import javax.swing.*;

/**
 * <li>OVO JE DRUGI NAČIN SA GRAFIČKIM SUCELJEM ISPISA</li>
 */

public class IfFunkcijaOperatoriPoredjenja1 {
    public static void main(String[] args) {
        String poredim1 = JOptionPane.showInputDialog("Unesi neki broj: ");
        int nekiBroj1 = Integer.parseInt(poredim1);
        String poredim2 = JOptionPane.showInputDialog("Unesi još neki broj: ");
        int nekiBroj2 = Integer.parseInt(poredim2);


        if (nekiBroj1 > nekiBroj2) {
            JOptionPane.showMessageDialog(null, "Prvi uneseni broj je veći!");
        } if (nekiBroj1>=nekiBroj2){
            JOptionPane.showMessageDialog(null,"Prvi uneseni broj je veči, ili je jednak drugom unesenom broju");
        }
    }
}
