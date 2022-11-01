package com.review.class05;

public class CarTester {

    public static void main(String[] args) {

       Car car = new Tesla("Tesla", "x","Yello");
        car.drive();
        car.start();
        car.stop();

        Tesla tesla = new Tesla("Tesla","x","Green");

        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();

        // Car car = new Car();--->no we cannot create an object of abstract classes

    }
}
