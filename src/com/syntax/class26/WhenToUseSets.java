package com.syntax.class26;

import java.util.*;

public class WhenToUseSets {

    public static void main(String[] args) {
//romove all the duplicate from this list/collection . Note since it's ArrayList we can do loop follow with condtion and we can remove the duplication , but since we learned about Set .
        //we can use set  to avoid duplication in collection farmework.

        ArrayList<Integer> num= new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(10);
        num.add(40);
        num.add(50);
/* note if we are in collection framework,  collection framework will allow us to convert any data structure to any other data structure
 (like convert ArrayList to LinkedHashSet or TreeSet to ArrayList and so on),just by passing the data structure to the constructor. */
        System.out.println(num);

        System.out.println(new LinkedHashSet<>(num)); //converted ArrayList to LinkedHashSet

        HashSet<Integer> hashSet= new HashSet<Integer>(num); //converted ArrayList to Hashset

        System.out.println(hashSet);



        LinkedList<Integer> linkedList = new LinkedList<>(hashSet); //converting hashset to linked hashset by just calling the reference variable inside the constructor.
        System.out.println(linkedList);






    }
}
