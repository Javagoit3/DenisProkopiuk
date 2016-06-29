package com.app.dprokopiuk.module03.example5;

/**
 * Created by Администратор on 23.06.2016.
 */
public class App5 {

    public static void main(String[] args){
       /* Car car = new Car();
        System.out.println(car.toString());
        System.out.println(car);

        Bmw bmw = new Bmw();
        System.out.println(bmw);*/


        /*Car car = new Car();
        car.printCarInfo();
        Car car1 = new Bmw();
        car1.printCarInfo();
        Car car2 = new Porsche();
        car2.printCarInfo();
        */
        App5 app5 = new App5();
        Car car=app5.getCar(89);
        car.printCarInfo();
    }


    public Car getCar(int type){
        Car car = null;
        switch(type){
            case 0:
                car = new Bmw();
                break;
            case 1:
                car = new Porsche();
                break;
            default:
                car = new Car();
        }
        return car;
    }

}
