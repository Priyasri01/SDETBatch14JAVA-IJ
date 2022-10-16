package ReplitSamples;

import java.util.Arrays;

public class Replit153 {

    public static void main(String[] args) {
String str ="This is parent constructor";
        String type="";
        String [] arr=str.split(" "); // this spilt take regular expression.
        System.out.println(Arrays.toString(arr));


       for(int i=0; i<arr.length;i++){

            type+=arr[i] + " ";
        }

        System.out.println(type);
    }
    }



