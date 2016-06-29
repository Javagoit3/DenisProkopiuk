package com.app.dprokopiuk.module04.sample6;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App6 {
    public static final int MODAY=1;
    public static final int TUESDAY=2;
    public static final int WEDNESDAY=3;

    public static void main(String[] args){
        DaysOfWeek[] array=DaysOfWeek.values();
        DaysOfWeek wednesday=DaysOfWeek.WEDNESDAY;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            System.out.println(array[i].ordinal());
            System.out.println(array[i].toString());
            System.out.println(array[i].name());
            System.out.println("---------------------");
        }
        MONTH[] monthArray=MONTH.values();
        /*enum MONTH1{
            JAN, FAB, MARCH;
        }*/
    }


    enum MONTH{
        JAN, FAB, MARCH;
    }
}
