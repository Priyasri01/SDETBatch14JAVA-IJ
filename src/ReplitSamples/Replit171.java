package ReplitSamples;

public class Replit171 extends Parent11 {
    /*
    Create a Parent11 Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class

In main method call the methods.

Expected Output:

m1 without parameters
m1 method with parameter
     */

    void m1() {

        System.out.println("m1 without parameters");
    }

    void m1(String name) {

        {

            System.out.println(name + " method with parameter");
        }
    }



    public static void main(String[] args) {

        Replit171 obj = new Replit171();
        obj.m1();
        obj.m1("m1");


    }

}
abstract class  Parent11 { //created abstracted class and created two overloaded method as per the requirement.

    abstract void m1();
    abstract void m1(String name);




}

