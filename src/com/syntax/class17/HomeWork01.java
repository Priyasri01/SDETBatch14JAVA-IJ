package com.syntax.class17;

public class HomeWork01 {

    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
/*important note:  constructor is for intialize the value , so in real work we won't put syso out.
we won't get any compiler error.but it's not good practice to put syso out inside the contructor.*/
    private String firstName;
    private String lastName;

    private  int rollNum;

    public HomeWork01(){ // default constructor

        System.out.println("it's default constructor");

    }

    public HomeWork01(String name, String lsname,int number  ){ //parameterized constructor.

        firstName=name;
        lastName=lsname;
        rollNum=number;
       // System.out.println("Student details " + firstName + " "+lastName +
                         //   " and your roll number " + rollNum);


    }

void print(){

    System.out.println("Student details " + firstName + " "+lastName +
            " and your roll number " + rollNum);

}


}
