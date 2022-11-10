package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {

    public static void main(String[] args) {

        //in ArrayList & linked list duplication are allowed  and insertion are in order
        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        //what out put we will get
        System.out.println(numbers); // Result [10, 20, 10]

        //in HashSet and linkedHashSet won't allow duplication and insertion is not in order.
        LinkedHashSet<Integer> setNumbers= new  LinkedHashSet<>();

        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        setNumbers.add(50);
        System.out.println(setNumbers);  //[50, 20, 10]
    }
}
