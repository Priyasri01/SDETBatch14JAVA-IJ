package com.syntax.class28;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {


        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone", 1000.00);
        items.put("Egg",2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard",100.10);
        items.put("Keyword", 100.00);
        items.put("Flower", 1.00);
//note:so instead of make separate line for store values and iterator.
// we combined together in single line in line 18.

   /*     Iterator<Double> iterator = items.values().iterator();

        while (iterator.hasNext()){

            Double price = iterator.next();

            if(price>10){

                    iterator.remove();

                }
            }
        System.out.println(items);
        */

        items.values().removeIf(x->x>10.00);

        System.out.println(items);
        }



    }


