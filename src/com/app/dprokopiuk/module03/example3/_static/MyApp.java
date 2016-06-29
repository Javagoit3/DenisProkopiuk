package com.app.dprokopiuk.module03.example3._static;

/**
 * Created by Администратор on 23.06.2016.
 */
public class MyApp {

    public static void main(String[] args){
        int a1=4;
        int b1=3;
        int subtraction=Utils.subtract(a1, b1);
        System.out.println(subtraction);
        String str1=Utils.myStaticText;


        /*int a = 1;
        int b=2;
        Utils utils = new Utils();
        String str=utils.myText;
        int sum=utils.add(a,b);
        System.out.println(sum);*/
    }
}
