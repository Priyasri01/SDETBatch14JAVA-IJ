package ReplitSamples;

public class Replit121 {

    /*For you to do:

    declare 3 instance variables to hold an integer, double and char values.

    Create 2 instances of the class and assign values to variables and the print them

            Expected Output:

            10
            10.23
    a
100
        100.23
    s */

    int num;
    double num1;
    char letter;

    public static void main(String[]args){

        Replit121  obj1 = new Replit121 ();

        obj1.num=10;
        obj1.num1=10.23;
        obj1.letter='a';


       Replit121  obj2 = new Replit121 ();

       obj2.num= 100;
       obj2.num1=100.23;
       obj2.letter='s';

        System.out.println(obj1.num);
        System.out.println(obj1.num1);
        System.out.println(obj1.letter);
        System.out.println(obj2.num);
        System.out.println(obj2.num1);
       System.out.println(obj2.letter);


        }
    }


