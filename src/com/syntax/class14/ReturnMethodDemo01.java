package com.syntax.class14;

public class ReturnMethodDemo01 {

    /*
     a method will return something is called Return method.
     void can't return any type of value , beside just print the value.
    */

    boolean isEven(int number){

        if(number%2==0){

            return true;
        }else{

            return false;
        }
    }

    public static void main(String[] args) {
        ReturnMethodDemo01 obj = new ReturnMethodDemo01(); // new object "obj" is created for "ReturnMethodDemo01" class.

        if(obj.isEven(4)){

            System.out.println("It's even number");
        }else{

            System.out.println("It's not even number");
        }
    }
}
