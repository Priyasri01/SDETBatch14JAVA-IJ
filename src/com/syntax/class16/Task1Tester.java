package com.syntax.class16;

public class Task1Tester {


    public static void main(String[] args) {

         /*
   part1. Create a method that will accept an array as parameters and will return a sum of all
    elements from that array.
   Part2. Method should be visibly only within same package and accessible by the creating an
    instance of the class.
     */


        // this is part2 and for Part 1 check on "Task1" class.

                Task1 obj=new Task1(); // created object as per the requirements "accessible by the creating an instance(instance means object) of the class".
                int [] array={10,10,20,30};

                int sumOfElemets= obj.sumArray(array);

             System.out.println(sumOfElemets);

            }
    }
