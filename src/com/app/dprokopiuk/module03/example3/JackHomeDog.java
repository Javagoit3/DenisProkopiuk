package com.app.dprokopiuk.module03.example3;

/**
 * Created by Администратор on 23.06.2016.
 */
public class JackHomeDog extends HomeDog {


    static{
        System.out.println("JackHomeDog.static block1");
    }

    {
        System.out.println("\t\t\tJackHomeDog.block1");
    }

    {
        System.out.println("\t\t\tJackHomeDog.block2");
    }

    public JackHomeDog() {
        System.out.println("\t\t\tJackHomeDog.Constructor");
    }


    static{
        System.out.println("JackHomeDog.static block2");
    }

}
