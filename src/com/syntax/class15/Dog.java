package com.syntax.class15;

public class Dog {

    String name; //instance, because it's inside the class
    static int noOfLegs=4; //this is static variable , because the value can't change . so have this variable as static.
    String color; //it's instant variable , because it's inside the class.

    void bark(){
        int i=10; //local
        for (int j = 0; j < i; j++) {
            //int j is also a local variable
            System.out.println("Barking....");
        }
    }

    void printInfo(){
        System.out.println("name "+name+" color "+color);
    }
    void printName(){
        System.out.println("name "+name);
    }

    // Break till 1:50
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Tomy";
        dog1.bark();

        Dog dog2=new Dog();
        dog2.name="Lucky";
        dog2.printName();
    }
}
