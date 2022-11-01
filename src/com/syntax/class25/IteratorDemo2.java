package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args){

        ArrayList<String> beautyProducts=new ArrayList<>();
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

        Iterator<String> iterator=beautyProducts.iterator();
        System.out.println(beautyProducts.size());

        while (iterator.hasNext()){ //.hasNext() method is perfectly used for while method
            System.out.println(iterator.next());
            System.out.println(iterator.next()); //note we are not supposed to put two next(), we will get run time error if we have elements with odd size().in case it's even then we won't gett run time error. But always makesure to have single next().
        }
        System.out.println(beautyProducts);
    }
}
