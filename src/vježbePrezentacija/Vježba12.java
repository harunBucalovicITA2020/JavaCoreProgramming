package vježbePrezentacija;


import javax.swing.*;

public class Vježba12 {
    public static void main(String[] args) {
        //String unesiSlovo = JOptionPane.showInputDialog("neko slovo:");
        String text = "riba ribi grize rep";
        char[] znakovi = text.toCharArray();
        int brojač = 0;
        for(int i =0;i<znakovi.length;i++){
            char slovo = znakovi[i];
            if(slovo != 'r'){
                continue;

            }
            brojač++;
        }
        String poruka = "U ovoj rečenici r se ponavlja " + brojač;
        System.out.println(poruka);



    }
}
