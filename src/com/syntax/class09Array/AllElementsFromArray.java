package com.syntax.class09Array;

public class AllElementsFromArray {
    public static void main(String[] args) {

        String[] iceCream={"vanilla","chocolate","pistashio","kulfi", "mango"};

        System.out.println(iceCream.length);

//how to get all values? by using loop
        for(int i=0 ; i< iceCream.length; i++){

            System.out.println(iceCream[i]);
        }

        System.out.println("*****************************enhance for loop******************************");

        //only when we deal with array we can use enhance for loop/ for each loop

        String[] iceCream1={"vanilla","chocolate","pistashio","kulfi", "mango"};

        for(String flavor: iceCream1){ // for(data type variablename: arrayname for which we want to get the value)

            System.out.print(flavor + " ");
        }

        int[] num= {12,56,345,1,0,9};

        for(int i=0 ; i<num.length; i++){

            System.out.print(num[i] + " ");
        }

        System.out.println("*****************************enhance for loop******************************");
        //it can do only in one direction

        int [] num1= {12,56,345,1,0,9};

        for(int a:num1){

            System.out.println(a);
        }
    }
}
