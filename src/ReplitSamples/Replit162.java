package ReplitSamples;

public class Replit162 {
    /*
    Overload static method and then execute both overloaded methods.

Expected Output:

static method without parameter
static method with int parameter
     */

    static void method(){
        System.out.println("static method without parameter");
    }

    static void method(int a){

        System.out.println("static method with int parameter");

    }
    public static void main(String[] args) {

        method();
        method(1);

    }
}
