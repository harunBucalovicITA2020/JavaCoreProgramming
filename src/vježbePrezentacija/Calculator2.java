package vježbePrezentacija;

/**
 *                                             <p>VEOMA VAŽNA NAPOMENA!!!</p>
 *
 * <li>KADA KREIRAM FUNKCIJU/METODU MOGU KORISTITI ISTO IME METODE, ALI PARAMETAR METODE NE MOZE BITI ISITI!! </li>
 */

public class Calculator2 {
    /**
     *
     *
     * public double proizvod(String name, String surename, int age, String poruka, double ... numbers1)
     *        ova iznad napisana METODA preuzima blok koda ispod napisane funkcije/metode :
     *                  public double proizvod(double[] numbers)
     * Ključni razlog je taj da kada pisemo RETURN, dodajemo ime metode čiji blok koda želimo da naslijedi.
     *                        return PROIZVOD(numbers1);
     * Mi tada ustvari proslijedjujemo vrijednosti namjenjene toj metodi u tijelo metode čiji blok koda želimo
     * da koristimo.
     *
     *
     *
     * @param numbers
     * @return
     */
    public double proizvod(double[] numbers) {
        double proizvod = 1.0;
        for (double number:numbers) {
            proizvod = proizvod * number;
        }
        return proizvod;
    }
    public double proizvod(String name, String surename, int age, String poruka, double ... numbers1){
        return proizvod(numbers1);
    }

}
