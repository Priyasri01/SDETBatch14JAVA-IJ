package com.syntax.class22;

public class Parent {

  static String name= "Priyasri";

        static void print(){
            System.out.println("Hello World");
        }


    }
    class Child extends Parent{
        static void print(){

            System.out.println("Hello There " + name);
        }


    }


