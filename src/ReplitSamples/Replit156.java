package ReplitSamples;

public class Replit156 {
    /*
    For you to do:

Create class str

declare variable int i=10;

Create class str1 extends str

declare variable int i=20;

create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display

Expected Output:

20
10
     */
    public static void main(String[]args){

        Str1 obj= new Str1();
        obj.method();
    }
}
class Str {

    int i=10;

}
class Str1 extends Str{

    int i=20;

    void method(){


        System.out.println(i);
        System.out.println(super.i);
    }

}