package com.syntax.class24;

import java.util.ArrayList;

public class WhyCollectionsFrameWork {
    public static void main(String[] args) {
  /*
    if we have to store a single or two value then we should use variables
     */
        String name="Joseh";
        String name2="joe";
        System.out.println(name);
        System.out.println(name2);

        /*
        fixed in size
         */

        String[] breeds= new String[10];
        breeds[0]="Bull Dog";
        System.out.println();

        ArrayList<String> color = new ArrayList<>();
        color.add("pink");

    }



}
