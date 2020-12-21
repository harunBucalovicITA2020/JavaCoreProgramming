package javaCoreProgramming.objectOrientedProgramming.one.animal;

public class Hamster extends Animal {

    public Hamster(String name){
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("krc krc krc");
    }
}
