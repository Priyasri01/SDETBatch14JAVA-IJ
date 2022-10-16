package com.syntax.class19;

class Vehicle {
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}

public class Car extends Vehicle{
    String model;
    String make;
    int year;



}

class Tesla extends Car{ /*note when u see line item 3 , 11 & 17 class it's multilevel inheritance class .
                          because one parent class "Vehicle" and many child class "car" , "Tesla"
                           and all are not directly connected to the parent class. it's goes like chain */
    void printInfo(){
        System.out.println("I am a Electrical Car");
    }


}

class Toyota extends Car { /*note line 17 and 23  are Hierarchical inheritance ,
                         because it's one parent class "Car" and all other subclass/child class "Tesla", "Toyota"
                         accessing directly parent class by using extends keyword. */
  /* Toyota(){
       System.out.println("peter");
    }*/

    void printInfo(){
          System.out.println("I am a Combustion Engine Car");
      }

  }
  class BMW extends Car{

    void  displayInfo(){

        System.out.println("this is my favorite car");
    }

  }
/*class CustomCar extends Toyota,Tesla{ // note this is multiple inheritance , this is not allowed in java.
    not allowed because of diamond problem
}*/
    class Tester {
        public static void main(String[] args) {
            Toyota toyota = new Toyota();
            toyota.printTopSpeed();
            System.out.println(toyota.noOfWheel);


        }


    }
