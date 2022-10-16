package ReplitSamples;

public class Replit154 {

    /*
    In Parent Class.

Create a no-argument constructor and include the logic to print "Parent Constructor without argument"

Create another constructor that takes one parameter of integer type called number.

include the logic to print the value of the number.

In Child class.

Create a Constructor without parameter and include the logic to print "Child Constructor without argument"

Overload the constructor by adding one parameter of type integer

Inside the constructor call the parameterized parent class constructor.

In Main Class.

Create an object of Child without passing any argument.

And then another object of Child class by passing the value "10". run the application.

Expected Output:

Parent Constructor without argument
Child Constructor without argument
10
     */

    public static void main(String[] args){

        Child3 ch= new Child3();
        Child3 ch1= new Child3(10);
    }

    /*
    note we will get parent method output firt in the console  because child class includes parent class.
     */
}
class Parent {

    Parent(){

        String str= "Parent Constructor without argument";
        String a="";

        for(int i=0; i<str.length(); i++){

            a+=str.charAt(i);
        }

        System.out.println(a);

    }

    Parent(int number){


        System.out.println(number);
    }
}
class Child3 extends Parent{

    Child3(){

        String str= "Child";
        String str1= "Constructor";
        String str2="without";
        String str3="argument";

        System.out.println(str+" "+str1 + " " + str2 + " "+str3);

    }
    Child3(int num){

        super(num);
    }
}

