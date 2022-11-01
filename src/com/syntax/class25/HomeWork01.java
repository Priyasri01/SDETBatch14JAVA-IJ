package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork01 {

    public static void main(String[] args) {
        /*
        Create an arrayList of words.Remove every word that ends with "e"
         */

        ArrayList<String> name=new ArrayList<>(6);
        name.add("Ram");
        name.add("Rose");
        name.add("Absence");
        name.add("Hari");
        name.add("Archu");
        name.add("Characterizable");

        Iterator<String> iter= name.iterator();

        while(iter.hasNext()){

            String word=iter.next();

            if(word.endsWith("e")){
               iter.remove();

            }


        }
        System.out.println(name);
        System.out.println("**************************below using lamda ************************************");

        name.removeIf(word->word.startsWith("e"));
        System.out.println(name);
    }
}
