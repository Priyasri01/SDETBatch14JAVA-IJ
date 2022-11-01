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

        while(healthyDrinks.hasNext()){

            String healthyDr = healthyDrinks.next();

            if(healthyDr.contains("a") || healthyDr.contains("e")){

                System.out.print("water" + " ");
            }else{

                System.out.print(healthyDr+ " ");
            }
        }



    }
}
