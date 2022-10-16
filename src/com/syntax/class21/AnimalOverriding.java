package com.syntax.class21;

public class AnimalOverriding {

    void sleep(){
        System.out.println("Animals usually sleep for 6 hours");
    }

    void eat(){
        System.out.println("Grass & meat");
    }
}
class Cat extends AnimalOverriding {

    void sleep(){

        System.out.println("I like to sleep for 20 hours");
    }

    void eat(){
        System.out.println("I like only fish");
    }
}
class Dog extends AnimalOverriding {

    void sleep(){

        System.out.println("I like to sleep for 10 Hours");
    }
    void eat(){
        System.out.println("Dogs like meat");
    }
}
