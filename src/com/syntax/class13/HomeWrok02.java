package com.syntax.class13;

public class HomeWrok02 {

    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str= "ABDCabdc8989&%$#@&^";

        String str1= str.replaceAll(("[^a-zA-Z0-9]"), ("")) ;//  expect capital and small letter form a to z and number form 0-9 all are removed.

        System.out.println(str1);

       System.out.println("There are " +str1.length() + " Alphanumeric characters are there in this string.");




       }
    }

