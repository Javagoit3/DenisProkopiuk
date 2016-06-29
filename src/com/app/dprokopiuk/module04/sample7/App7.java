package com.app.dprokopiuk.module04.sample7;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App7 {

    public static void main(String[] args){
        /*int t=1;
        switch(t){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Default");
                break;
        }*/
        String str="A";
        switch(str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("Default");
                break;
        }
        if("A".equals(str)){

        }
        /*str=null;
        if(str.equals("A")){

        }*/
        MyDayOfWeek myd=MyDayOfWeek.MONDAY;
        switch(myd){
            case MONDAY:
                System.out.println("Name="+myd.getName()+"; Number="+myd.getNumber());
                break;
            case TUE:
                System.out.println("Name="+myd.getName()+"; Number="+myd.getNumber());
                break;
            case WED:
                System.out.println("Name="+myd.getName()+"; Number="+myd.getNumber());
                break;
        }

    }

}
