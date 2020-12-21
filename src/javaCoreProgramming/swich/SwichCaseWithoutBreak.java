package javaCoreProgramming.swich;

import javax.swing.*;
import java.util.ArrayList;


public class SwichCaseWithoutBreak {
    public static void main(String[] args) {
        String daysInWeek = JOptionPane.showInputDialog("Enter a number of day you didn't learn yet : ");
        int numberOfDays = Integer.parseInt(daysInWeek);
        ArrayList<String> day = new ArrayList<>();
        String finalMessage = "Congratulation, you have learn all days of week in English!";
        switch (numberOfDays) {
            case 1:
                day.add("Monday");
            case 2:
                day.add("Tuseday");
            case 3:
                day.add("Wedensday");
            case 4:
                day.add("Thursday");
            case 5:
                day.add("Friday");
            case 6:
                day.add("Saturday");
            case 7:
                day.add("Sunday");
                break;
            default:
                JOptionPane.showMessageDialog(null, finalMessage);

        }
        day.forEach(System.out::println);
/*
        JOptionPane.showMessageDialog(null, "Well done. Keep on going! You have left :" + day);
*/
    }
}
