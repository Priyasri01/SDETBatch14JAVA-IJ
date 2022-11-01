package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo06 {

    public static void main(String[] args) {
         /*
        what to delete all the product which start with letter B or ends with letter a.
         */
        ArrayList<String> beautyProducts= new ArrayList<>();


        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primera");

        Iterator<String> iterator=beautyProducts.iterator();

        while(iterator.hasNext()){

            String item= iterator.next();

            if(item.startsWith("B")|| item.endsWith("a")){

                iterator.remove();
            }

        }
        System.out.println(beautyProducts);
    }
}
