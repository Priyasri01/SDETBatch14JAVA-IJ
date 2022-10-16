package com.syntax.class18;

public class Student {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.

     */

    String name;
    String address;

    Student(String name, String address){

        this.name=name;
        this.address=address;


    }

    void displayInfo(){

        System.out.println("Student Name " + name + " and Address " + address);
    }

    public static void main(String[] args) {


         new Student("Peter", "42-villagest,New York -11355").displayInfo();
    }
}
