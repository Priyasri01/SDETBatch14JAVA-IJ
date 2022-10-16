package review.class06;

import java.sql.SQLOutput;

public class HomeWork01 {

    public static void main(String[] args) {

        String str = "Good";

        char[] arr= str.toCharArray(); // by using this method "toCharArray()" we are converting string to char


        for(int i= arr.length-1; i>=0; i--){

            System.out.print(arr[i]);
        }
    }
}
