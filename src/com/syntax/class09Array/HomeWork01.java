package com.syntax.class09Array;

public class HomeWork01 {
    public static void main(String[] args) {


        /*
         * 1. Create an array of cars and store 6 elements into it.
         * Using 2 different loops print all values from the array.
         */



        String[] car={"Tesla", "BMW", "Toyto","merze","jeep", "roles roy"};

        for(int i=0 ; i<car.length; i++){

            System.out.println(car[i]);
        }

        System.out.println("*************************************enhance for loop*******************************");

        for(String name:car){
            System.out.println(name);
        }
    }
}
