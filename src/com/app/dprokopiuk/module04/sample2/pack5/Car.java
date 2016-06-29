package com.app.dprokopiuk.module04.sample2.pack5;

/**
 * Created by Администратор on 25.06.2016.
 */
public class Car {


    public void processData(String data){
        boolean isValid = validate(data);
    }

    private boolean validate(String text){
        return text!=null && !text.trim().isEmpty();
    }

    private void drive(){

    }



}
