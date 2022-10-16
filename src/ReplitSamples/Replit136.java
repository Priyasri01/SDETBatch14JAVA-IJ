package ReplitSamples;

public class Replit136 {

    /*
    For you to do:

Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.

Expected Output:

This is Private Method
This is Default Method
This is Protected Method
This is Public Method
     */

    private void method1(){

        System.out.println("This is Private Method"); //this method can access within the class

    }

    void method2(){

        System.out.println("This is Default Method"); //this mehtod can access within the same pacakage
    }

    protected void method3(){

        System.out.println("This is Protected Method"); //access level of a protected modifier is within the package and outside the package through child class.

    }


    public void  method4(){

        System.out.println("This is Public Method"); //this method can access anywhere in the project


    }

    public static void main(String[] args){

        Replit136  obj = new Replit136 ();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();



    }

}
