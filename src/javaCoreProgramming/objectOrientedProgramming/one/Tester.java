package javaCoreProgramming.objectOrientedProgramming.one;

import javaCoreProgramming.objectOrientedProgramming.one.animal.Animal;
import javaCoreProgramming.objectOrientedProgramming.one.animal.Bird;
import javaCoreProgramming.objectOrientedProgramming.one.animal.Cat;

public class Tester {

    public static void main(String[] args) {
        Student student1 = new Student("Harun", "Bucalović");
        String punoImeStudent1 = student1.getName() + " " + student1.getSurename();

        student1.setAge(34);
        int godineStudent1 = student1.getAge();

        student1.setIndexNumber("1203-05/F");
        String brojIndexaStudent1 = student1.getIndexNumber();

        Animal animalStudent1 = new Cat("Brko");
        animalStudent1 = new Bird("Cicko");
        String imeAnimalStudent1 = animalStudent1.getName();
        animalStudent1.setVrstaZivotinje("Bird");
        String vrstaZivotinjeStudent1 = animalStudent1.getVrstaZivotinje();

        String imePrezimeGodineStudent1 = String.format("%s ima %d godine.", punoImeStudent1, godineStudent1);
        System.out.println(imePrezimeGodineStudent1);
        String student1Opis = String.format("%s ima ljubimca koji je %s i koji se zove %s.", punoImeStudent1, vrstaZivotinjeStudent1, imeAnimalStudent1);
        System.out.println(student1Opis);

        student1.setGender(Gender.MALE);
        Gender ganderStudent1 = student1.getGender();
        System.out.println(student1.getName() + " je " + ganderStudent1 + " spola.");

        Cat cat = new Cat("Brko");
        cat.setVrstaZivotinje("MAČKA");
        student1.setAnimal(cat);
        student1.printAnimal();

    }
}
