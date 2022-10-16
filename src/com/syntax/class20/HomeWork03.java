package com.syntax.class20;

public class HomeWork03 {

    /*Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/


    String name;
    String school;
    int batch;

   static void schoolDetails(String name){


       System.out.println(name);


   }

   static void schoolDetails(String name, String school){


       System.out.println(name + " and my School " + school);
   }

   static  void schoolDetails(int batch,String name , String school){

       System.out.println("My name is " + name + " I am in" + school + "in batch " + batch );
   }

    public static void main(String[] args) {


       HomeWork03 obj=new HomeWork03();

       obj.schoolDetails("Raju");
       obj.schoolDetails("perter", "Syntax");
       obj.schoolDetails(14,"Hari","Syntax");
    }
}
