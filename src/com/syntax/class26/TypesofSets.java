package com.syntax.class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesofSets {

    public static void main(String[] args) {

        /*
        There are three types of sets
        HashSet: it does not care about the insertion order.
        we can't call them with index.
        80% of industry will be use Hashset .
        so Hash is best in all cases except if we need all the elements in order

        HashSet:
        downSide=> it does not care about the insertion order
        Upside=> It is the faster type of set.
         */
//when ever you don't care about the order , just speed and avoid duplication then use HashSet.
        HashSet<String> letters = new HashSet<>();

        letters.add("Mango");
        letters.add("Apple");
        letters.add("Kiwi");
        letters.add("Orange");
        letters.add("Banana");
        System.out.println("HashSet");
        System.out.println(letters);



        //insertion speed is same as Hashset but retrieval speed in the worst, and order is maintained
        //when ever you need insertion order ,and avoid duplicate then use linkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();


        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);


//everyting sort by alphabetically, when ever  you need sorted data and avoid duplicate use TreeSet
        TreeSet<String> treeSet= new TreeSet<>();


        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Mango");
        System.out.println("treeSet");
        System.out.println( treeSet);


    }
}
