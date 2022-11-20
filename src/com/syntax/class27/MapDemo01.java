package com.syntax.class27;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {

        // Initialization of a HashMap by using Generics line 10

        HashMap<String, Double> fruit = new HashMap<>();
        //Add mapping/entry/pair to Map using put() method
        fruit.put("Apple",1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

// Printing mappings to the console
        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango");
        System.out.println(fruit);

        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(4.99)); //search the map for this value
        System.out.println(fruit.isEmpty());



/*can see that apart from put method all the other , methods are same as lists and sets.
Then why maps are not a part of collection framework? because it's data structure is different , it will store two values which is key & value. whereas collection take only one values.*/
    }
}
