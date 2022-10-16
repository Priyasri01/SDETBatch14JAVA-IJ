package com.syntax.class17;

public class Task03 {

    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    private String name;
    private String city;
    private String country;
    private String bornIn;
    private static String usPresident = "Joe Biden";

    //note All the constructors have to be separated by their parameters data types and number of parameters
    public Task03(String word)  //this Constructor method can access across the  package in the project // note we can't have static(non-access modifier) in the constructor

    {
        name=word;
        System.out.println(" your name is " + name);

    }
    private Task03(String place, String count){ //this constructor will access only with in the class

        city=place;
        country=count;

        System.out.println(" your state is " + place + " and country is" );

    }

    Task03(){ // this constructor can access within the package

        System.out.println("it's default constructor");


    }

   protected Task03(String born , String St , String cout) {

      bornIn = born;


    }

    public static void main(String[] args) {
        //Task03 obj1 = new Task03();
        Task03 obj2= new Task03("New York", "USA");



    }


}
