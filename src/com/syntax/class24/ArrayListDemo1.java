package com.syntax.class24;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        //Declare ArrayList
        //ArrayList al =new ArrayList(); any type data is applicable, hetrogenius data
        //ArrayList <Integer> al= new ArrayList<Integer>(); //specify the data type, homogenius data type.
       // ArrayList<String> al = new ArrayList<String>();
        //List al= new ArrayList();

//created object for any data type
        ArrayList al= new ArrayList();

        //Add new elements to the arraylist .note add method we can use in two different way one  is adding the elements at end of the array line 21 to 25.
        // another one is add elements anywhere in the array in line 40.

        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al);

        //size()

        System.out.println("Number of elements in array list "+ al.size());

        //remove
        al.remove(1); //here 1 is index number
      //  al.remove("Welcome");
    //both line 32 & 33 will provide the same output, we can call directly the elements or we specify the index. Both will work.

        System.out.println("After removing elements from array list: " +al.size());

    //insert new elments in spcify index,by using add(index,object/elements)
        al.add(2,"Python");
        System.out.println("After insertion:"+al);

    //retreive specific element
    System.out.println(al.get(2)); //here 2 is index of elements/objects

    //change elements/replace
    al.set(2,"C#");
    System.out.println("After replacing elements:"+al);

    //search -cotians() -->this will return true or false. this method is used to check/verify  is a specify value/elements are avilable or not.
        System.out.println(al.contains("C#"));
        System.out.println(al.contains("c++"));

    //isEmpty()
    System.out.println(al.isEmpty());

    /*read all the elements by using three different approach
        1)for loop
        2) for each loop
        3)iterator
     */

//1) for loop

     /*   for(int i=0; i<al.size(); i++){

            System.out.print(al.get(i) + " ");
        } */

     //   System.out.println("Reading elements using for enhance for loop");
  //2) enhance for loop
       /* for(Object type  e:al){


            System.out.println(e);
        }*/
  //3)iterator()

        System.out.println("Reading elements using iterator method");

        Iterator it= al. iterator(); //in this iterator will captuer all the elements/objects from the array.
        while(it.hasNext()){ //hasNext method will provide true, if it iterator has elements

            System.out.println(it.next()); // this.next() will print the elements and move to next.
        }
    }
}
