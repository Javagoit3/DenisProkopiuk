package com.app.dprokopiuk.module03.example5;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Car {
    private String name;
    private String color;

    public void printCarInfo(){
        System.out.println("SimpleCar");

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
