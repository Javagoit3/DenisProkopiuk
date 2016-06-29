package com.app.dprokopiuk.module03.example3._static;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Utils {
    public String myText = "Hello!";
    public static String myStaticText = "Static.Hello!";

    static{
        System.out.println("Utils.static block");
    }

    public Utils() {
        System.out.println("Utils.Constructor");
    }

    public int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
}
