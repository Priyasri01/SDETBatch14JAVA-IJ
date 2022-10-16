package ReplitSamples;

public class Replit114 {

   /* Step1: Create three methods that will accept 2 in parameters on integer type

    Step2: Write the logic in methods to perform actions below:

    The first method for multiplication

    The second method for addition

    The third method for subtraction

    Step3: execute all methods

for the addition method add two numbers to make 30

            for multiplication multiply two numbers to make 30

            for Subtraction subtract two numbers to equal 20

    Expected Output:

    Addition 30
    Multiplication 30
    Subtraction 20 */

    void Add(int num1, int num2){

        System.out.println("Addition " + (num1+num2));

    }
    void Multiple(int num1, int num2){

        System.out.println("Multiplication " + (num1*num2));

    }

    void sub(int num1, int num2){


        System.out.println("Subtraction " + (num1/num2));

    }

    public static void main(String[]args){

        Replit114 obj= new Replit114();

        obj.Add(10,20);
        obj.Multiple(10,3);
        obj.sub(40,2);
    }


}
