package vježbePrezentacija;

public class Calculator1 {
    /**
     * System.out.println("Zbir ovih brojeva " + numbers[i] + " iznosi " + suma); ovo mi ne treba unutar bloka koda for petlje,
     * jer uvjek ako ima sytem out print u bloku koda for petlje(loop) ili bilo koje druge petlje ili konstrukcije(npr. if)
     * prilikom poziva te funkcije desit ce se i ispis u konzoli
     *
     *
     * @param numbers
     * @return
     */


    public double sum(double[] numbers) {
        double suma = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        return suma;
    }
    public double sumElegance(double ... brojevi){
        return sum(brojevi);
    }



}
