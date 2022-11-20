package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToListWithMethodDemo2 {
    public static void main(String[] args) {

        // i want  a method that takes a map and returns a key in the fome of ArrayList

        HashMap<String,Double> item = new HashMap<>();
        item.put("Iphone 14",1000.00);
        item.put("Egg",2.40);
        item.put("Apples",5.00);
        item.put("Keyboard",100.00);

        item.put("Flower",1.00);
     List<String>key=getKey(item);
        System.out.println(key);
    List<Double> value=getValue(item);
        System.out.println(value);




        }
        // Task:Create method to get key in  form of Arraylist

    public static List<String> getKey(Map<String,Double> map){

        return new ArrayList<>(map.keySet()); //convert map to Arraylist instead of List, because List is an abstract class we can't create object to abstract class

    }

    //create method to get values in the form of Arraylist

    public static List<Double> getValue(Map<String,Double> valueMap){

        return new ArrayList<>(valueMap.values()); //converting map to ArrayList as per the task requirements
    }
}
