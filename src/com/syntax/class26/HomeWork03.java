package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class
HomeWork03 {

    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        //covert all ArrayList to linkhasSet, so it will remove duplicate and it will be in order.

        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>(aList);
        System.out.println(linkedHashSet);


    }
}
