package javaCoreProgramming.objectOrientedProgramming.one.animal;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void playSound() {
        System.out.println("mjau mjau prrr");
    }
}
