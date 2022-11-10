package com.syntax.class26;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HomeWork05 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
         */

        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Jerciho");
        cities.add("Manhattan");
        cities.add("Amity");
        cities.add("longIsland");
        cities.add("Albany");


        Iterator<String> iterator = cities.iterator();

        while(iterator.hasNext()){

            String city= iterator.next();

            if(city.startsWith("A")){
                iterator.remove();
            }
        }

        System.out.println(cities);
    }
}
