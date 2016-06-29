package com.app.dprokopiuk.module03.example6;

/**
 * Created by Администратор on 23.06.2016.
 */
public class Tools {

    //overloading
    public void proccess(){
        System.out.println("proccess()");
    }

    public boolean proccess(int type){
        System.out.println("proccess(type)"+type);
        return true;
    }

    public void proccess(String type){
        System.out.println("proccess(type)"+type);
    }

}
