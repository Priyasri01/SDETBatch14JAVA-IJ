package com.syntax.class18;

public class Car{ //common class has many different names like parent class , super class, base class.

    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
//if a field or method has private access modifer in parent class then child class can't use it.
    private String engineType;
    void printCarDetails(){

        System.out.println("Model "+ model+ " make "+make + " color is " +color);
    }
}
 class BMW extends Car {
    double engineCC;

}

class Tesla extends Car{

}
class Toyota extends Car{


}

class CarTester{

    public static void main(String[] args) {
        BMW bmw = new BMW();

        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.engineCC=500;
        bmw.printCarDetails();
    }

}
