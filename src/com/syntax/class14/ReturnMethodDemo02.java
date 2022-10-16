package com.syntax.class14;

public class ReturnMethodDemo02 {

    boolean myStery(){

        return false; // Return is reserved keyword . And method can't return more than value at time. And please note return  data type and method data type suppose to be same.
    }

    String mystery1(int num){

        return "Java";
    }

    String method(String word){

        //return "Java";
        //return word;
        if(word.equalsIgnoreCase("Java")){

            return "Java";
        }else{

            return "Python";
        }
    }

    public static void main(String[] args) {
        ReturnMethodDemo02 mt = new ReturnMethodDemo02();

         System.out.println(mt.myStery());
         System.out.println(mt.mystery1(5));

        System.out.println(mt.method("Python"));
    }
}
