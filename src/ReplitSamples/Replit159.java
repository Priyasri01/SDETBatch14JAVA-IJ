package ReplitSamples;

public class Replit159 {



       /* Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers

        In main method execute all 3 methods to match the output:

        Expected Output

        40 (should come from subtracting 4 numbers)
        30 (should come from subtracting 3 numbers)
        20 (should come from subtracting 2 numbers) */



}
class Main06 {

    void method1(int a, int b){

        System.out.println(a-b+ " (should come from subtracting 2 numbers)");
    }

    int  method1(int a, int b , int c){

        int sub = (a-b)-c;

        return sub;
    }

    void method1(int a,int b, int c, int d){

        System.out.println(a-b-c-d + " (should come from subtracting 4 numbers)");
    }

    public  static void main(String[] args){

        Main06 main = new Main06();
        main.method1(100, 20, 20, 20);
        System.out.println(main.method1(100,35,35) + " (should come from subtracting 3 numbers)");
        main.method1(40,20);

    }
}