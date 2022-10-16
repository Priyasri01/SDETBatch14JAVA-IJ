package ReplitSamples;

public class Replit111 {

    /*
    1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"

    2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"

    3. Call both methods

Expected Output:

Welcome to Syntax Technologies!
Welcome Syntax Students!
     */

    void syntaxTechnologies(Boolean word){

        if(word){
            System.out.println("Welcome to Syntax Technologies!");
        }else{
            System.out.println("Welcome to Syntax Students!");
        }
    }
    void syntaxStudents(String word1){

        if(word1.equalsIgnoreCase("STUDENT")){

            System.out.println("Welcome Syntax Students!");

        }else{
            System.out.println("Welcome to Syntax Technologies!");

        }
    }

    public static void main(String[]args){

        Replit111  obj= new Replit111 ();

        obj.syntaxTechnologies(true);
        obj.syntaxStudents("student");


    }
}
