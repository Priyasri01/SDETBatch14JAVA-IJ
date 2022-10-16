package ReplitSamples;

public class Replit116 {

    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

( Return false if one or both given numbers are not even)

Examples:

bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false
Expected Output:

false
     */

    boolean num(int num1, int num2) {
        boolean isEven = true;

        if (num1 % 2 == 0 && num2 % 2 == 0) {

            return isEven;
        } else {
            return isEven = false;
        }

    }

    public static void main(String[] args) {

        Replit116 obj = new Replit116();

        System.out.println(obj.num(4, 3));


    }
}
