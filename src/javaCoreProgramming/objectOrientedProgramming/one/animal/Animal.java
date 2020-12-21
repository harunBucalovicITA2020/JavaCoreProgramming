package javaCoreProgramming.objectOrientedProgramming.one.animal;

public abstract class Animal {
    private String name;
    private String vrstaZivotinje;


    public Animal(String name) {
        this.name = name;

    }

    public String getVrstaZivotinje() {
        return vrstaZivotinje;
    }

    public void setVrstaZivotinje(String vrstaZivotinje) {
        this.vrstaZivotinje = vrstaZivotinje;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void playSound();
}
