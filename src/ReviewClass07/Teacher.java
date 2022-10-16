package ReviewClass07;

public class Teacher {

    String name, lastName;
    int experience;
    String subject;
    double salary;

    // when we do not create a constructor --> compiler creates a default constructor for us.

    /* how to create a constructor we initialize instance variables
 1. constructor name = classname , Meaning classname objcetName = new ClassName();
 2.no return type not even void , meaning this constructor is mainly for initializing the values

     */

    Teacher ( String fname, String lName){

        name=fname;
        lastName=lName;
    }

 void print(){

     System.out.println("Teaches First Name "+ name + " and Last Name is " + lastName);
 }

}
