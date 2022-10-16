package com.syntax.class14;



public class HomWork01 {
    // Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void largestNum(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("The largest number is " + num1);


        } else {

            System.out.println("The largest number is " + num2);
        }
    }

    public static void main(String[] args) {
       // Create a method that will take 2 parameters as a numbers and prints which number is larger.

        HomWork01  large = new HomWork01();
       large.largestNum(10,20);
    }
}
