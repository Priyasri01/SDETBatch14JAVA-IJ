package com.syntax.class09Array;

public class Demo2Array {

    public static void main(String[] args) {
        String[] drinks= { "fanta", "milk","jusice", "lemonade","water", "DR.Pepper"};

        System.out.println(drinks[5]);
        //how many elements inside the array
       int size= drinks.length; //will give number of elements in the array
        System.out.println("Size of array =" + size);
    }
}