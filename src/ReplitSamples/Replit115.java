package ReplitSamples;

public class Replit115 {

    /*
    Create a method that will accept a String as a parameter and return new String all in upper case

    Call method

    Expected Output:

    TEST
     */

    String name(String word){

        return word;
    }
    public static void main(String[]args){

        Replit115  obj= new Replit115 ();

        String name1 =obj.name("test");
        System.out.println(obj.name("test").toUpperCase());
        // System.out.println(name1.toUpperCase()); both line will give same output.
    }
}
