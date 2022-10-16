package com.syntax.class14;

public class HomeWork02 {
//Create a method that will take a number and prints whether the number is even or odd.

    void Cal(int num){

        if(num%2==0){

            System.out.println("It's even number");
        }else{

            System.out.println("It's Odd number");

        }
    }

    public static void main(String[] args) {

        HomeWork02 obj = new HomeWork02();

        obj.Cal(20);
    }

}
