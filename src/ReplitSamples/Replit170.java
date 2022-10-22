package ReplitSamples;

public class Replit170 {
/*
For you to do:

Overload 2 final instance methods:

Call them in main method

Expected Output:

Final method with boolean parameter
Final method with String parameter
 */


        final void meth(boolean a){

            System.out.println("Final method with boolean parameter");
        }

        final void meth(String b){

            System.out.println("Final method with String parameter");
        }

        public static void main(String[] args){

            Replit170 obj= new  Replit170();

            obj.meth(false); //note even if we pass argument as false, still we will get the output . becuase we just pass the value  but we not cheking any condition for that value.
            obj.meth("Heloo");
        }

    }

