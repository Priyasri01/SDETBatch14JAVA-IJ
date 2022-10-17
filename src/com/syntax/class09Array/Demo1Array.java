package com.syntax.class09Array;

public class Demo1Array {

    public static void main(String[] args) {

        int[] arr = new int[4]; //arr is reference varaible

        //stor  elements inside an arr which is reference varaible
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        //access elements from the array
        System.out.println(arr[2]);
        System.out.println(arr[2]  + arr[3]);

        //lets  create an array  and store your classmates

        String[] name= new String[3];

        name[0]="priyasri";
        name[1]="Ram";
        name[2]="Archana";
        System.out.println("hello " + name[0]);
        System.out.println(name.length);
    }
}
