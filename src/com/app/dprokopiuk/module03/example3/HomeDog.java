package com.app.dprokopiuk.module03.example3;

/**
 * Created by Администратор on 23.06.2016.
 */
public class HomeDog extends Dog {


    static{
        System.out.println("HomeDog.static block1");
    }

    {
        System.out.println("\t\tHomeDog.block1");
    }

    {
        System.out.println("\t\tHomeDog.block2");
    }

    public HomeDog() {
        System.out.println("\t\tHomeDog.Constructor");
    }


    static{
        System.out.println("HomeDog.static block2");
    }
}
