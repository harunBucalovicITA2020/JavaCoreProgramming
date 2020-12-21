package javaCoreProgramming.objectOrientedProgramming.three;

public abstract class Beverage {
    private String beverageName;
    public abstract double cost();

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }
}
