package com.syntax.class16;

public class Task3 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

//note based on the requirement first use the access modifier(public, private,protected,default) and followed by non-access modifier(static, final,abstract,synchronized) .example line 11.
    private static String getVowels(String str){ /*note we  made this method  as private because as per the requirement
                                                " Method should be available inside the class only" and we made as static because requirments says " declared and executed by calling it is name */
     /*   String newStr=str.replaceAll("[^aeiouAEIOU]","");
        return newStr;*/

        return str.replaceAll("[^aeiouAEIOU]",""); // note instead of creating a new variable  and assign the vowels value to it in line 13 , we just directly did in retrun . Both  will give same outPut.
    }

    public static void main(String[] args) {
        String humera = getVowels("Humera"); // since we have created this  method "getVowels" as static we called directly by it name and store the value inside the "humera" variable.
        System.out.println("humera = " + humera); // note we if we have varaible , if we need to call instead of  typing all the sys out. we can just type "sysov"and enter u will get the full line.



    }
}


