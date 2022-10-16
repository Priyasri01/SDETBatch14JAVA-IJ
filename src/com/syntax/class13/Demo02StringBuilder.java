package com.syntax.class13;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Intelligent is Great");
        System.out.println(stringBuilder);
        stringBuilder. reverse(); // call the name of the variable and it we reverse.
        System.out.println(stringBuilder); /* see ur calling the original variable value ,
                                             it has been revised. because stringBuilder is Mutable(changeable)*/
        //same like string stringBuilder also have method in stringBuilder.
        // stingBuilder is good when u care about speed than memory.
        //StringBuilder is mutable. check line item#7.

        //string when we care about memory than processing time

      /*  String does not allow any methods to change the original contents of the variables
        because String is immutable */

        String str="Intellij ";
       // str.toLowerCase();  // this method won't work because it's string
        System.out.println(str.toLowerCase()); // note this will change  value only in the output, because
                                                // string is Immutable(Unchangeable)  the str value will be the same str = Intellij
        System.out.println(str);

       /* String country="usa"; //
        String state="New York";
        StringBuilder state=new StringBuilder("New york");
        StringBuilder state2=new StringBuilder("New york");*/


    }
}
