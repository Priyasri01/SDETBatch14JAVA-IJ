package com.syntax.class14;

public class MethodClassDemo {

    void printHello(){ // this part is called define the method , because i am not passing any parameter inside the ().

        System.out.println("Hello World");
        System.out.println("Hello Java");
    }

    void printWorld(String word){ // this method take single parameter of string data type and prints it.

        System.out.println(word);
    }


    public static void main(String[] args) {
        MethodClassDemo obj= new MethodClassDemo();
        obj.printHello();

    } // parameter will help us to
}
