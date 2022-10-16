package com.syntax.class16;

public class Task2WithChainingMethod {


    /*
    Create a method that will take a String as a parameter and returns reversed String
     Method should be available to all classes within your project and accessible by class name.
     */

        public static String reverseStr(String str){ // note we made it as public method as access modifier ,
                                                    // because  as per the requirement " should be available to all classes within your project"  and we have static ,
                                                    //  because as per the requirements it should be "accessible by class name."

       /* String newStr; // created new variable
        StringBuilder sb=new StringBuilder(str);  // convert string into string builder, by just passing  str inside the pranathesis()
        sb.reverse(); // reverse the value/character by using StringBuilder reverse method.
        newStr=sb.toString(); // converting sb string builder to string  and store that string into newStr.
        return newStr;*/ // calling the return newStr /output

            return new StringBuilder(str).reverse().toString(); // to avoid multiple line item from line 12 to 16 . we  used chaining method and we will get same result in single line.
        }

        public static void main(String[] args) {
            System.out.println(Task2WithChainingMethod.reverseStr("Sunday"));// we called this method through class name,since we created reverseStr as static.
        }
    }


