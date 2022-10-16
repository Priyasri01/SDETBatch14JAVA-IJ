package ReplitSamples;

public class Replit120 {

    /*
    For you to do:

Declare 3 instance variables to hold:

year, school name and batch #

Access variables from the main method and assign specific values to them

Print values of your variables in the following format:

Expected Output:

I am a student of batch 9 studying at Syntax in the year of 2021


     */
    int year;  //note: Instance variable : these are the variable declared inside the class.
    String  school;
    int batch;

    public static void main(String[] args){

        Replit120  obj = new Replit120 (); // created new object "obj" for Main class , in order to access the Instant variable , we need to access through object.

        obj.year=2021;
        obj.school="Syntax";
        obj.batch=9;

    System.out.println("I am a student of batch " + obj.batch + " studying at "+ obj.school + " in the year of "+ obj.year);


    }

}
