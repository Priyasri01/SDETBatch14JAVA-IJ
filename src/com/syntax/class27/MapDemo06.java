package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo06 {

    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        //Add mapping/entry/pair to store the values in a Map using put() method
        fruit.put("Apple",1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

      //Set<Map.Entry<String,Double>> entrySet = fruit.entrySet();

   Iterator<Map.Entry<String,Double>> iterator =fruit.entrySet().iterator();



        while(iterator.hasNext()){

            Map.Entry<String,Double> entrySet1 =iterator.next();

            System.out.println(entrySet1.getKey() + ":" + entrySet1.getValue());

        }

        }



    }

