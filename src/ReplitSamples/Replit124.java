package ReplitSamples;

public class Replit124 {
    /*
    Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:

first way: By calling directly

Second way: By using the className

Third way: By creating the object of the class

Expected Output:

Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
     */


    static String ss="Welcome To Syntax Technologies";

    public static void main(String[]args){

        System.out.println(ss); // first way by calling directly
        System.out.println(Replit124.ss); // by using the calss name

        Replit124 obj = new Replit124(); //By creating the object of the class

        System.out.println(obj.ss); // and calling the variable through object

    }
}
