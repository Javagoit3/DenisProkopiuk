package com.app.dprokopiuk.module03.example4;

/**
 * Created by Администратор on 23.06.2016.
 */
public class GrandParent extends Object {

    public GrandParent() {
        //super();
        System.out.println("GrandParent");
    }

    public GrandParent(String param) {
        //super();
        System.out.println("GrandParent.Param="+param);
    }


    public GrandParent(int param) {
        System.out.println("GrandParent.Param="+param);
    }

    public GrandParent(boolean param) {
        System.out.println("GrandParent.Param="+param);
    }

    public GrandParent(String param, int param1) {
        //this(param);
        this(param1);
        System.out.println("GrandParent.Param="+param+", param1="+param);
    }
}
