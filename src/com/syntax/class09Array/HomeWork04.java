package com.syntax.class09Array;

public class HomeWork04 {
    public static void main(String[] args) {
        /*
         * From an array of integer elements find the largest number.
         */

        int[] a= {10,50,89,100,-19};

        int largestNum = a[0];

        for(int i=0;i<a.length; i++){

            if(a[i]>largestNum){

                largestNum=a[i];
            }

        }
        System.out.println(largestNum);


        System.out.println("*********************************enhance loop****************************************");

        int[] b= {10,50,89,100,-19};

        int smallestNum=b[0];

        for(int c:b){

            if(c<smallestNum){
                smallestNum=c;
            }
        }

        System.out.println(smallestNum);
    }

}
