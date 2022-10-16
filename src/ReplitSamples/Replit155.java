package ReplitSamples;

public class Replit155 {

    /*
Create three classes (A, B, C)
Write two constructors:

Have a default constructor that prints out the following
For A: "I"

For B: "am"

For C: "a tester"

Make C extend B

and B extend A

From your Main class create an object of the C class.

Expected Output:

I
am
a tester
     */
    public static void main(String[] args){

        DC obj= new DC();


    }

}
 class Ab{ // created this class without constructor

     { //note if we not put the pranthesis  in line 38 & 40 we will get error
         System.out.println("I");
     }

}
class Bc extends Ab{
 Bc() {
        System.out.println("am");
    }


}
class DC extends Bc{
   DC()

    {
        System.out.println("a tester");
    }
}
