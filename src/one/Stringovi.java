package one;


public class Stringovi {

    public static void main(String[] args) {
        String name = "Karamba ";    // -----> string literal -----> string pool (prostor unutar hipe memory u kojem ce se nalaziti string)
        String prezime = "Karambić"; // -----> string literal -----> string pool
        String name1 = new String("Karamba "); // -----> prostor za skladistenje stringa van hipe pool-a (jer smo uradili poziv konstruktoru)!
        String name2 = "Karamba ";
        String punoIme = name + prezime;
        System.out.println(punoIme);

        System.out.println(name == name1); // inace ne porediti stringove koristeci ==, a ovo nije isto jer su adrese razlicite
        System.out.println(name == name2); // adrese su im iste jer su iz istog string pool-a! MORA BITI ISTO NAPISAN U POTPUNOSTI

        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));


    }
}
