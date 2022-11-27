package com.syntax.class30;

import util.ExcelReader;

public class ExceptionDemo04 {
    public static void main(String[] args) {

        try{ /*note where we can use this code , incase in any project if we doubt about the
            code then we can use try catch block so that
            it won't affect the rest of code .later we can fix it
            and also in work area if some code is not working properly then we use this(try,catch block) to send message to the developer and manager about the issues*/
            String name= null;

            System.out.println(name.length());


        }catch (Exception e){ /*inside the () we have to provide the type of error we might get from  try block code.Like exceptionoutofBond,NegativeArraySizeException, FileNotFoundException and so on.
          but if we are not sure about the type of error then we can give "Exception e" ..e is just variable created for Exception*/

            System.out.println("BackupCode");

        }

//note not all the exception needs try catch block. we use simple if and else condition also to getride the error. their are some excepyion that  we can  fix it by just provide correct code or by using if else condition.
        String name1=null;

        if(name1!=null){

            System.out.println(name1.length());
        }else{
            System.out.println("code is incorrect");
        }


        int[] arr= new int[5];
        int index =10;

        try {
            System.out.println(arr[index]);
        }catch (Exception e){
            System.out.println("The size of the array is greater than the array size");
        }

        /*About Unchecked Exception:these kind of exception is called unchecked exception otherwise called lightweight exception,
        java will not force us, java will say  these are lightwight error which can be avoided
         by just  writing correct code  or use if  else condtions ex: for lightWeight exceptions string name1 & name & array example.*/


        if(index<arr.length){

            System.out.println(arr[index]);
        }else{
            System.out.println("the size is not correct, please check");
        }


        /*
        Unchecked Exceptions can be avoided by writing a better code but
checked Exceptions are not lightweight exceptions, we must use try and
catch or add exception to the method signature to avoid them.
         */

       // System.out.println(ExcelReader.read("Data/Test1.xlsx")); //note in here java giving compiler error for read method(by saying "unhandled exception") ,
        // but whereas ,in above example(Unchecked exception name1, name& array index, java didn't provide  any compiler error)..

        try { /*we fixed the issues by using try catch block.this is called checked exception, the thing which are not control of the programmer and there are
            separate entity in the code, they are categorized under checked exception .
            most important part when ever we are dealing with something which is not in your control then that's checked exception you have to deal with try catch block */
            System.out.println(ExcelReader.read("Data/Test1.x"));
        } catch (Exception e) {
            System.out.println("File path is incorrect, just for practice i changed the extension");
        }

        System.out.println("Hello");
        System.out.println("Meter");
        System.out.println("perter");

        System.out.println("some importanat lines of code5");

        System.out.println( "some importanat lines of code6");

        System.out.println("some importanat lines of code6");

}
}