package com.app.dprokopiuk.module03.example2;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Employee {

    static{
        System.out.println("Employee.static block1");
    }

    {
        System.out.println("Employee.block1");
    }

    {
        System.out.println("Employee.block2");
    }

    public Employee() {
        System.out.println("Constructor");
    }


    static{
        System.out.println("Employee.static block2");
    }
}
