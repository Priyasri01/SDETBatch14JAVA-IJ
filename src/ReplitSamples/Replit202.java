package ReplitSamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Replit202 {
    public static void main(String[] args) {
        TreeMap<String,String> fruit = new TreeMap<>();

        fruit.put("1 item","apple");
        fruit.put("2 item","banana");
        fruit.put("3 item","pear");
        fruit.put("4 item","tomato");
        fruit.put("5 item","mango");
        fruit.put("6 item","kiwi");


        Set<Map.Entry<String,String>> allfruit =fruit.entrySet();

// note both for each and iterator loop will work fine , and gives both same value

      /* for(Map.Entry<String,String> fru:allfruit){

            System.out.println("Key is " + fru.getKey() + " and values is " + fru.getValue());
        }*/



        Iterator<Map.Entry<String,String>> iterator = allfruit.iterator();

        while(iterator.hasNext()){

            Map.Entry<String,String> fruits = iterator.next();

            System.out.println("Key is " + fruits.getKey() + " and values is " + fruits.getValue());


        }
    }
}
