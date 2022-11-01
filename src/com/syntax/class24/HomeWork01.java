package com.syntax.class24;

import java.util.ArrayList;

public class HomeWork01 {
    public static void main(String[] args) {
      /*  Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that */


        ArrayList<String> name= new ArrayList<>(5); //Mentioning the size is not mandatory , as we know the default initial capacity is 10 .
        // And,it will adjust according to our need later on during runtime itself. However, as we know  in our projects the amount of objects, so it's good to specify the size.
        // if we do this way the memory will not get wasted , it won't slower as well.
        name.add("Raju");
        name.add("Ram");
        name.add("Peter");
        name.add("Dev");
        name.add("Sri");

       System.out.println(name.isEmpty());
        System.out.println(name.contains("Ram"));
        System.out.println(name.size());

        for(String na:name){

            System.out.print(na+ " ");
        }

    }
}
