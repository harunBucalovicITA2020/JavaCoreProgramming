package javaCoreProgramming.objectOrientedProgramming.three;

public class CaffeBarExecutor {
    public static void main(String[] args) {

        Beverage blackCoffe = new Coffe();
        blackCoffe.setBeverageName("Black Coffe");
        String coffeTyp = blackCoffe.getBeverageName();
        String valuta = "KM";
        System.out.println(coffeTyp + " : " + blackCoffe.cost() + " " + valuta);
        Beverage coffeWithMilk = new Coffe();
        Beverage milkDecorator = new MilkDecorator(coffeWithMilk);

        String lineSeparator = System.lineSeparator();
        System.out.format("Kafa sa mlijekom : %s %s %s", milkDecorator.cost(), valuta, lineSeparator);

    }

}
