package com.syntax.class29;

import java.util.*;

public class MapWithMethodDemo1 {

    public static void main(String[] args) {

        // i want  a method that takes a map and returns a set containing all the keys from that map

        HashMap<String,Double> item = new HashMap<>();
        item.put("Iphone 14",1000.00);
        item.put("Egg",2.40);
        item.put("Apples",5.00);
        item.put("Keyboard",100.00);
        item.put("Flower",1.00);
       Set<String> key= getKeys(item); /* getKeys is method used to retirve the key form the map,note as we know
        we can call static method  through the class name, and no need instance to call the static method.
         but in here we called without the class name, why? because this method is inside the same class */

        System.out.println("All  the key from the map");
       for(String keysValu:key){

           System.out.println(keysValu);
       }
        Collection<Double> values=getValue(item);//getKeys is method used to retrive the value
        System.out.println("All  the values from the map");
 for(Double val:values){

     System.out.println(val);
 }

    }

    public static Set<String> getKeys(Map<String,Double> map) { /*this method used to retrieve the  key value,
        note: we put data type as  Map instead of "HashMap<String,Double>" , both will work same but one big advantage of
       making data type as Map is even if they changed HasMap to any other map(inline 14) still the method works fine.
        Because all these class(Hasmap, linkedHapMap, TreeMap) are implements the Map interface.
        so always keep in Mind if we have interface  and  mutiple class that are implementing in it .
        and whenever your are designing  the method always have the interface as data type inside the parameter()  and the return type also.  */

       return map.keySet();

    }
  // i want  a method that takes a map and returns a set containing all the keys from that map
    public  static Collection<Double> getValue(HashMap<String,Double> map1){

        return map1.values();
    }
}
