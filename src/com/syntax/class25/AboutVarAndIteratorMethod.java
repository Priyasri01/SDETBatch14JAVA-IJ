package com.syntax.class25;

import java.util.ArrayList;

public class AboutVarAndIteratorMethod {
    public static <iterator> void main(String[] args) {
        /*
        what to delete all the product which start with letter B or ends with letter a.
         */

        ArrayList<String> beautyProducts= new ArrayList<>();

        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");

//both line 16 & 17  will provide the same out put. in case if we don't know the data type then we can use var.

        //var iterator = beautyProducts.iterator(); from java 11 version we have this flexibility.

        var iterator = beautyProducts.iterator(); //java automatically will detect the data type when we put var.
       // Iterator<String>iterator=beautyProducts.iterator();

        /*
         var number=10; see in here i am not mentioning int data type
         for all item from 22 ,23,24 just i type var, jave
        var name="Tymur";
        var decimalNumber=21.5;
         */

        while(iterator.hasNext()){

          // var item= iterator.next(); //from java 11
            String item=iterator.next();
            if(item.startsWith("B") || item.endsWith("a")){

                iterator.remove();
            }

        }
        System.out.println(beautyProducts);

    }
}
