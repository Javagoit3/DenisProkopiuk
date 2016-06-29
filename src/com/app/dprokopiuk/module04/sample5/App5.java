package com.app.dprokopiuk.module04.sample5;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App5 {

    public static void main(String[] args){
        MySingleton mySingleton = MySingleton.initInstance();
        App5 app5 = new App5();
        app5.addData(mySingleton);
        mySingleton = MySingleton.initInstance();
        app5.addData(mySingleton);
    }

    private void addData(MySingleton mySingleton){
        mySingleton.addCap(null);
        for(int i=0;i<10;i++) {
            mySingleton.addCap(new Cap("Color"+i));
        }
        mySingleton.addCap(new Cap(null));
        System.out.println(mySingleton.getSize());

    }
}
