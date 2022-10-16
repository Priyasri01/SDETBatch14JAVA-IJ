package com.syntax.class14;

public class StringBufferVsBuilder {

    public static void main(String[] args) {
        //mostly used class newer better faster
        StringBuilder stringBuilder =new StringBuilder("Today is java class");
        //older one slow and not used mostly
        StringBuffer stringBuffer= new StringBuffer("Today is java class");

        //if we want to convert the string to a stringBuilder we can use the below syntax
        String str="Java is very easy";
        StringBuilder stringBuilder1= new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        /*       IF we want to convert from a StringBuilder to A String we can use
           the below syntax */
        String newStr=stringBuilder1.toString();

    }
}
