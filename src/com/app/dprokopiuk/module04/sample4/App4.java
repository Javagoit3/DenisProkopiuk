package com.app.dprokopiuk.module04.sample4;

import java.io.IOException;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App4 {

    public static void main(String[] args) throws IOException {
        String str = "Test";
        System.out.println(1+2+3+str+7+3);
        System.out.println(1+2+3);
        System.out.println(""+1+2+3);

        Runtime.getRuntime().exec("calc.exe");
    }
}
