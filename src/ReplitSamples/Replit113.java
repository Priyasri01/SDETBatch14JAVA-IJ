package ReplitSamples;

public class Replit113 {

    /*
    Step1: Create a method that will accept with 2 parameters of integer type

    Step2: Write the logic in that method in println statement to print hours and minutes

    Step3: Call the method

    Expected Output:

        11:30
     */

    void method(int num1, int num2){

        System.out.println(num1 + ":"+num2);
    }

    public static void main(String[] args){

        Replit113 obj= new Replit113();

        obj.method(11,30);
    }
}
