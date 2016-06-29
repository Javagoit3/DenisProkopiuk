package com.app.dprokopiuk.module03.example7;

import java.util.Arrays;

/**
 * Created by Администратор on 23.06.2016.
 */
public class App7 {

    public static void main(String... args){
        App7 app7 = new App7();
        app7.method();
        /*app7.method(3);
        app7.method(new int[]{1,2,3,4,5,6,7});
        app7.method(1,2,3,4,5,6,7);*/
    }


    public void method(){
        System.out.println("method()");
    }

    public void method(int a){
        System.out.println("method(a)"+a);
    }

    public void method1(int[] a){
        System.out.println("method(a)"+ Arrays.toString(a));
    }

    public void method(String name, int... a){
        for(int i=0;i<a.length;i++){

        }
        System.out.println("method(a)"+ Arrays.toString(a));
    }
}
