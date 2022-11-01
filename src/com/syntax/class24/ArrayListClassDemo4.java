package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListClassDemo4 {

    public static void main(String[] args) {

        ArrayList<String> name= new ArrayList<>();

        name.add("Priya");
        name.add("smala");
        name.add("MJ");
        name.add("josh");
        name.set(2,"Peter Line"); //it will replace , the size will be the same
        System.out.println(name);

        ArrayList<Integer> num= new ArrayList<>();
        num.add(10);
        num.add(25);
        num.add(35);
        num.add(1,100); //  it will add 100 value in the index 1, the size will be bigger
        num.set(0,1200); //it we replace o index from 0 to 1200
        System.out.println(num);
        num.clear();
        System.out.println(num); //it will delete the whole value






    }
}
