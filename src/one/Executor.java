package one;

public class Executor {
    public static void main(String[] args) {
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        /**
         <li>PROSTI TIPOVI ILI UGRAĐENI ILI PRIMITIVNI TIPOVI </li>
         <li>prva četiri služe za cijele brojeve</li>
         */

        byte number1 = 8;   //  8 bitni sadrzaj  2*2na7 -1
        short number2 = 16; // 16 bitni sadrzaj 2*2na15 -1
        int number3 = 32;   // 32 bitni sadrzaj 2*2na31 -1
        long number4 = 64;  // 64 bitni sadrzaj 2*2na63 -1

        /**
         * <li> Ostala četiri prosta tipa su: </li>
         * float -> 2 bajta
         * double -> 4 bajta
         * boolean
         * char
         */

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);

        // AUTOMATSKA KONVERZIJA TIPA
        int intNumber = 1456576868;
        long longNumber = intNumber;
        byte byteNumber = 127;
        short shortNumber = byteNumber;
        // EKSPLICITNA KONVERZIJA
        long longNumber1 = 545555454965L;
        int intNumber1 = (int) longNumber1;
        System.out.println("rezultat je : " + intNumber1);

        System.out.println("broj integre je :" + intNumber1);
        byte br1 = 15;
        byte br2 = 10;
        byte suma = (byte) (br1 + br2);
        short suma2 = (short) (br1 + br2);
        System.out.println(br1 - br2); // ovaj primjer je zapisan u integer tipu (po defaultu uvjek ide int tip)
        System.out.println("Suma u byte tipu : " + suma);
        /**
         <li/> Po defaultu kada npr sabiramo rezultat ce biti u integer tipu , a posto nam nije potrebno toliko
         memorije (koliko sadrzi int tip) mozemo kastati u byte. Prikazano u primjeru iznad!</li>
         */
        short broj1 = 15000;
        short broj2 = 15000;
        short suma1 = (short) (broj1 + broj2);
        System.out.println(suma1);

        float floatNumber = 20.345f;
        /**double doubleNumber = 20.345;
         System.out.println(floatNumber == doubleNumber);
         */
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        char znak = 87;
        char znak1 = '?';
        System.out.println(znak);
        System.out.println(znak1);


    }
}
