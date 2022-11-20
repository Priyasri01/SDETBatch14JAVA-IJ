package com.syntax.class28;

import java.util.*;

public class HomeWork03 {
    public static void main(String[] args) {

        /*
        Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */

        HashMap<Integer,String> bestBuy = new HashMap<>();

        bestBuy.put(74651,"Printer");
        bestBuy.put(90841,"TV");
        bestBuy.put(45871,"Laptop");
        bestBuy.put(98741,"Mouse");
        bestBuy.put(54817,"Moniter");

        for(var bestbuyStore:bestBuy.entrySet()) {

            System.out.println(bestbuyStore.getKey() + ":" + bestbuyStore.getValue());

        }


        }

    public static class MapDemoWithMethod {
        public static void main(String[] args) {

            // I want a method that takes a map and returns a arraylist all the keys and value  from that map

            TreeMap<String,Double> items=new TreeMap<>();
            items.put("Iphone 14",1000.0);
            items.put("Eggs",2.40);
            items.put("Apples",5.0);
            items.put("Keyboard",100.0);
            items.put("Flower",1.0);
            List<String> keys=getKeys(items);
            for (var key:keys
            ) {
                System.out.println(key);
            }

            List<Double> values= getValues(items);
            System.out.println(values);
        }

        public static List<String> getKeys(Map<String,Double> map){ //created return type as list , since Arraylist class implements list interface.

            return new ArrayList<>(map.keySet()); //converting map to Arraylist by just passing the argument inside the constructor.
        }

        public static List<Double> getValues(Map<String,Double> sholpan){

            return new ArrayList<>(sholpan.values());
        }



    }

    public static class InterviewQForMap {

        public static void main(String[] args) {
            // Create a method that returns a map of characters and their count in a String


            String str = "bdfjhdfbewqbcnsdfsdf";

            System.out.println(getCount(str));

        }
            public static Map<Character, Integer> getCount (String str){
                char[] charArr = str.toCharArray();
                Map<Character, Integer> map = new HashMap<>();
                for (char c : charArr) {

                    if (map.get(c) == null) {
                        map.put(c, 1);
                    } else {
                        int count = map.get(c);
                        count = count + 1;
                        map.put(c, count);
                    }
                }

                return map;
            }

        }
}

