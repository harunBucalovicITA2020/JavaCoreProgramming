package one;

import java.util.Scanner;

public class ComparisonDemo {
    /**
     * <li> U ovoj vježbi koristim dva operatora POREĐENJA</li>
     * <p>OPRETORI POREĐENJA ILI USPOREDBE ILI COMPARISON</p>
     * && ili AND -> oba uslova moraju biti zadovoljena
     * || ili ILI -> jedan od uslova mora biti zadovoljen
     */
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        int prviBroj = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj:");
        int drugiBroj = new Scanner(System.in).nextInt();

        if ((prviBroj != drugiBroj) && (prviBroj > drugiBroj)) {
            System.out.println("Brojevi nisu jednaki, a prvi uneseni broj je veči od drugog unesenog broja!");
        }
        if ((prviBroj == drugiBroj) || (prviBroj < drugiBroj)) {
            System.out.println("Uneseni brojevi su ili jednaki, ili je prvi uneseni broj manji od drugog unesenog broja! ");
        }
        if ((prviBroj == drugiBroj) || (prviBroj > drugiBroj)) {
            System.out.println("Uneseni brojevi su ili jednaki, ili je prvi uneseni broj veči od drugog unesenog broja! ");
        }
        if ((prviBroj > 100) && (prviBroj > drugiBroj)) {
            System.out.println("Prvi uneseni broj je veči od stotinu, a veči je i od drugog unesenog broja!");
        }

/**
 * KADA SE BUDEŠ VRATIO NA OVU VJEŽBU ODRADI KAO NA PREDAVANJIMA
 * SA VRIJEDNOSTIMA UNESENIM HARD PROGRAMMINGOM I PROBAJ INCREMENT ODADATI (++,ILI --)!!!
 */

    }
}
