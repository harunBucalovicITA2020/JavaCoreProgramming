package javaCoreProgramming.objectOrientedProgramming.one.animal;

public class Fish extends Animal{
    private String name;

    public Fish(String name){
        super(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void playSound() {
        System.out.println("blup blup");
    }
}
