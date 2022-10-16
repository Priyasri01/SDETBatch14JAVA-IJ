package ReplitSamples;

public class Replit118 {

   /* Write a method header on line two with the following specs:

    Returns:

    a String
    Name:

    spaceOut
    Parameters:

    a String
    Then complete the method by programming the following behavior

    Insert spaces after every character in the String s, then return the new string.
    See below examples (note the space at the end as well).
    Examples:

    spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y " */

    String spaceOut(String word){
        String name=""; //note if we not intialized  with any  we will get compiler error, that's why i put " ".
        for(int i=0 ; i<word.length(); i++){

            name+=word.charAt(i)+ " ";

        }
        return name;
    }
    public static void main(String[]args){

        Replit118 obj = new Replit118();

        System.out.println(obj.spaceOut("hello"));

    }

}
