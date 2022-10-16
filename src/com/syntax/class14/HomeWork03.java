package com.syntax.class14;

public class HomeWork03 {
    //Create a method that will print whether given String is palindrome or not.

    void palindrome( String word){

        StringBuilder st = new StringBuilder(word); //We are taking string value "word" and we convert to stringBuilder by put the sting value inside the parenthesis().
        st.reverse();

        if(st.toString().equalsIgnoreCase(word)){ //note in here we are using ".toString" because we can't compare string with string Builder. so we are converting string builder to string by using .toStirng()method.

            System.out.println("it's palindrome");
        }else {

            System.out.println("it's not palindrome");
        }


    }

    public static void main(String[] args) {

       HomeWork03 obj = new HomeWork03();

       obj.palindrome("MOM");
    }
}
