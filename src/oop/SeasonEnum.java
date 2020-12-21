package oop;

public enum SeasonEnum {

    PROLJEĆE(3,6,"Proljeće"),
    LJETO(6,9,"Ljeto"),
    JESEN(9,12,"Jesen"),
    ZIMA(12,3,"Zima");


    private final int startMonth;
    private final int endMonth;
    private final String nameMonth;

    SeasonEnum(int startMonth, int endMonth, String nameMonth) {
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.nameMonth = nameMonth;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public String getNameMonth() {
        return nameMonth;
    }
}
