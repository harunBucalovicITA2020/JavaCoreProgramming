package vježbePrezentacija;

public class CalculatorExecutor1 {
    public static void main(String[] args) {

        Calculator1 calculator1 = new Calculator1();
        double[] brojevi = {27,31,14,25,11,3,7};

        double sumaBrojeva1 = calculator1.sum(brojevi);
        System.out.println(sumaBrojeva1);
        double sumaBrojeva2 = calculator1.sumElegance(13,14,15,16);
        System.out.println(sumaBrojeva2);

    }
}
