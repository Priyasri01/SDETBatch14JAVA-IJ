package com.syntax.class28;

import java.util.LinkedHashSet;

public class HomeWork04 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {

        LinkedHashSet<String>  animal = new LinkedHashSet<>();

        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Monkey");
        animal.add("Deer");
        animal.add("Horse");
        animal.add("Deer");



        for(String allAnimal:animal){

            System.out.println(allAnimal);
        }

    }


}
