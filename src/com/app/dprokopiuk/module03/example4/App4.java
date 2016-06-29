package com.app.dprokopiuk.module03.example4;

/**
 * Created by Администратор on 23.06.2016.
 */
public class App4 {

    public static void main(String[] args){
        //GrandParent
            //Parent
                //Child

        //Child child = new Child(11);


        GrandParent grandParent = new Child();
        Child myChild = (Child) grandParent;
//        Child myChild1 = (Child)(new Object());


        Parent parent = new Child();
        Child child = new Child();



    }
}
