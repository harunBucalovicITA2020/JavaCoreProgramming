package javaCoreProgramming.array;
/*
<li>Zadatak igra na sreću</li>
*/

import javax.swing.*;


public class ArrayLoop2 {
    public static void main(String[] args) {
        int[] sretniBrojevi = {1, 7, 11, 17, 23, 32, 46};
        String uneseniBrojText = JOptionPane.showInputDialog("Pogodi sretni broj:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean pogodak = false;

        for (int sretniBroj : sretniBrojevi) {
            if (sretniBroj == uneseniBroj) {
                pogodak = true;
                break;
            }
        }
            String message = pogodak ? "Bravo imamo bingo!!!" : "Više sreće drugi put!";
            JOptionPane.showMessageDialog(null, message);

         int i = 0;
         while (i<sretniBrojevi.length){
             int brojevi = sretniBrojevi[i];
             System.out.println(brojevi);
             i++;
         }
         for (int z = 0; z < sretniBrojevi.length;z++){
             int brojevi2 = sretniBrojevi[z];
             System.out.println(brojevi2);
         }
         for(int brojevi3: sretniBrojevi){
             System.out.println(brojevi3);
         }

    }
}
