package ReplitSamples;

public class Replit160 {
    /*
    For you to do:

Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter

Call all methods inside your main method

Expected Output:

100
Syntax Technologies
100.09
     */
}

class Main07 {


    void method1(int a){


        System.out.println(a);

    }

    void method2(String name){

        System.out.println(name);

    }

    void method3(double num){

        System.out.println(num);
    }

    public static void main(String[]args){

        Main07 obj= new Main07();
        obj.method1(100);
        obj.method2("Syntax Technologies");
        obj.method3(100.09);
    }
}