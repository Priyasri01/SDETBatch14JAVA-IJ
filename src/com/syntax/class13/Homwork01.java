package com.syntax.class13;

public class Homwork01 {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String sen= " Do what you like to do";

        String name= sen.replace(" ", ""); //getting output without space.

        System.out.println(name);

        System.out.println();
        System.out.println("************************Anotherway for loop**********************************");

        for(int i=0; i<sen.length(); i++){

            if (!(sen.charAt(i)== ' ')){

                System.out.print(sen.charAt(i));


            }
        }
    }
}
