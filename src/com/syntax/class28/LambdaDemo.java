package com.syntax.class28;

import java.util.HashMap;

public class LambdaDemo {
    public static void main(String[] args) {
        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone", 1000.00);
        items.put("Egg",2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard",100.10);
        items.put("Keyword", 100.00);
        items.put("Flower", 1.00);


   items.keySet().removeIf(x->x.contains("n"));
        System.out.println(items);

        //lambdas are awesome row1.forEach(x-> System.out.print(x+ " "));
    }
}
