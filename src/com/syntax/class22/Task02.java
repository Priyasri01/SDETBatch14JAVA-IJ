package com.syntax.class22;

public class Task02 {
    /*
    Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
     */

}
class Parent1{


    void weekend(){

        System.out.println("DO grocery for week day and take the kinds for dinner");
    }

    void weekDays(){

        System.out.println(" Most of the parents will go to work");
    }

}
class Child1  extends Parent1{

    void weekend(){
        super.weekend();
        System.out.println("Do homework and play with kids");
    }

    void weekDays(){
        super.weekend();
        System.out.println(" will attend the school monday to firday");
    }

}