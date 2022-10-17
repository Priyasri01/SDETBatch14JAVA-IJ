package com.syntax.class22;

public class AnimalsTester {

    public static void main(String[] args) {
        Cat cat =new  Cat();
        cat.sleep(); //will get default behaviour
        cat.eat();

        Animals animals= new Panda(); // this is called as upcasting

        // Panda panda = new Animals(); //this is called as down-casting.

        Animals[] animal= {new Panda(), new Cat()};

    }
}

