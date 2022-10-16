package com.syntax.class15;

public class LocalVariableDemo1 {
    static String name="Confused";

    public static void main(String[] args) {
        int number=0;

        System.out.println();
        // local variables are defined inside blocks of code
        // and can only be used inside those blocks
        //System.out.println(name); //name variable is not local , so will get compiler error when we call it here

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(TypeVariableDemo2 .noOfTyres); //this is static variable , we can call it here , there won't any issues. since it's static variable.

        }
        {
            int i=0;

        }

        // System.out.println(i);

    }

    void printNumber(){
        int number=4;
        System.out.println(name);
        // System.out.println(number);
         name="Allan";


    }


}
