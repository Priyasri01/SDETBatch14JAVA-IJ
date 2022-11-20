package com.syntax.class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemoWithLambda {
    public static void main(String[] args) {


        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone", 1000.00);
        items.put("Egg",2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard",100.10);
        items.put("Keyword", 100.00);
        items.put("Flower", 1.00);

        System.out.println("Retrive All Items item list from the map");
        Set<String> key  =items.keySet(); //ketset method returns a set of string value
        // that contain all the keys of the map.

        for(String item : key){

            System.out.println(item);


        }
//incase if we want to just print the key and value from map note we can do loop directly instead of storing.

        System.out.println("Retrive All Items value from the map , but instead of storing the value in varaible, we directly called in the  loops below");

        for(Double value: items.values()){

        System.out.println(value);

        }

        System.out.println("All Items value from the map , assigned through reference variable and did loops ");
       Collection<Double> value =items.values();


       for(Double val:value){
           System.out.println(val);
       }

    }



}
