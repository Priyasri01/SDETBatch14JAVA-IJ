package com.syntax.class16;

public class Task1 {
     /*
   part1. Create a method that will accept an array as parameters and will return a sum of all
    elements from that array.
   Part2. Method should be visibly only within same package and accessible by the creating an
    instance of the class. meaning, need to access the method trough object.
     */
// note we created one more class with main method sine the requirments says with in the class.
    // this is part1 and for Part2 check on "Task1Tester" class.
 int sumArray(int [] arr){ // as per the requirement we created default method access modifier, because default access modifier will access within the same package.
        int sum=0;
        for (int num:arr // we used enhance for loop , if u want to see the example in for loop check on Homework01 in the same package.
        ) {
            sum+=num;
        }
        return sum;
    }
}


