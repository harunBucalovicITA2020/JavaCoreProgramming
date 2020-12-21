package two;

public class CoreProgramming2 {

    public static void main(String[] args) {

        short number1 = 300;
        short number2 = 300;
        short suma = (short) (number1 + number2);
        System.out.println("rezultat je : " + suma);

        short number3 = (short) 23.5;
        int number4 = (int) 47.12;

        System.out.println(number3 + number4);

        char znak1 = 65;
        char znak2 = 83;
        char oznaka = (char) (znak1 + znak2);
        System.out.println(znak1 + "" + znak2 + " MILAN");

        int pogađamoBroj = 0b001;
        pogađamoBroj = 0b1101;
        System.out.println(pogađamoBroj);

        int cifra1 = 36;
        int cifra2 = 48;
        boolean usporedba1 = (cifra1 == cifra2) || (cifra1 < cifra2);
        boolean usporedba2 = (cifra1 != cifra2) && (cifra1 > cifra2);
        System.out.println(usporedba1);
        System.out.println(usporedba2);


    }
}
