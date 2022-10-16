package com.syntax.class13;

import java.util.Scanner;

public class HomeWork06 {

    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
    Scanner in=new Scanner(System.in);
    System.out.println("Please enter a first name");
    String name1= in.next();
        System.out.println("Please enter a last name");
        String name2= in.next();


        System.out.println(name1.replace(name1, name2)); //in here we asking to replace value 1 to value2 .ex: name1 "priya" & name2 "hari" --output Hari
        System.out.println(name2.replace(name2, name1)); //in here we asking to replace value 2 to value1 .ex: name1 "hari" & name2 "priya" --output priya

    }
}
