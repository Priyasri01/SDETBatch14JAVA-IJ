package com.syntax.class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo04 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        //Add mapping/entry/pair/elements to Map using put() method
        fruit.put("Apple",1.99); //to store  the value in  map
        fruit.put("Mango", 2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
//
      Collection<Double> values= fruit.values(); //return all the values from a map

        Iterator<Double>iterator= values.iterator();

        while(iterator.hasNext()){
            Double value = iterator.next(); //since next() provide wrapper value ,
            // so we created Double with capital .
            // note java will auto matiacally take care the box and unbox . but it's good put the same data type
            if(value>2) {
                iterator.remove();


                }
            }

      //  System.out.println(fruit);

        //using lamda
        fruit.values().removeIf(x->x>2);
        System.out.println(fruit);
        }

    }

