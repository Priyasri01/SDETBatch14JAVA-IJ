package com.syntax.class16;

public class Person {

    private String password = "pass123";
    double salary = 1000;

    public String name = "Roman";

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);
        Bank bank = new Bank("Capital One");
        System.out.println(bank.name);

    }

}
    class Bank{

    String name;

    Bank (String name){

        this.name=name;
    }

    }


