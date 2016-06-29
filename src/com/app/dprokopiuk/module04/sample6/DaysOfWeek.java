package com.app.dprokopiuk.module04.sample6;

/**
 * Created by Администратор on 25.06.2016.
 */
public enum DaysOfWeek {

    MONDAY, TUESDAY(), WEDNESDAY(3);
    private int number;

    DaysOfWeek() {
        System.out.println("Enum.Constructor");
    }

    DaysOfWeek(int number) {
        this.number=number;
        System.out.println("Enum.Constructor.Number="+number);
    }

    @Override
    public String toString() {
        if(number==3){
            return "This is Wednesday";
        }
        return "MyString";
    }
}
