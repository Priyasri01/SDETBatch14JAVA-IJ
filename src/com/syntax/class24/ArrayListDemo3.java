package com.syntax.class24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        String[] arr={"Dog", "Cat","Elephant"};

        for(String value:arr){

            System.out.println(value);
        }
//converting Array to Arraylist in line 17
        ArrayList al= new ArrayList(Arrays.asList(arr));

        System.out.println(al);
    }
}
