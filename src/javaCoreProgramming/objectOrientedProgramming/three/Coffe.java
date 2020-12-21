package javaCoreProgramming.objectOrientedProgramming.three;

public class Coffe extends Beverage implements Drinkable  {

    public Coffe(){

    }
    public double cost(){
        return 1.5;
    }

    @Override
    public void drink() {
        System.out.println("");
    }
}
