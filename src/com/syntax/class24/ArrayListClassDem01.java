package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListClassDem01 {
    public static void main(String[] args) {

        ArrayList<String> color= new ArrayList<>();
        color.add("Red");
        color.add("green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Black");

        //print all elements one at time.
        System.out.println(color);
        System.out.println(color.get(0));
        System.out.println(color.get(2));
        //find size
        System.out.println(color.size());

        for(int i=0; i<color.size();i++){

            System.out.println(color.get(i));
        }
        System.out.println("*****************************************");

        for(String col:color){

            System.out.println(col);
        }
    }


}
