package com.syntax.class14;

public class MainMethodForMathClass {

    public static void main(String[] args) {


        MathClass obj=new MathClass(); // Creating an object of the Math class
            obj.printFiboSeries(5); //this is how we execute the logic present inside the methods
            obj.printFiboSeries(10);

        System.out.println("************for the addition we are calling the method from MathClass *******************");

        // a "method" is junk of code we can run with one line by calling them in main method.like line 9 ,10 & 15
        obj.add(10,20);
        }
    }


