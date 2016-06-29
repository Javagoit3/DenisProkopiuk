package com.app.sample1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App1 {

    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println(emp.TYPE);
      //  emp.TYPE="123";

        final Map map = new HashMap();
        //map = new HashMap<>();
        map.put("Key",new Employee());
        map.put("Key",123);


    }
}
