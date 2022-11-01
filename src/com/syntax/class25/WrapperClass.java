package com.syntax.class25;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        int num=10;
        // boxing or manual conversion from primitive to wrapper type
      Integer wrappedNum=Integer.valueOf(num);//this is old version practice 1.1
        System.out.println(wrappedNum);
        // AutoBoxing or automatic conversion of a primitive to a wrapper type
        Integer wrapnum=20; //wrappedNum is reference variable
        System.out.println(wrapnum);

            ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);

        //unboxing converting a wrapper type to a corresponding primitive type
        Integer wrappernum= 30;
     int num2=wrappernum.intValue(); //this is old version practice
        System.out.println(num2);
        // Auto unboxing or automatic conversion of a wrapper type to a primitive type


        Double wrapper=14.20; //this is wrapper class  value
        double num3=wrapper;//this is unboxing ,  unbox automatically convert wrapper data type to corresponding primitive data type.

        System.out.println(num3);


    }
}
