package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWork01WithLambda {

    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */

        HashMap<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "ebay");
        building.put(4, "Cipla");
        building.put(2, "Syntax");
        building.put(5, "Amzon");
        building.put(6, "Macy");
        building.put(7, "BMW");

        building.replace(4,"SuperDelux");

        System.out.println("The number of floor we have in this building is " + building.size());

        Iterator<Map.Entry<Integer, String>> iterator = building.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> bul_no = iterator.next();

            var key = bul_no.getKey();
            var value = bul_no.getValue();
            if (key==7) {

           iterator.remove();


            }
        }

        System.out.println(building);
 // building.entrySet().removeIf(x -> x.getKey()==7 && x.getValue().contains("BMW"));
  building.values().removeIf(x->x.contains("BMW"));

        System.out.println("Did with the help of lambda---> " +building);

        //NOTE: BOTH LINE 48 & 49 WILL WORK FINE.
    }
}