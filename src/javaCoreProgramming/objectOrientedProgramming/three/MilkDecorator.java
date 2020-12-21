package javaCoreProgramming.objectOrientedProgramming.three;

public class MilkDecorator extends Beverage {
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
