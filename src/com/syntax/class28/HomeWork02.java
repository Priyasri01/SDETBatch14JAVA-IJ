package com.syntax.class28;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork02 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
         */

        TreeMap<String,String> countires = new TreeMap<>();

        countires.put("Australia","Abuja");
        countires.put("Pakistan","Islambad");
        countires.put("Sri Lanka","Colombo");
        countires.put("India","New Delihi");
        countires.put("Myanmar","Naypyitaw");

        for(var country:countires.entrySet()){

           var  allcountry= country.getKey() + ":" + country.getValue();
            System.out.println(allcountry);
        }
        System.out.println("*********************************************");

        Iterator<Map.Entry<String,String>> iterator =countires.entrySet().iterator();

        while(iterator.hasNext()){

          Map.Entry<String,String> list= iterator.next();

            System.out.println(list);

            }
        System.out.println("*********************************************");
        TreeMap<String,String>country = new TreeMap<>();
        country.putAll(countires);



        for(String coutr :country.values()){



            System.out.println(coutr);

        }
    }


    }

