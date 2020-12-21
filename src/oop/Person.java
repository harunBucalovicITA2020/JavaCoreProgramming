package oop;

public class Person {
    public static int counter = 0;
    public String name;
    private String surename;
    private int age;
    private SeasonEnum godisnjeDoba;

   

    public Person() {
        super();
        System.out.println("Kreira se objekat...");
        counter++;
    }

    public Person(String ime) {
        this.name = ime;

    }

    public Person(int godine) {
        this.age = godine;
    }


    public Person(String ime, String prezime) {
        this(ime, prezime, 0);
    }

    public Person(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        counter++;
    }
    public SeasonEnum getGodisnjeDoba() {
        return godisnjeDoba;
    }

    public void setGodisnjeDoba(SeasonEnum godisnjeDoba) {
        this.godisnjeDoba = godisnjeDoba;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }


    public void speek() {
        String fullName = getFullName();//name + " " + surename;
        System.out.println(fullName + " mnogo priča");
    }

    public String getFullName() {
        String fullName = name + " " + surename;
        return fullName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speek(String nacinGovora) {
        System.out.println(getFullName() + " priča " + nacinGovora);
    }

    public static void objekti() {
        System.out.println("Ukupno je kreirano " + counter + " objekata");
    }


}
