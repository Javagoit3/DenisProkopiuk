package com.app.dprokopiuk.module04.sample7;

/**
 * Created by Администратор on 25.06.2016.
 */
public enum MyDayOfWeek {

    MONDAY("MODAY",1),TUE("T",2),WED("W",3);
    private String name;
    private int number;

    MyDayOfWeek(String name, int number) {
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
