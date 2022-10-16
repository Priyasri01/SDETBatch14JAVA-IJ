package ReplitSamples;

public class Replit139 {
    /*
    Create a method that will be available to all classes in your project with following specifications:

Returns:

a String
Name:

alphabetical
Parameters:

a String called str
Purpose:

Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
Additional Info:

You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater". Examples:
 'a' < 'b' ==> True
 'a' < 'a' ==> False
  'a' > 'b' ==> False

     */

    public static String alphabetical(String str){

        String character=" ";

        for(int i=1; i<str.length(); i++){

     if(str.charAt(i-1)<str.charAt(i)){ //first iteration: charAt(1-1)<charAt(1) ===> h<h false, second iter: charAt(2-1)which is charAt(1)<CharAt(2)==>e<h

         character+=str.charAt(i); //in here we are store the biggest value in the charater variable.
     }
 }
return character;

    }

    public static void main(String[] args) {


 System.out.println(alphabetical("hello"));
   System.out.println(alphabetical("software"));
 System.out.println(alphabetical("language"));
    }
}
