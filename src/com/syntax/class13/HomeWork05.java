package com.syntax.class13;
public class HomeWork05 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String name = "mom";
        String name2=""; // since we are comparing we have assigning  some value otherwise will get compiler error

        for(int i=name.length()-1; i>=0;i--){

           System.out.print(name.charAt(i));

           name2+=name.charAt(i);

        }

        if(name.equalsIgnoreCase(name2)){

            System.out.println(" it's palindrome");
        }
        else{
            System.out.println(" it's  not palindrome");

        }


    }
}