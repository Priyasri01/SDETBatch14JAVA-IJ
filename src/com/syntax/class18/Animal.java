package com.syntax.class18;

public class Animal {
 //the variables in animal class are private , then the child class
    //if you declared a variable as protected,it can be accessable to a class which is from a different package only if you extend the class.


  protected  String name;
    String breed;
    int age;
    double weight;

    void printInfo(){
        String name="now this will be printed";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }




}
