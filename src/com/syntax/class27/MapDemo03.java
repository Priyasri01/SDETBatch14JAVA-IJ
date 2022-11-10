package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        //Add mapping/entry/pair to Map using put() method
        fruit.put("Apple",1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1); //key written in the form of set, whereas value written in the form of list



        //there are three iterator , we can use
        //we can store same value, but not allow duplicate key because not to confuse
        // java doesn't know which one to call it. and Map only works based on key.
 //note: Before we are going for loops we have to use Keyset to collect all the key then proceed loop.
        Set<String>keySet=fruit.keySet(); //we are using keyset, the key set method return all the keys in the form of a set
        System.out.println(keySet);

        Iterator<String>iterator= keySet.iterator();

        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }

        System.out.println(fruit);

        fruit.keySet().removeIf(x->x.contains("n"));
        System.out.println(fruit);

    }
}
