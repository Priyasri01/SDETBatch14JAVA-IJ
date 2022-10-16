package com.syntax.class16;

public class PersonTester {

    public static void main(String[] args) {
        Person person=new Person();
         // System.out.println(person.password); // note this will give error because password created as private varibale in other class "person.java"
        System.out.println(person.salary); /*we won't get any error for this one because , salary variable crated as default in "Person class"
                                             as we know default variable can access any class within same package */
    }


}
