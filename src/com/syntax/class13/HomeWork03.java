package com.syntax.class13;

import java.util.Arrays;

public class HomeWork03 {
    public static void main(String[] args) {

      /*  You have a String a=”Is it saturday? Is it raining?
      Do we have a Java Class today?” How would you find out how many sentences are in that String? */


        String a= " Is it saturday? Is it raining? Do we have a Java class today?";

        String[] str = a.split("[?]");

        System.out.println(Arrays.toString(str));

        System.out.println(str.length);




    }
}
