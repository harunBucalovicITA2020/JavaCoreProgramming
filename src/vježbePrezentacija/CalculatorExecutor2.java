package vježbePrezentacija;

public class CalculatorExecutor2 {
    /**
     * uvjek kotistiti System.lineseparator(); umjesto \n ili \r\n da bismo izbjegli problem prilikom citanja
     * programa u operativnom sistemu koji je razlicit od onoga u kojem je pravljen program
     *
     * @param args
     */
    public static void main(String[] args) {


        double[] brojevi = new double[4];
        brojevi[0] = 3;
        brojevi[1] = 17;
        brojevi[2] = 11;
        brojevi[3] = 21;
        Calculator2 calculator2 = new Calculator2();
        double proizvodBrojeva = calculator2.proizvod(brojevi);
        System.out.println(proizvodBrojeva);
        String lineSeparator = System.lineSeparator();
        double proizvodBrojeva2 = calculator2.proizvod("Harun", "Bucalović", 34, "radi mnozenje", 45, 17, 4, 9, 21);
        System.out.format("Proizvod : %s%s", proizvodBrojeva2, System.lineSeparator());


    }
}
