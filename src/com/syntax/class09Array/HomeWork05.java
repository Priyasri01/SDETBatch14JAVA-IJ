package com.syntax.class09Array;

public class HomeWork05 {

    public static void main(String[] args) {

        /*
         * Create an array to store char values and then print those in reverse order
         */

        char[]  name={ 'A','B','C','D','F'};

        for(int i=name.length-1; i>=0;i--){

            System.out.println(name[i]+" ");
        }
    }
}
