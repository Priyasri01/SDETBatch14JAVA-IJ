package ReplitSamples;

public class Replit125 {

    /*
    Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.

Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance

Expected Output:

200
200
     */


    static int number;



    public static void main(String[]args){
        number= 200;

        Replit125  obj =new Replit125 ();

        System.out.println(Replit125 .number); //calling using class name
        System.out.println(obj.number); //calling the variable through Instance/object which is non-static



    }
}
