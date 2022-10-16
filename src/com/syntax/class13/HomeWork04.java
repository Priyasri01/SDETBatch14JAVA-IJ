package com.syntax.class13;

import java.util.Arrays;

public class HomeWork04 {
    public static void main(String[] args) {

        /*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever */

        String str = "This is sentence i want to reverse";

        String[] arr= str.split(" ");

    System.out.println(Arrays.toString(arr));

     for(int i= 0 ;i<arr.length; i++){ // enhance for loop won't work , because it can't update the elements.

         for(int j= arr[i].length()-1; j>=0; j--) {

             System.out.print(arr[i].charAt(j));

         }
System.out.print(" ");
     }




    }
}
