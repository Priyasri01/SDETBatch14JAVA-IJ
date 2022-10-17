package com.syntax.class09Array;

public class TwoDArrayShorterWayDemo {

    public static void main(String[] args) {

        int[][] arr={  {10,20,30,40}, //---> 1 array ... but we stored in Index so this [0]
                        {100,200,300,400}, //this is my second array....but we stored in Index so this [1]
                        {1,2,3,4} //this is my third array...but we stored in Index so this [2]

                    };


        System.out.println(arr[1][1]);
    }
}
