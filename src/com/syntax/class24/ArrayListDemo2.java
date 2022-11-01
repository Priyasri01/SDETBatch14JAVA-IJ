package com.syntax.class24;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList al= new ArrayList();
      //NOTE in this array list we have group of elements/single collection same data type. we can copy the same elements and can store check in line 18.
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup= new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("After removing " +al_dup);
        System.out.println(al);

        //sort ---collections.sort()
        System.out.println("Elements in the array list: "+al); //[x, Y, Z, A, B, C]
        Collections.sort(al); //descending order
        System.out.println("Elements in the array list after sorting:" +al);//[A, B, C, X, Y, Z]

        //Reverse order---collections.reverse()
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the array list after sorting in reverse order: "+al); // [Z, Y, X, C, B, A]

        //shuffling -Collections.shuffle()
Collections.shuffle(al);
        System.out.println("Elements in the array list after shuffling: "+al);



    }
}
