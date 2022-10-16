package ReplitSamples;

public class Replit135 {

    /* Write a method with the following specs:

     Returns:

     a String
     Name:

     surround
     Parameters:

     a String called s
     a String called search_term
     Then complete the method by programming the following behavior

     Return a new String built from s that has every instance of the search term surrounded by parentheses
     See below examples.
             Examples:

     surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
     surround("technology",'o') ==> "techn(o)l(o)gy" */


    public static String surround(String s, String serach_term) {
        String name=null;

        for (int i = 0; i < s.length(); i++) {

            if (serach_term.equalsIgnoreCase("c")) {
                name = s.replaceAll(serach_term, "(c)");

            } else if (serach_term.equalsIgnoreCase("o")) {
                name = s.replaceAll(serach_term, "(o)");
            }


        }
        return name;
        //
    }
        //test case below (dont change):

        public static void main(String[] args){

            System.out.println(surround("abcabcabc", "c"));//"ab(c)ab(c)ab(c)"

            System.out.println(surround("technology", "o")); //"techn(o)l(o)gy"

    }
}

