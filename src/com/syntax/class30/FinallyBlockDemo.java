package com.syntax.class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        try{ //this try block will execute only if the code is correct
            System.out.println(10/0);
           // System.out.println(ExcelReader.read("Data/Test1.x"))
        }catch (ArithmeticException ae){ // this catch block will execute only if the try block code is not correct
            System.out.println("Operation not allowed");
            String name=null;
            System.out.println(name.length()); /*note even if we have a exception inside the catch block
          the finally will execute but nothing will execute after final. s
          o that's why finally block important when we use try catch block.*/

            /*
            why we need finally block?
            The finally block in java is used to put important codes such as clean up code e.g.
             closing the file or closing the connection(if multiple page website are open) and so on. The finally block executes whether exception rise or not and whether exception
              handled or not. A finally contains all the crucial statements regardless of the exception occurs or not.
              so, basically when we open something will make sure to close it so that we won't have any issues.
              so, final block will carry important information. so that we can manage system resources properly

             */
        }finally { //It always execute once java open the try block.
            System.out.println("This Block is always executed no matter what");
        }

        System.out.println("1");

    }
}
