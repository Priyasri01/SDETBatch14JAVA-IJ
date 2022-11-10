package com.syntax.class26;

import java.util.TreeSet;

public class HomeWork04 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries = new TreeSet<>();

        countries.add("Mexico");
        countries.add("India");
        countries.add("Australia");
        countries.add("Nigeria");
        countries.add("USA");
        countries.add("Canada");

        System.out.println(countries);








    }
}
