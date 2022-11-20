package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> words= new ArrayList<>();

        List<String>words2= new ArrayList<>();
        // List is an interface and Array list is class which implement the method from list interface.
        // so we can store Arraylist to in list interface. it's polymorphism.we can utilize all the benefit what we have in List(I),
        // but  don't do polymorphism in list we have downside also check line16


        LinkedList<String>link1= new LinkedList<>();
        link1.addFirst("Hi"); // no error because create object for the linkedlist class only.

        List<String>link= new LinkedList<>();
       //link.addFirst("Hi"); // We will get complier  error, note this method "addFirst" not available , is not working,
        // because when ever we store the object of the class(in here Linketlist)  inside the  List interface,
        //  we can only call the methods that are available on the List(I) . we can't call the mehtod that are specified in that class(which is linkedlist).
        //  so this is down side of using polymorphism. so don't use it for collection farme work.


    }
}
