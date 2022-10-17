package com.syntax.class09Array;

public class TwoDArray {

    public static void main(String[] args) {
                        //[row][col]
        int[][] arr= new int[3][4];
       //1 row
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[0][3]=40;
       //2 row
        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=3;
        arr[1][3]=4;
        //3 row
        arr[2][0]=100;
        arr[2][1]=200;
        arr[2][2]=300;
        arr[2][3]=400;

        //how to access one elements from 2D array?

        System.out.println(arr[0][1]); //20

    }
}
