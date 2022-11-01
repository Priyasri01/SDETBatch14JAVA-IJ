package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo05 {
    public static void main(String[] args) {

        ArrayList<String> beautyProducts= new ArrayList<>();


        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        //get iterator method and store in iterator reference variable
        Iterator<String> iterator= beautyProducts.iterator();

        while(iterator.hasNext()){

           String item= iterator.next(); /*this is the better approach, first store the elements from next() to variable  and use it. never call the next() more than one time in loop.
            then we won't get the correct out, it acts like for loop if we call next method more than one time */
            if(item.endsWith("r")){
               iterator.remove();
            }

        }
        System.out.println(beautyProducts);

    }
}
