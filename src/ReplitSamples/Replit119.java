package ReplitSamples;

public class Replit119 {

    /*
    Write a method header with the following specs:

Returns:

a String
Name:

censorLetter
Parameters:

a String
a char
Then complete the method by programming the following behavior

Replace all instances of given character with a "*" within the given String.
See below examples.
Examples:

censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */

    String censorLetter(String a , char b) {

        String str = a.replaceAll(a.valueOf(b), "*");

        return str;
    }

    public static void main(String[]args){

        Replit119 obj  = new Replit119();

        System.out.println(obj.censorLetter("computer science",'e'));
        System.out.println(obj.censorLetter("trick or treat", 't'));
    }



}

