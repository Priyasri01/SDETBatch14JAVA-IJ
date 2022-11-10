package com.syntax.class25;

import java.util.ArrayList;

public class IteratorDemo4WithLambda {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();

        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        System.out.println(beautyProducts);
        // what happening in line16, remove all the elements that are available in beauty product which elements starts with letter 'B'. lambda introduce  after java 8
      beautyProducts.removeIf(item -> item.startsWith("B"));// removeIf method is act  like loop .in item it store all elements form the list then look for the elements that start form letter "B".
      // beautyProducts.removeAll(beautyProducts); //this will remove everything that present in the beauty-products  which we passed on the prameter.
      System.out.println(beautyProducts);

    }
}
