package com.syntax.class14;

public class HomeWork04 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed

    void main(String word){

        switch(word){

            case"India":
                System.out.println("Namaste");
                break;

            case "USA":
                System.out.println("Hello");
                break;

        }
    }

    public static void main(String[] args) {

        HomeWork04 obj = new HomeWork04();

        obj.main("India");
    }
}
