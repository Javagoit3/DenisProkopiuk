package com.app.dprokopiuk.module03.example3;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Dog {
    int t;
    static int q;

    static{
        System.out.println("Dog.static block1");
        q++;
        //t++;
    }

    {
        t++;
        q++;
        System.out.println("\tDog.block1");
    }

    {
        System.out.println("\tDog.block2");
    }

    public Dog() {
        System.out.println("\tDog.Constructor");
    }


    static{
        System.out.println("Dog.static block2");
    }
}
