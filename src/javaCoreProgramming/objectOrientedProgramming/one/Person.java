package javaCoreProgramming.objectOrientedProgramming.one;

import javaCoreProgramming.objectOrientedProgramming.one.animal.Animal;

public class Person {
    private String name;
    private String surename;
    private int age;
    private Gender gender;
    private Animal animal;

    public Person() {
        System.out.println("Poziva se konstruktor klase PERSON bez PARAMETARA!");
    }

    public Person(String name, String surename) {
        this.name = name;
        this.surename = surename;
        System.out.println("Poziva se konstruktor klase PERSON sa 2 PARAM!");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getSurename() {
        return surename;
    }

    protected int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        }
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void printAnimal() {
        if (animal != null) {
            System.out.format("%s %s posjeduje ljubimca %s, koji se zove %s.%s", name, surename,animal.getVrstaZivotinje() ,animal.getName(),System.lineSeparator() );
        }
    }
}




