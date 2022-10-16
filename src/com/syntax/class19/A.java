package com.syntax.class19;

public class A {

    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */

 static void  PrintF(){

      System.out.println("This is static method");
   }

    public static void main(String[] args) {


    B obj =new  B();
   obj.PrintF(); //note eventhough we don't have any mehtod inside the class B ,
        // we called this method and got output.Becuase class B  have inheritance method.B
 B.PrintF(); //WE CALLED DIRECTELY FROM THE METHOD, SINCE IT'S STATIC.HEER

 }

}
