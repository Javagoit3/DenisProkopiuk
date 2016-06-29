package com.app.dprokopiuk.module03.example4;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Child extends Parent {

    public Child() {
        //System.out.println("Child");
        super();
        System.out.println("Child");
    }

    public Child(int age) {
        super();
        System.out.println("Child.Age="+age);
    }
}
