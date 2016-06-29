package com.app.dprokopiuk.module04.sample5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 25.06.2016.
 */
public class MySingleton {
    private List<Cap> data = new ArrayList<>();
    private static MySingleton instance;

    private MySingleton(){
        //instance = new MySingleton();
    }

    public void addCap(Cap cap){
        boolean isValid = validate(cap);
        if(isValid){
            data.add(cap);
        }
    }

    public int getSize(){
        return data.size();
    }

    public Cap getCap(int index){
        return data.get(index);
    }

    private boolean validate(Cap cap){
        if(cap!=null){
            if(cap.getColor()!=null){
                return true;
            }
        }
        return false;
        //return cap!=null ? cap.getColor()!=null : false;
    }



    public static MySingleton initInstance(){
        if(instance==null){
            instance=new MySingleton();
        }
        return instance;
    }

}
