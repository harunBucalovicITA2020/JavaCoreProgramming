package javaCoreProgramming.array;

public class ArraysAkaNizovi {
    public static void main(String[] args) {
        int[] brojevi = new int[3];
        brojevi[0] = 17;
        brojevi[1] = 23;
        brojevi[2] = 38;
/*
 for(int i=0; i < brojevi.length; i++){
 System.out.print(brojevi[i]);
  }
  ovo je tzv inišiejt trough an arrey. to jos nismo ucili i nemoj se tim zamarati !!!
 */
        System.out.println(brojevi[0]);
        System.out.println(brojevi[1]);
        System.out.println(brojevi[2]);
        /*
         * <li>DRUGI NAČIN KADA SU NAM VRIJEDNOSTI UNAPRIJED POZNATE</li>
         */
        int[] brojevi1 = {34, 45, 56, 21};
        System.out.println(brojevi1[0]);
        System.out.println(brojevi1[1]);
        System.out.println(brojevi1[2]);

        String[] imena = new String[3];
        imena[0] = "Anesa";
        imena[1] = "Irfan";
        imena[2] = "Faruk";
        String nabrajanjeImena = imena[0] + ", " + imena[1] + ", " + imena[2];
        System.out.println(nabrajanjeImena);

        System.out.println(imena[0]);
        System.out.println(imena[1]);
        System.out.println(imena[2]);
//PRVI NAČIN , KADA UNAPRIJED ZNAMO KOLIKO CEMO MEMORIJE ZAUZETI
        String[][] names = new String[2][2];
        names[0][0] = "Gospodin";
        names[0][1] = "Gospođa";
        names[1][0] = "Smith";
        names[1][1] = "Jones";
        String gospodin = names[0][0] + " " + names[1][0];
        String gospođa = names[0][1] + " " + names[1][1];
        System.out.println(gospodin);
        System.out.println(gospođa);
//DRUGI NAČIN
        String[][] names1 = {{"Anesa", "Irfan", "Faruk"},
                {"prvi", "drugi", "treći"}};
        String prvoMjesto = names1[0][0] + " " + names1[1][0];
        String drugoMjesto = names1[0][1] + " " + names1[1][1];
        String treceMjesto = names1[0][2] + " " + names1[1][2];
        

        System.out.println(prvoMjesto);
        System.out.println(drugoMjesto);
        System.out.println(treceMjesto);
        System.out.println(names1.length);
    }
}
