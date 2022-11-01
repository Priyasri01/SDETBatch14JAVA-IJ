package com.syntax.class25;

import java.util.ArrayList;

public class NonGeneric {
    public static void main(String[] args) {

        /* Non-generic way of using collections framework this is how your ancestors use to write code before java
       1.5 it causes a lot of problems at run time because java don't know at compile time what type of data
        you are storing in this class and because java does not know it can't help you avoid these errors*/

        ArrayList names=new ArrayList();
        names.add("Serhi");
        names.add(10);

        // System.out.println(names);

     /* you will not  get compiler error for line 19. because you created this arraylist for any data type .
        maining u can store any data type. but u will get runtime error. .*/
                        //see in  line 21 we are explicitly provided the data type, since it's non-generic  collection framwork. and  everytime we have to put data type when we call a method.
        System.out.println(((String)names.get(1)).length()); /*u will get run time error.becuase index 1 carry int value and u are asking for the lenth() for the int value
        this method is not applicable for int data type*/


    }
}
