package com.app.sample1;

/**
 * Created by Администратор on 25.06.2016.
 */
public class Employee {
    //inline
    public final String TYPE="BOSS";
    public final String NAME_TYPE;
    public final String NAME_CLASS;
    //public final String NAME_PARAMETER;

    {
        NAME_TYPE="a";
    }


    public Employee() {

        NAME_CLASS = "B";
    }

    public final void validate(){
        System.out.println("Employee.validate");
    }

}
