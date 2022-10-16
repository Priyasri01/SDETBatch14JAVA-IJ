package ReplitSamples;

public class Replit109 {

    /*
    Create method name it as newLine

Add print statement inside method body as "newLine method implementation"

Call newLine method three times

Expected Output:

newLine method implementation
newLine method implementation
newLine method implementation
     */

    void newLine(int num){

        for(int i=0; i<num; i++){

            System.out.println("newLine method implementation");
        }


    }

    public static void main(String[]args){

        Replit109  obj= new Replit109 ();

        obj.newLine(3);
    }
}
