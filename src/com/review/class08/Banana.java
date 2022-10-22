package com.review.class08;

public class Banana extends Fruit{

    String  origin;

    Banana(String name, String shape, String color, String origin){
        super(name, shape, color);
        this.origin=origin;
    }

    void makeSmothie(){

        System.out.println("From"+name+" we get tasty smoothie");
    }

    /*
    WHEN child class have same method name as super class-- overriding.
    Overriding -- 2 methods with same name but in different class.

    how to override
    1.Method signature must be the same
    2.return type must be the  same
    3.access modifier/visibility  MUST be same or Must be higher
     */

    protected void grow(){
        System.out.println(name+"Grow fast & fresh");
    }

    public static void havePeel(){
        System.out.println("banana is very easy to peel");


    }
    /*
    when we have @override annotation, will give error for static method.
    In  static, we can't overload we can just re -declare .And we call the object  through the  polymorphism we will get the static method body from parent class/super class, not from the child class.
    because in method overloading we are achieving the polymorphism by run time polymorphism/static/late binding.
     */

    public static void main(String[] args) {

        Banana ban= new Banana("banana","banana shape","yello", "Ecudor");

        ban.haveBenefits(); //Fruit
        ban.makeSmothie(); //banana
        ban.grow();//banana

        Banana.havePeel();

        //runtime polymorphism

        Fruit fruit=  new Banana("banana", "banana shape","green","Africa");
        fruit.grow(); //runtime polymorphizm
        fruit.haveBenefits(); //runtime polymorphizm
        fruit.havePeel(); //in this we get output from parent/fruit even we have run time polymorphism.

    }
}
