package com.syntax.class22;

public class Parent {

  static String name= "Priyasri";

        static void print(){
            System.out.println("Hello World");
        }


    }
    class Child extends Parent{
    //@Override --note if we check with override it will give error, because when we do the static method  we can't override , we just re-declare note the terminology is different the way of doing is same.
        static void print(){ // like other type method , we can also override  the  static method but we as re-declared not as overriding.

            System.out.println("Hello There " + name);
        }


    }


