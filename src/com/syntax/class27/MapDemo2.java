package com.syntax.class27;
//// Importing required classes
import java.util.LinkedHashMap;

public class MapDemo2 {
  // Main driver method
    public static void main(String[] args) {

        // // Initialization of a LinkedHashMap
        //        // using Generics
        LinkedHashMap<String,Double> beautyProducts= new LinkedHashMap<>();
        // Add mappings to Map
        // using put() method
        beautyProducts.put("Foundation",50.5);
        beautyProducts.put("Blush",20.0);
        beautyProducts.put("Lipstick",10.50);

        LinkedHashMap<String,Double> cosmetics= new LinkedHashMap<>();
        cosmetics.put("soap",10.2);
        cosmetics.put("conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String,Double>grocery= new LinkedHashMap<>();

        grocery.putAll(beautyProducts);//just like add all , it will store complete  map from another map
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        grocery.clear();

        System.out.println(grocery);

    }
}
