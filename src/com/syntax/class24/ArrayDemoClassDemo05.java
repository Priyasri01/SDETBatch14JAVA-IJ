package com.syntax.class24;

import java.util.ArrayList;

public class ArrayDemoClassDemo05 {

    public static void main(String[] args) {

        ArrayList<String> color= new ArrayList<>();
        color.add("Red");
        color.add("green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Black");
        System.out.println(color);
        color.remove(2); //both 16 & 17 will give same result
        //color.remove("Blue"); //it will remove particular  elements form the arraylist

       // color.clear(); //it will remove the whole elements form the arraylist.
        System.out.println(color);

    }
}
