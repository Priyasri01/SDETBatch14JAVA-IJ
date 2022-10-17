package com.syntax.class09Array;

public class HomeWork02 {

    public static void main(String[] args) {

        /*
		 * Create an array of animals and store 5 elements into it.
		 * Using 2 different loops print all elements from the array.
		 */

        String[] animals= {"lion", "tiger", "Monkey", "cheeta", "dragon"};

        for(int i=0; i<animals.length; i++){

            System.out.println(animals[i]);
        }

        System.out.println("************************enhance for loop*******************************");
        String[] animals1= {"lion", "tiger", "Monkey", "cheeta", "dragon"};

        for(String ani:animals1){

            System.out.println(ani);
        }

    }
}
