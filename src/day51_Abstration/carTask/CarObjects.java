package day51_Abstration.carTask;

import jdk.nashorn.internal.runtime.regexp.joni.constants.TargetInfo;

public class CarObjects {

    public static void main(String[] args) {

        // Car car = new Car("Car", "car1", "Red", 2020, 2000);}


        Toyota toyota= new Toyota("Avalon","Gray",2018,25000);
        Audi audi = new Audi("A8","Black",2021,90000);
        Tesla tesla = new Tesla("Roadster","Red",2022,180000);
        BMW bmw = new BMW("750","Black",2020,70000);

        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(bmw);

        toyota.start();
        audi.start();
        tesla.start();
        bmw.start();






    }
}
