package javaCoreProgramming.objectOrientedProgramming.one;


public class Student extends Person {
    private String indexNumber;

    public Student() {
        // super(); ne moram ovo pisati, jer ce se svakako pozvati prvo konstruktor parent(PERSON) klase bez PARAMETARA!
        System.out.println("poziva se konst. klase STUDENT BEZ PARAM");
    }


    public Student(String ime, String prezime) {
        super(ime, prezime);      // ako ne upisemo super(); on svakako poziva konstruktor parent klase bez parametara,
        System.out.println("Poziva se konstruktor klase STUDENT sa 2 PARAM!"); // ali kada stavimo super(param1,param2) onda poziva konstruktor parent klase sa parametrima!
    }


    public void setIndexNumber(String indexNumber) {
        if (indexNumber.length() > 5 && indexNumber.length() < 10) {
            this.indexNumber = indexNumber;
        } else {
            System.out.println("Nešto nije uredu sa tvojim brojem indexa");
        }
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    @Override
    public void setAge(int godine) {
        //System.out.println("poziva se setAge metod klase STUDENT");
        if (godine >= 18 && godine <= 70) {
            super.setAge(godine);
        }
    }
/*
    @Override
    public int getAge() {
        return super.getAge();
    }
*/
    public void print() {
        int age = getAge();
        System.out.println("AGE : " + age);
    }

 }
