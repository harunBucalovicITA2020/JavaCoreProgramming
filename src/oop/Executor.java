package oop;


import static oop.SeasonEnum.JESEN;
import static oop.SeasonEnum.LJETO;

public class Executor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Harun"; // ako je public poljeonda ga ovako kreiramo
        p1.setSurename("Bucalović");// ako je polje private onda ga kreiramo preko setera i dohvaćamo geterom
        String prezimeP1 = p1.getSurename();
        p1.setAge(34);
        System.out.println(Person.counter);
        Person p2 = new Person();
        p2.name = "Anesa";
        p2.setSurename("Nuhanović");
        p2.setAge(30);
        System.out.println(Person.counter);
        Person p3 = new Person();
        p3.name = "Irfan";
        p3.setSurename("Bičakćić");
        p3.setAge(8);
        //System.out.println(Person.counter);
        Person p4 = new Person("Faruk", "Bičakčić");
        System.out.println(Person.counter);
        Person p5 = new Person("Aida", "Bičakčić", 36);
        System.out.println(Person.counter);
        Person p6 = new Person("Hamo", "Hapić", 0);
        // System.out.println(Person.counter);
        p6.speek("GLASNO");
        p1.speek();
        p4.speek();
        Person.objekti();
        p3.speek("TIHO");
        String punoIme = p6.getFullName();
        System.out.println(punoIme);
        String punoIme1 = p4.getName();



    }
}
