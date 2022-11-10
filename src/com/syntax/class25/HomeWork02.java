package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {

    public static void main(String[] args) {
        /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.

         */

        ArrayList<String> drinks= new ArrayList<>(6);

        drinks.add("Mango juice");
        drinks.add("Qishr");
        drinks.add("sprite");
        drinks.add("Dr.pepper");
        drinks.add("Cocio");
        drinks.add("Kukich");

        Iterator<String> healthyDrinks= drinks.iterator();
        System.out.println("All the drink from the List: " + drinks);

        System.out.println("All the healthy drinks  from the List: " );

        //note,the requirement says replace  get() method will work with index only , so this iterator is not good approach. we have to use for loop.
     /*   while(healthyDrinks.hasNext()){

            String healthyDr = healthyDrinks.next();

            if(healthyDr.contains("a") || healthyDr.contains("e")){

                System.out.print("water" + " "); //since i can't use set() inhere, i just did sout . we will get ouput but this is not done as per the requirment.so , this oppraoch is not right.
            }else{

                System.out.print(healthyDr+ " "); //healthyDr is variable we used for store the elements, and it will change on each iterate process. so we have to use  drinks.
           System.out.print(drinks);
            }
        }

      */ // this is the correct approach,  the size is not going to change, because  we are just replacing . the size going to be same so we can use this for loop.
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water"); //replace
            }
        }
        System.out.println(drinks);




    }
}
